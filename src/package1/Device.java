package package1;

public class Device {
  private    String manufacturer;

   private Float price;
   private String serialNumber;

    public Device(String manufacturer, Float price, String serialNumber) {
        this.manufacturer = manufacturer ;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        int i = 1;
        i = 681609170 + i;
        return i;
    }
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;
        Device device = (Device) obj;
        if (this.manufacturer != device.manufacturer || this.price != device.price || this.serialNumber != device.serialNumber) return false;
        return true;
}
}


//Создать классы: 1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
// 2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
// Добавить методы доступа. Конструктор.

//Смотреть задание 2. В обоих классах переопределить метод toString, что бы вывод был следующим:
// Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
// Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024

////Смотреть задание 2. Переопределить методы equals & hashCode в каждом классе. Создать класс Main, в котором создать
//// объекты классов и продемонстрировать переопределенные методы.