package de.neuefische.model;

public class HistoryStudent implements Student {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSubject() {
        return "Roman Empire";
    }

}
