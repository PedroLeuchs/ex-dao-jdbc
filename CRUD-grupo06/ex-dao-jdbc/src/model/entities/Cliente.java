package model.entities;

import model.dao.ClienteDao;

import java.io.Serializable;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String email;
	private String CPF;
	private ClienteDao sellerDao;


	public Cliente() {
	}

	public Cliente(Integer id, String name, String email, String CPF) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.CPF = CPF;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Cliente [id=" + id + ", name=" + name + ", email=" + email +  ", CPF="
				+ CPF + "]";
	}


    public static class Produto {
        private Integer id;
        private String nome;
        private Double preco;

        public Produto() {
        }

        public Produto(Integer id, String nome, Double preco) {
            this.id = id;
            this.nome = nome;
            this.preco = preco;
        }

        // Getters e setters

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Double getPreco() {
            return preco;
        }

        public void setPreco(Double preco) {
            this.preco = preco;
        }
        // Outros métodos relevantes
    }
}
