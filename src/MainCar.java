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
        System.out.println("положение при вызове класса с задаными параметрами");
        cd1.show();
        changeWindowStatus(cd1);
        System.out.println("поменяли значение окна в случае с задаными параметрами");
        cd1.show();


    }

    public static void openDoor (CarDoor c){
        c.setDoor("open");
    }
    public static void closeDoor (CarDoor c) {
        c.setDoor("closed");
    }
    public static void changeDoorStatus (CarDoor c){
        if (c.getDoor().equals("closed"))
            c.setDoor("open");
        else c.setDoor("closed");

    }
    public static void openWindow (CarDoor c){
        c.setWindow("open");
    }
    public static void closeWindow (CarDoor c){
        c.setWindow("closed");
    }
    public static void changeWindowStatus (CarDoor c) {
        if (c.getWindow().equals("closed"))
            c.setWindow("open");
        else c.setWindow("closed");
    }
}
