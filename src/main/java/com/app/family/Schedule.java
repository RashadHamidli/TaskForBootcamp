package com.app.family;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<List<String>> schedule;

    public Schedule() {
        this.schedule = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "schedule=" + schedule +
                '}';
    }
}

