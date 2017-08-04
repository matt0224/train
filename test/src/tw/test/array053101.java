package tw.test;

public class array053101 {

	public static void main(String[] args) {
		int[][] a;   //宣告最佳方式
		int b[][] ;                //矩陣不等於陣列
		int c[][] ; 
		a = new int[2][];               //隔出兩個空間
		//System.out.println(a[1][]);  //整數範圍內合乎INT語法  但超出陣列不行 
		a[0] = new int[3];            //第一個空間隔出三格
		a[1] = new int[2];            //第二個空間隔出兩格
		for (int i=0 ; i<a.length;i++){
			for (int j=0; j<a[i].length; j++){
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
			
		}
		  
	}

}
