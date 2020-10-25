package pl.bartekbak.skijumping.domain.service;

import pl.bartekbak.skijumping.domain.entity.Hill;
import pl.bartekbak.skijumping.domain.entity.Jury;
import pl.bartekbak.skijumping.domain.entity.StartingList;

import java.time.LocalDateTime;

public class Contest {
    private LocalDateTime dateTime;
    private Hill hill;
    private StartingList startingList;
    private Jury jury;

    public Contest(LocalDateTime dateTime, Hill hill, StartingList startingList, Jury jury) {
        this.dateTime = dateTime;
        this.hill = hill;
        this.startingList = startingList;
        this.jury = jury;
    }
}
