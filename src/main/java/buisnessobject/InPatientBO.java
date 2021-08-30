package buisnessobject;




import dao.InpatientDAO;
import entity.InPatient;


import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class InPatientBO {

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


        InPatient patient=new InPatient();
        patient.setPname(pname);
        patient.setDob(dob);
        patient.setPhoneno(phoneno);
        patient.setType(type);


        InpatientDAO patientDAO=new InpatientDAO();
        patientDAO.iP();
    }
    }
