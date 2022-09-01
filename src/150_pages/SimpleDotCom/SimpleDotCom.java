import java.io.*;
class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try{
            BufferedReader is ф= new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";

        for(int cell : locationCells) {
            if(guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}

class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int random = (int)(Math.random() * 5);
        int[] location = {random, random + 1, random + 2};
        theDotCom.setLocationCells(location);
        boolean isAlive = true;

        while(isAlive == true) {
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess);
            numOfGuess++;
            if(result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Ваи потребовалось " + numOfGuess + " попыток(и)");
            }
        }
    }
}