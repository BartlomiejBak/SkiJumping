package pl.bartekbak.skijumping.entities;

import pl.bartekbak.skijumping.enums.HillType;

/**
 * Class designed for ski jumping hills
 */

public class Hill {
    private static double worldLengthRecord;

    private String name;
    private String location;
    private double hillSize;
    private double pointK;
    private double record = 0;
    private HillType hillType;

    public Hill(String name, String location, double hillSize, double pointK) {
        this.name = name;
        this.location = location;
        this.hillSize = hillSize;
        this.pointK = pointK;

        //depending on hill type there will be different scoring rules
        if (pointK <= 100){
            this.hillType = HillType.MEDIUM;
        } else if (pointK >= 180){
            this.hillType = HillType.MAMMOTH;
        } else {
            this.hillType = HillType.LARGE;
        }
    }

    public static double getWorldLengthRecord() {
        return worldLengthRecord;
    }

    public static void setWorldLengthRecord(double worldLengthRecord) {
        Hill.worldLengthRecord = worldLengthRecord;
    }

    public HillType getHillType() {
        return hillType;
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
