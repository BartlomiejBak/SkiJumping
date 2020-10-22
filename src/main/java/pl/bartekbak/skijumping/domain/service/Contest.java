package pl.bartekbak.skijumping.domain.service;

import pl.bartekbak.skijumping.domain.entity.Hill;
import pl.bartekbak.skijumping.domain.entity.Jury;
import pl.bartekbak.skijumping.domain.entity.StartingList;

public class Contest {
    private Hill hill;
    private StartingList startingList;
    private Jury jury;

    public Contest(Hill hill, StartingList startingList, Jury jury) {
        this.hill = hill;
        this.startingList = startingList;
        this.jury = jury;
    }



}
