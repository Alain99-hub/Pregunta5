package main.java.org.example;

public class Student {
    private  String name;
    private  String id;
    private Integer grade;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Integer getGrade() {
        return grade;
    }
}
