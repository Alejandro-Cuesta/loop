package dev.alejandro.loop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class TablaMultiplicacion {
         //For//
    public static void usingForLoop(int n) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
         //iteramos dentro un array//
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(n + " x " + numbers[i] + " = " + (n * numbers[i]));
        }
    }

        //FOREACH(con array)//
    public static void usingForeachLoop(int n) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int num : numbers) {
            System.out.println(n + " x " + num + " = " + (n * num));
        }
    }

        //WHILE(con array)//
    public static void usingWhileLoop(int n) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int i = 0;
        while (i < numbers.length) {
            System.out.println(n + " x " + numbers[i] + " = " + (n * numbers[i]));
            i++;
        }
    }

        //DO-WHILE(con array)
    public static void usingDoWhileLoop(int n) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int i = 0;
        do {
            System.out.println(n + " x " + numbers[i] + " = " + (n * numbers[i]));
            i++;
        } while (i < numbers.length);
    }

        //ITERATOR(con List)
    public static void usingIterator(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            int num = it.next();
            System.out.println(n + " x " + num + " = " + (n * num));
        }
    }
}
   