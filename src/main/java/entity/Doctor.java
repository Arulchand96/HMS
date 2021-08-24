package entity;

public class Doctor {

   /* System.out.print("name:-");
    String dname = input.nextLine();
                System.out.print("specilization:-");
    String specilist = input.nextLine();
                System.out.print("work time:-");
    String appoint = input.nextLine();
                System.out.print("qualification:-");
    String doc_qual = input.nextLine();
                System.out.print("room no.:-");
    String droom = input.nextLine(); */

    private long id;
    private String dname;
    private String specilist;
    private String appoint;
    private String doc_qual;
    private String droom;




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getSpecilist() {
        return specilist;
    }

    public void setSpecilist(String specilist) {
        this.specilist = specilist;
    }

    public String getAppoint() {
        return appoint;
    }

    public void setAppoint(String appoint) {
        this.appoint = appoint;
    }

    public String getDoc_qual() {
        return doc_qual;
    }

    public void setDoc_qual(String doc_qual) {
        this.doc_qual = doc_qual;
    }

    public String getDroom() {
        return droom;
    }

    public void setDroom(String droom) {
        this.droom = droom;
    }

}
