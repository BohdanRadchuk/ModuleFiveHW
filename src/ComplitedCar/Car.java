package ComplitedCar;

public class Car {

    private final String productionDate = "asd";            //дата производства (неизменна после создания объекта)
    private  String enginetype;                     //тип двигателя
    private int maxspeed;                           //максимальная скорость машины (если она новая)
    private float onetohundred;                     //время разгона до 100км/ч
    private int maxpassagers;                       // пассажировместимость
    private int passagersnow;                       //кол-во пассажиров внутри в данный момент
    private int speednow;                           //текущая скорость
    private int[] wheelarr;                         //массив колес
    private int[] doorarr;                          //массив дверей*/

    /*public Car (String productionDate){
        this.productionDate = productionDate;
    }*/
    public Car (String enginetype, int maxspeed, float onetohundred, int maxpassagers, int passagersnow,int speednow){
        this.enginetype = enginetype;
        this.maxspeed = maxspeed;
        this.onetohundred = onetohundred;
        this.maxpassagers = maxpassagers;
        this.passagersnow = passagersnow;
        this.speednow = speednow;
    }

    public void setSpeednow(int speednow) {             //    Изменить текущую скорость
        this.speednow = speednow;
    }
    public void plusPassager (){//    Посадить 1 пассажира в машину
        this.passagersnow++;
    }
    public void minusPassager (){                    //    Высадить 1 пассажира
        this.passagersnow--;
    }
//    Высадить всех пассажиров
//    Получить дверь по индексу
//    Получить колесо по индексу
//    Снять все колеса с машины



}
