package pl.bartekbak.skijumping.domain.entity;


public class StartingList {

    Jumper[] list;

    public StartingList(int n){
        this.list = new Jumper[n];
        fillList(list);
    }


    public void fillList(Jumper[] list){
        for(int i = 0; i < list.length; i++){
            list[i] = new Jumper();
        }
    }

    public void showList(){
        for (Jumper jumper: list) {
            System.out.println("No: " + jumper.getStartingNo() + " personal best: " + jumper.getPersonalBest());
        }
    }

    public void showFirstRound(){
        for (Jumper jumper: list) {

        }
    }

    public void firstRound(StartingList list) {
        for (Jumper jumper : list.list) {

        }
    }


    public void secondRound(StartingList list){
        for (Jumper jumper:list.list) {

        }
    }


    public void showSecondRound() {
        for (Jumper jumper: list) {

        }
    }


    public void showTotalLength() {
        for (Jumper jumper: list) {

        }
    }
}
