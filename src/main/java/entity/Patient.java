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
    private String disease;
    private String sex;
    private String admit_status;
    private int age;




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

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdmit_status() {
        return admit_status;
    }

    public void setAdmit_status(String admit_status) {
        this.admit_status = admit_status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
