package com.company.buzdalova.s.bsbo07;
//part 1 task 2
public class PrintChar_ extends Thread {
    StringBuilder sb;
    public PrintChar_(StringBuilder sb){this.sb=sb;}
    @Override
    public  void run(){
        synchronized (sb){
            for(int i=0;i<100;i++){
                System.out.print(sb);}
                // System.out.println(Thread.currentThread());
                System.out.println();
                char chars = sb.charAt(0);
                sb.setCharAt(0,++chars);
            }
    }
}
