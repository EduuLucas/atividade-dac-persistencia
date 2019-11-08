package com.edu.ifpb.control;

import com.edu.ifpb.model.Endereco;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EnderecoDAO {

    @PersistenceContext
    EntityManager em;

    public void salvar(Endereco e){
        em.persist(e);
    }

    public void excluir(Endereco e){
        em.remove(e);
    }

    public void atualizar(Endereco e){
        em.merge(e);
    }

    public void buscar(Integer id){
        em.find(Endereco.class, id);
    }

}
