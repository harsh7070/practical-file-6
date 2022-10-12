package Practical_6;

public class p6_3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("This program is made by 21CE039_Harsh");
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
            // TODO Auto-generated method stub
            System.out.println("Output : ");
            for (int i = 0; i < 6; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            }
        });
        t.start();
    }
}

