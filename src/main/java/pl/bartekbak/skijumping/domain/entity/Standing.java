package pl.bartekbak.skijumping.domain.entity;
import lombok.Data;
import pl.bartekbak.skijumping.domain.service.Jump;

@Data
public class Standing implements Comparable<Standing> {
    private Jumper jumper;
    private Jump qualificationJump;
    private Jump firstRoundJump;
    private Jump secondRoundJump;

    private double qualificationNote;
    private double firstRoundNote;
    private double secondRound;
    private double totalNote;

    public Standing(Jumper jumper) {
        this.jumper = jumper;
    }

    @Override
    public int compareTo(Standing standing) {
        if (this.totalNote > standing.totalNote)
        return 1;
        else return this.totalNote == standing.totalNote ? 0 : -1;
    }
}
