package buisnessobject;

;
import dao.PatientDAO;
import dao.VisitorDAO;
import entity.Visitor;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class VisitorBO {

    public void createVisitor() {
        Scanner input = new Scanner(System.in);

        System.out.print("Patient id:-");
        long pid = input.nextLong();
        System.out.print("Doctor id:-");
        long did = input.nextLong();
        System.out.print("Doctor recommendation:-");
        String doctor_recommend = input.next();
        System.out.print("Medicine:-");
        String medicine = input.next();
        System.out.print("Followup Need:-");
        Boolean followup = input.nextBoolean();
        System.out.print("Followup Need:-");
        String visitdate = input.next();

        Visitor visitor=new Visitor();


        visitor.setPid(pid);
        visitor.setDid(did);
        visitor.setDoctor_reccommend(doctor_recommend);
        visitor.setMedicine(medicine);
        visitor.setFollowup(followup);
        visitor.setVisitdate(visitdate);

       VisitorDAO visitorDAO=new VisitorDAO();
        visitorDAO.save(visitor);
    }

    public void viewVisitor() {


        VisitorDAO visitorDAO=new VisitorDAO();
        List<Visitor> visitors = visitorDAO.find();


        {

            Iterator<Visitor> it = visitors.iterator();


            while (it.hasNext()) {

                Visitor visitor=it.next();



                System.out.println(visitor.getId());
                System.out.println(visitor.getPid());
                System.out.println(visitor.getDid());
                System.out.println(visitor.getDoctor_reccommend());
                System.out.println(visitor.getMedicine());
                System.out.println(visitor.getFollowup());
                System.out.println(visitor.getVisitdate());


            }

        }
    }

    public void createReportTwo() {
        Scanner input = new Scanner(System.in);

        System.out.print("Patient id:-");
        long pid = input.nextLong();

        Visitor visitor=new Visitor();


        visitor.setPid(pid);


        VisitorDAO visitorDAO=new VisitorDAO();
        visitorDAO.reportTwo(pid);
    }

    public void createReportThree() {

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        Scanner input = new Scanner(System.in);


        System.out.print("Enter date from: ");
        String from = input.nextLine();

        System.out.print("Enter date to: ");
        String to = input.nextLine();

        Visitor visitor=new Visitor();


        visitor.setFrom(from);
        visitor.setTo(to);


        VisitorDAO visitorDAO=new VisitorDAO();
        visitorDAO.reportThree(from, to);
    }



    public void createReportFour() {

        //SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        Scanner input = new Scanner(System.in);


        System.out.print("Follow up or not: ");
        Boolean followup = input.nextBoolean();

        Visitor visitor=new Visitor();

        visitor.setFollowup(followup);
        //visitor.setTo(to);


        VisitorDAO visitorDAO=new VisitorDAO();
        visitorDAO.reportFour(followup);
    }

    public void createReportFive() {

        //SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        Scanner input = new Scanner(System.in);


        System.out.print("Doctor Id: ");
        Long did = input.nextLong();

        Visitor visitor=new Visitor();

        visitor.setDid(did);
        //visitor.setTo(to);


        VisitorDAO visitorDAO=new VisitorDAO();
        visitorDAO.reportFive(did);
    }



    public void createReportEight() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        String date=dtf.format(now);

        System.out.println("Today Date"+date);
        System.out.println("the today’s visited patients list");



        Visitor visitor=new Visitor();

        //visitor.setDid(did);
        //visitor.setTo(to);


        PatientDAO patientDAO=new PatientDAO();
        patientDAO.reportEight(date);
    }




}
