package com.example.yulonepoint;

import java.util.ArrayList;
import java.util.Date;

public class ActivityFun{

    private ArrayList<Employee> listEm;
    private String name;
    private String note;
    private Date date;
    private Employee employee;

    public ActivityFun(Employee em, String name, String note,Date date){
        this.name = name;
        this.note = note;
        this.date = date;
        this.employee = em;
        listEm.add(this.employee);
    }

    public ArrayList<Employee> getListEm() {
        return listEm;
    }

    public void setListEm(ArrayList<Employee> listEm) {
        this.listEm = listEm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
