package ch16_objects.teacher;

import java.util.Objects;

public class Teacher {
    private String name;
    private String SchoolName;


    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String schoolName) {
        this.name = name;
        SchoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    @Override
    public String toString() {
        return name + " 선생님의 근무지는 " + SchoolName + "입니다.";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(SchoolName, teacher.SchoolName);
    }
    // 객체명1.equals(객체명2)

    @Override
    public int hashCode() {
        return Objects.hash(name, SchoolName);
    }
}
