public class Jumper {
    private int startingNo;
    private int height;
    private int weight;

    public Jumper(int i) {
        this.startingNo = i;
        this.height = (int)(200-Math.random()*40);
        this.weight = (int)(80-Math.random()*20);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getStartingNo() {
        return startingNo;
    }
}
