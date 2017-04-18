package com.company.lish.Thread;

/**
 * Created by lisho on 17/4/17.
 */
public class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println(name+"报数："+ i);
        }
        super.run();
    }
}
