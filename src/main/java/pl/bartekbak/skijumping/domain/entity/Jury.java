package pl.bartekbak.skijumping.domain.entity;

import pl.bartekbak.skijumping.domain.enums.JumpStyle;
import pl.bartekbak.skijumping.domain.service.Jump;

public class Jury {
    private int id;

    public Jury(int id) {
        this.id = id;
    }

    public double evaluate(Jump jump){
        double note = 20;

        note -= evaluateFlight(jump.getFlightStyle());
        note -= evaluateLanding(jump);

        return note;
    }

    private double evaluateLanding(Jump jump) {
        double note = 0;
        if (jump.isFall()){
            note -= 7;
        } else if (jump.isSupportedLanding()){
            note -= randomValueRangeAAndB(4, 5);
        } else if (!jump.isTelemark()){
            note -= 2;
        }
        return note;
    }

    private double evaluateFlight(JumpStyle jump) {
        double note = 0;
        switch (jump){
            case EXCELLENT:
                note -= randomValueRangeAAndB(0, 1);
                break;
            case NICE:
                note -= randomValueRangeAAndB(1.5, 2);
                break;
            case POOR:
                note -= randomValueRangeAAndB(2.5, 3);
                break;
            case MSTYLE:
                note -= randomValueRangeAAndB(3.5, 5);
                break;
        }
        return note;
    }

    private double randomValueRangeAAndB(double a, double b){
        double rangeSpread = (b - a) * 2 + 1;
        rangeSpread *= Math.random();
        return a + 0.5 * (int)rangeSpread;
    }
}
