package com.masai.app.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuesFive {
    private int empCode;
    private String empName;
    private double empSalary;
    private String empDept;

    public QuesFive(int empCode, String empName, double empSalary, String empDept) {
        this.empCode = empCode;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDept = empDept;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    @Override
    public String toString() {
        return "Employee [empCode=" + empCode + ", empName=" + empName + ", empSalary=" + empSalary + ", empDept="
                + empDept + "]";
    }

    public static void main(String[] args) {
        ArrayList<QuesFive> employees = new ArrayList<>();
        employees.add(new QuesFive(101, "Ram", 9000, "IT"));
        employees.add(new QuesFive(102, "Shyam", 8000, "HR"));
        employees.add(new QuesFive(103, "Shreya", 7500, "Finance"));
        employees.add(new QuesFive(104, "Sankalp", 8500, "Marketing"));
        employees.add(new QuesFive(105, "Vignesh", 9200, "IT"));
        employees.add(new QuesFive(106, "Harshit", 8800, "HR"));
        employees.add(new QuesFive(107, "Rohan", 7800, "Finance"));
        employees.add(new QuesFive(108, "Anirban", 9500, "Marketing"));
        employees.add(new QuesFive(109, "Silvi", 8200, "IT"));
        employees.add(new QuesFive(110, "Jordan", 9800, "HR"));

        System.out.println("Before sorting:");
        for (QuesFive employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees, Comparator.comparingDouble(QuesFive::getEmpSalary));

        System.out.println("\nAfter sorting:");
        for (QuesFive employee : employees) {
            System.out.println(employee);
        }
    }
}
