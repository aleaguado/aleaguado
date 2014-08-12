/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alexandreaguado;

import java.util.Scanner;

/**
 *
 * @author aleaguado
 */

class EstruturaAvancada  //Criamos aqui nossa classe EstruturaAvancada
   { 
   private String[] a;                 // cria a referência do vetor
   private int nElems;               // nElems controla quantos elementos o vetor terá ...
   private int novo;
   private int velho;
   //-----------------------------------------------------------
   public EstruturaAvancada(int max)         // método construtor
      {
      a = new String[max];                 // cria o vetor ...
      nElems = 0;                        // inicialmente sem itens ...
      }
//--------------------------------------------------------------
//Método de busca ....
//--------------------------------------------------------------
   public boolean find(String searchKey)
      {                              // metodo buscará o valor que a classe usuaria pedir ...
      
      int j;
      for(j=0; j<nElems; j++)            // varrerá o vetor buscando ...
         if(a[j].equals(searchKey))           // entrou o item?
            break;                       // sai do for antes de finalizar ...
      if(j == nElems)                    // precisou chegar no final??
         return false;                   // se sim, retorna falso
      else
         return true;                    // se não, encontrou ...
      }  // fim da busca
  
    public boolean buscaAvancada(String searchKey)
      {                              // metodo buscará o valor que a classe usuaria pedir ...
      int j;
      boolean teste=false;
      for(j=0; j<nElems; j++)           // varrerá o vetor buscando ...
         if(a[j].charAt(0) == searchKey.charAt(0))   {        // entrou o item?
              System.out.println("Encontrado o nome: " + a[j] );                       // sai do for antes de finalizar ...
              teste=true;
         }
        return teste;                // se não, encontrou ...
      }  // fim da busca
 
//--------------------------------------------------------------
//Método de inserção ....
//--------------------------------------------------------------
   public void insert(String value)    // insere um elemento no vetor
      {
      a[nElems] = value;             // insere nessa posição ...
      nElems++;                      // incrementa o tamanho
      }
//--------------------------------------------------------------
//Método de remoção ....
//--------------------------------------------------------------
   public boolean delete(String value)
      {
      int j;
      for(j=0; j<nElems; j++)        // varre o vetor 
         if( value == a[j] )
            break;
      if(j==nElems)                  // se não encontrar retorna falso
         return false;
      else                           // se encontrar ...
         {
         for(int k=j; k<nElems; k++) // move os mais altos para "frente"
            a[k] = a[k+1];
         nElems--;                   // decrementa o contador de elementos
         return true;
         }
      }  // final do método de remoção
//--------------------------------------------------------------
//Método de visualização ....
//--------------------------------------------------------------
   public void display()             // mostra o conteúdo do vetor
      {
      for(int j=0; j<nElems; j++)      
         System.out.print(a[j] + " ");  
      System.out.println("");
      }
   //-----------------------------------------------------------
   }  // aqui termina a classe EstruturaAvancada



public class AlexandreAguado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max=100;
        Scanner entstring = new Scanner(System.in);
        Scanner entint = new Scanner(System.in);
        int qty=0;
        // TODO code application logic here
        System.out.println("Seja bem vindo! Quantos nomes vai guardar?");
        qty = entint.nextInt();
        System.out.println("Entao vamos guardar: " + qty);
        EstruturaAvancada arr = new EstruturaAvancada(qty);
        
        for (int i = 0; i < qty; i++) {
            System.out.println("Digite um nome");
            arr.insert(entstring.nextLine());
        }

        System.out.println("Digite uma letra para buscarmos:");
        
       if (!arr.buscaAvancada(entstring.nextLine()))
            System.out.println("Nao encontrado!!!"); 
       
        System.out.println("Linha adicionada para teste_1");
        System.out.println("Linha adicionada para teste_2");       
        System.out.println("Linha adicionada para teste_3");
        
        System.out.println("Linha adicionada para teste_4");
        System.out.println("Linha adicionada por AleAluno para teste_5");
 
        System.out.println("Linha adicionada para teste_5");
        System.out.println("Linha do Aguado!!!");
        System.out.println("Adicionei algo depois do arquivo do alealuno!!!");
    }
  
}
