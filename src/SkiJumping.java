/**
 * main method of ski jumping app
 * provides 2 jump tournament and shows final standings
 * @author bartlomiej.bak
 */
public class SkiJumping {

    public static void main(String[] args){
        Jury[] juryTeam = new Jury[5];
        for (int i = 0; i < 5; i++) {
            juryTeam[i] = new Jury();
        }
        double[] juryNotes = new double[5];


        Jumper[] competitors = new Jumper[5];
        for (int i = 0; i < 5; i++) {
            competitors[i] = new Jumper();
        }

        Hill zakopane = new Hill("Wielka Krokiew", "Zakopane", 140.0, 125.0);

        for (Jumper competitor: competitors) {
            Jump jump = competitor.jump(zakopane);
            competitor.setFirst(jump);

            for (int i = 0; i < 5; i++) {
                juryNotes[i] = juryTeam[i].evaluate(jump);
            }

            System.out.println("Competitor " + competitor.getStartingNo()
            + " reached " + jump.getJumpLength() + " meters.");
            System.out.print("Jury notes: ");
            double juryTotalNote = 0;
            double minNote = juryNotes[0];
            double maxNote = juryNotes[0];
            for (double note: juryNotes) {
                System.out.print(note + " ");
                juryTotalNote += note;
                if (note > maxNote) maxNote = note;
                if (note < minNote) minNote = note;
            }
            System.out.println("\nJump note: " + (jump.getJumpLengthNote() + juryTotalNote - maxNote - minNote));
        }

    }


//todo: elimination round, general classification

}
