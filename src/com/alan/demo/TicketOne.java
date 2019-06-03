package com.alan.demo;

public class TicketOne implements Runnable {
    @Override
    public void run() {
        int ticket =100;
        while (true){
            if (ticket>0){
                try {
                    Thread.sleep(1);
                    System.out.println(Thread.currentThread().getName() + "正在卖票:" + ticket--);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
