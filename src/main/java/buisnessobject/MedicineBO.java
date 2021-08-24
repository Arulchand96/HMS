package buisnessobject;

import dao.MedicineDAO;
import dao.PatientDAO;
import entity.Medicine;
import entity.Patient;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MedicineBO {

    public void createMedicine() {
        Scanner input = new Scanner(System.in);
        System.out.print("name:-");
        String med_name = input.nextLine();
        System.out.print("comp:-");
        String med_comp = input.nextLine();
        System.out.print("exp_date:-");
        String exp_date = input.nextLine();
        System.out.print("cost:-");
        String med_cost = input.nextLine();
        System.out.print("no of unit:-");
        int count = input.nextInt();
        Medicine medicine=new Medicine();
        medicine.setMed_name(med_name);
        medicine.setMed_comp(med_comp);
        medicine.setExp_date(exp_date);
        medicine.setMed_cost(med_cost);
        medicine.setCount(count);

        MedicineDAO medicineDAO=new MedicineDAO();
        medicineDAO.save(medicine);
    }

    public void viewMedicine() {


        MedicineDAO medicineDAO=new MedicineDAO();
        List<Medicine> medicines= medicineDAO.find();


        {

            Iterator<Medicine> it = medicines.iterator();

            while (it.hasNext()) {

                Medicine medicine=it.next();



                System.out.println(medicine.getMed_name());
                System.out.println(medicine.getMed_comp());
                System.out.println(medicine.getMed_comp());
                System.out.println(medicine.getMed_cost());
                System.out.println(medicine.getCount());




            }

        }
    }

}

