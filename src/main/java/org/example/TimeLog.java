package org.example;

import java.time.LocalDate;

public class TimeLog {


    // TODO: change employeeId to Employee employee
    private Employee employee;
    private int hoursWorked;

    private LocalDate date;

    // TODO: missing date (hint: LocalDate)


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public TimeLog(Employee employee, int hoursWorked, LocalDate date) {
        this.employee = employee;
        this.hoursWorked = hoursWorked;
        this.date = date;
    }


    }

