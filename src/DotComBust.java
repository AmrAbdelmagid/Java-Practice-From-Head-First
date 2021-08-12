import java.util.ArrayList;

import gamelogic.DotCom;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        DotCom two = new DotCom();
        DotCom three = new DotCom();
        one.setName("Pets.com");
        two.setName("eToys.com");
        three.setName("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom com : dotComsList){
            ArrayList<String> locations = helper.placeDotCom(3);
            com.setLocationCells(locations);
        }
    }
}
