package pl.bartekbak.skijumping.domain.service;

import pl.bartekbak.skijumping.domain.entity.Contest;
import pl.bartekbak.skijumping.domain.entity.Jury;
import pl.bartekbak.skijumping.domain.entity.Standing;

import java.util.*;

public class ContestService {
    private Contest contest;

    public ContestService(Contest contest) {
        this.contest = contest;
    }

    public void runQualificationRound() {
        jumpQualification();
        setQualificationNotes();
        sortStandings();
        showResults();
    }

    public void runFirstRound() {
        jumpFirstRound();
        setFirstRoundNotes();
        sortStandings();
        showResults();
    }

    public void runSecondRound() {
        jumpSecondRound();
        setFinalRoundNotes();
        sortStandings();
        showResults();
    }

    private void jumpQualification() {
        for (Standing standing : contest.getStandingList()) {
            standing.setQualificationJump(new Jump(standing.getJumper(), contest.getHill()));
            standing.getQualificationJump().takeJump();
        }
    }

    private void setQualificationNotes() {
        for (Standing standing : contest.getStandingList()) {
            double note = rateJump(standing.getQualificationJump(), contest.getJuryList());
            standing.setQualificationNote(note);
            standing.setTotalNote(note);
        }
    }

    private void jumpFirstRound() {
        Standing lastJumper = contest.getStandingList().get(49);
        for (Standing standing : contest.getStandingList()) {
            if (standing.getTotalNote() >= lastJumper.getTotalNote()) {
                standing.setFirstRoundJump(new Jump(standing.getJumper(), contest.getHill()));
                standing.getFirstRoundJump().takeJump();
            }
        }
    }

    private void setFirstRoundNotes() {
        Standing lastJumper = contest.getStandingList().get(49);
        for (Standing standing : contest.getStandingList()) {
            if (standing.getFirstRoundJump() != null) {
                double note = rateJump(standing.getFirstRoundJump(), contest.getJuryList());
                standing.setFirstRoundNote(note);
                standing.setTotalNote(note);
            } else {
                standing.setTotalNote(0.0);
            }
        }
    }

    private void jumpSecondRound() {
        Standing lastJumper = contest.getStandingList().get(29);
        for (Standing standing : contest.getStandingList()) {
            if (standing.getTotalNote() >= lastJumper.getTotalNote()) {
                standing.setSecondRoundJump(new Jump(standing.getJumper(), contest.getHill()));
                standing.getSecondRoundJump().takeJump();
            }
        }
    }

    private void setFinalRoundNotes() {
        Standing lastJumper = contest.getStandingList().get(29);
        for (Standing standing : contest.getStandingList()) {
            if (standing.getSecondRoundJump() != null) {
                double note = rateJump(standing.getSecondRoundJump(), contest.getJuryList());
                standing.setSecondRoundNote(note);
                standing.setTotalNote(standing.getTotalNote() + note);
            }
        }
    }

    private double rateJump(Jump jump, List<Jury> juryList) {
        List<Double> notes = new ArrayList<>();
        for (Jury jury : juryList) {
            notes.add(jury.evaluate(jump));
        }
        return jump.getJumpLengthNote() + getJuryMiddleNotes(notes);
    }

    private double getJuryMiddleNotes(List<Double> notes) {
        if (notes.size() != 5) return 0;
        Collections.sort(notes);
        return notes.get(1) + notes.get(2) + notes.get(3);
    }

    private void sortStandings(){
        Collections.sort(contest.getStandingList());
    }

    private void showResults() {
        System.out.println(contest.toString());
    }
}
