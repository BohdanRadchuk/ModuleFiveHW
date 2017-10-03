package UserInterfaceCar;

import ComplitedCar.Car;
import ComplitedCar.CarDoor;
import ComplitedCar.CarWheel;

import java.util.Scanner;

public class MainCarUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarDoor cd = new CarDoor();
        CarDoor cd1 = new CarDoor(true, true);
        CarWheel cw = new CarWheel();
        CarWheel cw1 = new CarWheel(0.5f);
        Car c = new Car ("VR6", 180, 8.9f, 5, 4 , 120);



            System.out.println("lets create a new car. ");

            System.out.println("enter your creation date(int)");
            int crdate = scanner.nextInt();
            Car c1 = new Car(crdate);
            System.out.println("enter engine type(String)");
            scanner.next();
            String enginetype = scanner.nextLine();
            System.out.println("enter maxspeed of the car(int)");
            int maxspeed = scanner.nextInt();
            System.out.println("how fast your car can get from one to hundred?(float)");
            int onetohundred = scanner.nextInt();
            System.out.println("how many people can get into the car?(int)");
            int maxpassangers = scanner.nextInt();
            System.out.println("how many people are in the car now?(int)");
            int passnow = scanner.nextInt();
            System.out.println("what is a speed of the car now?(int)");
            int speednow = scanner.nextInt();
            Car c2 = new Car (enginetype, maxspeed, onetohundred, maxpassangers, passnow ,speednow);

        System.out.println("type 1 to change moving speed at the moment;");
        System.out.println("type 2 to add one passenger");
        System.out.println("type 3 to remove 1 passanger;");
        System.out.println("type 4 to remove all passangers;");
        System.out.println("type 5 to close a door");
        System.out.println("type 6 to open a door");
        System.out.println("type 7 to change door from open to closed or from closed to open");
        System.out.println("type 8 to close a window");
        System.out.println("type 9 to open a window");
        System.out.println("type 10 to change door from open to closed or from closed to open");
        System.out.println("type 11 to see are door and window closed or open");
        System.out.println("type 12 to");
        System.out.println("type ");
        System.out.println("type ");
        System.out.println("type ");
        for (String questrepeat = "yes" ; questrepeat.equals("yes"); questrepeat = scanner.nextLine() ) {
            System.out.println("enter your choice");
            int question = scanner.nextInt();
            if (question == 1)
                System.out.println("enter your speed");
                c2.setSpeednow(scanner.nextInt());
            if (question == 2)
                c2.plusPassanger();
            if (question==3)
                c2.minusPassanger();
            if (question == 4)
                c2.getOutPassangers();
            if (question == 5)
                cd1.closeDoor();
            if (question == 6)
                cd1.openDoor();
            if (question == 7)
                cd1.changeDoorStatus();
            if (question == 8)
                cd1.closeWindow();
            if (question == 9)
                cd1.openWindow();
            if (question == 10)
                cd1.changeWindowStatus();
            if (question == 11)
                cd1.show();
            if (question == 12)
                c2.show();



            System.out.println("вы хотите выполнить ещё 1 задание ? (type \"yes\" to repeat)");
            scanner.next();
        }










        /*System.out.println(c.getWheel());
        c.show();

        System.out.println("значения окон и дверей по умолчанию:");
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
        cw.setWheelerasuer(0.5f);               //устанавливаем значение стёртости шины вручную на 0,5
        cw.show();
        cw.getNewTire();                        //берём новую шину
        cw.show();
        cw.tireUsage(0.64f);                    //стираем шину на значение
        cw.show();*/
    }


}
