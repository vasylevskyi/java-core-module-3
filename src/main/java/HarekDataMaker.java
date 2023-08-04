package main.java;

import java.util.Arrays;

/**
 * Module 3 Task 14
 */

public class HarekDataMaker {

    public String aggregateSingle(String name, String age, String planet) {
//        String[] aggregateArray = new String[] {name, age, planet};
//        return Arrays.toString(aggregateArray);
        return "name - " + name + ", " + "age - " + age + ", " + "planet - " + planet;
    }
    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {
        String[] aggregateAllArray = new String[names.length];
        String outputString = new String();
        for (int i = 0; i < names.length; i++) {
            if (i == names.length) {
                aggregateAllArray[i] = aggregateSingle(names[i], Integer.toString(ages[i]), planets[i]);
            } else aggregateAllArray[i] = aggregateSingle(names[i], Integer.toString(ages[i]), planets[i]);
        }
        return aggregateAllArray;
    }


    public static void main(String[] args) {
        String[] names = new String[] {"hter", "pou", "diz"};
        int[] ages = new int[] {30, 35, 70};
        String[] planets = new String[] {"Mars", "Earth", "Jupiter"};

        HarekDataMaker harekDataMaker = new HarekDataMaker();

        System.out.println(harekDataMaker.aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]));
        System.out.println("###");

        System.out.println(Arrays.toString(harekDataMaker.aggregateAll(names, ages, planets)));
    }


}
