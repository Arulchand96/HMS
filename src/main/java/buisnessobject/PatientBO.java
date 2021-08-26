package buisnessobject;

import dao.DoctorDAO;
import dao.PatientDAO;
import entity.Doctor;
import entity.Patient;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PatientBO {

    public void createPatient() {
        Scanner input = new Scanner(System.in);
        System.out.print("name:-");
        String pname = input.nextLine();
        System.out.print("dob:-");
        String dob = input.nextLine();
        System.out.print("phoneno:-");
        String phoneno = input.nextLine();
        System.out.print("type:-");
        String type = input.nextLine();


        Patient patient=new Patient();
        patient.setPname(pname);
        patient.setDob(dob);
        patient.setPhoneno(phoneno);
        patient.setType(type);


         PatientDAO patientDAO=new PatientDAO();
        patientDAO.save(patient);
    }

    public void viewPatient() {


        PatientDAO patientDAO=new PatientDAO();
        List<Patient> patients = patientDAO.find();


        {

            Iterator<Patient> it = patients.iterator();

            while (it.hasNext()) {

                Patient patient=it.next();



                System.out.println(patient.getId());
                System.out.println(patient.getPname());
                System.out.println(patient.getDob());
                System.out.println(patient.getPhoneno());
                System.out.println(patient.getType());



            }

        }
    }

}

