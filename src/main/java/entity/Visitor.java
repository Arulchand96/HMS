package entity;

import java.util.Scanner;

public class Visitor {

   /* Scanner input = new Scanner(System.in);
            System.out.print("Patient id:-");
    String pid = input.nextLine();
            System.out.print("Date of visit-");
    String date_of_visit = input.nextLine();
            System.out.print("Purpose of visit:-");
    String purpose_of_visit = input.nextLine();
            System.out.print("bp:-");
    int bp = input.nextInt();
            System.out.print("Temperature:-");
    int Temperature = input.nextInt();
            System.out.print("Doctor visit:-");
    String Dotor_visit = input.nextLine();
            System.out.print("is firstvisit:-");
    int is_firstvisit = input.nextInt();*/



    private long vid;
    private long pid;
    private long did;
    private String doctor_reccommend;
    private String medicine;

    public long getVid() {
        return vid;
    }

    public void setVid(long vid) {
       vid = vid;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public long getDid() {
        return did;
    }

    public void setDid(long did) {
        this.did = did;
    }

    public String getDoctor_reccommend() {
        return doctor_reccommend;
    }

    public void setDoctor_reccommend(String doctor_reccommend) {
        this.doctor_reccommend = doctor_reccommend;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
}
