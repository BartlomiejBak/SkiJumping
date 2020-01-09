public class StartingList {
    Jumper[] list;

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
}
