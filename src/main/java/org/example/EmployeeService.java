package org.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employees;
    private List<TimeLog> timelogs;


    public EmployeeService() {

        this.employees = new ArrayList<>();

        this.timelogs = new ArrayList<>();

    }
        public void addEmployee(Employee employee) {
            employees.add(employee);
        }

        public void removeEmployee(Employee employee) {
            employees.remove(employee);
        }

        public void addTimeLog(TimeLog timeLog) {
            timelogs.add(timeLog);
        }

    }

