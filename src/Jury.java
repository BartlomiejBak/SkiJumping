public class Jury {
    private String name;
    private String nationality;

    public Jury(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public double evaluate(Jump jump){
        double note = 40;
        //flight - 0 to 5 points less
        switch (jump.getFlight()){
            case EXCELLENT:
                note -= (int) Math.random() * 2;
                break;
            case NICE:
                note -= (int) Math.random() * 2 + 2;
                break;
            case POOR:
                note -= (int) Math.random() * 2 + 4;
                break;
            case MSTYLE:
                note -= (int) Math.random() * 4 + 6;
                break;
        }

        //landing

        if (!jump.isTelemark()){
            note -= 2;
        }

        return note;
    }
}
