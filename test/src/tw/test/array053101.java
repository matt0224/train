package tw.test;

public class array053101 {

	public static void main(String[] args) {
		int[][] a;   //�ŧi�̨Τ覡
		int b[][] ;                //�x�}������}�C
		int c[][] ; 
		a = new int[2][];               //�j�X��ӪŶ�
		//System.out.println(a[1][]);  //��ƽd�򤺦X�GINT�y�k  ���W�X�}�C���� 
		a[0] = new int[3];            //�Ĥ@�ӪŶ��j�X�T��
		a[1] = new int[2];            //�ĤG�ӪŶ��j�X���
		for (int i=0 ; i<a.length;i++){
			for (int j=0; j<a[i].length; j++){
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
			
		}
		  
	}

}
