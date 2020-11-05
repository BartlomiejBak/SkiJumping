package pl.bartekbak.skijumping.domain.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.bartekbak.skijumping.domain.enums.JumpStyle;
import pl.bartekbak.skijumping.domain.service.Jump;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class JuryTest {

    @Mock
    Jump jump;

    Jury jury;
    double note;

    @BeforeEach
    void setUp() {
        jury = new Jury(1);
        note = 0;
    }

    @Test
    void evaluate_LandingIsFallFlightIsExcellent_assert12To13() {
        //given
        given(jump.isFall()).willReturn(true);
        given(jump.getFlightStyle()).willReturn(JumpStyle.EXCELLENT);
        //when
        note = jury.evaluate(jump);
        System.out.println(note);
        //then
        assertTrue(note >= 12 && note <= 13);
    }

    @Test
    void evaluate_LandingIsSupportedFlightIsExcellent_assert14to16() {
        //given
        given(jump.isSupportedLanding()).willReturn(true);
        given(jump.getFlightStyle()).willReturn(JumpStyle.EXCELLENT);
        //when
        note = jury.evaluate(jump);
        System.out.println(note);
        //then
        assertTrue(note >= 14 && note <= 16);
    }

    @Test
    void evaluate_LandingNoTelemarkFlightIsExcellent_assert17to18() {
        //given
        given(jump.getFlightStyle()).willReturn(JumpStyle.EXCELLENT);
        //when
        note = jury.evaluate(jump);
        System.out.println(note);
        //then
        assertTrue(note >= 17 && note <= 18);
    }

    @Test
    void evaluate_LandingTelemarkFlightIsExcellent_assert19to20() {
        //given
        given(jump.isTelemark()).willReturn(true);
        given(jump.getFlightStyle()).willReturn(JumpStyle.EXCELLENT);
        //when
        note = jury.evaluate(jump);
        System.out.println(note);
        //then
        assertTrue(note >= 19 && note <= 20);
    }

    @Test
    void evaluate_LandingNoTelemarkFlightIsNice_assert16to16AndHalf() {
        //given
        given(jump.getFlightStyle()).willReturn(JumpStyle.NICE);
        //when
        note = jury.evaluate(jump);
        System.out.println(note);
        //then
        assertTrue(note >= 16 && note <= 16.5);
    }

    @Test
    void evaluate_LandingNoTelemarkFlightIsPoor_assert15to15AndHalf() {
        //given
        given(jump.getFlightStyle()).willReturn(JumpStyle.POOR);
        //when
        note = jury.evaluate(jump);
        System.out.println(note);
        //then
        assertTrue(note >= 15 && note <= 15.5);
    }

    @Test
    void evaluate_LandingNoTelemarkFlightIsMStyle_assert13to14AndHalf() {
        //given
        given(jump.getFlightStyle()).willReturn(JumpStyle.MSTYLE);
        //when
        note = jury.evaluate(jump);
        System.out.println(note);
        //then
        assertTrue(note >= 13 && note <= 14.5);
    }

    @Test
    void evaluate_noJump_assertEquals0() {
        //given
        jump = null;
        //when
        note = jury.evaluate(jump);
        System.out.println(note);
        //then
        assertTrue(note == 0);
    }
}