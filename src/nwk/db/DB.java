/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nwk.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alexandre Garcia Aguado
 * @Baseado nos materiais do Prof. Monan
 */
public class DB {
    
    private final String Db = "xe";
    private final String ConnString = "jdbc:oracle:thin:@//10.1.1.182:1521/" + Db;
    private final String User = "aleaguado";
    private final String Pass = "aleaguado";
    private Connection connection;
    
    private static DB instance;
    
    
    public static DB getInstance(){
        if (instance == null){
            instance = new DB();
        }
        return instance;
    }
    
    public Connection getConnection() throws SQLException{
        if (connection == null){
            connection = DriverManager.getConnection(ConnString,User,Pass);
        }
        return connection;
    }    
    
}