package ComplitedCar;

public class CarDoor {
    private boolean opendoor;
    private boolean openwindow;
    public CarDoor () {                             //конструктор с пустыми полями по умолчанию дверь и окна закрыты
        this.opendoor = true;
        this.openwindow = true;
    }
    public CarDoor (boolean opendoor, boolean openwindow){  //конструктор который принимает значения двери и окон
        this.opendoor = opendoor;
        this.openwindow = openwindow;
    }
    public boolean getDoor (){                       //getter door
        return opendoor;
    }
    public boolean getWindow (){                     //getter window
        return openwindow;
    }
    public void setDoor (boolean opendoor){              //setter door
        this.opendoor = opendoor;
    }
    public void setWindow (boolean openwindow){          //setter window
        this.openwindow = openwindow;
    }
    public void openDoor () {
        setDoor(true);
    }
    public void closeDoor () {
        setDoor(false);
    }
    public void changeDoorStatus (){
        if (getDoor() == (false))
            setDoor(true);
        else setDoor(false);

    }
    public void openWindow (){
        setWindow(true);
    }
    public void closeWindow (){
        setWindow(false);
    }
    public void changeWindowStatus () {
        if (getWindow()==(false))
            setWindow(true);
        else setWindow(false);
    }

    public void show (){
        String soutwindow = (openwindow == true) ? "open" : "closed";
        String soutdoor = (opendoor == true) ? "open" : "closed";
        System.out.println("the door is \t" + soutdoor);
        System.out.println("the window is \t " + soutwindow);
    }
}
