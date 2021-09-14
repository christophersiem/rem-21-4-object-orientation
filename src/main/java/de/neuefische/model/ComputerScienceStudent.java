package de.neuefische.model;

public class ComputerScienceStudent implements Student{

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSubject() {
        return "Java Basics";
    }

}
