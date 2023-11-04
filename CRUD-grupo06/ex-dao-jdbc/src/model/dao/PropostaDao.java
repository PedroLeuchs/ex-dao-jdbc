package model.dao;

import model.entities.Proposta;

import java.util.List;

public interface PropostaDao {
    int insert(Proposta obj);
    void update(Proposta obj);
    void deleteById(Integer id);
    Proposta findById(Integer id);
    List<Proposta> findAll();
}
