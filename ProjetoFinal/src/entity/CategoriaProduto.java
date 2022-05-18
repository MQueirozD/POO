/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author rafae
 */

@NamedQueries({
    @NamedQuery(name = "CategoriaProduto.findAll", query = "SELECT c FROM CategoriaProduto c"),
    @NamedQuery(name = "CategoriaProduto.findById", 
                            query = "SELECT c FROM CategoriaProduto c WHERE c.id = :codigo")
})
@Entity
@Table(name = "tab_categoria_produto")
public class CategoriaProduto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
   
    @Column(length = 100, nullable = false)
    private String nome;
    
    @OneToMany(mappedBy = "categoriaProduto")
    private ArrayList<Produto> produtos;

    public CategoriaProduto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public CategoriaProduto() {
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaProduto)) {
            return false;
        }
        CategoriaProduto other = (CategoriaProduto) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CategoriaProduto[ id=" + id + " ]";
    }
    
}
