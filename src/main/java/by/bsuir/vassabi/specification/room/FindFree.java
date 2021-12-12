package by.bsuir.vassabi.specification.room;

import java.util.Collections;
import java.util.List;

import by.bsuir.vassabi.specification.Specification;

public class FindFree implements Specification {

    public FindFree() {
    }

    @Override
    public String toSql() {
        return "WHERE occupied = 'false'";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.emptyList();
    }
}
