package com.masai.app.stream1;

import com.masai.app.stream1.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String args[])  {
        Employee e = new Employee();

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("shyam","hr",121));
        employeeList.add(new Employee("ram","hr",230));
        employeeList.add(new Employee("shreya","hr",450));
        employeeList.add(new Employee("Sankalp","dev",300));
        Map<String, List<Employee>> ans= e.groupByJobTitle(employeeList);
        for (Map.Entry<String, List<Employee>> entry : ans.entrySet()) {
            System.out.println("Job Title: " + entry.getKey());
            for (Employee employee : entry.getValue()) {
                System.out.println("\t" + employee.getName());
            }
        }
        double avg = e.calculateAverage(employeeList);
        System.out.println(avg);












    }
}
