package org.example;

public class TimeLog {

    private int employeeID;
    private int hoursWorked;

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
