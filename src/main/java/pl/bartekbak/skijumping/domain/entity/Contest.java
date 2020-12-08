package pl.bartekbak.skijumping.domain.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Contest {
    private LocalDateTime dateTime;
    private Hill hill;
    private StartingList startingList;

    private List<Standing> standingList;
    private List<Jury> juryList;

    public Contest(LocalDateTime dateTime, Hill hill, StartingList startingList) {
        this.dateTime = dateTime;
        this.hill = hill;
        this.startingList = startingList;
        createJuryTeam();
        createStandingList();
    }

    private void createJuryTeam() {
        this.juryList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            juryList.add(new Jury(i + 1));
        }
    }

    private void createStandingList() {
        standingList = new ArrayList<>();
        for (Jumper jumper : startingList.getList()) {
            standingList.add(new Standing(jumper));
        }
    }

    @Override
    public String toString() {
        return "Contest results\n" +
                "date: " + dateTime +
                "\nhill: " + hill.getName() + "\n" +
                results();
    }

    private String results() {
        String results = "";
        for (int i = 1; i <= standingList.size(); i++) {
            results += "\n" + i + " place: " +
            standingList.get(i - 1).toString();
        }
        return results;
    }
}
