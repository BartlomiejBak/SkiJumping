package pl.bartekbak.skijumping.domain.entity;

import lombok.Getter;
import lombok.Setter;
import pl.bartekbak.skijumping.domain.enums.HillType;

/**
 * Class designed for ski jumping hills
 */

@Getter
public class Hill {

    static double worldLengthRecord;

    private final String name;
    private final String location;
    private final double hillSize;
    private final double pointK;
    private final HillType hillType;
    @Setter
    private double record = 0;

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
}
