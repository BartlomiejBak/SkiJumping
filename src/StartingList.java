public class StartingList {
    Jumper[] list;
    //todo comments
    public StartingList(int n){
        this.list = new Jumper[n];
        fillList(list);
    }

    public void fillList(Jumper[] list){
        for(int i = 0; i < list.length; i++){
            list[i] = new Jumper(i);
        }
    }

    public void showList(){
        for (Jumper jumper: list) {
            System.out.println("No: " + jumper.getStartingNo() + " W: " + jumper.getWeight() + " H: " + jumper.getHeight());
        }
    }
    public void showFirstRound(){
        for (Jumper jumper: list) {
            System.out.println("No: " + jumper.getStartingNo() + ", length: " + jumper.getFirstJumpLength());

        }
    }
    public void firstRound(StartingList list) {
        for (Jumper jumper : list.list) {
            jumper.setFirstJumpLength();
        }
    }

    public void secondRound(StartingList list){
        for (Jumper jumper:list.list) {
            jumper.setSecondJumpLength();
        }
    }

    public void showSecondRound() {
        for (Jumper jumper: list) {
            System.out.println("No: " + jumper.getStartingNo() + ", length: " + jumper.getSecondJumpLength());
        }
    }

    public void showTotalLength() {
        for (Jumper jumper: list) {
            System.out.println("No: " + jumper.getStartingNo() + ", length: " + jumper.getTotalLength());
        }
    }
}
