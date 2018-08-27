package TheCommandPattern.iHome;

public class GarageDoor {

    public GarageDoor() {

    }

    public void up() {
        System.out.println("Garage Door is Open");
    }

    public void down() {
        System.out.println("Garage Door is Close");
    }

    public void stop() {
        System.out.println("Garage Door is Stop");
    }

    public void lightOn() {
        System.out.println("Light is On!");
    }

    public void lightOff() {
        System.out.println("Light is Off!");
    }
}
