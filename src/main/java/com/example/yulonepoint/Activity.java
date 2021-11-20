package com.example.yulonepoint;

import java.util.ArrayList;
import java.util.Date;

/*
* Ici se trouve notre classe Activite ou on peut avoir deux
* types d'activites presentement qui sont:
* -ActiviteFun
* -ActiviteDetente
*
* Association avec la classe Employee
* */
public class Activity {
    private String name;
    private Date date;
    private Employee employee;

    public Activity(Employee em, String name, Date date){
        this.name = name;
        this.date = date;
        this.employee = em;
    }

    //default class
    public Activity(){
        this.date = new Date();
    }



    /**
     * set Employee
     * @param em
     */
    public void setEmployee(Employee em){
        this.employee = em;
    }

    /**
     * Return the employee who created the activity
     * @return
     */
    public Employee getEmployee() {
        return employee;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

}
