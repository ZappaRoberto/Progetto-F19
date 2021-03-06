package dao;

import userSide.Trattativa;
import userSide.User;

import java.sql.SQLException;

public interface TrattativaDao {
    //CRUD
    boolean create(Trattativa trattativa) throws SQLException;
    Trattativa findByTrattativa(Trattativa trattativa) throws SQLException;
    boolean update() throws SQLException;
    boolean delete() throws SQLException;
    boolean accept(Trattativa trattativa) throws SQLException;
    boolean deny(Trattativa trattativa) throws SQLException;

}
