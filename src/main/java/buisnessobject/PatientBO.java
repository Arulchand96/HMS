package buisnessobject;

import dao.DoctorDAO;
import dao.PatientDAO;
import dao.VisitorDAO;
import entity.Doctor;
import entity.Patient;
import entity.Visitor;
import sun.security.x509.IPAddressName;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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


        Patient patient = new Patient();
        patient.setPname(pname);
        patient.setDob(dob);
        patient.setPhoneno(phoneno);
        patient.setType(type);


        PatientDAO patientDAO = new PatientDAO();
        patientDAO.save(patient);
    }

    public void viewPatient() {


        PatientDAO patientDAO = new PatientDAO();
        List<Patient> patients = patientDAO.find();


        {

            Iterator<Patient> it = patients.iterator();

            while (it.hasNext()) {

                Patient patient = it.next();


                System.out.println(patient.getId());
                System.out.println(patient.getPname());
                System.out.println(patient.getDob());
                System.out.println(patient.getPhoneno());
                System.out.println(patient.getType());


            }

        }
    }

    public void createReportOne() {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        Long idR = input.nextLong();
        System.out.print("name:-");
        String pnameR = input.next();


        Patient patient = new Patient();
        patient.setId(idR);
        patient.setPname(pnameR);
        PatientDAO patientDAO = new PatientDAO();
        patientDAO.reportOne(idR, pnameR);


        //PatientDAO patientDAO=new PatientDAO();
        patientDAO.reportOne( idR, pnameR);
    }

   /* public void createReportSix() {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        String type = input.nextLine();


        Patient patient = new Patient();
        patient.setType(type);

        PatientDAO patientDAO = new PatientDAO();
        patientDAO.reportSix(Type);


        //PatientDAO patientDAO=new PatientDAO();
        patientDAO.reportOne( idR, pnameR);
    }

    public void createReportSeven() {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        Long idR = input.nextLong();
        System.out.print("name:-");
        String pnameR = input.next();


        Patient patient = new Patient();
        patient.setId(idR);
        patient.setPname(pnameR);
        PatientDAO patientDAO = new PatientDAO();
        patientDAO.reportOne(idR, pnameR);


        //PatientDAO patientDAO=new PatientDAO();
        patientDAO.reportOne( idR, pnameR);
    }*/

    public void viewReportOne() {

        Patient patient=new Patient();




        //PatientDAO patientDAO=new PatientDAO();
        //patientDAO.reportOne(idR,pnameR);


        /*{

            //Iterator<Patient> it = patients.iterator();

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

}*/
    }

}

