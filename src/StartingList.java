/**
 *
 * @author bartlomiej.bak
 */
public class StartingList {
    Jumper[] list;

    /**
     *Creates starting list of n jumpers
     * @param n setting number of competitors
     */
    public StartingList(int n){
        this.list = new Jumper[n];
        fillList(list);
    }

    /**
     * Fills list with various Jumpers
     * @param list not null
     */
    public void fillList(Jumper[] list){
        for(int i = 0; i < list.length; i++){
            list[i] = new Jumper(i);
        }
    }

    /**
     * Prints basic info about jumpers: number, weight and height
     */
    public void showList(){
        for (Jumper jumper: list) {
            System.out.println("No: " + jumper.getStartingNo() + " W: " + jumper.getWeight() + " H: " + jumper.getHeight());
        }
    }

    /**
     * Shows results of first round
     */
    public void showFirstRound(){
        for (Jumper jumper: list) {
            System.out.println("No: " + jumper.getStartingNo() + ", length: " + jumper.getFirstJumpLength());

        }
    }

    /***
     * @param list not null
     */
    public void firstRound(StartingList list) {
        for (Jumper jumper : list.list) {
            jumper.setFirstJumpLength();
        }
    }

    /**
     *
     * @param list not null
     */
    public void secondRound(StartingList list){
        for (Jumper jumper:list.list) {
            jumper.setSecondJumpLength();
        }
    }

    /**
     *
     */
    public void showSecondRound() {
        for (Jumper jumper: list) {
            System.out.println("No: " + jumper.getStartingNo() + ", length: " + jumper.getSecondJumpLength());
        }
    }

    /**
     *
     */
    public void showTotalLength() {
        for (Jumper jumper: list) {
            System.out.println("No: " + jumper.getStartingNo() + ", length: " + jumper.getTotalLength());
        }
    }
}
