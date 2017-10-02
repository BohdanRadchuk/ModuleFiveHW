import ComplitedCar.Car;
import ComplitedCar.carDoor;
import ComplitedCar.CarWheel;

public class MainCar {
    public static void main(String[] args) {
        carDoor cd = new carDoor();
        carDoor cd1 = new carDoor(true, true);
        CarWheel cw = new CarWheel();
        CarWheel cw1 = new CarWheel(0.5f);
        //Car prod = new Car("26.09.2017");
        Car c = new Car ("VR6", 180, 8.9f, 5, 4 , 120);


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


        cw.show();                              //берём шину по умолчанию
        cw.setWheelerasuer(1.5f);               //устанавливаем значение стёртости шины вручную на 0,5
        cw.show();
        cw.getNewTire();                        //берём новую шину
        cw.show();
        cw.tireUsage(1.64f);                    //стираем шину на значение
        cw.show();
    }


}
