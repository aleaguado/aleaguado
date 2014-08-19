/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nwk.classes;

/**
 *
 * @author aleaguado
 */
public class EstruturaDados {
   private Pessoa[] a;               // vetor do tipo pessoa
   private int nElems;               /// quantas pessoas serao armazenadas no vetor

   public EstruturaDados(int max)    // comentario aqui
      {
      a = new Pessoa[max];               // comentario aqui
      nElems = 0;                        // comentario aqui
      }
//--------------------------------------------------------------                                    // put person into array
   public void inserir(String nome, String telefone, int idade)
      {
      a[nElems] = new Pessoa(nome, telefone, idade);
      nElems++;                          // comentario aqui
      }
   
//--------------------------------------------------------------
public Pessoa display(int indice)
      {
      return a[indice];
      }
//--------------------------------------------------------------
public int size()
      {
      return nElems;
      }

   }  // end class ClassDataArray