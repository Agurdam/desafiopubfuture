/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.dao;

import com.br.entidades.Contas;
import com.br.utils.Singleton;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author X
 */
public class ContasDao {
      private EntityManager em;
    
    public ContasDao(){
        em = Singleton.getConection();
    }
    
    public void inserir(Contas cat){
        em.getTransaction().begin();
        em.persist(cat);
        em.getTransaction().commit();
    }
    
    public void atualizar(Contas cat){
        em.getTransaction().begin();
        em.merge(cat);
        em.getTransaction().commit();
    }
    
    public void excluir(Contas cat){
        em.getTransaction().begin();
        em.remove(cat);
        em.getTransaction().commit();
    }
    
    public List getLista(String cat){
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT e FROM Contas e where e.banco Like:likes");
        query.setParameter("likes", "%" + cat.trim() + "%");
        List<Contas> lista = query.getResultList();        
        em.getTransaction().commit();
        return lista;
    }
}
