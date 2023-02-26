package org.example;



public class Main {

    public static void main(String[] args) {

        Team<Footman> squadF = new Team<>();

        squadF.add(new Footman(55, "joe", new Melee("spear", 15)));
        squadF.add(new Footman(55, "moe", new Melee("sword", 10)));
        squadF.add(new Footman(55, "doe", new Melee("axe", 20)));


        Team<BaseHero> squadS = new Team<>();

        squadS.add(new Archer(15, "jonh", new Ranged("bow", 5, 50)));
        squadS.add(new Archer(15, "jonathan", new Ranged("crossbow", 15, 25),new ShieldEx("Caldary" , 50, false)));
        squadS.add(new Footman(55, "carl", new Melee("sword", 10), new Hshield("Pridwen" , 30, true)));
        squadS.add(new Footman(55, "earl", new Melee("axe", 20)));

        for (BaseHero item : squadS) {
            System.out.println(item);
        }

        System.out.println(squadS.maxTeamRange());
        System.out.println(squadS.minArmor());
    }

}
