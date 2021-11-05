package Learning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String driver = "ChromeDriver";

        if (driver.equals("FireFox driver")) {
            System.out.println("Firefox driver");
        } else {
            System.out.println("Not available");
        }
        // #################################
        String driver2 = Main.setDriver("OperaDriver");  // ctrl +kliknięcie -> przekierowuje do deklaracji metody

        switch (driver2) {
            case "ChromeDriver":
                //jakiś kod
                System.out.println("Chrome");
                break;
            case "OperaDriver":
                //jakiś kod
                System.out.println("Opera");
                break;
            default:
                //jakiś kod
                System.out.println("Another driver");
        }

        // #################################

        int[] arrayNumbers;
        int arrayNumbers2[];

        arrayNumbers = new int[10];
        arrayNumbers[0] = 1;
        arrayNumbers[1] = 1;
        arrayNumbers[2] = 2;
        arrayNumbers[3] = 3;
        arrayNumbers[4] = 5;

        System.out.println(arrayNumbers[4]);

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        Movie[] moviesArray = new Movie[2];
        moviesArray[0] = new Movie();
        moviesArray[1] = new Movie();

        System.out.println(moviesArray.length);

        for (String day : daysOfWeek) {
            System.out.println(day);
        }
        System.out.println("#############################");

        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println(daysOfWeek[i]);
        }

        // #################################

        String szkolenie = "Szkolenie Z Selenium + Java :) ";
        System.out.println(szkolenie.length());
        System.out.println(szkolenie.charAt(5));

        // #################################

        char znak = '!';
        System.out.println(znak);
        char[] tabznakow = {'A', 'g', 'K', '#'};

        System.out.println("Znaki ASCI");

        char jakisznak = 64;
        System.out.println(jakisznak);

        // #################################
        System.out.println("KOLEKCJE");

        List<Movie> greatMoviesList = new ArrayList<>();
        greatMoviesList.add(new Movie());
        greatMoviesList.add(new Movie());
        greatMoviesList.add(new Movie());
        greatMoviesList.add(new Movie());
        greatMoviesList.add(new Movie());

        System.out.println(greatMoviesList.size());

        List<Movie> badMoviesList = new ArrayList<>();
        badMoviesList.add(new Movie());
        badMoviesList.add(new Movie());
        badMoviesList.add(new Movie());
        System.out.println(badMoviesList.size());

        greatMoviesList.addAll(badMoviesList);

        System.out.println(greatMoviesList.size());

        badMoviesList.clear();
        System.out.println("BadMovies after erase: " + badMoviesList.size());

        System.out.println(badMoviesList.isEmpty());

        List<String> participants  = new ArrayList<>();
        participants.add("Mateusz");
        participants.add("Dariusz");
        participants.add("Adrian");
        participants.add("Adrian");
        participants.add(0, "Kinga");
        for(String participant : participants){
            System.out.println(participant);
        }

        System.out.println(participants.get(2));
        System.out.println(participants.indexOf("Kinga"));
        System.out.println(participants.remove("Mateusz"));
        System.out.println(participants.remove("Adrian"));
        for (String participant : participants){
            System.out.println(participant);
        }

        // ################################# Set


        Set<String> participantsSet = new HashSet<>();
        participantsSet.add("Mateusz");
        participantsSet.add("Dariusz");
        participantsSet.add("Kasia");
        participantsSet.add("Kasia");
        for(String participant : participantsSet){
            System.out.println(participant);
        }

    }


    private static String setDriver(String driver) {
        return driver;
    }
}