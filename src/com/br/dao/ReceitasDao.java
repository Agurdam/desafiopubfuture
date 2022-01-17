/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.dao;

import com.br.entidades.Receitas;
import com.br.utils.Singleton;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author X
 */
public class ReceitasDao {
      private EntityManager em;
    
    public ReceitasDao(){
        em = Singleton.getConection();
    }
    
    public void inserir(Receitas cat){
        em.getTransaction().begin();
        em.persist(cat);
        em.getTransaction().commit();
    }
    
    public void atualizar(Receitas cat){
        em.getTransaction().begin();
        em.merge(cat);
        em.getTransaction().commit();
    }
    
    public void excluir(Receitas cat){
        em.getTransaction().begin();
        em.remove(cat);
        em.getTransaction().commit();
    }
    
    public List getLista(String cat){
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT e FROM Receitas e where e.origem Like:likes");
        query.setParameter("likes", "%" + cat.trim() + "%");
        List<Receitas> lista = query.getResultList();        
        em.getTransaction().commit();
        return lista;
    }
}
