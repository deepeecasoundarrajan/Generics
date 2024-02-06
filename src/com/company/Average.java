package com.company;

import java.util.*;


public class Average {
    public double average(List<? extends Number> numbers) {
        Double sum = 0.0;
        for(Number num: numbers) {
            sum += num.doubleValue();
        }
        return sum/numbers.size();
    }
}
