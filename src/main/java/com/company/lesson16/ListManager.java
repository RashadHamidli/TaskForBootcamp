package com.company.lesson16;

import java.util.ArrayList;
import java.util.List;

public class ListManager<T> {
    private List<T> list=new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void addList(T element) {
        this.list.add(element);
    }
}
