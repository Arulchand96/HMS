package dao;
import buisnessobject.BedBO;
import buisnessobject.InPatientBO;
import entity.Bed;
import entity.Patient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BedDAO {

    String myUrl = "jdbc:mysql://localhost:3306/HospitalMS?useSSL=false";
    String user = "root";
    String pass = "8883543506";

    public void saveBed(int bed) {

        Bed bed1=new Bed();

        BedBO bedBO = new BedBO();
        bedBO.createBed();



        //List<Bed> beds = new ArrayList<Bed>();



        try {

            // create a mysql database connection
            //String myDriver = "com.mysql.cj.jdbc.Driver";


            //Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            Statement st = conn.createStatement();

            st.executeUpdate("INSERT INTO bed ( bedid, bedtype, roomname ) "
                    + "VALUES ('"+bed+"','"+bed1.getBedType()+"','"+bed1.getRoomName()+"')");
            //Bed bed=new Bed();
            //beds.add(bed);


            conn.close();
            System.out.println("Bed and Room given for IP patient");
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }


    }

    public List<Bed> find() {



        List<Bed> b = new ArrayList<Bed>();

        try {

            Connection conn = DriverManager.getConnection(myUrl, user, pass);

            String query = "SELECT * FROM bed;";

            Statement st = conn.createStatement();

            ResultSet resultSet = st.executeQuery(query);

            while (resultSet.next()) {

                Bed bed=new Bed();
                bed.setBedId(resultSet.getInt(1));
                bed.setBedType(resultSet.getString(2));
                bed.setRoomName(resultSet.getString(3));
                //patient.setPhoneno(resultSet.getString(4));
                //patient.setType(resultSet.getString(5));
                //p.add(patient);

            }




            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        finally {
            return b;
        }
    }
}
