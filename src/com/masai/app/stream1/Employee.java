package com.masai.app.stream1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
        private  String name;
        private String title;
        private  int salary;
    public Employee(){}

    public Employee(String name, String title,int salary) {
        this.name = name;
        this.title = title;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


//    public Map<String, List<Employee>> groupByJobTitle( List<Employee> employeeList){
//        Map<String, List<Employee>> resultMap = new HashMap<>();
//        for (int i = 0; i < employeeList.size(); i++) {
//            Employee employee = employeeList.get(i);
//            List<Employee> employeeSubList = resultMap.getOrDefault(employee.getTitle(), new ArrayList<Employee>());
//            employeeSubList.add(employee);
//            resultMap.put(employee.getTitle(), employeeSubList);
//        }
//        return resultMap;
//    }
public Map<String, List<Employee>> groupByJobTitle( List<Employee> employeeList) {
    Map<String, List<Employee>> resultMap = new HashMap<>();
    for (Employee employee : employeeList) {
        List<Employee> employeesWithSameJobTitle = resultMap.get(employee.title);
        if (employeesWithSameJobTitle == null) {
            employeesWithSameJobTitle = new ArrayList<>();
            resultMap.put(employee.title, employeesWithSameJobTitle);
        }
        employeesWithSameJobTitle.add(employee);
    }
    return resultMap;
}
    public double calculateAverage(List<Employee> employeeList) {
        double averageSalary = employeeList.stream()
                .mapToInt(employee -> employee.salary)
                .average()
                .orElse(0.0);
        return  averageSalary;
    }
}
