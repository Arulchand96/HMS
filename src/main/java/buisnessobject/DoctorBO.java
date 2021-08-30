package buisnessobject;

import dao.Appointment_statusDAO;
import dao.DoctorDAO;
import entity.Appointment_status;
import entity.Doctor;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DoctorBO {

    public void createDoctor() {
        Scanner input = new Scanner(System.in);
        System.out.print("name:-");
        String dname = input.nextLine();
        System.out.print("specilization:-");
        String specilist = input.nextLine();
        System.out.print("work time:-");
        String appoint = input.nextLine();
        System.out.print("qualification:-");
        String doc_qual = input.nextLine();
        System.out.print("room no.:-");
        String droom = input.nextLine();
        Doctor doctor=new Doctor();
        doctor.setDname(dname);
        doctor.setSpecilist(specilist);
        doctor.setAppoint(appoint);
        doctor.setDoc_qual(doc_qual);
        doctor.setDroom(droom);
        DoctorDAO doctorDAO=new DoctorDAO();
        doctorDAO.save(doctor);
    }

     public void viewDoctor() {


        DoctorDAO doctorDAO=new DoctorDAO();
        List<Doctor> doctors = doctorDAO.find();


        {

            Iterator<Doctor> it = doctors.iterator();

            while (it.hasNext()) {

                Doctor doctor=it.next();



                System.out.println(doctor.getId());
                System.out.println(doctor.getDname());
                System.out.println(doctor.getSpecilist());
                System.out.println(doctor.getDoc_qual());
                System.out.println(doctor.getAppoint());
                System.out.println(doctor.getDroom());


            }

        }
    }

}
