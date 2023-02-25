package org.example;

public class FindYoungestEldestWorkers {

   private String type;
    private  String name;
    private  String birthday;

    public FindYoungestEldestWorkers() {
    }

    public FindYoungestEldestWorkers(String type, String name, String birthday) {
        this.type = type;
        this.name = name;
        this.birthday = birthday;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "FindYoungestEldestWorkers{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", bithday='" + birthday + '\'' +
                '}';
    }
}
