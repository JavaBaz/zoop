package com.github.JavaBaz;

import com.github.JavaBaz.animals.mammals.felines.Lion;
import com.github.JavaBaz.infra.Origin;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Welcome to my Zoo :)");

        Lion shirshah = new Lion(true,
                            "shirshah",
                LocalDate.now(),
                Origin.AFRICA);


        shirshah.sleep();
    }
}