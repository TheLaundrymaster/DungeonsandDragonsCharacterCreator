public class Player {
    DiceRoller d;
    Skill s;


    public Player(DiceRoller d, Skill s) {
        this.d = new DiceRoller();
        this.s = new Skill();

    }

    public Player() {
        d = new DiceRoller();
        s = new Skill();
    }

    public void getStats(){
        d.rollAbilites();
    }

    public void seeStats(){
        d.seeScores();
    }

    public void swapStats(int value1 , int value2){
        d.switchScores(value1,value2);
    }

    public void calculateModifiers(){
        s.calculateModifiers(d.totals);
        s.seeModifiers();
    }

    public void setSkills(){
        s.setSkills(s.modifiers);
        s.seeSkills();
    }
}
