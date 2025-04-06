/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-02 03:16:32
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-03 07:21:37
 * @FilePath: /workspace/STUDY/com/process/Process.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package com.process;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 进程控制块（PCB）
 *
 * 定义进程对象，每个进程都会存储自己的信息
 */
class Process {
    String name;//进程名（P1 P2）
    int arrivalTime;//进程到达时间
    int burstTime;//需要运行时间
    int usedTime;//已运行时间
    String state; // 状态：W(Wait) 就绪, R(Run) 运行, B(Block) 阻塞

    //构造方法，创建进程
    public Process(String name, int arrivalTime, int burstTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.usedTime = 0;//进程刚创建，还没有运行
        this.state = "W";//初始状态为W(就绪)
    }
}

/**
 * 调度器
 * 管理进程的调度，记录当前的时间
 */
class Scheduler {
    private List<Process> processes; //存储 所有进程 的 列表
    private int currentTime = 0; //记录当前时间

    //构造方法，传入进程列表
    public Scheduler(List<Process> processes) {
        this.processes = processes;
    }
 
    /**
     * 先来先服务 (FCFS) 调度算法
     * 原理
     * - 按 到达时间 排序，最先到的进程先执行。
     * - 进程运行完后再执行下一个进程。
     * - 不会抢占，即进程一旦开始运行，必须运行完。
     */
    public void fcfsScheduling() {
        // 按 进程到达时间 排序
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime)); 
        System.out.println("FCFS 调度开始");
        
        for (Process p : processes) {
            //如果当前时间小于进程到达时间，等待进程到达
            if (currentTime < p.arrivalTime) {
                currentTime = p.arrivalTime;
            }
            //运行进程
            p.state = "R";//进程状态变为运行
            printStatus(p);//打印进程状态
            //进程执行时间 = 需要运行时间
            currentTime += p.burstTime;
            p.usedTime = p.burstTime;//进程完成
            p.state = "Completed";
        }
        System.out.println("FCFS 调度结束\n");
    }

    /**
     * 短作业优先 (SJF) 调度算法
     * 原理
     * - 优先执行 运行时间最短的进程。
     * - 进程到达后，会选择 当前所有进程 中运行时间最短的一个执行。
     */
    public void sjfScheduling() {
        List<Process> readyQueue = new ArrayList<>(); //就绪队列
        //按到达时间排序
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));
        System.out.println("SJF 调度开始");

        int index = 0;
        while (!readyQueue.isEmpty() || index < processes.size()) {
            //将所有到达的进程加入就绪队列
            while (index < processes.size() && processes.get(index).arrivalTime <= currentTime) {
                readyQueue.add(processes.get(index));
                index++;
            }

            //按 运行时间排序（选择最短的作业）
            readyQueue.sort(Comparator.comparingInt(p -> p.burstTime));
            if (!readyQueue.isEmpty()) {
                Process p = readyQueue.remove(0);//取出最短作业
                p.state = "R";//进程状态变为运行
                printStatus(p);
                currentTime += p.burstTime;
                p.usedTime = p.burstTime;
                p.state = "Completed";//进程完成
            } else {
                currentTime++;//如果当前没有进程可执行,时间前进
            }
        }
        System.out.println("SJF 调度结束\n");
    }

    /**
     * 时间片轮转 (RR) 调度算法
     * 原理
     * - 所有进程按 固定时间片 轮流执行，防止某个进程长期占用 CPU。
     * - 进程如果在时间片内没执行完，就放回队列，等待下一轮。
     */
    public void rrScheduling(int timeQuantum) {
        Queue<Process> readyQueue = new LinkedList<>();
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));
        System.out.println("RR 调度开始");

        int index = 0;
        while (!readyQueue.isEmpty() || index < processes.size()) {
            while (index < processes.size() && processes.get(index).arrivalTime <= currentTime) {
                readyQueue.add(processes.get(index));
                index++;
            }
            if (!readyQueue.isEmpty()) {
                Process p = readyQueue.poll();
                p.state = "R";
                printStatus(p);
                int executionTime = Math.min(timeQuantum, p.burstTime - p.usedTime);
                currentTime += executionTime;
                p.usedTime += executionTime;
                if (p.usedTime == p.burstTime) {
                    p.state = "Completed";
                } else {
                    p.state = "W";
                    readyQueue.add(p);
                }
            } else {
                currentTime++;
            }
        }
        System.out.println("RR 调度结束\n");
    }

    // 打印进程状态
    private void printStatus(Process p) {
        System.out.println("时间: " + currentTime + " | 运行进程: " + p.name + " | 状态: " + p.state);
    }
}

// 主类  ---  测试
public class ProcessScheduler {
    public static void main(String[] args) {
        List<Process> processes = new ArrayList<>();
        processes.add(new Process("P1", 0, 5));
        processes.add(new Process("P2", 2, 3));
        processes.add(new Process("P3", 4, 2));
        processes.add(new Process("P4", 6, 4));
        processes.add(new Process("P5", 8, 3));
        
        Scheduler scheduler = new Scheduler(processes);
        scheduler.fcfsScheduling();
        scheduler.sjfScheduling();
        scheduler.rrScheduling(2); // 时间片大小设为2
    }
}
