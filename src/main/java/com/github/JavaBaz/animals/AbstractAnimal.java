package com.github.JavaBaz.animals;

import com.github.JavaBaz.infra.Origin;

import java.time.LocalDate;


public abstract class AbstractAnimal {

    protected int hp;
    protected boolean isWild;
    protected String name;
    protected LocalDate dateOfBirth;
    protected Origin origin;
    // TODO : add an enum named FoodType in infra
    //      containing these : HERBIVORE, CARNIVORES, OMNIVORES


    public AbstractAnimal(boolean isWild, String name, LocalDate dateOfBirth, Origin origin) {
        this.hp = 100;
        this.isWild = isWild;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    protected void sleep() {
    }

}
