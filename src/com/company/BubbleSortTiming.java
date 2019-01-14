package com.company;

public class BubbleSortTiming {
    public static void main(String[] args) {
        System.out.println("Creating Random Int Array...");
        int[] testArr = (int[]) SortingUtilis.IntARR(1000000, 100000);
        System.out.println("Copying Array...");
        int[] copyTestArr = SortingUtilis.SameArr(testArr);
        long timeStart = 0;
        long timeStop = 0;

        System.out.println("Sorting using bubbleSort()");
        timeStart = System.nanoTime();
        new SortingUtilis(copyTestArr);
        timeStop = System.nanoTime() - timeStart;

        System.out.println("Time for bubbleSort() :" + timeStop + " nanoseconds");

    }
}


