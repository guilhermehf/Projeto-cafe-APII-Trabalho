package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author assparremberger
 */
public class Conexao {
    private  static final String URL = 
            "jdbc:mysql://localhost:3306/app_cafe?zeroDateTimeBehavior=convertToNull";
    private  static final String USER = "root";
    private  static final String SENHA = "";
    private  static final String DRIVER = 
            "com.mysql.jdbc.Driver";
    
    
    public static void executar(String query){
        try {
            Class.forName( DRIVER );
            Connection conn = DriverManager.getConnection(URL,USER,SENHA);
            Statement st = conn.createStatement();
            st.execute( query );
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog
                (null, e.toString());
        }
    }
    
    public static int executarComRetornoId(String query){
        
        try {
            
            Class.forName( DRIVER );
            Connection conn = DriverManager.getConnection(URL,USER,SENHA);
            PreparedStatement st = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
           
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            rs.next();
            int id = rs.getInt(1);
            conn.close();
            return id;
        } catch (Exception e) {
            JOptionPane.showMessageDialog
                (null, e.toString());
            return 0;
        }
    }
    
    public static ResultSet consultar(String query){
        try {
            Class.forName( DRIVER );
            Connection conn = 
                DriverManager.getConnection(URL,USER,SENHA);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery( query );
        //    conn.close();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog
                (null, e.toString());
            return null;
        }
    }
    
}
