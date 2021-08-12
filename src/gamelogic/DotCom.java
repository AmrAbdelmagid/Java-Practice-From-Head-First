package gamelogic;

import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells = new ArrayList<String>();
    private String dotComName; 

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String name){
        dotComName = name;
    }

    public String checkYourself(String userInput) {
        String result = "miss";

        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }

        System.out.println(result);

        return result;
    }

}

// private int[] locationCells;
// private boolean[] hitsCells = {false,false,false};
// private int numOfHits = 0;

// for (int cell : locationCells) {

// if (guess == cell) {
// result = "hit";
// numOfHits++;
// break;
// }
// }

// this code is not a part of the book but it is a suggested way to solve the
// issue (but bad practice), and I applied it just to practice how to think.

// for (int i = 0 ; i < locationCells.length; i++) {
// if (guess == locationCells[i] && !hitsCells[i] ) {
// result = "hit";
// numOfHits++;
// hitsCells[i] = true;
// break;
// } else if (hitsCells[i]){
// if (guess == locationCells[i])
// result = "This value was hit, enter another one";
// }
// }

// if (numOfHits == locationCells.length) {
// result = "kill";
// }