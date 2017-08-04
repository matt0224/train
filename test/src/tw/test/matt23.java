package tw.test;


		public class matt23 {

			public static void main(String[] args) {
				  Bike b1 = new Bike();
				  Bike s1 = new scoter();     //如果都沒講的話但是只有唯一 用父類別的吳傳回建構式去跑,不能用其他的
				 //scoter s2 = new scoter();
		         b1.upSpeed();
				 s1.upSpeed();
				 System.out.println(b1.getSpeed());
				 System.out.println(s1.getSpeed());
				 //s1.upSpeed();
				// System.out.println(b1.getSpeed());
				 //System.out.println(s1.getSpeed());
//				 s1.upSpeed();
//				 b1.upSpeed();
//				 s1.upSpeed();
//				 s1.downSpeed();
//				 
//				 System.out.println(s1.getSpeed());
			}

		}

