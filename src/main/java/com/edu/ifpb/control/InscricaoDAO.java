package com.edu.ifpb.control;

import com.edu.ifpb.model.Inscricao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class InscricaoDAO {

    @PersistenceContext
    EntityManager em;

    public void salvar(Inscricao i){
        em.persist(i);
    }

    public void excluir(Inscricao i){
        em.remove(i);
    }

    public void atualizar(Inscricao i){
        em.merge(i);
    }

    public void buscar(Integer id){
        em.find(Inscricao.class, id);
    }

}
