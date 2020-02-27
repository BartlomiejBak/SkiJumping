public class Jury {
    private String name;

    public Jury() {
    }

    private String nationality;

    public Jury(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }


    /**
     * method for evaluating jump - note should be between 8.0 - 20.0
     * @param jump Jump that will be evaluated
     * @return double note for jump
     */
    public double evaluate(Jump jump){
        double note = 20;

        //flight - 0 to 5 points less
        switch (jump.getFlightStyle()){
            case EXCELLENT:
                note -= randomRange(0, 1);
                break;
            case NICE:
                note -= randomRange(1.5, 2);
                break;
            case POOR:
                note -= randomRange(2.5, 3);
                break;
            case MSTYLE:
                note -= randomRange(3.5, 5);
                break;
        }

        //landing up to 7 points less

        if (jump.isFall()){
            note -= 7;
        } else if (jump.isSupportedLanding()){
            note -= randomRange(4, 5);
        } else if (!jump.isTelemark()){
            note -= 2;
        }

        //todo diversity element - now every jury will set same note.

        return note;
    }

    /**
     * @param a integer low value
     * @param b integer high value
     * @return double from range [a, b] with 0.5 step
     */

    public double randomRange (double a, double b){
        double multiplier = (b - a) * 2 + 1;
        multiplier *= Math.random();
        return a + 0.5 * (int)multiplier;
    }
}
