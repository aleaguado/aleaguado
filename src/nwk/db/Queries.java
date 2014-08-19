/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nwk.db;
import nwk.classes.*;
import javax.swing.JOptionPane;

/**
 *
 * @author aleaguado
 */
public class Queries {
    private DAO idao = new DAO();
    private String tabPessoa = "Pessoas";
    
    private void Queries(){
    }
    
    public boolean inserirPessoa(String Nome, String Telefone, int Idade) {
        String conteudo = "'" + Nome.toUpperCase() + "','" + Telefone + "'," + Idade;
        if (!idao.inserir(tabPessoa,conteudo)) {
            return false;
        }
        return true;
    }
    
    public EstruturaDados selecionarPessoa(String busca) {        
        String cond;
        String[][] arr;
        cond = "NOME like '%" + busca.toUpperCase() +"%' or TELEFONE like '%" + busca + "%' or IDADE like '%" + busca + "%'";
        
        try{
            return idao.selecionar(tabPessoa, "*", cond);
        }

        catch (Exception e) {      
            JOptionPane.showMessageDialog(null,"Erro ao selecionar");
        }
        return null;
    }    
}
