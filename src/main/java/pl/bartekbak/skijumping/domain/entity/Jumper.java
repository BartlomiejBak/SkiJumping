package pl.bartekbak.skijumping.domain.entity;

import lombok.Getter;
import lombok.Setter;
import pl.bartekbak.skijumping.domain.service.Jump;

/**
 * @author bartlomiej.bak
 */

@Getter
@Setter
public class Jumper {
    static int jumpers;

    private int startingNo;
    private int height;
    private int weight;
    private double record = 0;
    private double firstRound, secondRound, totalNote;
    private Jump first, second;

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

    /**
     * pl.bartekbak.skijumping.domain.service.Jump on the hill
     * @param hill pl.bartekbak.skijumping.domain.entity.Hill
     * @return pl.bartekbak.skijumping.domain.service.Jump
     */
    public Jump jump(Hill hill){
        Jump jump = new Jump(this, hill);
        return jump;
    }

}