package com.github.JavaBaz.animals;

import com.github.JavaBaz.infra.FoodType;
import com.github.JavaBaz.infra.Origin;

import java.time.LocalDate;


public abstract class AbstractAnimal {

    protected int hp;
    protected int attackPower;
    protected int defencePower;
    protected boolean isWild;
    protected String name;
    protected LocalDate dateOfBirth;
    protected Origin origin;
    protected FoodType foodType;

    public AbstractAnimal(boolean isWild, String name, LocalDate dateOfBirth, Origin origin, FoodType foodType) {
        this.hp = 100;
        this.attackPower = 3;
        this.defencePower = 2;
        this.isWild = isWild;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.origin = origin;
        this.foodType = foodType;
    }

    public String getName() {
        return name;
    }

    public void attack(AbstractAnimal attacker, AbstractAnimal defender) {
        if ((attacker.attackPower += 1) <= 5) {
            attacker.attackPower += 1;
        } else attacker.attackPower = 5;

        if ((defender.defencePower -= 1) >= 0) {
            defender.defencePower -= 1;
        } else defender.defencePower = 0;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPower() { return attackPower; }

    public void setAttackPower(int attackPower) { this.attackPower = attackPower; }

    public int getDefencePower() { return defencePower; }

    public void setDefencePower(int defencePower) { this.defencePower = defencePower; }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }
}
