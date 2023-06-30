package org.example;

import java.time.LocalDate;

public class TimeLog {


    // TODO: change employeeId to Employee employee
    private int employeeID;
    private int hoursWorked;

    // TODO: missing date (hint: LocalDate)

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public TimeLog (int employeeID, int hoursWorked){
        this.employeeID = employeeID;
        this.hoursWorked = hoursWorked;


    }
}
