package jsp;

public class Person {
    //Бин это обычный клас у которого есть конструктор по умолчанию, у которого все поля приватные,
    //и на них всех есть гетеры и сеттеры.
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
