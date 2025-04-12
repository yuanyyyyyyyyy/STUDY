package chapter20.com.cyx.pokemon.level;

/**
 * 9. 关卡设计
 * 关卡有编号、有地图
 *
 * 关卡
 */
public class Level {

    /**
     * 关卡编号
     */
    private int number;
    /**
     * 关卡地图
     */
    private LevelMap map;

    private Level preLevel;

    private Level nextLevel;

    public Level(Level prLevel, int number, Level nextLevel){
        this.preLevel = prLevel;
        this.number = number;
        this.nextLevel = nextLevel;
        this.map = new LevelMap(number);
    }

    public int getNumber() {
        return number;
    }

    public Level getPreLevel() {
        return preLevel;
    }

    public void setPreLevel(Level preLevel) {
        this.preLevel = preLevel;
    }

    public Level getNextLevel() {
        return nextLevel;
    }

    public void setNextLevel(Level nextLevel) {
        this.nextLevel = nextLevel;
    }

    public LevelMap getMap(){
        return map;
    }
}

