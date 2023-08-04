package main.java;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Module 3 Tasks 6-13
 */

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[] {age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        String strNames = names[0] + " AND " + names[9] + " TOGETHER";
        return strNames;
    }
    public void changeElectResult(String[] results) {
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
    }

    public String[] changeElectResultAgain(String[] results) {
        String[] againResults = new String[3];
        System.arraycopy(results, 2, againResults, 0, 3);
        return againResults;
    }
    public char[][] createKeyboard() {
        return new char[][] {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };
    }
    public void printKeyboard() {
        char[][] keybord = createKeyboard();
        for (int i = 0; i < keybord.length; i++ ) {
            System.out.println(Arrays.toString(keybord[i]));
        }
/*
        OR
        System.out.println(Arrays.toString(keyboard[0]));
        System.out.println(Arrays.toString(keyboard[1]));
        System.out.println(Arrays.toString(keyboard[2]));
        System.out.println(Arrays.toString(keyboard[3]));
*/
    }
    public String[] makeCopy(String[] names) {
        String[] copyOfNames = Arrays.copyOf(names, names.length);
        System.out.println("Copied!");
        return copyOfNames;
    }



    public static void main(String[] args) {
        String[] source = new String[] {"Hero", "Mihu"};
        String[] copy = new HarekCity().makeCopy(source);

        source[0] = "CHANGED!"; //Мы меняем исходный массив, но на копии это не отображается

        System.out.println(Arrays.toString(copy));
    }

}
