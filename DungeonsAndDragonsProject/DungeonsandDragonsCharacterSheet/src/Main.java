import java.util.concurrent.TimeUnit;

public class Main {
    /*
    Acomplished:
        Made ability score roller with modifier and skills.

    Need to work on:
        Background
        Class
        Race
        Initiative
        EVERYTHING ELSE
     */


    public static void main(String[] args)  {
        Player Theo = new Player();

        Theo.getStats();
        Theo.seeStats();
        Theo.swapStats(0,1);
        Theo.seeStats();

        //Theo.calculateModifiers();
        //Theo.setSkills();



    }
}