package pl.bartekbak.skijumping.domain.service;

import lombok.Getter;
import pl.bartekbak.skijumping.domain.entity.Hill;
import pl.bartekbak.skijumping.domain.entity.Jumper;
import pl.bartekbak.skijumping.domain.enums.JumpStyle;

@Getter
public class Jump {

    //flying phase of jump
    private JumpStyle flightStyle = JumpStyle.NICE;
    //todo implement style mechanism

    // landing
    private boolean telemark;
    private boolean supportedLanding;
    private boolean fall;
    private double jumpLength;
    private double jumpLengthNote;

    public Jump(Jumper jumper, Hill hill) {
        int lengthFactorInt = (int)(Math.random() * 30);
        double lengthFactor = lengthFactorInt / 2.0;
        this.jumpLength = hill.getPointK() + lengthFactor;

        double landingFactor = Math.random();
        if (landingFactor > 0.4){
            this.telemark = true;
        } else if (landingFactor > 0.1){
            this.telemark = false;
        } else if (landingFactor > 0.03){
            this.supportedLanding = true;
        } else {
            fall = true;
        }

        int baseJumpNote = 0;
        double lengthNoteModifier = 0;
        switch (hill.getHillType()){
            case MEDIUM:
                baseJumpNote = 60;
                lengthNoteModifier = 2;
                break;
            case LARGE:
                baseJumpNote = 60;
                lengthNoteModifier = 1.8;
                break;
            case MAMMOTH:
                baseJumpNote = 120;
                lengthNoteModifier = 1.2;
                break;
        }

        this.jumpLengthNote = baseJumpNote + (this.getJumpLength() - hill.getPointK()) * lengthNoteModifier;
    }

}
