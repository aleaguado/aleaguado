/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DemoAvancado;

/**
 *
 * @author aleaguado
 */
public class Pessoa {
   private String nome;
   private String telefone;
   private int idade;
//--------------------------------------------------------------
   public Pessoa(String n, String t, int id)
      {                               // comentario aqui
      nome = n;
      telefone = t;
      idade = id;
      }
//--------------------------------------------------------------
   public void displayPessoa()
      {
      System.out.print("   Nome: " + nome);
      System.out.print(", Telefone: " + telefone);
      System.out.println(", Idade: " + idade);
      }
//--------------------------------------------------------------
   public String getNome()           // comentario aqui
      { return nome; }
   
   public String getTelefone()           // comentario aqui
      { return telefone; }
   
   public int getIdade()           // comentario aqui
      { return idade; }
}