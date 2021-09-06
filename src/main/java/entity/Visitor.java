package entity;

import java.text.DateFormat;
import java.util.Date;
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



    private long id;
    private long pid;
    private long did;
    private String doctor_reccommend;
    private String medicine;
    private Boolean followup;
    private String from;
    private String to;
    private String visitdate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
       id = id;
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

    public Boolean getFollowup() {
        return followup ;
    }

    public void setFollowup(boolean followup) {
        this.followup = followup;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getVisitdate() {
        return visitdate;
    }

    public void setVisitdate(String visitdate) {
        this.visitdate = visitdate;
    }
}
