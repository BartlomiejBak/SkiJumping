public class Jumper {
    //todo comments
    private int startingNo;
    private int height;
    private int weight;
    private double firstJumpLength = 0;
    private double secondJumpLength = 0;
    private double totalLength = getFirstJumpLength() + getSecondJumpLength();
    public Jumper(int i) {
        this.startingNo = i;
        this.height = (int)(200-Math.random()*40);
        this.weight = (int)(80-Math.random()*20);
    }

    public double jump(){
        int baseJump = 100;
        return (baseJump + (Math.random() * 60 * getWeight() / getHeight()));
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStartingNo() {
        return startingNo;
    }

    public double getFirstJumpLength() {
        return firstJumpLength;
    }

    public void setFirstJumpLength() {
        this.firstJumpLength = this.jump();
        this.totalLength = this.getFirstJumpLength() + this.getSecondJumpLength();
    }

    public double getSecondJumpLength() {
        return secondJumpLength;
    }

    public void setSecondJumpLength() {
        this.secondJumpLength = this.jump();
        this.totalLength = this.getFirstJumpLength() + this.getSecondJumpLength();
    }

    public double getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(double totalLength) {
        this.totalLength = totalLength;
    }
}
