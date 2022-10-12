package Practical_6;

class Test
{
    int num;
    public void set(int num)
    {
        System.out.println("Producer Produced- " +num);
        this.num=num;
    }
    public void get()
    {
        System.out.println("Consumer Consumed- " +num);
    }
}
class Producer implements Runnable
{
    Test q;
    public Producer(Test q)
    {
        this.q=q;
        Thread t=new Thread(this,"Producer");
        t.start();
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            q.set(i++);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
            }
        }
    }

}
class consu implements Runnable
{
    Test q;
    public consu(Test q)
    {
        this.q=q;
        Thread t=new Thread(this,"Consumer");
        t.start();
    }
    public void run()
    {
        while(true)
        {
            q.get();
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
            }
        }
    }
}
public class p6_5 {
    public static void main(String[] args) {
        System.out.println("This program is made by 21CE039_Harsh");
        Test q=new Test();
        new Producer(q);
        new consu(q);
    }
}

