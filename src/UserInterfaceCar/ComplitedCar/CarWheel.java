package UserInterfaceCar.ComplitedCar;

public class CarWheel {
    private float wheelerasuer;
    public CarWheel (){
        this.wheelerasuer = 1f;
    }
    public  CarWheel (float wheelerasuer){
        this.wheelerasuer = wheelerasuer;
    }


    public float getWheelerasuer() {
        return wheelerasuer;
    }
    public void setWheelerasuer(float wheelerasuer) {
        this.wheelerasuer = wheelerasuer;
    }
    public void getNewTire (){
        setWheelerasuer(1f);
    }
    public  void  tireUsage (float usage){
        this.wheelerasuer = wheelerasuer - usage;
    }
    public void  show (){
        if (wheelerasuer>0 && wheelerasuer<=1)
        System.out.println("шина цела на "+ wheelerasuer*100 +"%");
        else {
            if (wheelerasuer <= 0)
                System.out.println("шина полностью стрёрта");
            else System.out.println("это уже не одна шина");
        }
    }
}
