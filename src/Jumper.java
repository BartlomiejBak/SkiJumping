import java.util.Arrays;

/**
 * @author bartlomiej.bak
 */
public class Jumper {
    static int jumpers;
    private int startingNo;
    private int height;
    private int weight;
    private double record = 0;

    //todo taking care of jumper skills
    private int takeOffSkill, flightSkill, landingSkill;


    /**
     * Creates new jumper with variable height (160-200 cm) and weight (60-80 kg) and random lvl of skills
     */
    public Jumper() {
        jumpers++;
        this.startingNo = jumpers;
        this.height = (int)(200-Math.random()*40);
        this.weight = (int)(80-Math.random()*20);
    }

    public double getRecord() {
        return record;
    }

    public void setRecord(double record) {
        this.record = record;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getStartingNo() {
        return startingNo;
    }

}
