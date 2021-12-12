package by.bsuir.vassabi.builder;

import java.sql.ResultSet;

import by.bsuir.vassabi.exception.RepositoryException;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
