package com.company.lish.Synchronized;

/**
 * Created by lisho on 17/4/17.
 */
public class Main {
    public static void main(String[] args) {
        MySynchronized s1 = new MySynchronized();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);
        Thread t3 = new Thread(s1);
        t1.start();
        t2.start();
        t3.start();
    }
}
