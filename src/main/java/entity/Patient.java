package entity;

public class Patient {

   /* Scanner input = new Scanner(System.in);

            System.out.print("name:-");
            String pname = input.nextLine();
            System.out.print("disease:-");
            String disease = input.nextLine();
            System.out.print("sex:-");
            String sex = input.nextLine();
            System.out.print("admit_status:-");
            String admit_status = input.nextLine();
            System.out.print("age:-");
            int age = input.nextInt(); */

    private long id;
    private String pname;
    private String dob;
    private String phoneno;
    private String type;





    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
