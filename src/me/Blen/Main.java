package me.Blen;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] stringArrays = new String[5];
        double[] doubleArrays = new double[5];
        int[] intArrays = new int[5];

        stringArrays[0]="First String";
        stringArrays[1]="Second String";
        stringArrays[2]="Third String";
        stringArrays[3]="Fourth String";
        stringArrays[4]="Fifth String";

        intArrays[0]=1582;
        intArrays[1]=2845;
        intArrays[2]=4;
        intArrays[3]=6;
        intArrays[4]=8;

        doubleArrays[0]=3.142;
        doubleArrays[1]=1.115;
        doubleArrays[2]=3.248;
        doubleArrays[3]=5.258;
        doubleArrays[4]=5.000;

        for(int index=0; index<stringArrays.length; index++){
            System.out.printf("\nThis is the unsorted array of String %s", stringArrays[index]);
        }


        for(int index=0; index<stringArrays.length; index++){
            Arrays.sort(stringArrays);
            System.out.printf("\nThis is the sorted array of Strings %s", stringArrays[index]);
        }

        for(int index=0; index<intArrays.length; index++){
            System.out.printf("\nThis is the unsorted array of integers %s", intArrays[index]);
        }

        for (int index2=0; index2<intArrays.length; index2++) {
            Arrays.sort(intArrays);
            System.out.printf("\nThis is the sorted array of Integers %d", intArrays[index2]);
        }
        for(int index=0; index<doubleArrays.length; index++){
            System.out.printf("\nThis is the unsorted array of doubles %s", doubleArrays[index]);
        }

        for (int index3=0; index3<doubleArrays.length; index3++){
            Arrays.sort(doubleArrays);
            System.out.printf("\nThis is the sorted array of doubles %f", doubleArrays[index3]);
        }

    }
}
