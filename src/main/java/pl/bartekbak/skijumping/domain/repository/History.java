package pl.bartekbak.skijumping.domain.repository;

import pl.bartekbak.skijumping.domain.entity.Contest;

import java.util.ArrayList;
import java.util.List;

public class History {
    private static History historyInstance;
    private List<Contest> contestList;

    private History() {
        this.contestList = new ArrayList<>();
    }

    public static History getInstance() {
        if (historyInstance == null) return new History();
        return historyInstance;
    }

    public List<Contest> getContestList() {
        return contestList;
    }

    public void addContest(Contest contest) {
        contestList.add(contest);
    }
}
