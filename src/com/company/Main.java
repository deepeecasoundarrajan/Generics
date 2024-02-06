package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        genericPair gp = new genericPair();
        gp.id = 3;
        gp.name = "NewPair";

        System.out.println(gp.toString());

        GenericObject<Integer, String> gObject = new GenericObject(1, "Deepeeca");
        System.out.println(gObject.getSomething());
        System.out.println(gObject.name.length());

        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5);
        List<String> stringList = List.of("aa", "bb", "cc", "dd", "ee");

        Average av = new Average();
        System.out.println(av.average(intList));
        System.out.println(av.average(doubleList));

    }
}
