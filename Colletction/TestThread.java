package com.set;



public class TestThread implements Runnable{
        public static void main(String[] args) {
                TestThread ts =new TestThread();
                Thread th=new Thread(ts);
                th.start();
               for(int i=0;i<20;i++) {
                       System.out.println("reading:"+i);
               }
        }
        public void run() {
                for(int i=0;i<20;i++) {
                System.out.println("coding"+i);
                }
        }
}
