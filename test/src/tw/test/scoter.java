package tw.test;


	
	/*
	 *  �]���{���b23��
	 */
	public class scoter extends Bike {     //�b�o�䪽����extends
				scoter(){       //�}�l�w�q�ۤv���غc��  �غc���S���b�~�Ӫ�
				//super();   //�Ĥ@�D�ԭz�y�k���Lthis��super �S�������@�������o�䰵�F�ĤT��ĥ|���~�����6��
					             //���Y�Dobject   //�u���غc�������~�� �ݩʤ�k���i�H�~��
					System.out.println("Scoter()");
				}
				void upSpeed(){						//�o��}�l�q�s�w�q�[�t�ץΦۤv�� ��t�רS���ܤ@�˥Τ����O��
				 // super.upSpeed();   //�{���]�p���Ϊ������ۼƦA�W�[,�|���έ��k�A�[�J�ۤv����k
				  speed = (speed<1)?1.5:(speed*10);  		//  �]���ݩʧ����ʸ˩ҥH�u��bbike��				
					
				}
				void upSpeedv2(){      //�\���s�ڭ̱q�s�R�W �i�H�O�d�����O���F��j�ƥ\��
					
				}
	}

