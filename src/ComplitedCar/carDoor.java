package ComplitedCar;

public class carDoor {
    private boolean opendoor;
    private boolean openwindow;
    public carDoor () {                             //конструктор с пустыми полями по умолчанию дверь и окна закрыты
        this.opendoor = true;
        this.openwindow = true;
    }
    public carDoor (boolean opendoor, boolean openwindow){  //конструктор который принимает значения двери и окон
        this.opendoor = opendoor;
        this.openwindow = openwindow;
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
        if (opendoor == (false))
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
        if (openwindow==(false))
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
