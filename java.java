abstract class HomeAutomation {

    void displayLights() {
        System.out.println("LED is glowing...");
    }

    void offLights() {
        System.out.println("LED is switched off...");
    }

    abstract void controlLights();
}


class ReverseEnggClinics extends HomeAutomation {

    void controlLights() {
        System.out.println("Lights are being controlled.");
    }
}


public class java {
    public static void main(String[] args) {

        ReverseEnggClinics obj = new ReverseEnggClinics();

        obj.displayLights();
        obj.offLights();
        obj.controlLights();
    }
}

