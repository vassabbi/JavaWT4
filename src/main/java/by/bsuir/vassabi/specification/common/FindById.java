package by.bsuir.vassabi.specification.common;

import java.util.Collections;
import java.util.List;

import by.bsuir.vassabi.specification.Specification;

public class FindById implements Specification {

    private final Integer id;

    public FindById(Integer id) {
        this.id = id;
    }

    @Override
    public String toSql() {
        return "where id = ?";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.singletonList(id);
    }
}
