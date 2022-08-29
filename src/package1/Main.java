package package1;

public class Main {
    public static void main(String[] args) {
            Device device = new Device("Samsung",120f,"AB1234567CD");
            System.out.println(device.toString());
            Device monitor = new Monitor(device.getManufacturer(),device.getPrice(),device.getSerialNumber(),1280,1024);
            System.out.println( monitor.toString());
            System.out.println( monitor.getManufacturer());
        EthernetAdapter eAdapter = new EthernetAdapter("Samsung",120f,"sn_2435",200,"mac_0101");
        System.out.println(eAdapter.hashCode());
        EthernetAdapter eAdapter2 = new EthernetAdapter("Samsung",120f,"sn_2435",200,"mac_0101");
        System.out.println(eAdapter2.hashCode());
        System.out.println( eAdapter.equals(eAdapter2));

        Monitor monitor1 =new Monitor("Samsung",120f,"sn_8794",1280,920);
        System.out.println(monitor1.hashCode());
        Monitor monitor2 =new Monitor("Samsung",120f,"sn_8794",1280,920);
        System.out.println(monitor2.hashCode());
        System.out.println( monitor1.equals(monitor2)  );

        Device device1 = new Device("Samsung",120f,"sn_8794");
        System.out.println(device1.hashCode());
        Device device2 = new Device("Samsung",120f,"sn_8794");
        System.out.println(device2.hashCode());
        System.out.println( device1.equals(device2));
    }


}
//Создать классы: 1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
// 2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
// Добавить методы доступа. Конструктор.


// В обоих классах переопределить метод toString, что бы вывод был следующим:
//Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
//Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024

//Смотреть задание 2. Переопределить методы equals & hashCode в каждом классе. Создать класс Main, в котором создать
// объекты классов и продемонстрировать переопределенные методы.