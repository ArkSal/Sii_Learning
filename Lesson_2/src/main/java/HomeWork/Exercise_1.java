package HomeWork;

import com.github.curiousoddman.rgxgen.RgxGen;

public class Exercise_1 {

    public static void main(String[] args) {

        System.out.println(tokenGenerator(numberOfCharacters.DZIESIEC));

    }

    public static String tokenGenerator(numberOfCharacters signValue) {
        int tokenLength = signValue.charAmount;

        switch (signValue) {
            case PIEC:
                return stringCreator(tokenLength);

            case DZIESIEC:
                return stringCreator(tokenLength);

            default:
                return stringCreator(tokenLength);
        }
    }

    public enum numberOfCharacters {
        PIEC(5),
        DZIESIEC(10),
        PIETNASCIE(15);

        int charAmount;

        numberOfCharacters(int amount) {
            this.charAmount = amount;
        }
    }

    ///////////////////////////////////////////////////
    private static String stringCreator(int tokenLength) {
        RgxGen rgxGen = new RgxGen("[a-zA-Z0-9!@#$%^&*()]{" + tokenLength + "}");
        return rgxGen.generate();
    }
//////////////////////Using for loop and ASCI char, also working -> instead of method above
/*      private static String stringCreator(int tokenLength){
            var returnedToken = new StringBuilder();
            for(int i=0; i<tokenLength; i++){
            returnedToken.append(getRandomChar());
        }
        return returnedToken.toString();
    }


        private static char getRandomChar(){
             Random random = new Random();
             return (char)(random.nextInt( 33, 128));
    */
    //////////////////////////////////////////

}


/*
Zaimplementuj metodę Java - tokenGenerator().
                1. Liczba parametrów - dowolne
                2. Nazwa - tokenGenerator()
                3. Return - zwraca token
                4. token - to ciąg randomowych znaków [a-z][A-Z][0-9][!@#$%^&*()] - o dowolnej długości
                3  Metoda generuje 3 różne wersje tokenów w zależności od potrzeby usera:  5-znakowy, 10-znakowy oraz 15-znakowy

                Przykład tokena 5 znakowego - g4#2%
                Przykład tokena 10 znakowego - g4#2%hQQ5^
                Przykład tokena 15 znakowego - g4#2%hQQ5^YY5!2*/
