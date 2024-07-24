package com.example;


public class App 
{
    public static void main( String[] args ){
        BubbleSort bubbleSort = new BubbleSort();

        Integer[][] arrays = {
            {70, 61, 72, 83, 38},
            {7, 2, 76, 4, 99},
            {28, 9, 13, 78, 19},
            {68, 84, 41, 62, 18},
            {37, 57, 40, 13, 50}
        };

        for(Integer[] array : arrays){
            Integer[] sortedArray = bubbleSort.sort(array);
            for(int num : sortedArray){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
