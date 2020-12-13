package com.company.buzdalova.s.bsbo07;
import java.util.Random;
public class Window {
    Random random = new Random();
    public int Number;
    public enum ServiceCategory{
        YOUNG, OLD, BUSINESS, ALL;
        public int leaving=0;
    }
    private boolean isBusy= false;
    public ServiceCategory windowCategory;
    public Window (int number, ServiceCategory windowCategory ){
        this.Number=number;
        this.windowCategory= windowCategory;
    }

    public Citizen ServiceCitizen;
    public void getService(Citizen citizen){
        if(windowCategory== citizen.citizenCategory || windowCategory==ServiceCategory.ALL)
        {if(!isBusy)
            {
                System.out.println("Citizen "+citizen.ID+" go to window #"+ this.Number);
                ServiceCitizen= citizen;
                isBusy=true;
                try
                {
                    Thread.sleep(random.nextInt(1000)+100);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                citizen.hasServiced=true;
                System.out.println("Citizen "+ citizen.ID+ " out of window #"+ this.Number);
                isBusy=false;
            }
        else {
            System.out.println("Window #" + this.Number + " is not avaliable cause "+ ServiceCitizen.ID+ " is here");
            citizen.hasServiced=false;
            citizen.citizenCategory.leaving++;
        }
        }
        else {
            System.out.println("Citizen "+ citizen.ID+ " in wrong window ");

        }
    }
}
