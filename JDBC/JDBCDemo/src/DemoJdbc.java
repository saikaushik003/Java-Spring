import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {
        /*
        import package
        load and register
        create connection
        create statement
        execute statement
        process the results
        close
         */
        int sid = 102;
        String sname= "LM10";
        int marks = 91;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "saikaushik38";
        String query = "insert into student values(?, ?, ?)";

        Connection con = DriverManager.getConnection(url, uname,pass);

        System.out.println("Connection Established");

        //Statement st = con.createStatement();
        //st.executeQuery(query)//for reading i.e select
        //st.execute(query)//for insert, update, delete

        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);

        st.execute();

        con.close();
        System.out.println("Connection closed");
    }

}
