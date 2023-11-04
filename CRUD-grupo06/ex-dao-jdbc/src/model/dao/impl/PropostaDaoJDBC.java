package model.dao.impl;

import db.DB;
import db.DbException;
import model.dao.PropostaDao;
import model.entities.Proposta;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PropostaDaoJDBC implements PropostaDao {
    private Connection conn;

    public PropostaDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int insert(Proposta obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO Proposta "
                            + "(cod, descricao) "
                            + "VALUES "
                            + "(?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, obj.getCod());
            st.setString(2, obj.getDescricao());

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setId(id);
                }
                DB.closeResultSet(rs);
            } else {
                throw new DbException("Unexpected error! No rows affected!");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
        return obj.getId();
    }

    @Override
    public void update(Proposta obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "UPDATE Proposta "
                            + "SET cod = ?, descricao = ? "
                            + "WHERE id = ?");

            st.setString(1, obj.getCod());
            st.setString(2, obj.getDescricao());
            st.setInt(3, obj.getId());

            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("DELETE FROM Proposta WHERE id = ?");

            st.setInt(1, id);

            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public Proposta findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM Proposta WHERE id = ?");

            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                return instantiateProposta(rs);
            }
            return null;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Proposta> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM Proposta");
            rs = st.executeQuery();

            List<Proposta> list = new ArrayList<>();

            while (rs.next()) {
                list.add(instantiateProposta(rs));
            }
            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    private Proposta instantiateProposta(ResultSet rs) throws SQLException {
        Proposta obj = new Proposta();
        obj.setId(rs.getInt("id"));
        obj.setCod(rs.getString("cod"));
        obj.setDescricao(rs.getString("descricao"));
        return obj;
    }
}
