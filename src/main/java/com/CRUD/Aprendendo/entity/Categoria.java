package com.CRUD.Aprendendo.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="categoria_id")
    private Integer categoriaId;

    @Column(name = "categoria_nome")
    private String categoriaNome;

    @OneToMany(mappedBy="categoria")
    @JsonManagedReference
    private List<Produto> produtoList;

    public String getCategoriaNome() {
        return categoriaNome;
    }

    public void setCategoriaNome(String categoriaNome) {
        this.categoriaNome = categoriaNome;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public List<Produto> getPodutoList() {
        return produtoList;
    }

    public void setPodutoList(List<Produto> podutoList) {
        this.produtoList = podutoList;
    }
}
