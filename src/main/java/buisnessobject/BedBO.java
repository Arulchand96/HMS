package buisnessobject;

import dao.BedDAO;
import dao.InpatientDAO;
import dao.PatientDAO;
import entity.Bed;
import entity.Patient;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BedBO {

    public void createBed() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bed id:-");
        int bedId = input.nextInt();
        System.out.print("Bed type:-");
        String bedType = input.nextLine();
        System.out.print("Room name:-");
        String roomName = input.nextLine();


        Bed bed = new Bed();
        bed.setBedId(bedId);
        bed.setBedType(bedType);
        bed.setRoomName(roomName);


        //InpatientDAO inPatientDAO=new InpatientDAO();
        //List<Bed> bed =inPatientDAO.s();
    }
}