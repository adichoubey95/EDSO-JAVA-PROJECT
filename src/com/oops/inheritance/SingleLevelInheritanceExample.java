package com.oops.inheritance;

class Amazon {
    void shoes() {
        System.out.println("sports shoes");
    }

}
class Myntra extends Amazon {
    void clothes() {
        System.out.println("sells clothes");
    }
}

public class SingleLevelInheritanceExample {
    public static void main(String[] args) {
        Myntra ref = new Myntra();
        ref.clothes();
        ref.shoes();


    }
}
