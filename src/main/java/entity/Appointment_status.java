package entity;

import java.util.Scanner;

public class Appointment_status {

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

    private long pid;
    private String date_of_visit;
    private String purpose_of_visit;
    private String bp;
    private String temperature;
    private String doctor_visit;
    private int is_firstvisit;



    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getDate_of_visit() {
        return date_of_visit;
    }

    public void setDate_of_visit(String date_of_visit) {
        this.date_of_visit = date_of_visit;
    }

    public String getPurpose_of_visit() {
        return purpose_of_visit;
    }

    public void setPurpose_of_visit(String purpose_of_visit) {
        this.purpose_of_visit = purpose_of_visit;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getDoctor_visit() {
        return doctor_visit;
    }

    public void setDoctor_visit(String doctor_visit) {
        this.doctor_visit = doctor_visit;
    }

    public int getIs_firstvisit() {
        return is_firstvisit;
    }

    public void setIs_firstvisit(int is_firstvisit) {
        this.is_firstvisit = is_firstvisit;

    }




}
