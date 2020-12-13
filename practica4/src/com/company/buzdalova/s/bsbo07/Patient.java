package com.company.buzdalova.s.bsbo07;

public  class Patient  {
    //public Process patientservice;

    public static  volatile boolean hasservicedT;
     public static volatile boolean hasservicedMRT;
      public static volatile int ID;
    // volatile Process therapist;
   // volatile Process mrt;


    //public Process.ServiceCategory patientstep;

public String otzyv1;
    public void suck() {

       //therapist();
       // mrt.mrt(this);
        if (hasservicedT&&hasservicedMRT==true) System.out.println(this.ID+" good serv");
        else System.out.println(this.ID+" bad serv");
        return ;
    }

    public Patient(int ID, boolean hasservicedT, boolean hasservicedMRT) throws InterruptedException {
        Thread.sleep(1000);
    }
    public boolean teraped(){
        return hasservicedT;
    }
    public boolean mrted(){
        return hasservicedMRT;
    }
}
