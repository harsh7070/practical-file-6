package Practical_6;
public class p6_4 {
    public static void main(String[] args) {
        System.out.println("This program is made by 21CE039_Harsh");
        Thread first = new Thread(new Runnable() {
            @Override
            public void run() {
            System.out.println("Hello I am FIRST");
            }
        }, "FIRST");
        Thread second = new Thread(new Runnable() {
            @Override
            public void run() {
            System.out.println("Hello I am SECOND");
            }
        }, "SECOND");
        Thread third = new Thread(new Runnable() {
            @Override
            public void run() {
        System.out.println("Hello I am THIRD"); }}, "THIRD");
        second.setPriority(Thread.NORM_PRIORITY);
        first.setPriority(second.getPriority()-2);
        third.setPriority(second.getPriority()+2);
        first.start();
        second.start();
        third.start();
    } }
