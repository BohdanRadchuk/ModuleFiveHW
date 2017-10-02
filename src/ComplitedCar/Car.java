package ComplitedCar;

import java.util.Arrays;

public class Car {

    private int productionDate = 02102017;            //дата производства (неизменна после создания объекта)
    private String enginetype;                     //тип двигателя
    private int maxspeed;                           //максимальная скорость машины (если она новая)
    private float onetohundred;                     //время разгона до 100км/ч
    private int maxpassangers;                       // пассажировместимость
    private int passangersnow;                       //кол-во пассажиров внутри в данный момент
    private int speednow;                           //текущая скорость
    private float[] wheelarr = new float[4];            //массив колес

    CarWheel cw = new CarWheel();


    private int[] doorarr = new int[]{1,2,3,4};                          //массив дверей*/

    public  Car (int productionDate){
        this.productionDate = productionDate;
    }
    public Car (String enginetype, int maxspeed, float onetohundred, int maxpassagers, int passagersnow,int speednow){
        this.enginetype = enginetype;
        this.maxspeed = maxspeed;
        this.onetohundred = onetohundred;
        this.maxpassangers = maxpassagers;
        this.passangersnow = passagersnow;
        this.speednow = speednow;
    }

    public void setSpeednow(int speednow) {             //    change speed at the moment
        this.speednow = speednow;
    }
    public void plusPassanger (){                       //    getin 1 passanger
        this.passangersnow++;
    }
    public void minusPassanger (){                      //    get out 1 passanger
        this.passangersnow--;
    }
    public void getOutPassangers (){                    //    get out all passangers
        this.passangersnow = 0;
    }
    public  int getDoorarr() {                      // get massive index door
        int i = 3;                                  // massive index
        int door = doorarr[i];
        return door;
    }
    public  float getWheel() {                      // get massive index wheel
        cw.tireUsage(0.5f);
        for (int i = 0; i<wheelarr.length; i++) {

            wheelarr[i] = cw.getWheelerasuer();
        }
        int i = 3;                                  // massive index
        float wheel = wheelarr[i];
        return wheel;
    }
    public void getOffAllWheels(){                  //    Снять все колеса с машины
        float tempwheelarr[] = new float[0];
        this.wheelarr = tempwheelarr;

    }
    public void addWheelArr() {                     //adding wheels
        int extrasize = 3;
        float tempwheelarr[] = new float[wheelarr.length+extrasize];
        System.arraycopy(wheelarr, 0, tempwheelarr,0, wheelarr.length);
        for (int i = wheelarr.length; i<tempwheelarr.length; i++) {
            tempwheelarr[i] = cw.getWheelerasuer();
        }
        this.wheelarr = tempwheelarr;
    }
    public float maxSpeedNow () {                   //calculating max speed of used car
        float maxspeednow;
        float worstwheel = wheelarr[0];

        if (passangersnow!=0){
            for (int i = 1; i<wheelarr.length; i++) {
                if (worstwheel > wheelarr[i])
                    worstwheel = wheelarr[i];
            }

                maxspeednow = worstwheel*maxspeed;
        }
        else maxspeednow = 0;
    return maxspeednow;
    }
    public void show(){
        System.out.println("Production date: "+ productionDate);
        System.out.println("Engine type: "+ enginetype);
        System.out.println("New car maximal speed:" + maxspeed);
        System.out.println("from zero to hundred car gets in "+ onetohundred + " seconds");
        System.out.println(maxpassangers + " passangers can get in to the car at once");
        System.out.println("in car " + passangersnow + " pasangers at the moment");
        System.out.println("the car is mooving with speed "+speednow + " now" );
        System.out.println("car has " + wheelarr.length +  " wheels:" + Arrays.toString(wheelarr));
        System.out.println("car has " + doorarr.length + " doors");
        System.out.println("max speed of the car now is " + maxSpeedNow());
    }


}
