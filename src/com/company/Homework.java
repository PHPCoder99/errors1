package com.company;

public class Homework {
    public static void main(String[] args) {
        stringLength();
        divideInts();
        nthElemArray();
        subtractArrays(new int[] {1, 2, 3, 4}, new int[] {1, 3, 3, 4});
        System.out.println();
        divideArrays(new int[] {4, 3, 2, 4}, new int[] {2, 1, 2, 1});
    }

    public static void stringLength(){
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public static void divideInts(){
        try {
            int a = 5;
            int b = 0;
            System.out.println(a/b);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static void nthElemArray(){
        try {
            int[] array = {1, 2, 3};
            int n = 5;
            System.out.println(array[n]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    public static void subtractArrays(int[] array1, int[] array2){
        try {
            int[] result = new int[array1.length];
            if (array1.length != array2.length){
                throw new RuntimeException("array lengths are not equal");
            }
            for (int i = 0; i < array1.length; i++) {
                result[i] = array1[i]/array2[i];
                System.out.print(result[i] + " ");
            }
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public static void divideArrays(int[] array1, int[] array2){
        try {
            int[] result = new int[array1.length];
            if (array1.length != array2.length){
                throw new RuntimeException("array lengths are not equal");
            }
            for (int i = 0; i < array1.length; i++) {
                result[i] = array1[i]/array2[i];
                System.out.print(result[i] + " ");
            }
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
