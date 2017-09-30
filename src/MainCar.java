import ComplitedCar.CarDoor;

public class MainCar {
    public static void main(String[] args) {
        CarDoor cd = new CarDoor();
        CarDoor cd1 = new CarDoor(true, true);

        System.out.println("значения по умолчанию :");
        cd.show();
        cd.setWindow(false);
        cd.setDoor(false);
        System.out.println("открыли окна и двери сэтом:");
        cd.show();
        cd.closeWindow ();
        cd.closeDoor();
        System.out.println("закрыли окна и двери модулем: ");
        cd.show();
        cd.openDoor();
        cd.openWindow();
        System.out.println("открыли двери модулем");
        cd.show();
        cd.changeDoorStatus();
        cd.changeWindowStatus();
        System.out.println("поменяли положение открыт-закрыт:");
        cd.show();
        System.out.println("положение при вызове класса с задаными параметрами");
        cd1.show();
        cd1.changeWindowStatus();
        System.out.println("поменяли значение окна в случае с задаными параметрами");
        cd1.show();
    }

}
