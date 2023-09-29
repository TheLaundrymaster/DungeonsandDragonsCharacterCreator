import java.util.*;

public class DiceRoller {
    ArrayList<Integer> totals = new ArrayList<>();


    public DiceRoller() {

    }

    public ArrayList<Integer> rollAbilites() {
        ArrayList<Integer> rolls = new ArrayList<>();


        Random r = new Random();
        int min = 1, max = 6;

        for (int x = 0; x < 6; x++) {

            int s = 0;
            int i = 0;
            while (i < 4) {
                rolls.add(r.nextInt(max - min + 1) + min);
                //System.out.println(rolls);
                i++;
            }
            Collections.sort(rolls);
            //System.out.println(rolls);
            //drop lowest
            rolls.remove(0);
            //add up
            for (int j = 0; j < rolls.size(); j++) {
                s = rolls.get(j) + s;
            }
            //System.out.println(rolls);
            //System.out.println(s);
            //System.out.println("/n");
            totals.add(s);
            rolls.clear();
        }

        return totals;

    }

    public void seeScores() {
        System.out.println(totals);
    }

    public  ArrayList<Integer> switchScores( int val1, int val2){
        Collections.swap(totals,val1,val2);
        return totals;
    }


}
