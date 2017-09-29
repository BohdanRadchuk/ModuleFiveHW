import ComplitedCar.CarDoor;

public class MainCar {
    public static void main(String[] args) {
        CarDoor cd1 = new CarDoor();
        CarDoor cd = new CarDoor("open", "open");
        System.out.println("cd1 1  - " + cd.getWindow ());
        cd.setWindow("closed");
        System.out.println("cd1 2 - " + cd.getWindow());
        cd.setWindow("open");
        System.out.println("cd1 3 - " + cd.getWindow());
        closeWindow ();
        System.out.println("cd1 4 - " + cd.getWindow());
        changeWindowStatus();
        System.out.println("cd1 5 - " + cd.getWindow());




        System.out.println(cd.getWindow());
        cd.show ();


    }

    public static void openDoor (){
        CarDoor cd = new CarDoor();
        cd.setDoor("open");
    }
    public static void closeDoor () {
        CarDoor cd = new CarDoor();
        cd.setDoor("closed");
    }
    public static void changeDoorStatus (){
        CarDoor cd = new CarDoor();

        if (cd.getDoor().equals("closed"))
            cd.setDoor("open");
        else cd.setDoor("closed");

    }
    public static void openWindow (){
        CarDoor cd = new CarDoor();
        cd.setWindow("open");
    }
    public static void closeWindow (){
        CarDoor cd = new CarDoor();
        cd.setWindow("closed");
    }
    public static void changeWindowStatus () {
        CarDoor cd = new CarDoor();
        if (cd.getWindow().equals("closed"))
            cd.setWindow("open");
        else cd.setWindow("closed");
    }
}
