package model.dao;

import java.util.List;

import model.entities.Vendedor;

public interface SellerDao {

	int insert(Vendedor obj);
	void update(Vendedor obj);
	void deleteById(Integer id);
	Vendedor findById(Integer id);
	List<Vendedor> findAll();

}
