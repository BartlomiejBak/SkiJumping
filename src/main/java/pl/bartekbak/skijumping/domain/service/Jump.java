package pl.bartekbak.skijumping.domain.service;

import lombok.Getter;
import pl.bartekbak.skijumping.domain.entity.Hill;
import pl.bartekbak.skijumping.domain.entity.Jumper;
import pl.bartekbak.skijumping.domain.enums.JumpStyle;

@Getter
public class Jump {

    private Jumper jumper;
    private Hill hill;
    private JumpStyle flightStyle;
    private boolean telemark;
    private boolean supportedLanding;
    private boolean fall;
    private double jumpLength;
    private double jumpLengthNote;

    public Jump(Jumper jumper, Hill hill) {
        this.jumper = jumper;
        this.hill = hill;
        this.telemark = false;
        this.supportedLanding = false;
        this.fall = false;
        this.jumpLength = 0.0;
        this.jumpLengthNote = 0.0;
    }

    public void takeJump() {
        clearStats();
        double inRunSpeed = measureInRunSpeed();
        double takeOffScore = getTakeOffScore();
        fly(inRunSpeed, takeOffScore);
        checkFlightStyle();
        land();
        calculateJumpLengthNote();
    }

    private void clearStats() {
        this.telemark = false;
        this.supportedLanding = false;
        this.fall = false;
    }

    private double measureInRunSpeed() {
        double baseSpeed = 0;
        switch (hill.getHillType()) {
            case MEDIUM:
                baseSpeed = 90;
                break;
            case LARGE:
                baseSpeed = 95;
                break;
            case MAMMOTH:
                baseSpeed = 105;
                break;
        }
        baseSpeed -= baseSpeed * Math.random() / 10;

        return baseSpeed;
    }

    private double getTakeOffScore() {
        return Math.random() * jumper.getTakeOffSkill();
    }

    private void checkFlightStyle() {
        double styleFactor = Math.random() * jumper.getFlightSkill();

        if (styleFactor > 80) {
            this.flightStyle = JumpStyle.EXCELLENT;
        } else if (styleFactor > 50) {
            this.flightStyle = JumpStyle.NICE;
        } else if (styleFactor > 20) {
            this.flightStyle = JumpStyle.POOR;
        } else {
            this.flightStyle = JumpStyle.MSTYLE;
        }
    }

    private void land() {
        double landingFactor = Math.random() * jumper.getLandingSkill();

        if (landingFactor > 20){
            this.telemark = true;
        } else if (landingFactor > 0.5 && landingFactor <= 5){
            this.supportedLanding = true;
        } else {
            fall = true;
        }
    }

    private void calculateJumpLengthNote() {
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

    private void fly(double inRunSpeed, double takeOffScore) {
        double lengthFactor = (inRunSpeed + takeOffScore) / 150;
        this.jumpLength = Math.round(lengthFactor * hill.getHillSize() * 2) / 2.0;
    }

}
