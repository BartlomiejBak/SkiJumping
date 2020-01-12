public class SkiJumping {
    //todo comments
    public static void main(String[] args){
        System.out.println("jump");
        int n = 1;
        StartingList lista = new StartingList(n);
        lista.showList();
        lista.firstRound(lista);
        lista.showFirstRound();
        lista.secondRound(lista);
        lista.showSecondRound();
        lista.showTotalLength();
    }

//todo: style notes, elimination round, general classification

}
