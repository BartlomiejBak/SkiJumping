package pl.bartekbak.skijumping.domain.entity;

import org.junit.jupiter.api.Test;
import pl.bartekbak.skijumping.domain.enums.HillType;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void getHillType_NewHill_TypeMedium() {
        Hill hill = new Hill("name","location", 100, 90);
        HillType result = hill.getHillType();
        assertEquals(HillType.MEDIUM, result);
    }

    @Test
    void getHillType_NewHill_TypeLarge() {
        Hill hill = new Hill("name","location", 130, 120);
        HillType result = hill.getHillType();
        assertEquals(HillType.LARGE, result);
    }

    @Test
    void getHillType_NewHill_TypeMammoth() {
        Hill hill = new Hill("name","location", 200, 190);
        HillType result = hill.getHillType();
        assertEquals(HillType.MAMMOTH, result);
    }


}