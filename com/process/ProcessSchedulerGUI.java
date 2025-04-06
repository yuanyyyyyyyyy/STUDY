/*
 * @Author: m13237097902 m13237097902@gmail.com
 * @Date: 2025-04-03 07:25:19
 * @LastEditors: m13237097902 m13237097902@gmail.com
 * @LastEditTime: 2025-04-03 07:31:20
 * @FilePath: /workspace/STUDY/com/process/ProcessControlBlock.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package com.process;

import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

class ProcessControlBlock {
    String name;
    int arrivalTime;
    int burstTime;
    int remainingTime;
    String state;

    public ProcessControlBlock(String name, int arrivalTime, int burstTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.state = "W"; // 初始状态为等待 (Wait)
    }
}

class Scheduler {
    private List<ProcessControlBlock> processes;
    private JTextArea outputArea;
    
    public Scheduler(List<ProcessControlBlock> processes, JTextArea outputArea) {
        this.processes = processes;
        this.outputArea = outputArea;
    }
    
    public void runFCFS() {
        outputArea.append("\n[FCFS 调度开始]\n");
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));
        for (ProcessControlBlock pcb : processes) {
            pcb.state = "R";
            printState(pcb);
            pcb.state = "完成";
        }
        outputArea.append("[FCFS 调度结束]\n");
    }
    
    public void runSJF() {
        outputArea.append("\n[SJF 调度开始]\n");
        processes.sort(Comparator.comparingInt(p -> p.burstTime));
        for (ProcessControlBlock pcb : processes) {
            pcb.state = "R";
            printState(pcb);
            pcb.state = "完成";
        }
        outputArea.append("[SJF 调度结束]\n");
    }
    
    public void runRR(int quantum) {
        outputArea.append("\n[RR 调度开始]\n");
        Queue<ProcessControlBlock> queue = new LinkedList<>(processes);
        while (!queue.isEmpty()) {
            ProcessControlBlock pcb = queue.poll();
            pcb.state = "R";
            printState(pcb);
            if (pcb.remainingTime > quantum) {
                pcb.remainingTime -= quantum;
                pcb.state = "W";
                queue.offer(pcb);
            } else {
                pcb.state = "完成";
            }
        }
        outputArea.append("[RR 调度结束]\n");
    }
    
    private void printState(ProcessControlBlock pcb) {
        outputArea.append("时间: " + pcb.arrivalTime + " | 运行进程: " + pcb.name + " | 状态: " + pcb.state + "\n");
    }
}

public class ProcessSchedulerGUI {
    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(ProcessSchedulerGUI::createAndShowGUI);
    }
    
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("进程调度模拟器");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        
        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        
        JButton fcfsButton = new JButton("FCFS 调度");
        JButton sjfButton = new JButton("SJF 调度");
        JButton rrButton = new JButton("RR 调度");
        
        JPanel panel = new JPanel();
        panel.add(fcfsButton);
        panel.add(sjfButton);
        panel.add(rrButton);
        
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);
        
        List<ProcessControlBlock> processes = Arrays.asList(
                new ProcessControlBlock("P1", 0, 5),
                new ProcessControlBlock("P2", 1, 3),
                new ProcessControlBlock("P3", 2, 2),
                new ProcessControlBlock("P4", 3, 4),
                new ProcessControlBlock("P5", 4, 3)
        );
        
        Scheduler scheduler = new Scheduler(processes, outputArea);
        
        fcfsButton.addActionListener(e -> scheduler.runFCFS());
        sjfButton.addActionListener(e -> scheduler.runSJF());
        rrButton.addActionListener(e -> scheduler.runRR(2));
        
        frame.setVisible(true);
    }
}

