package pl.bartekbak.skijumping.domain.entity;
import lombok.Data;
import pl.bartekbak.skijumping.domain.service.Jump;

import static pl.bartekbak.skijumping.ui.MainView.noteFormat;

@Data
public class Standing implements Comparable<Standing> {
    private Jumper jumper;
    private Jump qualificationJump;
    private Jump firstRoundJump;
    private Jump secondRoundJump;

    private double qualificationNote;
    private double firstRoundNote;
    private double secondRoundNote;
    private double totalNote;

    public Standing(Jumper jumper) {
        this.jumper = jumper;
    }

    @Override
    public int compareTo(Standing standing) {
        if (this.totalNote < standing.totalNote)
        return 1;
        else return this.totalNote == standing.totalNote ? 0 : -1;
    }

    @Override
    public String toString() {
        String result = "Jumper " + jumper.getStartingNo();
        if (firstRoundJump == null) {
            return result +
                    ", qualification jump length = " + noteFormat.format(qualificationJump.getJumpLength()) +
                    "m, qualification jump note = " + noteFormat.format(qualificationNote);
        } else if (secondRoundJump == null) {
            return result +
                    ", first round jump length = " + noteFormat.format(firstRoundJump.getJumpLength()) +
                    "m, first round note = " + noteFormat.format(firstRoundNote) +
                    ", total note = " + noteFormat.format(totalNote);
        }
        return  result +
                ", first round jump length = " + noteFormat.format(firstRoundJump.getJumpLength()) +
                "m, first round note = " + noteFormat.format(firstRoundNote) +
                ", second round jump length = " + noteFormat.format(secondRoundJump.getJumpLength()) +
                "m, second round note = " + noteFormat.format(secondRoundNote) +
                ", total note = " + noteFormat.format(totalNote);
    }
}
