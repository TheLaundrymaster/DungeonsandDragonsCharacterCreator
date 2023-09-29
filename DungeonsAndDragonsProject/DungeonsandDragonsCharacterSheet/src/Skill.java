import java.util.*;

public class Skill {
    ArrayList<Integer> modifiers = new ArrayList<>();
    SortedMap<String, Integer> map = new TreeMap<String, Integer>();


    public Skill(ArrayList<Integer> modifiers, SortedMap<String, Integer> map) {
        this.modifiers = modifiers;
        this.map = map;
    }

    public Skill() {

    }

    public ArrayList<Integer> calculateModifiers(ArrayList<Integer> totals){
        for (int i = 0; i < totals.size() ; i++ ){
            modifiers.add((totals.get(i)-10)/2);
        }
        return modifiers;
    }

    public void seeModifiers(){
        System.out.println(modifiers);
    }

    public Map<String,Integer> setSkills(ArrayList<Integer> modifiers){
        //0 - str, 1 - dex, 2 - con, 3 - int, 4 - wis, 5 - cha
        map.put("Acrobatics",modifiers.get(1));
        map.put("Animal Handling",modifiers.get(4));
        map.put("Arcana",modifiers.get(3));
        map.put("Athletics",modifiers.get(0));
        map.put("Deception",modifiers.get(5));
        map.put("History",modifiers.get(3));
        map.put("Insight",modifiers.get(4));
        map.put("Intimidation",modifiers.get(5));
        map.put("Investigation",modifiers.get(3));
        map.put("Medicine",modifiers.get(4));
        map.put("Nature",modifiers.get(3));
        map.put("Perception",modifiers.get(4));
        map.put("Performance",modifiers.get(5));
        map.put("Persuasion",modifiers.get(5));
        map.put("Religion",modifiers.get(3));
        map.put("Slight of Hand",modifiers.get(1));
        map.put("Stealth",modifiers.get(1));
        map.put("Survival",modifiers.get(4));
        return map;
    }

    public void seeSkills(){
        System.out.println(Arrays.asList(map));
    }
}

