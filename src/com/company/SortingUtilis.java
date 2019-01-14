package com.company;

public class SortingUtilis {

    public SortingUtilis(int[] copyTestArr) {
    }

    //swaps
    public static void Swap(int[]testArr,int x,int y){
        int temp;
        temp = testArr[x];
        testArr[x]=testArr[y];
        testArr[y]=temp;
    }
    public static void Swap(String[] list, int x, int y) {
        String temp = list[x];
        list[x] = list[y];
        list[y] = temp;
    }

    public static void Swap(double[] doubleArr, int i, int j) {
        double temp = doubleArr[i];
        doubleArr[i] = doubleArr[j];
        doubleArr[j] = temp;
    }

    public static String[] randomStringArr(int count, int letters) {
        String[] randomStringArr = new String[count];
        while (count > 0) {
            String x = "";
            for (int i = 0; i < letters; i++) {             //amount of letters for each word are given here
                char y = (char) ((Math.random() * 26) + 97);
                x = x + y;
            }
            count--;
            randomStringArr[count] = x;
        }
        return randomStringArr;
    }

    public static int[] IntARR(int count, int i){
        int[] randomIntArr = new int[count];
        for(int n=0;n<count-1;n++){
            randomIntArr[n]=(int)(Math.random()*1001);
        }
        return randomIntArr;
    }
    public static double[] TimesArr(int count){
        double[] randomdoubleArr = new double[count];
        for(int n=0;n<count-1;n++){
            randomdoubleArr[n]=(int)(Math.random()*1001);
        }
        return randomdoubleArr;
    }



    public static boolean isSorted(int[]testArr)
    {
        for (int n = 0; n < testArr.length - 1; n++) {
            if (testArr[n] > testArr[n + 1]) {
                SortingUtilis.Swap(testArr, n, n + 1);
            }
        }
        return true;
    }
    public static boolean isSorted(double[] doubleArr)
    {
        for (int n = 0; n < doubleArr.length - 1; n++) {
            if (doubleArr[n] > doubleArr[n + 1]) {
                SortingUtilis.Swap(doubleArr, n, n + 1);
            }
        }
        return true;
    }
    public static boolean isSorted(String[] list)
    {
        for (int n = 0; n < list.length - 1; n++) {
            if (0 > list[n+1].compareTo(list[n])) {
                SortingUtilis.Swap(list, n, n + 1);
            }
        }
        return true;
    }


    public static int[] SameArr(int[] testArr)
    {
        int[] copytestArr=new int[10];
        for (int n = 0; n < testArr.length ; n++) {
            copytestArr[n]= testArr[n];
        }
        return copytestArr;
    }
    public static String[] copylist(String[] list)
    {
        String[] copylist=new String[10];
        for (int n = 0; n < list.length ; n++) {
            copylist[n]=list[n];
        }
        return copylist;
    }
    public static double[] Same2Arr(double[] doubleArr)
    {
        double[] copydoubleArr=new double[10];
        for (int n = 0; n < doubleArr.length ; n++) {
            copydoubleArr[n]= doubleArr[n];
        }
        return copydoubleArr;
    }

    public static boolean checkSum(double[] before, double[] after) {
        double beforesum = 0;
        double aftersum = 0;
        for (int b = 0; b < before.length; b++) {
            beforesum = beforesum + before[b];
        }
        for (int a = 0; a < after.length; a++) {
            aftersum = aftersum + after[a];
        }
        if (aftersum == beforesum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean checkSum(int[] before, int[] after) {
        int beforesum = 0;
        int aftersum = 0;
        for (int b = 0; b < before.length; b++) {
            beforesum = beforesum + before[b];
        }
        for (int a = 0; a < after.length; a++) {
            aftersum = aftersum + after[a];
        }
        if (aftersum == beforesum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}