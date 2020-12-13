package com.company;
import com.company.buzdalova.s.bsbo07.*;
import com.company.buzdalova.s.bsbo07.Process;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static com.company.buzdalova.s.bsbo07.MyQueue.*;
import static java.lang.Thread.sleep;

public class Main {
   /* public  static ArrayList<Patient> path=new ArrayList<>();
    public static boolean isEmp() {
        return path.isEmpty();
    }*/
    public  static  void main(String[] args) throws InterruptedException {
        Random rand= new Random();

       //part 1
        // practica4.task1();
       /*
            StringBuilder sb= new StringBuilder().append('a');
            ArrayList<PrintChar_> printChar=new ArrayList<>();
            for(int i=0;i<100;i++){
            printChar.add(new PrintChar_(sb));
            }
            printChar.forEach(PrintChar_::start);
        */

        //practica4.task3();
        //practica4.task4();


        //part 2
        //task 1
       /*ArrayList<Window> windows= new ArrayList<>();
       windows.add(new Window(1, Window.ServiceCategory.ALL));
        windows.add(new Window(2, Window.ServiceCategory.OLD));
        windows.add(new Window(3, Window.ServiceCategory.BUSINESS));
        ArrayList<Citizen> citizens= new ArrayList<>();
        for (int i =0; i<100; i++)
        {
            citizens.add(new Citizen(rand.nextInt(500)+1,
                    Window.ServiceCategory.values()[rand.nextInt(3)],
                    windows.get(rand.nextInt(3))));
            citizens.get(i).start();
            Thread.sleep(500);
        }
        for (Citizen citizen : citizens){citizen.join();}
        int YoungLeave , OldLeave, BusinessLeave;
        YoungLeave=citizens.stream().filter(
                citizen -> citizen.citizenCategory== Window.ServiceCategory.YOUNG
        ).findFirst().get().citizenCategory.leaving;
        OldLeave=citizens.stream().filter(
                citizen -> citizen.citizenCategory== Window.ServiceCategory.OLD
        ).findFirst().get().citizenCategory.leaving;
        BusinessLeave=citizens.stream().filter(
                citizen -> citizen.citizenCategory== Window.ServiceCategory.BUSINESS
        ).findFirst().get().citizenCategory.leaving;
        System.out.println("Count of leaving: "+
                "\t Young: "+YoungLeave+
                "\t Old: "+ OldLeave+
                "\t Business: "+ BusinessLeave);*/


        //task2
     Scanner in=new Scanner(System.in);
     Integer max;
        System.out.println("Enter the length of queue");
            max=in.nextInt();
            maxLength=max;

            //ArrayList<Patient> path=new ArrayList<>();
        /*for (int i = 0; i<maxLength; i++){
            path.add(i,new Patient( rand.nextInt((100) + 10),  false, false));
        }*/

 /*Thread ttyu = new Thread(new Runnable() {
    public void run(){
        try{ for (int i = 1; i<maxLength+1; i++){
            sleep(500);
            MyQueue.addPatientToQueue();
            if(!queue.isEmpty()){
                System.out.println(i+ " " + queue.element());
            }
            else System.out.println( "queue is empty ");}
        }
        catch (InterruptedException e) { e.printStackTrace(); }
    }

});
        ttyu.run();*/

        Process process= new Process();
        for (int i = 0; i<maxLength; i++){
            queue.addLast(new Patient( rand.nextInt((10000) + 10),  false, false));
           // MyQueue.queue.Allqueue();
           //MyQueue.addPatientToQueue();
            System.out.println(" Size of queue "+queue.size());
           // System.out.println(i+ " " + queue.element());
           // Process.mrtt.start();
            //Process.doctor.start();
        }
        while(queue.peek()!=null){process.run();
            System.out.println(queue.element() + " obslyjen");
            queue.removeFirst();
            System.out.println(" Size of queue "+queue.size());
        }
       // for (Patient pathh: queue) { }

    }

}


