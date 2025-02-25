package com.employee_payroll_app.employee_payroll_app.model;

public class EmployeePayroll {

    private String name;
    private double salary;

    public EmployeePayroll(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
