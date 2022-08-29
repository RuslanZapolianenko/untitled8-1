package package2;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean tail= true;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tail=" + tail +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
//Используя Intelij IDEA создать проект, пакет. Создать класс Animal с именем String, возрастом int, хвостом Boolean.
// В классе переопределить метод toString, что бы вывод был сдедующим «Имя: Васька, возраст: 45, хвост: нет».
// В классе Animal переопределить методы equals & hashCode.