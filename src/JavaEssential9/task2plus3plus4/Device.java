package JavaEssential9.task2plus3plus4;

import java.util.Objects;

public class Device {
    String manufactures;
    float price;
    String serialNumber;

    public String getManufactures() {
        return manufactures;
    }

    public void setManufactures(String manufactures) {
        this.manufactures = manufactures;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Device(String manufactures, float price, String serialNumber) {
        this.manufactures = manufactures;
        this.price = price;
        this.serialNumber = serialNumber;

    }

    @Override
    public String toString() {
        return "Device: " +
                "manufactures=" + manufactures +
                ", price=" + price +
                ", serialNumber=" + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0 && manufactures.equals(device.manufactures) && serialNumber.equals(device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufactures, price, serialNumber);
    }
}

class Monitor extends Device {
    int resolutionX;
    int resolutionY;

    public Monitor(String manufactures, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufactures, price, serialNumber);
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
        return "Monitor: " +
                "manufactures=" + manufactures +
                ", price=" + price +
                ", serialNumber=" + serialNumber +
                ", X=" + resolutionX +
                ", Y=" + resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, resolutionY);
    }
}

class EthernetAdapter extends Device {
    int speed;
    String mac;

    public EthernetAdapter(String manufactures, float price, String serialNumber, int speed, String mac) {
        super(manufactures, price, serialNumber);
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
}
