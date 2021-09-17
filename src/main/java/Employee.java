

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;

public class Employee {

    public static void AllTheEmployeesInDevelopmentTeam() throws Exception {
        File myFile = new File("C:\\Users\\Dell\\Desktop\\Employee.txt");
        Scanner myScan = new Scanner(myFile);

        List<Employee> employees = new ArrayList();


        while (myScan.hasNext()) {

            String line = myScan.nextLine();
            Scanner scanner = new Scanner(line);
            scanner.useDelimiter(",");

            while (scanner.hasNext()) {
                String name = scanner.next();
                String role = scanner.next();
                String support = scanner.next();
                String salary = scanner.next();
                String experience  = scanner.next();

                 employee = new ();
                employees.add(employee);


                System.out.println(employee);
            }

    }

        // reading text file into List in Java 7

       /* try {
            List<String> lines = Collections.emptyList();
            lines = Files.readAllLines(Paths.get("C:\\Users\\Dell\\Desktop\\Employee.txt"), StandardCharsets.UTF_8);

            System.out.println("Content of List:");
            System.out.println(lines);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/




    }

    public static void main(String[] args) throws Exception{

        Employee.AllTheEmployeesInDevelopmentTeam();
    }




}
