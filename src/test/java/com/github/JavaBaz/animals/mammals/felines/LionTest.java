package com.github.JavaBaz.animals.mammals.felines;

import com.github.JavaBaz.infra.FoodType;
import com.github.JavaBaz.infra.Origin;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LionTest {

    @Test
    @DisplayName("hp should not be more than 100")
    void hpShouldNotBeMoreThan100() {
        Lion testLion = new Lion(true,
                "nameOfTestLion",
                LocalDate.now(),
                3,
                2,
                Origin.AFRICA,
                FoodType.CARNIVORES);
        testLion.sleep();
        assertTrue(testLion.getHp() == 100);
    }

    @Test
    @DisplayName("hp should not be more than 100 - 1")
    void hpShouldNotBeMoreThan100_1() {
        Lion testLion = new Lion(true,
                "nameOfTestLion",
                LocalDate.now(),
                4,
                3,
                Origin.AFRICA,
                FoodType.CARNIVORES);
        testLion.setHp(99);
        testLion.sleep();
        assertTrue(testLion.getHp() == 100);
    }
}