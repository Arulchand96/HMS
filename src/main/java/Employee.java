

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
    String experience;

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

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

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
                    String experience = scanner.next();
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


    public static Double findTheLeastSalary(List<Employee> employees) {
        //List<Employee> employees = new ArrayList<Employee>();

        double minimum=0;
        try {
            //int i;
            Employee employee=new Employee();
            minimum=employees.get(0).getSalary();

            for ( int i = 1; i < Employee.allTheEmployeesInDevelopmentTeam("Development").size(); i++) {
                    if (employees.get(i).getSalary() < minimum & !"Fresher".equals(employees.get(i).getRole()) ) {
                        minimum = employees.get(i).getSalary();
                        //mininmum_name=employees.get(i).getName();
                    }

                }

                }
        catch(Exception e){
            e.printStackTrace();
        }
        return minimum;
    }

/*
//List All the employees in IT team
    public static void allTheEmployeesInITTeam(Employee employee) {
        try {
            int i = 0;
            File myFile = new File("C:\\Users\\Dell\\Desktop\\Employee.txt");
            Scanner myScan = new Scanner(myFile);
            List<Employee> employees = new ArrayList<Employee>();
            System.out.println("List All the employees in IT team");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%20s %30s %20s %20s %20s", "NAME", "ROLE", "SUPPORT", "SALARY", "EXPERIENCE");
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            while (myScan.hasNext()) {
                String line = myScan.nextLine();
                Scanner scanner = new Scanner(line);
                scanner.useDelimiter(", ");
                while (scanner.hasNext()) {
                    String name = scanner.next();
                    String role = scanner.next();
                    String support = scanner.next();
                    Long salary = scanner.nextLong();
                    String experience = scanner.next();
                    //System.out.println("name"+name);
                    //System.out.println("role"+role);
                    Employee employee1 = new Employee();
                    employee.setName(name);
                    employee.setRole(role);
                    employee.setSupport(support);
                    employee.setSalary(salary);
                    employee.setExperience(experience);
                    employees.add(employee);
                    String targetName = "IT";
                    Employee result = null;
                    for (Employee employee2 : employees) {
                        if (targetName.equals(employee2.getSupport())) {
                            String selectedName = employees.get(i).getName();
                            String selectedRole = employees.get(i).getRole();
                            String selectedSupport = employees.get(i).getSupport();
                            //Long selectedSalary = employees.get(i).getSalary();
                            String selectedExperience = employees.get(i).getExperience();
                            System.out.format("%20s %30s %20s %20s %20s", selectedName, selectedRole, selectedSupport, selectedSalary, selectedExperience);
                            System.out.println();
                            break;
                        }
                    }
                    i++;
                }
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
        }
        catch (Exception e){

        }
    }

 //List All the employees in HR team
    public static void allTheEmployeesInHRTeam(Employee employee) {
        try {
            int i = 0;
            File myFile = new File("C:\\Users\\Dell\\Desktop\\Employee.txt");
            Scanner myScan = new Scanner(myFile);
            List<Employee> employees = new ArrayList<Employee>();
            System.out.println("List All the employees in HR team");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%20s %30s %20s %20s %20s", "NAME", "ROLE", "SUPPORT", "SALARY", "EXPERIENCE");
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            while (myScan.hasNext()) {
                String line = myScan.nextLine();
                Scanner scanner = new Scanner(line);
                scanner.useDelimiter(", ");
                while (scanner.hasNext()) {
                    String name = scanner.next();
                    String role = scanner.next();
                    String support = scanner.next();
                    Long salary = scanner.nextLong();
                    String experience = scanner.next();
                    //System.out.println("name"+name);
                    //System.out.println("role"+role);
                    Employee employee1 = new Employee();
                    employee.setName(name);
                    employee.setRole(role);
                    employee.setSupport(support);
                    employee.setSalary(salary);
                    employee.setExperience(experience);
                    employees.add(employee);
                    String targetName = "HR";
                    Employee result = null;
                    for (Employee employee2 : employees) {
                        if (targetName.equals(employee2.getSupport())) {
                            String selectedName = employees.get(i).getName();
                            String selectedRole = employees.get(i).getRole();
                            String selectedSupport = employees.get(i).getSupport();
                            //Long selectedSalary = employees.get(i).getSalary();
                            String selectedExperience = employees.get(i).getExperience();
                            System.out.format("%20s %30s %20s %20s %20s", selectedName, selectedRole, selectedSupport, selectedSalary, selectedExperience);
                            System.out.println();
                            break;
                        }
                    }
                    i++;
                }
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
        }
        catch (Exception e){

        }
    }

//List All the Fresher employees
    public static void allTheFresher(Employee employee) {
        try {
            int i = 0;
            File myFile = new File("C:\\Users\\Dell\\Desktop\\Employee.txt");
            Scanner myScan = new Scanner(myFile);
            List<Employee> employees = new ArrayList<Employee>();
            System.out.println("//List All the Fresher employees");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%20s %30s %20s %20s %20s", "NAME", "ROLE", "SUPPORT", "SALARY", "EXPERIENCE");
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            while (myScan.hasNext()) {
                String line = myScan.nextLine();
                Scanner scanner = new Scanner(line);
                scanner.useDelimiter(", ");
                while (scanner.hasNext()) {
                    String name = scanner.next();
                    String role = scanner.next();
                    String support = scanner.next();
                    Long salary = scanner.nextLong();
                    String experience = scanner.next();
                    //System.out.println("name"+name);
                    //System.out.println("role"+role);
                    Employee employee1 = new Employee();
                    employee.setName(name);
                    employee.setRole(role);
                    employee.setSupport(support);
                    employee.setSalary(salary);
                    employee.setExperience(experience);
                    employees.add(employee);
                    String targetName = "Fresher";
                    Employee result = null;
                    for (Employee employee2 : employees) {
                        if (targetName.equals(employee2.getRole())) {
                            String selectedName = employees.get(i).getName();
                            String selectedRole = employees.get(i).getRole();
                            String selectedSupport = employees.get(i).getSupport();
                            //Long selectedSalary = employees.get(i).getSalary();
                            String selectedExperience = employees.get(i).getExperience();
                            System.out.format("%20s %30s %20s %20s %20s", selectedName, selectedRole, selectedSupport, selectedSalary, selectedExperience);
                            System.out.println();
                            break;
                        }
                    }
                    i++;
                }
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
        }
        catch (Exception e){

        }
    }

//Find the employee in development team who's getting the least salary. Not the fresher
    public static void findTheLeastSalary(Employee employee) {
        try {
            int i = 0;
            File myFile = new File("C:\\Users\\Dell\\Desktop\\Employee.txt");
            Scanner myScan = new Scanner(myFile);
            List<Employee> employees = new ArrayList<Employee>();
            System.out.println("//Find the employee in development team who's getting the least salary. Not the fresher");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%20s %30s %20s %20s %20s", "NAME", "ROLE", "SUPPORT", "SALARY", "EXPERIENCE");
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            while (myScan.hasNext()) {
                String line = myScan.nextLine();
                Scanner scanner = new Scanner(line);
                scanner.useDelimiter(", ");
                while (scanner.hasNext()) {
                    String name = scanner.next();
                    String role = scanner.next();
                    String support = scanner.next();
                    Long salary = scanner.nextLong();
                    String experience = scanner.next();
                    //System.out.println("name"+name);
                    //System.out.println("role"+role);
                    Employee employee1 = new Employee();
                    employee.setName(name);
                    employee.setRole(role);
                    employee.setSupport(support);
                    employee.setSalary(salary);
                    employee.setExperience(experience);
                    employees.add(employee);
                    String selectedName = employees.get(i).getName();
                    String selectedRole = employees.get(i).getRole();
                    String selectedSupport = employees.get(i).getSupport();
                    //Long selectedSalary = employees.get(i).getSalary();
                    String selectedExperience = employees.get(i).getExperience();
                    String targetName = "Development";
                    Employee result = null;
                    for (Employee employee2 : employees) {
                       // long minimum =employees.get(1).getSalary();
                        for (i = 0; i < employees.size(); i++)
                             if(selectedSalary < minimum) {
                                 minimum = selectedSalary;
                             }
                            System.out.println(minimum);

                            /*for (int i = 0; i < arr.length; i++) {
                                //Compare elements of array with min
                                if(arr[i] <min)
                                    min = arr[i];
                            }
                    }
                    i++;
                }

            }



            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            System.out.println();

        }
        catch (Exception e){

        }
    }

*/
    public static void main(String[] args) throws Exception{

       /* System.out.println("List All the employees");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%20s %30s %20s %20s %20s", "NAME", "ROLE", "SUPPORT", "SALARY", "EXPERIENCE");
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------");*/

       //Employee employee=new Employee();
       //List<Employee> employees=new ArrayList<>();
       //System.out.println(Employee.allTheEmployeesInDevelopmentTeam("Development"));
        System.out.println(Employee.findTheLeastSalary(Employee.allTheEmployeesInDevelopmentTeam("Development")));




        //List<Employee> employees=Employee.allTheEmployees(employee);

       //List All the employees in Development team
        //Employee.allTheEmployeesInDevelopmentTeam(employees);

     /*   //List All the employees in IT team
        Employee.allTheEmployeesInITTeam(employee);

        //List All the employees in HR team
        Employee.allTheEmployeesInHRTeam(employee);

        //List All the Fresher employees
        Employee.allTheFresher(employee);

        //Find the employee in development team who's getting the least salary. Not the fresher
        Employee.findTheLeastSalary(employee); */



        }

    }





