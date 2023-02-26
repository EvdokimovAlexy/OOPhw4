package org.example;



public class Footman extends BaseHero<Melee, Hshield> {

    public Footman(int health, String name, Melee weapon) {
        super(health, name, weapon);
    }

    public Footman(int health, String name, Melee weapon, Hshield shield) {
        super(health, name, weapon, shield);
    }

    @Override
    public String toString() {
        return "Footman{" +
                "} " + super.toString() + "\n" +  "~~~";
    }
}
