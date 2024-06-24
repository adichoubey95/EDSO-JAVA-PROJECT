package com.oops.inheritance;
class OnlineTransaction {
    void payment() {
        System.out.println("online payment");
    }
}
class PhonePay extends OnlineTransaction {
    int limit = 50000;
    void checkbalance() {
        System.out.println("checking balance");
    }
}
class Gpay extends PhonePay {
    void reward() {
        System.out.println("Getting Reward");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Gpay s = new Gpay();
        s.reward();
        s.checkbalance();
        System.out.println(s.limit);
        s.payment();
    }
}
