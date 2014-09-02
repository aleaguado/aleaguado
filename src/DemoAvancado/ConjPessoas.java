/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DemoAvancado;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleaguado
 */
public class ConjPessoas {
 
   private Pessoa[] a;                 // cria a referência para um vetor do tipo Pessoa
   private int nElems;               // nElems controla quantos elementos o vetor terá ... 
    
    public ConjPessoas(int max)         // método construtor
      {
      a = new Pessoa[max];                 // cria o vetor ...
      nElems = 0;                        // inicialmente sem itens ...
      }

 //--------------------------------------------------------------
//Método que retorna quantidade de itens do vetor ....
//--------------------------------------------------------------
   public int size()
      { return nElems; }

//--------------------------------------------------------------
//Método de inserção ORDENADA com String!!! ....
//--------------------------------------------------------------
   public void insert(String n, String t, int id)    // insere o elemento no vetor
      {
      int j;
      for(j=0; j<nElems; j++)        // localiza onde esse elemento se encaixa
          //usamos aqui o metodo compareTo para String
          if (a[j].getNome().compareTo(n) > 0) //mudado
            break;
      for(int k=nElems; k>j; k--)    // move os elementos maiores uma posição p/ frente
         a[k] = a[k-1];
      //Apos abrir um espaço no lugar certo, ele cria o nome objeto Pessoa na posição aberta!!!
      a[j] = new Pessoa(n, t, id);                  // insere o elemento na posição necessária
      nElems++;                      // incrementa a variavel de controle de tamanho
      }  // finaliza o método de inserção

   
//Retorna o formato que a jTable precisa   
//public Object[] toJTable()    // insere o elemento no vetor
//      {
//      int j;
//      for(j=0; j<nElems; j++)        // localiza onde esse elemento se encaixa
//          //usamos aqui o metodo compareTo para String
//          if (a[j].getNome().compareTo(n) > 0) //mudado
//            break;
//      for(int k=nElems; k>j; k--)    // move os elementos maiores uma posição p/ frente
//         a[k] = a[k-1];
      //Apos abrir um espaço no lugar certo, ele cria o nome objeto Pessoa na posição aberta!!!
//      a[j] = new Pessoa(n, t, id);                  // insere o elemento na posição necessária
//      nElems++;                      // incrementa a variavel de controle de tamanho
//      }  // finaliza o método de inserção

  
 public DefaultTableModel getTable() {
 
    String[] colunas = new String[]{"Nome","Telefone", "Idade"};
 
    String[][] dados = new String[100][3];
    
     for (int i = 0; i < nElems; i++) {
         dados[i][0] = a[i].getNome();
         dados[i][1] = a[i].getTelefone();
         dados[i][2] = Integer.toString(a[i].getIdade());
     }
    

    DefaultTableModel model = new DefaultTableModel(dados , colunas );
    
    return model;
 
 }   
   
   
   
//--------------------------------------------------------------
//Método de visualização ....
//--------------------------------------------------------------
   public void display()             // mostra o conteúdo do vetor
      {
      for(int j=0; j<nElems; j++)      
         a[j].displayPessoa();
      }
   //-----------------------------------------------------------
}

