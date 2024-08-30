package com.github.JavaBaz.animals.mammals.felines;

import com.github.JavaBaz.infra.FoodType;
import com.github.JavaBaz.infra.Origin;

import java.time.LocalDate;

public class Lion extends AbstractFelines {
    public Lion(boolean isWild, String name, LocalDate dateOfBirth, int attackPower, int defencePower, Origin origin, FoodType foodType) {
        super(isWild, name, dateOfBirth, attackPower, defencePower, origin, foodType);
    }
}
