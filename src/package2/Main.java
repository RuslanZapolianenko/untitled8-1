package package2;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Васька",45,false);
        System.out.println( animal1.toString() );
        Animal animal2 = new Animal("Васька",45,false);
        System.out.println( animal1.hashCode());
        System.out.println( animal2.hashCode());
        System.out.println(animal1.equals(animal2));
    }
}
//Используя Intelij IDEA создать проект, пакет. Создать класс Animal с именем String, возрастом int, хвостом Boolean.
// В классе переопределить метод toString, что бы вывод был сдедующим «Имя: Васька, возраст: 45, хвост: нет».
// В классе Animal переопределить методы equals & hashCode.