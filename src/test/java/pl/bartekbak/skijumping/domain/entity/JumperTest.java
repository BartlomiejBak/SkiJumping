package pl.bartekbak.skijumping.domain.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumperTest {

    Jumper jumper;

    @BeforeEach
    void setUp() {
        jumper = new Jumper(1);
    }

    @Test
    void getTakeOffSkill_assertIsInRange() {
        //given
        int takeOffSkill;
        //when
        takeOffSkill = jumper.getTakeOffSkill();
        //then
        assertTrue(takeOffSkill <= 100 && takeOffSkill >= 0);
    }

    @Test
    void getFlightSkill_assertIsInRange() {
        //given
        int flightSkill;
        //when
        flightSkill = jumper.getFlightSkill();
        //then
        assertTrue(flightSkill <= 100 && flightSkill >= 0);
    }

    @Test
    void getLandingSkill_assertIsInRange() {
        //given
        int landingSkill;
        //when
        landingSkill = jumper.getLandingSkill();
        //then
        assertTrue(landingSkill <= 100 && landingSkill >= 0);
    }
}