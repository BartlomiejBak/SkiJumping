public class Jump {
    private boolean telemark;
    private boolean supportedLanding;
    private boolean fall;
    private double jumpLength;
    private Flight flight;

public Jump(boolean telemark, boolean supportedLanding, boolean fall, double jumpLength) {
        this.telemark = telemark;
        this.supportedLanding = supportedLanding;
        this.fall = fall;
        this.jumpLength = jumpLength;
    }

    public Flight getFlight() {
        return flight;
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
