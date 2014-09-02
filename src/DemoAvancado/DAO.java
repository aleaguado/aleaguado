/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DemoAvancado;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author aleaguado
 */
public class DAO {
    private Connection conn;
    private String tabPessoa = "Pessoas";
    
    public DAO(){
      
    }
  
        // O metodo inserir recebe por parametro um objeto do tipo Pessoa, que dentro tem as 
        // informaçoes necessarias para fazer a inserção no banco
    public boolean inserir(Pessoa p) {
        boolean retorno = false;
        String conteudo = "'" + p.getNome().toUpperCase() + "','" + p.getTelefone() + "'," + p.getIdade();
        
        String sql = "INSERT INTO " + tabPessoa + " values(" + conteudo + ")";
       try{
            conn = DB.getInstance().getConnection();
            Statement stm = this.conn.createStatement();
            stm.executeUpdate(sql);
            retorno = true;
          //  conn.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro -> " + this.getClass().getName() + ") - " + e.getMessage());
        }
       
       return retorno;  
                
    }
    
    
        public boolean atualizar(Pessoa p) {
        boolean retorno = false;
        
        String sql = "UPDATE " + tabPessoa + " SET TELEFONE = '" + p.getTelefone() + "', IDADE = " +p.getIdade() + " where NOME = '" + p.getNome().toUpperCase() + "'";
       try{
            conn = DB.getInstance().getConnection();
            Statement stm = this.conn.createStatement();
            stm.executeUpdate(sql);
            retorno = true;
          //  conn.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro -> " + this.getClass().getName() + ") - " + e.getMessage());
        }
       
       return retorno;  
                
    }
        
    public boolean remover(Pessoa p) {
        boolean retorno = false;

        String sql = "DELETE FROM " + tabPessoa + " where NOME = '" + p.getNome().toUpperCase() + "' and IDADE = " + p.getIdade() + " and TELEFONE = '" + p.getTelefone() + "'";
       try{
            conn = DB.getInstance().getConnection();
            Statement stm = this.conn.createStatement();
            stm.executeUpdate(sql);
            retorno = true;
          //  conn.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro -> " + this.getClass().getName() + ") - " + e.getMessage());
        }
       
       return retorno;  
                
    }     
        
        
        
    
    
    
    
    
        
    public ConjPessoas selecionar(String busca) {
            
         int j=0;
         ConjPessoas conjP = new ConjPessoas(100);
         
         String fields = "*";
         String filter = "NOME like '%" + busca.toUpperCase() +"%' or TELEFONE like '%" + busca + "%' or IDADE like '%" + busca + "%'";
        
         String sql = "SELECT " + fields + " from " + tabPessoa + " where " + filter;
       try{
            conn = DB.getInstance().getConnection();
            Statement stm = this.conn.createStatement();
            stm.execute(sql);  
             //Adquirindo através de um objeto ResulSet, os registros retornados pela SQL:  
            ResultSet results = stm.getResultSet();  
            while (results.next()){  
                conjP.insert(results.getNString("NOME"), results.getNString("TELEFONE"), results.getInt("IDADE"));
 //               JOptionPane.showMessageDialog (null, "Informações: " + results.getNString("NOME") + " | " + results.getNString("TELEFONE") + " | " + results.getInt("IDADE"));
            }
              return conjP;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro!!! -> " + this.getClass().getName().toString() + ") - " + e.getMessage());            
            return null;
        }

    }
    
    
    
}
