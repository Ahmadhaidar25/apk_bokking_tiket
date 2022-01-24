/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bioskop;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmadhaidar
 */
public class konekDB {
    Connection con;
    public Connection getConnection(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbbioskop","root","");
            JOptionPane.showMessageDialog(null, "KONEKSI SUKSES");
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GAGAL KONEKSI");
        }
        return con;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
