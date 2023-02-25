package org.example;

public class FindLongestProject {
    private String name;
    private int monthCount;

    public FindLongestProject() {
    }

    public FindLongestProject(String name, int monthCount) {
        this.name = name;
        this.monthCount = monthCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthCount() {
        return monthCount;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }

    @Override
    public String toString() {
        return "FindLongestProject{" +
                "NAME='" + name + '\'' +
                ", MONTH_COUNT=" + monthCount +
                '}';
    }
}
