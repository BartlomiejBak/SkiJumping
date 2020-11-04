package pl.bartekbak.skijumping.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class StartingList {

    private List<Jumper> list;


    public StartingList(int numberOfJumpers){
        this.list = new ArrayList<>();
        fillList(numberOfJumpers);
    }


    private void fillList(int numberOfJumpers){
        for(int i = 0; i < numberOfJumpers; i++){
            this.list.add(new Jumper());
        }
    }

    public void showList(){
        for (Jumper jumper: list) {
            System.out.println("No: " + jumper.getStartingNo() + " personal best: " + jumper.getPersonalBest());
        }
    }

}
