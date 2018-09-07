/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectaBanco;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Manoel Henrique
 */
public class Conexao {
   public Statement stm; //responsavel por preparar e realizar pesquisas no banco de dados 
   public ResultSet rs; //responsavel por armazenar o resultado de uma pesquisa passada para statement
   private String driver = "org.postgresql.Driver"; //responsavel por identificar o serviço de banco de dados
   private String caminho = "jdbc:postgresql://localhost:5433/campoMinado"; // responsavel por setar o local do banco de dados
   private String usuario = "postgres";
   private String senha = "post";
   public Connection conn; //responsavel por realizar a Conexao com o banco de dados

   public void conecta(){
   
       try {
           
           System.setProperty("jdbc.Driver", driver);//seta a propriedade do driver de conexão
           conn=DriverManager.getConnection(caminho, usuario, senha); //realiza a conexão com o banco de dados
       } catch (SQLException ex) {
          
       }
   }
   
   public void desconcta(){
       try {
           conn.close();
       } catch (SQLException ex) {
       }
   }

    public void executaSQL(String sql) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (Exception e) {
        }
    }
}


