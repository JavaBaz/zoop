package com.github.JavaBaz.animals.mammals;

import com.github.JavaBaz.animals.AbstractAnimal;
import com.github.JavaBaz.infra.FoodType;
import com.github.JavaBaz.infra.Origin;

import java.time.LocalDate;

public abstract class AbstractMammal extends AbstractAnimal {


    public AbstractMammal(boolean isWild, String name, LocalDate dateOfBirth, int attackPower, int defencePower, Origin origin, FoodType foodType) {
        super(isWild, name, dateOfBirth, attackPower, defencePower, origin, foodType);
    }

    public void givingABirth(){
        System.out.println("Mammal named " + this.getName() + " is giving a birth");
    }
}
