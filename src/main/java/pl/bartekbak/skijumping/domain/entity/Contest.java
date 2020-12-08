package pl.bartekbak.skijumping.domain.entity;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
public class Contest {
    private LocalDateTime dateTime;
    private Hill hill;
    private StartingList startingList;

    private List<Standing> standingList;
    private List<Jury> jury;

    public Contest(LocalDateTime dateTime, Hill hill, StartingList startingList) {
        this.dateTime = dateTime;
        this.hill = hill;
        this.startingList = startingList;
        createJuryTeam();
        createStandingList();
    }

    private void createJuryTeam() {
        this.jury = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            jury.add(new Jury(i + 1));
        }
    }

    private void createStandingList() {
        standingList = new ArrayList<>();
        for (Jumper jumper : startingList.getList()) {
            standingList.add(new Standing(jumper));
        }
    }
}
