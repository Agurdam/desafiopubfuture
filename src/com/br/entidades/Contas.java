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
@Table(name = "contas")
@NamedQueries({
    @NamedQuery(name = "Contas.findAll", query = "SELECT c FROM Contas c"),
    @NamedQuery(name = "Contas.findByIdContas", query = "SELECT c FROM Contas c WHERE c.idContas = :idContas"),
    @NamedQuery(name = "Contas.findByBanco", query = "SELECT c FROM Contas c WHERE c.banco = :banco"),
    @NamedQuery(name = "Contas.findByAgencia", query = "SELECT c FROM Contas c WHERE c.agencia = :agencia"),
    @NamedQuery(name = "Contas.findByConta", query = "SELECT c FROM Contas c WHERE c.conta = :conta"),
    @NamedQuery(name = "Contas.findBySaldo", query = "SELECT c FROM Contas c WHERE c.saldo = :saldo"),
    @NamedQuery(name = "Contas.findByDataCadastro", query = "SELECT c FROM Contas c WHERE c.dataCadastro = :dataCadastro"),
    @NamedQuery(name = "Contas.findByDataAtualizacao", query = "SELECT c FROM Contas c WHERE c.dataAtualizacao = :dataAtualizacao")})
public class Contas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idContas")
    private Integer idContas;
    @Basic(optional = false)
    @Column(name = "banco")
    private String banco;
    @Basic(optional = false)
    @Column(name = "agencia")
    private int agencia;
    @Basic(optional = false)
    @Column(name = "conta")
    private int conta;
    @Basic(optional = false)
    @Column(name = "saldo")
    private double saldo;
    @Basic(optional = false)
    @Column(name = "dataCadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;
    @Basic(optional = false)
    @Column(name = "dataAtualizacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

    public Contas() {
    }

    public Contas(Integer idContas) {
        this.idContas = idContas;
    }

    public Contas(Integer idContas, String banco, int agencia, int conta, double saldo, Date dataCadastro, Date dataAtualizacao) {
        this.idContas = idContas;
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    public Integer getIdContas() {
        return idContas;
    }

    public void setIdContas(Integer idContas) {
        this.idContas = idContas;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContas != null ? idContas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contas)) {
            return false;
        }
        Contas other = (Contas) object;
        if ((this.idContas == null && other.idContas != null) || (this.idContas != null && !this.idContas.equals(other.idContas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.entidades.Contas[ idContas=" + idContas + " ]";
    }
    
}
