package com.asalega;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

            guessingGame();

        }

    public static void guessingGame(){
        System.out.println("Type range for random numbers generator." + "\n" + "First number:");
        int firstNumber = sc.nextInt();
        System.out.println("Type border number:");
        int secondNumber = sc.nextInt();

        int randomNumber = getRandomNumberInRange(firstNumber, secondNumber);
        String finalMessage = (guessingMethod(randomNumber)) ? "You guessed it!" : "Sorry you didn't guess the " +
                "number, the answer was: " + randomNumber;
        System.out.println(finalMessage);
    }


    public static boolean guessingMethod(int numberToGuess){
        System.out.println("Please try to guess the drawn number:");
        int numberGivenByUser = sc.nextInt();
        for (int i = 0; i < 5; i++){
            if(i>0){
                System.out.print("Type another number:");
                numberGivenByUser = sc.nextInt();
            }
            if(numberGivenByUser == numberToGuess){
                return true;
            }
            else if(i==4) break;

            else if(numberGivenByUser>numberToGuess){
                System.out.println("Your number is GREATER than the one you are trying to guess");
            }
            else{
                System.out.println("Your number is LOWER than the one you are trying to guess");
            }
                System.out.println("Please try again, you have " + (4 - i) +  " remaining attemts");
        }
        return false;
    }

    public static int getRandomNumberInRange(int origin, int bound){
        return new Random().nextInt(origin, bound+1);
    }
}

//Gra w zgadywanie polegająca na tym, że program losuje liczbę, a użytkownik próbuje ją odgadnąć.

//Wymagania:
//1. Program losuje liczbę z zakresu 0-99.
//2. Program wyświetla komunikat z prośbą o rozpoczęcie zgadywania liczby całkowitej z zakresu 0-99
//3. Program wczytuje liczbę wpisaną przez użytkownika.
//4. Użytkownik powinien mieć maksymalnie 5 prób zgadywania.
//5. Zachowanie programu podczas podania niepoprawnej liczby:
//- w przypadku podania zbyt dużej liczby wypisać do konsoli: "Your number is GREATER than the one you are trying to guess"
//- w przypadku podania zbyt małej liczby wypisać do konsoli: "Your number is LOWER than the one you are trying to guess"
//- podać ile prób zostało mu do końca.
//- jeżeli nie była to jego ostatnia próba to wypisać tekst: "Please try again"
//6. Jeżeli użytkownik zgadł liczbę, program powinien wydrukować tekst "You guessed it!"
//7. Jeżeli w ciągu 5 prób nie udało się odgadnąć liczby użytkownik, program ma wydrukować wiadomość:
//"Sorry you didn't guess the number, the answer was: "
//oraz dopisać do niej jaka była wartość liczby której nie udało się odgadnąć