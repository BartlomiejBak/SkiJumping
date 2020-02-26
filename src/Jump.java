public class Jump {

    //flying phase of jump
    private Style flightStyle;

    // landing
    private boolean telemark;
    private boolean supportedLanding;
    private boolean fall;
    private double jumpLength;

    public Jump(Jumper jumper, Hill hill) {


    }

    public Style getFlightStyle() {
        return flightStyle;
    };

    public boolean isTelemark() {
        return telemark;
    }

    public boolean isSupportedLanding() {
        return supportedLanding;
    }

    public boolean isFall() {
        return fall;
    }

    public double getJumpLength() {
        return jumpLength;
    }

}
