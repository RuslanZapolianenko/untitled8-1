package package1;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, Float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                '}';
    }

    @Override
    public int hashCode() {
        int i = 2;
        i = 681609170 + i;
        return i;
    }

    @Override
    public boolean equals(Object obj) {
        // рефлективность
        if (this == obj) return true;
        //
        if (obj == null || getClass() != obj.getClass()) return false;
        Monitor monitor = (Monitor) obj;
        if (this.getManufacturer() != monitor.getManufacturer() || this.getPrice() != monitor.getPrice() || this.getSerialNumber() != monitor.getSerialNumber() || this.resolutionX != monitor.resolutionX || this.resolutionY != monitor.resolutionY)
            return false;
        return true;
    }

}

//Создать классы: 1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
// 2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
// Добавить методы доступа. Конструктор.

//Смотреть задание 2. В обоих классах переопределить метод toString, что бы вывод был следующим:
// Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
// Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024