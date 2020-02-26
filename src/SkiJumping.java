/**
 * main method of ski jumping app
 * provides 2 jump tournament and shows final standings
 * @author bartlomiej.bak
 */
public class SkiJumping {

    public static void main(String[] args){
        System.out.println("jump");
        int n = 1;
        StartingList list = new StartingList(n);
        list.showList();
        list.firstRound(list);
        list.showFirstRound();
        list.secondRound(list);
        list.showSecondRound();
        list.showTotalLength();
    }

//todo: style notes, elimination round, general classification

}
