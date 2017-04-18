package com.company.lish.Thread;

/**
 * Created by lisho on 17/4/17.
 */

public class MyRunnable implements Runnable {

    String teamName;

    public MyRunnable(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(teamName+"报数："+i);
        }
    }
}
