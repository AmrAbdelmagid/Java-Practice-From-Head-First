package gamelogic;
public class SimpleDotCom {

    private int[] locationCells;
    private boolean[] hitsCells = {false,false,false};
    private int numOfHits = 0;

    public void setLocationCells(int [] locations){
        locationCells = locations;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";


            for (int i = 0 ; i < locationCells.length; i++) {
                if (guess == locationCells[i] && !hitsCells[i] ) {
                    result = "hit";
                    numOfHits++;
                    hitsCells[i] = true;
                    break;
                } else if (hitsCells[i]){
                    if (guess == locationCells[i])
                    result = "This value was hit, enter another one";
                }
            }
        

         
        // for (int cell : locationCells) {

        //     if (guess == cell) {
        //         result = "hit";
        //         numOfHits++;
        //         break;
        //     }
        // }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);

        return result;
    }

}
