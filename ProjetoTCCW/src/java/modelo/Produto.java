/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author marcelosiedler
 */
@Entity
@Table(name = "produto")
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT l FROM Produto l")})
public class Produto implements Serializable {

    @OneToMany(mappedBy = "produto")
    private List<ProdutoVenda> produtovendaList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nomeproduto")
    private String nomeproduto;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "marca")
    private String marca;
    @Column(name = "tamanho")
    private Integer tamanho;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "precocusto")
    private Float precocusto;
    @Column(name = "precovenda")
    private Float precovenda;
    @Column(name = "dataregistro")
    @Temporal(TemporalType.DATE)
    private Date dataregistro;
    

    public Produto() {
    }

    public List<ProdutoVenda> getProdutovendaList() {
        return produtovendaList;
    }

    public void setProdutovendaList(List<ProdutoVenda> produtovendaList) {
        this.produtovendaList = produtovendaList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Float getPrecocusto() {
        return precocusto;
    }

    public void setPrecocusto(Float precocusto) {
        this.precocusto = precocusto;
    }

    public Float getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(Float precovenda) {
        this.precovenda = precovenda;
    }

    public Date getDataregistro() {
        return dataregistro;
    }

    public void setDataregistro(Date dataregistro) {
        this.dataregistro = dataregistro;
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
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Produto[ id=" + id + " ]";
    }

    public List<ProdutoVenda> getProdutoVendaList() {
        return produtovendaList;
    }

    public void setProdutoVendaList(List<ProdutoVenda> produtovendaList) {
        this.produtovendaList = produtovendaList;
    }
    
}
