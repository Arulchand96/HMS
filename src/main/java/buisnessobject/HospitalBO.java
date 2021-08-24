package buisnessobject;

import dao.HospitalDAO;
import entity.Hospital;
import java.util.ListIterator;
import java.util.*;
import java.util.Scanner;

public class HospitalBO {

    public void createHospital() {
        Scanner input = new Scanner(System.in);
        System.out.print("name:-");
        String Hname = input.nextLine();
        System.out.print("Location:-");
        String Hlocation = input.nextLine();
        Hospital h = new Hospital();
        h.setName(Hname);
        h.setLocation(Hlocation);
        HospitalDAO hospitalDAO = new HospitalDAO();
        hospitalDAO.save(h);
    }

    public void viewHospital() {


        HospitalDAO hospitalDAO = new HospitalDAO();
        List<Hospital> hospitals = hospitalDAO.find();


        {
/*defining a List
            //List<String>  = Arrays.asList("Boston", "San Diego", "Las Vegas", "Houston", "Miami", "Austin");
//iterate List using the ListIterator

            ListIterator<Hospital> h = hospitals.listIterator();
            while(h.hasNext())
            {
//prints the elements of the List
                System.out.println(h.next());
            }
        }
    }
*/
            //List<String> myList = new ArrayList<String>();

            // Adding elements to the List
            // Custom inputs
           // hospitals.add(hospitals.get(1));
           // hospitals.add(hospitals.get(2));
            //hospitals.add(hospitals.get(3));


            // Iterator
            Iterator<Hospital> it = hospitals.iterator();

            // Condition check for elements in List
            // using hasNext() method returning true till
            // there i single element in a List
            while (it.hasNext()) {

                Hospital hospital=it.next();


                // Print all elements of List
                System.out.println(hospital.getId());
                System.out.println(hospital.getName());
                System.out.println(hospital.getLocation());
               // System.out.println(it.next());
                // Hospital hospital = new Hospital();
        /*hospitals.setId(hospitals.getLong(1));
        hospital.setName(resultSet.getString(2));
        hospital.setLocation(resultSet.getString(3));*/
        /*System.out.println("--------------------------------------------------------------------------------");
        System.out.println(hospital.getId());
        System.out.println(hospital.getName());
        System.out.println(hospital.getLocation());
        System.out.println("--------------------------------------------------------------------------------");*/
            }

        }
    }
}