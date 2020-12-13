package com.company.buzdalova.s.bsbo07;

public class Citizen extends  Thread
{
    public Window.ServiceCategory citizenCategory;
    Window window;
    int ID;
    boolean hasServiced;

    public void run(){
        window.getService(this);
        if (hasServiced) System.out.println(this.ID+" good serv");
        else System.out.println(this.ID+" bad serv");
    }
    public Citizen(int ID, Window.ServiceCategory citizenCategory, Window window){
        this.ID= ID;
        this.citizenCategory=citizenCategory;
        this.window= window;
    }

}
