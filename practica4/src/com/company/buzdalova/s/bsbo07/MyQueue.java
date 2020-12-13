package com.company.buzdalova.s.bsbo07;
import java.util.ArrayDeque;
import java.util.Random;
public class MyQueue {

   public static  ArrayDeque<Patient> queue = new ArrayDeque<Patient>();
    public static int maxLength;
    //public Patient ID;
  static Random random = new Random();

    public  boolean teraped= false;
    public  boolean mrted=false;

    public static synchronized void  addPatientToQueue() throws InterruptedException {

        int r= random.nextInt(100)+1;
        queue.add(new Patient( r, false, false));

    }

    /*public static void Allqueue()
    {
        int r= random.nextInt(100)+1;queue.add(new Patient( r,  false, false));
    }*/

    public synchronized Patient removeProcessFromQueue() {
        Patient rem = queue.remove();
        return rem;
    }



    @Override
    public String toString() {
        return queue.toString();
    }

    public int getMaxLength() {
        return maxLength;
    }
    //public void getQueue() {return queue;}
}
