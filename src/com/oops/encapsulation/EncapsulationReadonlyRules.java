package com.oops.encapsulation;

public class EncapsulationReadonlyRules {

    private int i = 10;
    private int j = 20;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}

class EncapsulationRules{
    public static void main(String[] args) {
    /*{
        EncapsulationReadonlyRules ER= new EncapsulationReadonlyRules();
        System.out.println(ER.getI()); //calling of getter method
        System.out.println(ER.getJ());
    }*/
        EncapsulationWriteOnly EW = new EncapsulationWriteOnly();
        EW.setA(45);
        EW.setB(50);
        System.out.println(EW.getA());
        System.out.println(EW.getB());
    }
}
