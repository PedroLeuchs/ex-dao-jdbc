package model.entities;

import model.dao.ProdutoDao;

import java.util.List;

public class Produto {

    private Integer id;
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public   Produto() {

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public ProdutoDao daoProduct = new ProdutoDao() {

        @Override
        public int insert(Produto produto) {
            return 0;
        }

        @Override
        public void update(Produto produto) {

        }

        @Override
        public void deleteById(Integer id) {

        }

        @Override
        public Produto findById(Integer id) {
            return null;
        }

        @Override
        public List<Produto> findAll() {
            return null;
        }


    };
    @Override
    public String toString() {
        return "Produto [id=" + id + ", name=" + nome + ", preco=" + preco + "]";
    }
}


