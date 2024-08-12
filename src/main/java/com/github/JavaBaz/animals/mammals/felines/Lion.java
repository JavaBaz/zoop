package com.github.JavaBaz.animals.mammals.felines;

import com.github.JavaBaz.infra.Origin;

import java.time.LocalDate;

public class Lion extends AbstractFelines {

    public Lion(boolean isWild, String name, LocalDate dateOfBirth, Origin origin) {
        super(isWild, name, dateOfBirth, origin);
    }
}
