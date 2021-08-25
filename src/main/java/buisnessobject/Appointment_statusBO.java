package buisnessobject;

import dao.Appointment_statusDAO;
import dao.HospitalDAO;
import entity.Appointment_status;
import entity.Hospital;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Appointment_statusBO {

    public void createAppointment_status() {
        Scanner input = new Scanner(System.in);
        System.out.print("Patient id:-");
        long pid = input.nextLong();
        System.out.print("Date of visit-");
        String date_of_visit = input.nextLine();
        System.out.print("Purpose of visit:-");
        String purpose_of_visit = input.nextLine();
        System.out.print("bp:-");
        String bp = input.nextLine();
        System.out.print("Temperature:-");
        String temperature = input.nextLine();
        System.out.print("Doctor visit:-");
        String doctor_visit = input.nextLine();
        System.out.print("is firstvisit:-");
        int  is_firstvisit = input.nextInt();
        Appointment_status a=new Appointment_status();
        a.setPid(pid);
        a.setDate_of_visit(date_of_visit);
        a.setPurpose_of_visit(purpose_of_visit);
        a.setBp(bp);
        a.setTemperature(temperature);
        a.setDoctor_visit(doctor_visit);
        a.setIs_firstvisit(is_firstvisit);
       Appointment_statusDAO appointment_statusDAO= new Appointment_statusDAO();
        appointment_statusDAO.save(a);
    }

    public void viewAppointment_status() {


        Appointment_statusDAO appointment_statusDAO=new Appointment_statusDAO();
        List<Appointment_status> appointment_statuses = appointment_statusDAO.find();


        {

            Iterator<Appointment_status> it = appointment_statuses.iterator();

            while (it.hasNext()) {

                Appointment_status appointment_status=it.next();



                System.out.println(appointment_status.getPid());
                System.out.println(appointment_status.getDate_of_visit());
                System.out.println(appointment_status.getPurpose_of_visit());
                System.out.println(appointment_status.getBp());
                System.out.println(appointment_status.getTemperature());
                System.out.println(appointment_status.getDoctor_visit());
                System.out.println(appointment_status.getIs_firstvisit());

            }

        }
    }




}
