public class Hill {
    private String name;
    private String location;
    private double hillSize;
    private double pointK;
    private double record = 0;
    private int startgates;

    public Hill(String name, String location, double hillSize, double pointK) {
        this.name = name;
        this.location = location;
        this.hillSize = hillSize;
        this.pointK = pointK;
    }

    public double getRecord() {
        return record;
    }

    public void setRecord(double record) {
        this.record = record;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getHillSize() {
        return hillSize;
    }

    public double getPointK() {
        return pointK;
    }
}
