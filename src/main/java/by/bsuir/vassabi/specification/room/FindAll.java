package by.bsuir.vassabi.specification.room;

import java.util.Collections;
import java.util.List;

import by.bsuir.vassabi.specification.Specification;

public class FindAll implements Specification {

    @Override
    public String toSql() {
        return "";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.emptyList();
    }
}
