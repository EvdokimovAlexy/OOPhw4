package org.example;

public class Hshield implements Shield{


    String ShieldName;
    private final int ShieldPoint;
    public Hshield(String ShieldName, int ShieldPoint, boolean b) {
        this.ShieldName = ShieldName;
        this.ShieldPoint = ShieldPoint;
    }

    @Override
    public String toString() {
        return "Hshield{" +
                "ShieldName='" + ShieldName + '\'' +
                ", ShieldPoint=" + ShieldPoint +
                '}';
    }

    @Override
    public int recover() {
        return ShieldPoint;
    }

    public int getShieldPoint() {
        return ShieldPoint;
    }
}
