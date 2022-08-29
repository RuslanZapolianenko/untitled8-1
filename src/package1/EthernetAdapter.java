package package1;

public class EthernetAdapter extends Device {
    public int speed;
    public String mac;

    public EthernetAdapter(String manufacturer, Float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter{" +
                "speed=" + speed +
                ", mac='" + mac + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        int i = 3;
        i = 681609170 + i;
        return i;
    }
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        //
        if (obj == null || getClass() != obj.getClass()) return false;
        EthernetAdapter ethernetAdapter = (EthernetAdapter) obj;
        if (this.speed != ethernetAdapter.speed || this.mac != ethernetAdapter.mac) return false;
        return true;
    }
}


//Создать классы: 1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
// 2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
// Добавить методы доступа. Конструктор.

//Смотреть задание 2. В обоих классах переопределить метод toString, что бы вывод был следующим:
// Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
// Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024