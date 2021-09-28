

import dao.DoctorDAO;
import entity.Doctor;

import javax.swing.event.ListDataListener;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;

public class Employee {

    String name;
    String role;
    String support;
    double salary;
    int experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    /*public static void createNewFile() {
        File file=new File("C:\\Users\\Dell\\Desktop\\Busoft_Employee_Detail.txt");
        boolean result;
        try{
            result=file.createNewFile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }*/

//List All the employees
    public static List<Employee> allTheEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        try {
            File myFile = new File("C:\\Users\\Dell\\Desktop\\Employee.txt");
            Scanner myScan = new Scanner(myFile);
            while (myScan.hasNext()) {
                String line = myScan.nextLine();
                Scanner scanner = new Scanner(line);
                scanner.useDelimiter(", ");
                while (scanner.hasNext()) {
                    String name = scanner.next();
                    String role = scanner.next();
                    String support = scanner.next();
                    double salary = scanner.nextDouble();
                    int experience = scanner.nextInt();
                    Employee employee=new Employee();
                    employee.setName(name);
                    employee.setRole(role);
                    employee.setSupport(support);
                    employee.setSalary(salary);
                    employee.setExperience(experience);
                    employees.add(employee);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return employees;
    }

//List All the employees in IT team
    public static List<Employee> allTheEmployeesInDevelopmentTeam(String targetName) {
        List<Employee> employees = new ArrayList<Employee>();
        try {
            for (Employee employee2 : Employee.allTheEmployees()) {
                if (targetName.equals(employee2.getSupport())) {
                    employees.add(employee2);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
            }
        return employees;
        }

//List All the Fresher employees
    public static List<Employee> allTheFresher(String targetName) {
        List<Employee> employees = new ArrayList<Employee>();
        try {
            for (Employee employee2 : Employee.allTheEmployees()) {
                if (targetName.equals(employee2.getRole())) {
                    employees.add(employee2);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return employees;
    }

//Find the employee in development team who's getting the least salary. Not the fresher
    public static double findTheLeastSalary() {
        List<Employee> employees = new ArrayList<Employee>();
        double minimum=0;
        try {
            minimum=employees.get(0).getSalary();

            for ( int i = 1; i < Employee.allTheEmployeesInDevelopmentTeam("Development").size(); i++) {
                    if (employees.get(i).getSalary() < minimum & !"Fresher".equals(employees.get(i).getRole()) ) {
                        minimum = employees.get(i).getSalary();
                    }
                }
                }
        catch(Exception e){
            e.printStackTrace();
        }
        return minimum;
    }

//List the empoyee who's working with max experience
    public static List<Employee> maximumExperience() {
        List<Employee> employees = new ArrayList<Employee>();
        try {
            int i=0;
            for (Employee employee2 : Employee.allTheEmployees()) {
                int maximum=Employee.allTheEmployees().get(0).getExperience();
                for( i = 1; i < Employee.allTheEmployees().size(); i++) {
                    if (Employee.allTheEmployees().get(i).getExperience() > maximum) {
                        maximum = Employee.allTheEmployees().get(i).getExperience();
                    }
                }
                if (maximum==employee2.getExperience()) {
                    employees.add(employee2);
                    //System.out.println(Employee.allTheEmployees().get(i).getExperience());
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return employees;
    }

//List the empoyee who's working with less experience
    public static List<Employee> lessExperience() {
        List<Employee> employees = new ArrayList<Employee>();
        try {
            int i=1;
            for (Employee employee2 : Employee.allTheEmployees()) {
                int minimum=employees.get(0).getExperience();
                for( i = 1; i < Employee.allTheEmployees().size(); i++) {
                    if (employees.get(i).getExperience() < minimum) {
                        minimum = employees.get(i).getExperience();
                    }
                }
                if (minimum==employee2.getExperience()) {
                    employees.add(employee2);
                    System.out.println(employees.get(i).getExperience());
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return employees;
    }

//Find the employee who's getting the min salary
    public static String findMinimumSalary() {
        List<Employee> employees = new ArrayList<Employee>();
        double minimum=0;
        String minimum_name=null;
        int i=0;
        try {
            //Employee employee=new Employee();
            minimum=Employee.allTheEmployees().get(0).getSalary();
            for (  i=0; i < Employee.allTheEmployees().size(); i++) {
                if (Employee.allTheEmployees().get(i).getSalary() < minimum) {
                    minimum = Employee.allTheEmployees().get(i).getSalary();
                }
            }
            System.out.println(minimum);
            minimum_name= Employee.allTheEmployees().get(i).getName();
            System.out.println(minimum_name);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return minimum_name;
    }

//Find the employee who's getting the max salary
    public static Double findMaximumSalary() {
        List<Employee> employees = new ArrayList<Employee>();
        double maximum=0;
        try {
            Employee employee=new Employee();
            maximum=employees.get(0).getSalary();
            for ( int i = 1; i < Employee.allTheEmployees().size(); i++) {
                if (employees.get(i).getSalary() > maximum ) {
                    maximum = employees.get(i).getSalary();
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return maximum;
    }

//Find the employees who are all getting the salary greater than 100000
    public static Double getSalaryGreaterThanOneLakhs() {
        List<Employee> employees = new ArrayList<Employee>();
        double maximum=0;
        try {
            Employee employee=new Employee();
            for ( int i = 0; i < Employee.allTheEmployees().size(); i++) {
                maximum=100000;
                if (employees.get(i).getSalary() > maximum ) {
                    maximum = employees.get(i).getSalary();
                    System.out.println(maximum);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return maximum;
    }

//Find the total salary the company spent
    public static Double totalSalary() {
        List<Employee> employees = new ArrayList<Employee>();
        double sum=0;
        try {
            Employee employee=new Employee();
            for(int i=0;i<Employee.allTheEmployees().size();i++){
                sum += employees.get(i).getSalary();
            }
            System.out.println(sum);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return sum;
    }

//Find the average the average of the total employee experience
    public static Double averageExperience() {
        List<Employee> employees = new ArrayList<Employee>();
        double average=0;
        double sum=0;
        try {
            Employee employee=new Employee();
            for(int i=0;i<Employee.allTheEmployees().size();i++){
                sum += employees.get(i).getExperience();
            }
             average = (sum / Employee.allTheEmployees().size());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return average;
    }

    public static void main(String[] args) throws Exception{

        Employee.findMinimumSalary();


        }

    }





