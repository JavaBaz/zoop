package com.github.JavaBaz;

import com.github.JavaBaz.animals.mammals.felines.AbstractFelines;
import com.github.JavaBaz.animals.mammals.felines.Lion;
import com.github.JavaBaz.animals.mammals.primates.Orangutan;
import com.github.JavaBaz.infra.FoodType;
import com.github.JavaBaz.infra.Origin;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Welcome to my Zoo :)");

        Lion shirshah = new Lion(true,
                            "shirshah",
                LocalDate.now(),
                Origin.AFRICA,
                FoodType.CARNIVORES);

        shirshah.sleep();


        Orangutan boufal = new Orangutan(false,
                "boufal",
                LocalDate.now().minusMonths(4),
                Origin.ASIA,
                FoodType.OMNIVORES);



        shirshah.attack(boufal);


    }
}