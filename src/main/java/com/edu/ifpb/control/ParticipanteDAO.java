package com.edu.ifpb.control;

import com.edu.ifpb.model.Participante;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ParticipanteDAO {

    @PersistenceContext
    EntityManager em;

    public void salvar(Participante p){
        em.persist(p);
    }

    public void excluir(Participante p){
        em.remove(p);
    }

    public void atualizar(Participante p){
        em.merge(p);
    }

    public void buscar(Integer id){
        em.find(Participante.class, id);
    }
}
