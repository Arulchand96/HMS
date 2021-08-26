package buisnessobject;

import entity.Visitor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class InpatientBO {

    String myUrl = "jdbc:mysql://localhost:3306/HospitalMS?useSSL=false";
    String user = "root";
    String pass = "8883543506";

    private long pid;
    private String type;

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void IP() {

            try {

                Connection conn = DriverManager.getConnection(myUrl, user, pass);

                Statement st = conn.createStatement();

                //Connection conn = DriverManager.getConnection(myUrl, user, pass);

                String query = "SELECT * FROM patient where type='op'";

                ResultSet resultSet = st.executeQuery(query);

                while (resultSet.next()) {

                    InpatientBO inpatientBO=new InpatientBO();
                    inpatientBO.setPid(resultSet.getLong(1));
                    inpatientBO.setType(resultSet.getString(2));


                }



                conn.close();

            } catch (Exception e) {
                System.err.println("Got an exception!");
                System.err.println(e.getMessage());
            }


    }
}
