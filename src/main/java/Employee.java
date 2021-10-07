

import dao.DoctorDAO;
import entity.Doctor;

import javax.swing.event.ListDataListener;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;

public class Employee  {

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

     public static void createNewFile() {
         File file = new File("C:\\Users\\Dell\\Desktop\\Busoft_Employee_Detail.txt");
         boolean result;
         try {
             result = file.createNewFile();
         } catch (IOException e) {
             e.printStackTrace();
         }
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

//List All the employees in IT team
    public static List<Employee> allTheEmployeesInITTeam(String targetName) {
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

//List All the employees in IT team
    public static List<Employee> allTheEmployeesInHRTeam(String targetName) {
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
    public static List<Employee> findTheLeastSalary() {
        List<Employee> employees = new ArrayList<Employee>();
        double minimum=0;
        try {
            minimum=Employee.allTheEmployeesInDevelopmentTeam("Development").get(0).getSalary();

            for ( int i = 1; i < Employee.allTheEmployeesInDevelopmentTeam("Development").size(); i++) {
                    if (Employee.allTheEmployeesInDevelopmentTeam("Development").get(i).getSalary() < minimum & !"Fresher".equals(Employee.allTheEmployeesInDevelopmentTeam("Development").get(i).getRole()) ) {
                        minimum = Employee.allTheEmployeesInDevelopmentTeam("Development").get(i).getSalary();
                    }
                }
            for(Employee employee:Employee.allTheEmployeesInDevelopmentTeam("Development")) {
                if(minimum==employee.getSalary()){
                    employees.add(employee);
                }
            }
                }
        catch(Exception e){
            e.printStackTrace();
        }
        return employees;
    }

//List the employee who's working with max experience
    public static List<Employee> maximumExperience() {
        List<Employee> employees = new ArrayList<Employee>();
        try {
            int i=0;
                int maximum=Employee.allTheEmployees().get(0).getExperience();
                for( i = 1; i < Employee.allTheEmployees().size(); i++) {
                    if (Employee.allTheEmployees().get(i).getExperience() > maximum) {
                        maximum = Employee.allTheEmployees().get(i).getExperience();
                    }
                }
            for (Employee employee2 : Employee.allTheEmployees()) {
                if (maximum==employee2.getExperience()) {
                    employees.add(employee2);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return employees;
    }

//List the employee who's working with less experience
    public static List<Employee> lessExperience() {
        List<Employee> employees = new ArrayList<Employee>();
        try {
            int i=1;
                int minimum=Employee.allTheEmployees().get(0).getExperience();
                for( i = 1; i < Employee.allTheEmployees().size(); i++) {
                    if (Employee.allTheEmployees().get(i).getExperience() < minimum) {
                        minimum = Employee.allTheEmployees().get(i).getExperience();
                    }
                }
                for(Employee employee:Employee.allTheEmployees()) {
                    if (minimum == employee.getExperience()) {
                        employees.add(employee);
                    }
                }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return employees;
    }

//Find the employee who's getting the min salary
    public static List<Employee> findMinimumSalary()
    {
        List<Employee> employees = new ArrayList<Employee>();
        double minimum=0;
        String minimum_name=null;
        int i=0;
        try {
            minimum=Employee.allTheEmployees().get(0).getSalary();
            for (  i=0; i < Employee.allTheEmployees().size(); i++) {
                if (Employee.allTheEmployees().get(i).getSalary() < minimum) {
                    minimum = Employee.allTheEmployees().get(i).getSalary();
                }
            }
            for(Employee employee:Employee.allTheEmployees()) {
                if(minimum==employee.getSalary()){
                    employees.add(employee);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return employees;
    }

//Find the employee who's getting the max salary
    public static List<Employee> findMaximumSalary() {
        List<Employee> employees = new ArrayList<Employee>();
        double maximum=0;
        String maximumName=null;
        int i;
        try {
            maximum=Employee.allTheEmployees().get(0).getSalary();
            for ( i = 0; i < Employee.allTheEmployees().size(); i++) {
                if (Employee.allTheEmployees().get(i).getSalary() > maximum ) {
                    maximum = Employee.allTheEmployees().get(i).getSalary();
                }
            }
            for(Employee employee2:Employee.allTheEmployees()){
                if(maximum==employee2.getSalary()){
                    employees.add(employee2);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return employees;
    }

//Find the employees who are all getting the salary greater than 100000
    public static List<Employee> getSalaryGreaterThanOneLakhs() {
        List<Employee> employees = new ArrayList<Employee>();
        double maximum=0;
        try {
            Employee employee=new Employee();
            for ( int i = 0; i < Employee.allTheEmployees().size(); i++) {
                maximum=100000;
                if (Employee.allTheEmployees().get(i).getSalary() > maximum ) {
                    maximum = Employee.allTheEmployees().get(i).getSalary();
                }
                for (Employee employee2 : Employee.allTheEmployees()) {
                    if (maximum==employee2.getSalary()) {
                        employees.add(employee2);
                    }
                }
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return employees;
    }

//Find the total salary the company spent
    public static Double totalSalary() {
        double sum=0;
        try {
            Employee employee=new Employee();
            for(int i=0;i<Employee.allTheEmployees().size();i++){
                sum += Employee.allTheEmployees().get(i).getSalary();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return sum;
    }

//Find the average the average of the total employee experience
    public static Double averageExperience() {
        double average=0;
        double sum=0;
        try {
            Employee employee=new Employee();
            for(int i=0;i<Employee.allTheEmployees().size();i++){
                sum += Employee.allTheEmployees().get(i).getExperience();
                average = (sum / Employee.allTheEmployees().size());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return average;
    }
//Comparable
public static Comparable<Employee> getEmployeeByExperience() {
    // override the compare() method
    Employee employee=new Employee();
    Comparable comp=new Comparable() {
        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }
        public int compareTo(Employee e) {
            return employee.getExperience() - e.getExperience();
        }

}
    public static List<Employee> comparable(){
        List<Employee> employees = new ArrayList<>();
        List<Employee> employees1 = new ArrayList<Employee>();
        for(Employee employee:Employee.allTheEmployees()){
            employees.add(employee);
        }
        Collections.sort(Employee.allTheEmployees());
        for (Employee employee1 : employees) {
            employees1.add(employee1);
        }
        return employees1;
    }


//Comparator
public static Comparator<Employee> getEmployeeByName(){
    // override the compare() method
    Comparator comp = new Comparator <Employee>() {
        public int compare(Employee e1, Employee e2) {
            return e1.name.compareTo(e2.name);
        }
    };
    return comp;
}
public static List<Employee> comparator(){
    List<Employee> employees = new ArrayList<Employee>();
    List<Employee> employees1 = new ArrayList<Employee>();
    for(Employee employee:Employee.allTheEmployees()){
        employees.add(employee);
    }
        Collections.sort(employees, Employee.getEmployeeByName());
        for (Employee employee1 : employees) {
            employees1.add(employee1);
        }
    return employees1;
}





    public static void main(String[] args){

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dell\\Desktop\\Busoft_Employee_Detail.txt"));

            List<Employee> employeesInDevelopmentTeamList = Employee.allTheEmployeesInDevelopmentTeam("Development");
            writer.write("List All the employees in Development team");
            writer.newLine();
            for(int i=0;i< employeesInDevelopmentTeamList.size();i++) {
                //String getSalaryString=Double.toString();
                //String getExperienceString=Double.toString();
                writer.write(employeesInDevelopmentTeamList.get(i).getName()+employeesInDevelopmentTeamList.get(i).getRole()+employeesInDevelopmentTeamList.get(i).getSupport()+employeesInDevelopmentTeamList.get(i).getSalary()+employeesInDevelopmentTeamList.get(i).getExperience());
                writer.newLine();
            }
            writer.newLine();

            List<Employee> employeesInITTeamList = Employee.allTheEmployeesInDevelopmentTeam("IT");
            writer.write("List All the employees in IT team");
            writer.newLine();
            for(int i=0;i< employeesInITTeamList.size();i++) {
                String getSalaryString=Double.toString(employeesInITTeamList.get(i).getSalary());
                String getExperienceString=Double.toString(employeesInITTeamList.get(i).getExperience());
                writer.write(employeesInITTeamList.get(i).getName()+employeesInITTeamList.get(i).getRole()+employeesInITTeamList.get(i).getSupport()+getSalaryString+getExperienceString);
                writer.newLine();
            }
            writer.newLine();

            List<Employee> employeesInITHRList = Employee.allTheEmployeesInDevelopmentTeam("HR");
            writer.write("List All the employees in HR team");
            writer.newLine();
            for(int i=0;i< employeesInITHRList.size();i++) {
                String getSalaryString=Double.toString(employeesInITHRList.get(i).getSalary());
                String getExperienceString=Double.toString(employeesInITHRList.get(i).getExperience());
                writer.write(employeesInITHRList.get(i).getName()+employeesInITHRList.get(i).getRole()+employeesInITHRList.get(i).getSupport()+getSalaryString+getExperienceString);
                writer.newLine();
            }
            writer.newLine();

            List<Employee> fresherList = Employee.allTheFresher("Fresher");
            writer.write("List All the Fresher employees");
            writer.newLine();
            for(int i=0;i< fresherList.size();i++) {
                String getSalaryString=Double.toString(fresherList.get(i).getSalary());
                String getExperienceString=Double.toString(fresherList.get(i).getExperience());
                writer.write(fresherList.get(i).getName()+fresherList.get(i).getRole()+fresherList.get(i).getSupport()+getSalaryString+getExperienceString);
                writer.newLine();
            }
            writer.newLine();

            List<Employee> leastSalaryList = Employee.findTheLeastSalary();
            writer.write("Find the employee in development team who's getting the least salary. Not the fresher");
            writer.newLine();
            for(int i=0;i< leastSalaryList.size();i++) {
                String getSalaryString=Double.toString(leastSalaryList.get(i).getSalary());
                String getExperienceString=Double.toString(leastSalaryList.get(i).getExperience());
                writer.write(leastSalaryList.get(i).getName()+leastSalaryList.get(i).getRole()+leastSalaryList.get(i).getSupport()+getSalaryString+getExperienceString);
                writer.newLine();
            }
            writer.newLine();

            List<Employee> maximumexperienceList = Employee.maximumExperience();
            writer.write("List the employee who's working with max experience");
            writer.newLine();
            for(int i=0;i< maximumexperienceList.size();i++) {
                String getSalaryString=Double.toString(maximumexperienceList.get(i).getSalary());
                String getExperienceString=Double.toString(maximumexperienceList.get(i).getExperience());
                writer.write(maximumexperienceList.get(i).getName()+maximumexperienceList.get(i).getRole()+maximumexperienceList.get(i).getSupport()+getSalaryString+getExperienceString);
                writer.newLine();
            }
            writer.newLine();

            List<Employee> lessExperienceList = Employee.lessExperience();
            writer.write("List the empoyee who's working with less experience");
            writer.newLine();
            for(int i=0;i< lessExperienceList.size();i++) {
                String getSalaryString=Double.toString(lessExperienceList.get(i).getSalary());
                String getExperienceString=Double.toString(lessExperienceList.get(i).getExperience());
                writer.write(lessExperienceList.get(i).getName()+lessExperienceList.get(i).getRole()+lessExperienceList.get(i).getSupport()+getSalaryString+getExperienceString);
                writer.newLine();
            }
            writer.newLine();

            List<Employee> minimumSalaryList = Employee.findMinimumSalary();
            writer.write("Find the employee who's getting the minimum salary");
            writer.newLine();
            for(int i=0;i< minimumSalaryList.size();i++) {
                String getSalaryString=Double.toString(minimumSalaryList.get(i).getSalary());
                String getExperienceString=Double.toString(minimumSalaryList.get(i).getExperience());
                writer.write(minimumSalaryList.get(i).getName()+minimumSalaryList.get(i).getRole()+minimumSalaryList.get(i).getSupport()+getSalaryString+getExperienceString);
                writer.newLine();
            }
            writer.newLine();

            List<Employee> maximumSalaryList = Employee.findMaximumSalary();
            writer.write("Find the employee who's getting the max salary");
            writer.newLine();
            for(int i=0;i< maximumSalaryList.size();i++) {
                String getSalaryString=Double.toString(maximumSalaryList.get(i).getSalary());
                String getExperienceString=Double.toString(maximumSalaryList.get(i).getExperience());
                writer.write(maximumSalaryList.get(i).getName()+maximumSalaryList.get(i).getRole()+maximumSalaryList.get(i).getSupport()+getSalaryString+getExperienceString);
                writer.newLine();
            }
            writer.newLine();

            List<Employee> greaterThanOneLakhsList = Employee.getSalaryGreaterThanOneLakhs();
            writer.write("Find the employees who are all getting the salary greater than 100000");
            writer.newLine();
            for(int i=0;i< greaterThanOneLakhsList.size();i++) {
                String getSalaryString=Double.toString(greaterThanOneLakhsList.get(i).getSalary());
                String getExperienceString=Double.toString(greaterThanOneLakhsList.get(i).getExperience());
                writer.write(greaterThanOneLakhsList.get(i).getName()+greaterThanOneLakhsList.get(i).getRole()+greaterThanOneLakhsList.get(i).getSupport()+getSalaryString+getExperienceString);
                writer.newLine();
            }
            writer.newLine();

            Double sum = Employee.totalSalary();
            writer.write("Find the total salary the company spent");
            String sumInString = Double.toString(sum);
            writer.newLine();
            writer.write(sumInString);
            writer.newLine();

           Double average=Employee.averageExperience();
           writer.newLine();
           writer.write("Find the average the average of the total employee experience");
           String averageInString=Double.toString(average);
           writer.newLine();
           writer.write(averageInString);

            writer.newLine();
            List<Employee> sortedListUsingComparator = Employee.comparator();
            writer.write("sorted list using comparator");
            writer.newLine();
            for(int i=0;i< sortedListUsingComparator.size();i++) {
                //String list={sortedListUsingComparator.get(i).getName(), sortedListUsingComparator.get(i).getRole(),sortedListUsingComparator.get(i).getSupport(),sortedListUsingComparator.get(i).getSalary(), sortedListUsingComparator.get(i).getExperience()};
                //String getSalaryString=Double.toString();
                //String getExperienceString=Double.toString();
                //writer.write(list);
                writer.write(sortedListUsingComparator.get(i).getName()+sortedListUsingComparator.get(i).getRole()+sortedListUsingComparator.get(i).getSupport()+sortedListUsingComparator.get(i).getSalary()+sortedListUsingComparator.get(i).getExperience());
                writer.newLine();
            }

            writer.newLine();
            List<Employee> sortedListUsingComparable = Employee.comparable();
            writer.write("sorted list using comparable");
            writer.newLine();
            for(int i=0;i< sortedListUsingComparable.size();i++) {
                //String list={sortedListUsingComparator.get(i).getName(), sortedListUsingComparator.get(i).getRole(),sortedListUsingComparator.get(i).getSupport(),sortedListUsingComparator.get(i).getSalary(), sortedListUsingComparator.get(i).getExperience()};
                //String getSalaryString=Double.toString();
                //String getExperienceString=Double.toString();
                //writer.write(list);
                writer.write(sortedListUsingComparable.get(i).getName()+sortedListUsingComparable.get(i).getRole()+sortedListUsingComparable.get(i).getSupport()+sortedListUsingComparable.get(i).getSalary()+sortedListUsingComparable.get(i).getExperience());
                writer.newLine();
            }

           writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("----------Written successfully----------");
        }
        }

    }





