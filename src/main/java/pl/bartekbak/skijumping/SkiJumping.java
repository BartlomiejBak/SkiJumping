package pl.bartekbak.skijumping;

import pl.bartekbak.skijumping.domain.entity.Hill;
import pl.bartekbak.skijumping.domain.service.Jump;
import pl.bartekbak.skijumping.domain.entity.Jumper;
import pl.bartekbak.skijumping.domain.entity.Jury;
import pl.bartekbak.skijumping.ui.MainView;

import java.util.Scanner;

/**
 * main method of ski jumping app
 * provides 2 jump tournament and shows final standings
 * @author bartlomiej.bak
 */
public class SkiJumping {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MainView mainView = new MainView(scanner);
        mainView.init();
    }
}
