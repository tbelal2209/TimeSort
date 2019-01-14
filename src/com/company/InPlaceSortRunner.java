package com.company;

public class InPlaceSortRunner {
    public static String[] bubbleSort(String[] list){
        for(int n=0; n < list.length-1; n++){
            if (0 > list[n+1].compareTo(list[n])) {
                SortingUtilis.Swap(list, n, n + 1);
                n= -1;
            }
        }
        return list;
    }

    public static double[] SelectionSort(double[] doubleArr){
        int lowest;
        for(int i=0; i<doubleArr.length-1;i++){
            lowest = i;
            for(int j=1; j<doubleArr.length-i;j++){
                if(doubleArr[lowest]>doubleArr[i+j]){
                    lowest = i+j;
                }
            }
            SortingUtilis.Swap(doubleArr,i,lowest);
        }
        return doubleArr;

    }
    public static int[] insertionSort(int[] testArr){

        for(int x=1; x<testArr.length;x++){
            for(int y=x; y>0;y--){

                if (testArr[y]<testArr[y-1])
                {
                    SortingUtilis.Swap(testArr,y,y-1);
                }
            }

        }
        return testArr;

    }


}