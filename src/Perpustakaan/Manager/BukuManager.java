 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan.Manager;

import Perpus.Helper.CheckConnection;
import static Perpus.Helper.CheckConnection.showBook;
import Perpus.Helper.ConnectionHelper;
import Perpustakaan.Model.Buku;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Fitri Ariska
 */
public class BukuManager {
     public static void main(String[] args){    
     }
      public static List<Buku> showAllBook(){
       List<Buku> bukulist = new ArrayList();
       
           try{  
           Connection conn = (Connection) ConnectionHelper.getConnection();
           Statement stmn = conn.createStatement();
           ResultSet rs = stmn.executeQuery("Select * from buku");
           
           //perulangan untuk menampilkan isi tabel atau output 
           
           while (rs.next()){
              Buku buku = new Buku();
              buku.setId_buku(Integer.parseInt(rs.getString("id_buku")));
              buku.setJudul_buku(rs.getString("judul_buku"));
              buku.setPenerbit(rs.getString("penerbit"));
              buku.setPengarang(rs.getString("pengarang"));
              buku.setTahun_terbit(Integer.valueOf(rs.getString("tahun_terbit")));
              
              bukulist.add(buku);
           }
    }catch (SQLException ex){
        Logger.getLogger(CheckConnection.class.getName()).log(Level.SEVERE, null, ex);
        
       }
           return bukulist;
           
}
      
    
     
 }
         
         


    
    
          
          
           
        


