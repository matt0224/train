package tw.test;

public class for992 {

		public static void main(String[] args) {
			 int result ;
			 for(int k=0 ; k<2 ; k++){ //2�N���Ӿ�C
				 for(int j=1; j<=9 ; j++){
					 for(int i=2 ; i<=5 ; i++){   //\t�j�}�r�� �@�C��4�� 2.3.4.5 �ҥH�~*4
						 int newi = i+k*4;   //�]���@�C��4��  �]���Ĥ@��k�Oo �ĤG��~�|����
						 result= newi*j ;
						
					  System.out.print(newi+" * "+j+" ="+result+"\t");
					 }
					 System.out.println();
				 }
				 System.out.println("---------------------------------------");
		  }	 
		}

	}