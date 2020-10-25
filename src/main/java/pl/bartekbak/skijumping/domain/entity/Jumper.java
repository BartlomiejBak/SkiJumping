package pl.bartekbak.skijumping.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.bartekbak.skijumping.domain.service.Jump;

import java.util.Random;

/**
 * @author bartlomiej.bak
 */

@Getter
@Setter
@NoArgsConstructor
public class Jumper {
    private int startingNo;
    private double personalBest;
    private int takeOffSkill;
    private int flightSkill;
    private int landingSkill;

    public Jumper(int startingNo) {
        this.startingNo = startingNo;
        this.personalBest = 0;
        this.takeOffSkill = randomSkillValue();
        this.flightSkill = randomSkillValue();
        this.landingSkill = randomSkillValue();

    }

    private int randomSkillValue() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
