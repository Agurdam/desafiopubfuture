/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.utils;

/**
 *
 * @author X
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Singleton {
    
    private static EntityManager conection;
    private static EntityManagerFactory emf;

  
    public static EntityManager getConection() {
        if(conection == null){
            setConection();
        }
        return conection;
    }

    
    public static void setConection(){
        emf = Persistence.createEntityManagerFactory("JPA");
        conection = emf.createEntityManager();
    }
    
    
    
}
