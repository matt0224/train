package tw.test;

public class matt19 {

	public static void main(String[] args) {
		  Bike b1= new Bike();
		  Bike b2= new Bike(1.2);
        //  System.out.println(b1); /1 這邊會出現位置
		  System.out.println(b1.speed);
		  System.out.println(b2.speed);
		  b1.upSpeed();
		  
	}

}
