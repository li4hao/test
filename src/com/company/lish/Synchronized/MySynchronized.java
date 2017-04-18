package com.company.lish.Synchronized;

/**
 * Created by lisho on 17/4/17.
 */
public class MySynchronized implements Runnable{

    private  int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            synchronized (this){
                if (ticket > 0) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("剩余车票数量："+ ticket--);

                }
            }


            
        }
    }
}
