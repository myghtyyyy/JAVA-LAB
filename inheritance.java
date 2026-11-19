

class Device {
    void turnOn() {
        System.out.println("turn on");
    }
}
class SmartDevice extends Device {
    void connectWifi() {
        System.out.println("WiFi on");
    }
}


class SmartWatch extends SmartDevice {
    void showTime() {
        System.out.println("10:00AM");
    }
}
public class inheritance {
    public static void main(String[] args) {
        SmartWatch watch = new SmartWatch();
        watch.turnOn();      
        watch.connectWifi();  
        watch.showTime();
    }
}
