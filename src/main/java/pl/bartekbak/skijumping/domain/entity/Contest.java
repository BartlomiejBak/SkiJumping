package pl.bartekbak.skijumping.domain.entity;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
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
