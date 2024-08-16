package com.github.JavaBaz.animals.mammals.primates;

import com.github.JavaBaz.animals.mammals.AbstractMammal;
import com.github.JavaBaz.infra.FoodType;
import com.github.JavaBaz.infra.Origin;

import java.time.LocalDate;

public abstract class AbstractPrimates extends AbstractMammal {
    public AbstractPrimates(boolean isWild, String name, LocalDate dateOfBirth, Origin origin, FoodType foodType) {
        super(isWild, name, dateOfBirth, origin, foodType);
    }
}