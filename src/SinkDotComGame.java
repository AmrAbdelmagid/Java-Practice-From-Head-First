import java.util.ArrayList;

import gamelogic.DotCom;

public class SinkDotComGame {
    public static void main(String[] args) throws Exception {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        DotCom theDotCom = new DotCom();
        int randomNum = (int) (Math.random() * 5);

        ArrayList<String> locations = new ArrayList<String>();
        // locations = { randomNum, randomNum + 1, randomNum + 2 };
        for (int i = 0; i < 3; i++){
            randomNum ++;
            locations.add(String.valueOf(randomNum));
        }
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}