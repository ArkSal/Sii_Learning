package com.asalega;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_2 {

    public static void main(String[] args) {

        runApplication();

    }

    public static void runApplication() {
        int[] intArray = getNewEmptyArray();
        System.out.println("Array with " + intArray.length + " indexes created");
        fillArrayWithSummaryMessage(intArray);
    }

    private static int[] getNewEmptyArray() {
        int correctArraySize = getPositiveIntegerFromScanner();
        return new int[correctArraySize];
    }

    private static int[] fillArrayWithSummaryMessage(int[] array) {
        int[] temporaryArray = new int[array.length];
        double averageValue = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Type integer to fill index: " + (i + 1));
            temporaryArray[i] = getIntegerFromScanner();
            averageValue += temporaryArray[i];
        }
        averageValue /= temporaryArray.length;
        if (averageValue == (int) averageValue) {
            System.out.println("Average value of array numbers is: " + (int) averageValue);
        } else {
            System.out.println("Average value of array numbers is: " + averageValue);
        }

        Integer[] wrappedInts = Arrays.stream(temporaryArray)
                .boxed()
                .toArray(Integer[]::new);
        System.out.println("Maximum array value is: " + Collections.max(Arrays.asList(wrappedInts)));
        return temporaryArray;
    }

    private static int getPositiveIntegerFromScanner() {
        int positiveInteger;
        do {
            System.out.print("Type positive integer number for array size:");
            positiveInteger = getIntegerFromScanner();
        } while (positiveInteger <= 0);

        return positiveInteger;
    }

    private static int getIntegerFromScanner() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("It's not integer, please type integer number!: ");
        }
        int result = sc.nextInt();
        sc.nextLine();
        return result;
    }


}


//int size = 5;
//int[] numbers = new int[size];
//
//Powyższy kod pozwala na stworzenie tablicy gdzie ilość elementów jest zależna o wartości zmiennej. Wykorzystaj to w
// poniższym programie:

//1. Program powinien poprosić użytkownika o podanie liczby całkowitej.
//2. Następnie program powinien stworzyć tablicę po podanym przez użytkownika rozmiarze.
//3. Następnie poprosić użytkownika o podanie liczb aby zapełnić nimi tablicę
// (jeżeli użytkownik w pkt 1 podał liczbę 5 jako rozmiar, to w pkt 3 oczekujemy że poda 5 liczb i każda z nich zapiszemy w tablicy)
//4. Po zakończeniu wpisywania liczb przez użytkownika, program powinien wypisać jaka była średnia liczb wprowadzonych
// przez użytkownika oraz wartość maksymalna