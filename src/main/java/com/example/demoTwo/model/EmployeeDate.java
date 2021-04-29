package com.example.demoTwo.model;
import java.util.Date;

public class EmployeeDate {

    private Employee employee;
    private Date date;

    public EmployeeDate(Employee employee, Date date) {
        this.employee = employee;
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

