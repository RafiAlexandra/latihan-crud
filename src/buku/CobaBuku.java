
package buku;
import java.sql.*;
//import java.sql.Connection;
//import.java.sql.DriverManager;
//import.java.sql.SQLException;

public class CobaBuku {
public static void main(String[] args) {
 String url = "jdbc:mysql://localhost:3306/bukudb";
 String username = "root";
 String password = "";
 
 Connection  connect = null;

try{ 
 connect = DriverManager.getConnection(url, username, password);
    System.out.println("Koneksi berhasil");
 } catch (SQLException ex){
   System.out.println("Koneksi gagal" + ex);
      }

 String query = "SELECT * FROM buku";

 Statement st;
 ResultSet rs;
 String judulBuku;
 
 try{
 st = connect.createStatement();
 rs = st.executeQuery(query);
 while (rs.next()){
     judulBuku = rs.getString("");
     System.out.println(judulBuku);
    }
 } catch (SQLException ex) {
            System.out.println("Query gagal dijalankan");
}
}
}

