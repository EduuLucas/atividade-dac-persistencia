package com.edu.ifpb.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "artigos")
public class Artigo implements Serializable {

    @Id
    private Integer id;
    private String titulo;
    private String orientador;
    private String coautores;
    private String modalidade;
    private String urlDownload;
    private LocalDate dataSubmissao;

    @ManyToOne
    private Participante participante;

    public Artigo(Integer id, String titulo, String orientador, String coautores, String modalidade, String urlDownload, LocalDate dataSubmissao, Participante participante) {
        this.id = id;
        this.titulo = titulo;
        this.orientador = orientador;
        this.coautores = coautores;
        this.modalidade = modalidade;
        this.urlDownload = urlDownload;
        this.dataSubmissao = dataSubmissao;
        this.participante = participante;
    }

    public Artigo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getCoautores() {
        return coautores;
    }

    public void setCoautores(String coautores) {
        this.coautores = coautores;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getUrlDownload() {
        return urlDownload;
    }

    public void setUrlDownload(String urlDownload) {
        this.urlDownload = urlDownload;
    }

    public LocalDate getDataSubmissao() {
        return dataSubmissao;
    }

    public void setDataSubmissao(LocalDate dataSubmissao) {
        this.dataSubmissao = dataSubmissao;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }


}
