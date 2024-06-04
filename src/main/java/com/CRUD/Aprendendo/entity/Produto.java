package com.CRUD.Aprendendo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.Set;


@Entity
@Table(name="produto")
public class Produto {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY)
    @Column(name="produto_id")
    private Integer produtoId;

    @Column(name="produto_nome")
    private String produtoNome;

    @ManyToOne
    @JoinColumn(name="categoria_id" , referencedColumnName = "categoria_id")
    @JsonBackReference
    private Categoria categoria;

    @ManyToMany
    @JoinTable(name="item_pedido", joinColumns = @JoinColumn(name = "produto_id"))
    Set<Pedido> pedidos;

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
