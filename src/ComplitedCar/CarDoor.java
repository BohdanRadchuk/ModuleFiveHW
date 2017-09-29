package ComplitedCar;

public class CarDoor {
    private String door;
    private String window;
    public CarDoor () {                             //конструктор с пустыми полями по умолчанию дверь и окна закрыты
        this.door = "closed";
        this.window = "closed";
    }
    public CarDoor (String door, String window){    //конструктор который принимает значения двери и окон
        this.door = door;
        this.window = window;
    }
    public String getDoor (){                       //getter door
        return door;
    }
    public String getWindow (){                     //getter window
        return window;
    }
    public void setDoor (String door){              //setter door
        this.door = door;
    }
    public void setWindow (String window){          //setter window
        this.window = window;
    }
    public void show (){
        System.out.println("the door is " + door);
        System.out.println("the window is " + window);
    }
}
