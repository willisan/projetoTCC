/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
 * @author gpdan
 */
@Entity
@Table(name = "crediario")
@NamedQueries({
    @NamedQuery(name = "Crediario.findAll", query = "SELECT c FROM Crediario c")})
public class Crediario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "valor")
    private Float valor;
    @Column(name = "numeroparcelas")
    private Integer numeroparcelas;
    @Column(name = "valorparcelas")
    private Float valorparcelas;
    @Column(name = "vencimentoparcelas")
    @Temporal(TemporalType.DATE)
    private Date vencimentoparcelas;
     @Column(name = "datavenda")
    @Temporal(TemporalType.DATE)
    private Date datavenda;
     
     public Crediario () {
         
     }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Integer getNumeroparcelas() {
        return numeroparcelas;
    }

    public void setNumeroparcelas(Integer numeroparcelas) {
        this.numeroparcelas = numeroparcelas;
    }

    public Float getValorparcelas() {
        return valorparcelas;
    }

    public void setValorparcelas(Float valorparcelas) {
        this.valorparcelas = valorparcelas;
    }

    public Date getVencimentoparcelas() {
        return vencimentoparcelas;
    }

    public void setVencimentoparcelas(Date vencimentoparcelas) {
        this.vencimentoparcelas = vencimentoparcelas;
    }

    public Date getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(Date datavenda) {
        this.datavenda = datavenda;
    }
     
     

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Crediario)) {
            return false;
        }
        Crediario other = (Crediario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Crediario[ id=" + id + " ]";
    }
    
}
