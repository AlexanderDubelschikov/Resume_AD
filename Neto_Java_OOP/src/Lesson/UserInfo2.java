package Lesson;

import java.util.Objects;

public class UserInfo2 {

    protected String name;
    protected String surname;
    protected int age;

    public UserInfo2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public boolean equals(Object obj) {
        UserInfo2 o = (UserInfo2) obj;
        return name.equals(o.name) && surname.equals(o.surname);
    }
}
