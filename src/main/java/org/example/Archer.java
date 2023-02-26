package org.example;


public class Archer extends BaseHero<Ranged , ShieldEx>{
    public Archer(int health, String name, Ranged ranged) {
        super(health, name, ranged);

    }

    public Archer(int health, String name, Ranged ranged, ShieldEx shield) {
        super(health, name, ranged, shield);
    }



    @Override
    public Ranged getWeapon() {
        return super.getWeapon();
    }

    public  int range(){
        return ((Ranged)weapon).getRange();

        //weapon.getRange();
    }

    @Override
    public String toString() {
        return /*"Archer{" +
                "weapon=" + weapon +
                "} " +*/ "Archer{" + super.toString() + "\n" +  "~~~";
    }
}
