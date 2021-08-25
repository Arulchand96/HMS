package buisnessobject;

;
import dao.VisitorDAO;
import entity.Visitor;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VisitorBO {

    public void createVisitor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Visitor id:-");
        long vid = input.nextLong();
        System.out.print("Patient id:-");
        long pid = input.nextLong();
        System.out.print("Doctor id:-");
        long did = input.nextLong();
        System.out.print("Doctor recommendation:-");
        String doctor_recommend = input.nextLine();
        System.out.print("Medicine:-");
        String medicine = input.nextLine();

        Visitor visitor=new Visitor();

        visitor.setVid(vid);
        visitor.setPid(pid);
        visitor.setDid(did);
        visitor.setDoctor_reccommend(doctor_recommend);
        visitor.setMedicine(medicine);

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



                System.out.println(visitor.getVid());
                System.out.println(visitor.getPid());
                System.out.println(visitor.getDid());
                System.out.println(visitor.getDoctor_reccommend());
                System.out.println(visitor.getMedicine());


            }

        }
    }




}
