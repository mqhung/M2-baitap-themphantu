package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 0};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter index you want insert:");
        int index = input.nextInt();
        System.out.print("Enter value you want insert:");
        int insertValue = input.nextInt();
        addArray(index, insertValue, array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void addArray(int index, int value, int[] arr) {
        for (int j = arr.length - 1; j > index; j--) {
            arr[j] = arr[j-1];
        }
        arr[index] = value;
    }
}
