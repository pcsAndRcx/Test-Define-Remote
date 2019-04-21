package pojo;

public class Person {
    private String name;
    private Integer age;
    private User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Person(String name, Integer age, User user) {
        this.name = name;
        this.age = age;
        this.user = user;
    }

@Override
public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", user=" + user +
            '}';
}
}
