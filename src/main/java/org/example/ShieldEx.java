package org.example;

public class ShieldEx implements Shield{

    String ShieldName;
    private final int ShieldPoint;
    public ShieldEx(String ShieldName, int ShieldPoint, boolean b) {
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

