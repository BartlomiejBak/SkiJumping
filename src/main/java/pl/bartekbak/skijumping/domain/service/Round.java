package pl.bartekbak.skijumping.domain.service;

import pl.bartekbak.skijumping.domain.entity.Jumper;
import pl.bartekbak.skijumping.domain.entity.Jury;
import pl.bartekbak.skijumping.domain.entity.StartingList;

import java.util.List;
import java.util.Map;

public class Round {
    private StartingList startingList;
    private List<Jury> juries;



    public Round(StartingList startingList, List<Jury> juries) {
        this.startingList = startingList;
        this.juries = juries;

    }

    public Round(StartingList startingList, List<Jury> juries, Map<Jumper, Double> totalResults) {
        this.startingList = startingList;
        this.juries = juries;

    }

    public void runRound() {

    }

    private void sortResults() {

    }
}
