package com.example.yulonepoint;

import java.util.ArrayList;
import java.util.Date;

public class Employee {

    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<ActivityFun> listActivityFun;
    private ArrayList<Activity> listActivity;


    public Employee(String firstName,String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.listActivity = new ArrayList<>();
        this.listActivityFun = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Activity> getListActivity() {
        return listActivity;
    }

    //employee wants to creates a fun activity
    public void createsFun (String name, String note, Date date){
        ActivityFun activityFun = new ActivityFun(this,name,note,date);
        listActivityFun.add(activityFun);
    }

    //employee wants to creates a simple activity
    public void createsSimple(String name, Date date){
        Activity activity = new Activity(this,name,date);
        listActivity.add(activity);
    }

    public ArrayList<ActivityFun> getListActivityFun() {
        return listActivityFun;
    }

    //Show all activity that the employee creates
    //starts with thoses called fi=un
    public ArrayList<ActivityFun> show(){
        return this.getListActivityFun();
    }
    //starts with thoses called simple
    public ArrayList<Activity> showS(){
        return this.getListActivity();
    }
    public String profile(){
        String fullName = this.getFirstName() +" "+this.getLastName();
        return fullName+ "\n"+ this.getEmail();
    }
}
