package com.edu.ifpb.control;

import com.edu.ifpb.model.Contato;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ContatoDAO {

    @PersistenceContext
    EntityManager em;

    public void salvar(Contato c){
        em.persist(c);
    }

    public void excluir(Contato c){
        em.remove(c);
    }

    public void atualizar(Contato c){
        em.merge(c);
    }

    public void buscar(Integer id){
        em.find(Contato.class, id);
    }

}
