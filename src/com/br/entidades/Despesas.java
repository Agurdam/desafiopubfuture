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
@Table(name = "despesas")
@NamedQueries({
    @NamedQuery(name = "Despesas.findAll", query = "SELECT d FROM Despesas d"),
    @NamedQuery(name = "Despesas.findByIdDespesas", query = "SELECT d FROM Despesas d WHERE d.idDespesas = :idDespesas"),
    @NamedQuery(name = "Despesas.findByCredor", query = "SELECT d FROM Despesas d WHERE d.credor = :credor"),
    @NamedQuery(name = "Despesas.findByValor", query = "SELECT d FROM Despesas d WHERE d.valor = :valor"),
    @NamedQuery(name = "Despesas.findByDataVencimento", query = "SELECT d FROM Despesas d WHERE d.dataVencimento = :dataVencimento"),
    @NamedQuery(name = "Despesas.findByDataCadastro", query = "SELECT d FROM Despesas d WHERE d.dataCadastro = :dataCadastro"),
    @NamedQuery(name = "Despesas.findByDataAtualizacao", query = "SELECT d FROM Despesas d WHERE d.dataAtualizacao = :dataAtualizacao"),
    @NamedQuery(name = "Despesas.findByObservacao", query = "SELECT d FROM Despesas d WHERE d.observacao = :observacao")})
public class Despesas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDespesas")
    private Integer idDespesas;
    @Basic(optional = false)
    @Column(name = "credor")
    private String credor;
    @Basic(optional = false)
    @Column(name = "valor")
    private double valor;
    @Basic(optional = false)
    @Column(name = "dataVencimento")
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
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

    public Despesas() {
    }

    public Despesas(Integer idDespesas) {
        this.idDespesas = idDespesas;
    }

    public Despesas(Integer idDespesas, String credor, double valor, Date dataVencimento, Date dataCadastro, Date dataAtualizacao) {
        this.idDespesas = idDespesas;
        this.credor = credor;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    public Integer getIdDespesas() {
        return idDespesas;
    }

    public void setIdDespesas(Integer idDespesas) {
        this.idDespesas = idDespesas;
    }

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
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
        hash += (idDespesas != null ? idDespesas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Despesas)) {
            return false;
        }
        Despesas other = (Despesas) object;
        if ((this.idDespesas == null && other.idDespesas != null) || (this.idDespesas != null && !this.idDespesas.equals(other.idDespesas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.entidades.Despesas[ idDespesas=" + idDespesas + " ]";
    }
    
}
