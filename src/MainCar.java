import ComplitedCar.CarDoor;

public class MainCar {
    public static void main(String[] args) {
        CarDoor cd = new CarDoor();
        CarDoor cd1 = new CarDoor("open", "open");
        System.out.println("значения по умолчанию :");
        cd.show();
        cd.setWindow("open");
        cd.setDoor("open");
        System.out.println("открыли окна и двери сэтом:");
        cd.show();
        closeWindow (cd);
        closeDoor(cd);
        System.out.println("закрыли окна и двери модулем: ");
        cd.show();
        openDoor(cd);
        openWindow(cd);
        System.out.println("открыли двери модулем");
        cd.show();
        changeDoorStatus(cd);
        changeWindowStatus(cd);
        System.out.println("поменяли положение открыт-закрыт:");
        cd.show();
        s
        cd1.show();


    }

    public static void openDoor (CarDoor cd){
       cd.setDoor("open");
    }
    public static void closeDoor (CarDoor cd) {
        cd.setDoor("closed");
    }
    public static void changeDoorStatus (CarDoor cd){
        if (cd.getDoor().equals("closed"))
            cd.setDoor("open");
        else cd.setDoor("closed");

    }
    public static void openWindow (CarDoor cd){
        cd.setWindow("open");
    }
    public static void closeWindow (CarDoor cd){
        cd.setWindow("closed");
    }
    public static void changeWindowStatus (CarDoor cd) {
        if (cd.getWindow().equals("closed"))
            cd.setWindow("open");
        else cd.setWindow("closed");
    }
}
