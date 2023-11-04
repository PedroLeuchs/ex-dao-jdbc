package model.dao;

import db.DB;
import model.dao.impl.*;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	public static ClienteDao createClienteDao() {
		return (ClienteDao) new ClienteDaoJDBC(DB.getConnection());
	}

    public static PropostaDao createPropostaDao() {
		return (PropostaDao) new PropostaDaoJDBC(DB.getConnection());
	}

	public static ProdutoDao createProdutoDao() { return (ProdutoDao) new ProdutoDaoJDBC(DB.getConnection());}

	public static UserDao createUserDao() { return (UserDao) new UserDaoJDBC(DB.getConnection());}
}
