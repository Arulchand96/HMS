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
        System.out.print("disease:-");
        String disease = input.nextLine();
        System.out.print("sex:-");
        String sex = input.nextLine();
        System.out.print("admit_status:-");
        String admit_status = input.nextLine();
        System.out.print("age:-");
        int age = input.nextInt();
        Patient patient=new Patient();
        patient.setPname(pname);
        patient.setDisease(disease);
        patient.setSex(sex);
        patient.setAdmit_status(admit_status);
        patient.setAge(age);

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
                System.out.println(patient.getDisease());
                System.out.println(patient.getAdmit_status());
                System.out.println(patient.getSex());
                System.out.println(patient.getAge());



            }

        }
    }

}

