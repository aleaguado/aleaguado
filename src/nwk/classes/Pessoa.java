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
public class Pessoa {
    private String nome;
    private String telefone;
    private int idade;

    public Pessoa(String nomep, String telefonep, int idadep) {
        nome = nomep;
        telefone = telefonep;
        idade = idadep;
    }
    
    public void setValues(String nomep, String telefonep, int idadep) {
        nome = nomep;
        telefone = telefonep;
        idade = idadep;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public int getIdade() {
        return idade;
    }

            }
