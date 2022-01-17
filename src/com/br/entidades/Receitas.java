/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author X
 */
@Entity
@Table(name = "receitas")
@NamedQueries({
    @NamedQuery(name = "Receitas.findAll", query = "SELECT r FROM Receitas r"),
    @NamedQuery(name = "Receitas.findByIdReceitas", query = "SELECT r FROM Receitas r WHERE r.idReceitas = :idReceitas"),
    @NamedQuery(name = "Receitas.findByOrigem", query = "SELECT r FROM Receitas r WHERE r.origem = :origem"),
    @NamedQuery(name = "Receitas.findByValor", query = "SELECT r FROM Receitas r WHERE r.valor = :valor"),
    @NamedQuery(name = "Receitas.findByDataRecebimento", query = "SELECT r FROM Receitas r WHERE r.dataRecebimento = :dataRecebimento"),
    @NamedQuery(name = "Receitas.findByDataCadastro", query = "SELECT r FROM Receitas r WHERE r.dataCadastro = :dataCadastro"),
    @NamedQuery(name = "Receitas.findByDataAtualizacao", query = "SELECT r FROM Receitas r WHERE r.dataAtualizacao = :dataAtualizacao"),
    @NamedQuery(name = "Receitas.findByObservacao", query = "SELECT r FROM Receitas r WHERE r.observacao = :observacao")})
public class Receitas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idReceitas")
    private Integer idReceitas;
    @Basic(optional = false)
    @Column(name = "origem")
    private String origem;
    @Basic(optional = false)
    @Column(name = "valor")
    private double valor;
    @Column(name = "dataRecebimento")
    @Temporal(TemporalType.DATE)
    private Date dataRecebimento;
    @Basic(optional = false)
    @Column(name = "dataCadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;
    @Basic(optional = false)
    @Column(name = "dataAtualizacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;
    @Column(name = "observacao")
    private String observacao;

    public Receitas() {
    }

    public Receitas(Integer idReceitas) {
        this.idReceitas = idReceitas;
    }

    public Receitas(Integer idReceitas, String origem, double valor, Date dataCadastro, Date dataAtualizacao) {
        this.idReceitas = idReceitas;
        this.origem = origem;
        this.valor = valor;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    public Integer getIdReceitas() {
        return idReceitas;
    }

    public void setIdReceitas(Integer idReceitas) {
        this.idReceitas = idReceitas;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(Date dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReceitas != null ? idReceitas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Receitas)) {
            return false;
        }
        Receitas other = (Receitas) object;
        if ((this.idReceitas == null && other.idReceitas != null) || (this.idReceitas != null && !this.idReceitas.equals(other.idReceitas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.entidades.Receitas[ idReceitas=" + idReceitas + " ]";
    }
    
}
