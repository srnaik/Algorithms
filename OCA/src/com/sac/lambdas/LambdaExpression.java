package com.sac.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpression {


    public static void main(String[] args) {
        List<Animal> arlList = new ArrayList<>();
        arlList.add(new Animal("fish",false,true));
        arlList.add(new Animal("kangaroo",false,true));
        arlList.add(new Animal("rabbit",false,true));
        arlList.add(new Animal("turtle",true,true));
        print(arlList, a ->a.isCanHop());
    }

    public static void print(List<Animal> animals, Predicate<Animal> checker){
        for (Animal animal: animals){
            if(checker.test(animal)){
                System.out.println(animal.getSpecies() + " ");
            }
            System.out.println();
        }
    }
}
