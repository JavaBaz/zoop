package com.github.JavaBaz.animals.mammals.felines;

import com.github.JavaBaz.animals.mammals.AbstractMammal;
import com.github.JavaBaz.infra.FoodType;
import com.github.JavaBaz.infra.Origin;

import java.time.LocalDate;

public abstract class AbstractFelines extends AbstractMammal {


    public AbstractFelines(boolean isWild, String name, LocalDate dateOfBirth, Origin origin, FoodType foodType) {
        super(isWild, name, dateOfBirth, origin, foodType);
    }

    @Override
     public void sleep() {
          System.out.println(getName()+" is sleeping between 12 and 18 hours");

          if((this.hp += 25) <= 100){
              this.hp += 25;
          } else
              this.hp = 100;
    }


}
