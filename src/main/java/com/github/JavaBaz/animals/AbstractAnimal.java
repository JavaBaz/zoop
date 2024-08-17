package com.github.JavaBaz.animals;

import com.github.JavaBaz.infra.FoodType;
import com.github.JavaBaz.infra.Origin;

import java.time.LocalDate;


public abstract class AbstractAnimal {

    protected int hp;
    protected boolean isWild;
    protected String name;
    protected LocalDate dateOfBirth;
    protected Origin origin;
    protected FoodType foodType;

    public AbstractAnimal(boolean isWild, String name, LocalDate dateOfBirth, Origin origin, FoodType foodType) {
        this.hp = 100;
        this.isWild = isWild;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.origin = origin;
        this.foodType = foodType;
    }

    public String getName() {
        return name;
    }

    protected void sleep() {
        if((this.hp += 5) <= 100) {
            this.hp += 5;
        } else this.hp = 100;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }
}
