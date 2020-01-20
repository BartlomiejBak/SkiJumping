/**
 * main method of skijumping app
 * provides 2 jump tournament and shows final standings
 * @author bartlomiej.bak
 */
public class SkiJumping {

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
