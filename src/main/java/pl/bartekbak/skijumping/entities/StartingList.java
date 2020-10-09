package pl.bartekbak.skijumping.entities;

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
            list[i] = new Jumper();
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

        }
    }

    /***
     * @param list not null
     */
    public void firstRound(StartingList list) {
        for (Jumper jumper : list.list) {

        }
    }

    /**
     *
     * @param list not null
     */
    public void secondRound(StartingList list){
        for (Jumper jumper:list.list) {

        }
    }

    /**
     *
     */
    public void showSecondRound() {
        for (Jumper jumper: list) {

        }
    }

    /**
     *
     */
    public void showTotalLength() {
        for (Jumper jumper: list) {

        }
    }
}
