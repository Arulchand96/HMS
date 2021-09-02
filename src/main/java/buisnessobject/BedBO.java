package buisnessobject;
import buisnessobject.InPatientBO;
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
        //System.out.print("Bed id:-");
        //int bedId = input.nextInt();
        System.out.print("Bed type:-");
        String bedType = input.next();
        System.out.print("Room name:-");
        String roomName = input.next();


        Bed bed1 = new Bed();
        //bed.setBedId(bedId);
        bed1.setBedType(bedType);
        bed1.setRoomName(roomName);



        //BedDAO bedDAO= new BedDAO();


        //bedDAO.saveBed(bed);





    }
}