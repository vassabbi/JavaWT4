package by.bsuir.vassabi.specification.user;

import java.util.Collections;
import java.util.List;

import by.bsuir.vassabi.specification.Specification;

public class FindByUsername implements Specification {

    private final String username;

    public FindByUsername(String username) {
        this.username = username;
    }

    @Override
    public String toSql() {
        return "WHERE username=?";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.singletonList(username);
    }
}
