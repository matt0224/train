package tw.test;

public class Bike {
    double speed;  //這個類別擁有的屬性
     Bike(){                                      //宣告名稱只能跟類別依樣,從括號避免混淆
        speed=100;
    	   	//  speed = s; //客戶指定1.2所以給他1.2
    	   	
    	    System.out.println("Bike:bike()");   //在主程式只有1個腳踏車的同時會混淆兩台腳踏車
    	   	    //上面兩台腳踏車插在屬性不同一個是double
    	   //以上是屬性
    	  }
     Bike(double s){                                      //宣告名稱只能跟類別依樣,從括號避免混淆
   	  speed=200;
   	//  speed = s; //客戶指定1.2所以給他1.2
   	
   //  System.out.println("Bike:bike()");   //在主程式只有1個腳踏車的同時會混淆兩台腳踏車
   	    //上面兩台腳踏車插在屬性不同一個是double
   //以上是屬性
   }

void upSpeed(){   //要有物件才能做的方法 任何物件都有傳回值 VOID就沒有傳回值 
    //透過方法改變速度
speed = (speed<1)?1:(speed*1.2);   
} void upSpeed(int gear){   //gear指定 但是也是要呼叫加速度
                               //""同名異事""
speed = (speed<1)?1:(speed*(1.2+gear));   //複製第一個增加檔位
}
void downSpeed(){
speed= (speed<1)?1:(speed*0.7);;
}
double getSpeed(){      //里程表的意思  這邊是第4行要加這兩行傳回速度
return speed;
}	
}