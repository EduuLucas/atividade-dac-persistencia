package com.edu.ifpb.control;

import com.edu.ifpb.model.Artigo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ArtigoDAO {

    @PersistenceContext
    EntityManager em;

    public void salvar(Artigo a){
        em.persist(a);
    }

    public void excluir(Artigo a){
        em.remove(a);
    }

    public void atualizar(Artigo a){
        em.merge(a);
    }

    public void buscar(Integer id){
        em.find(Artigo.class, id);
    }

}
