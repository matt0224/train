package tw.test;

public class Bike {
    double speed;  //�o�����O�֦����ݩ�
     Bike(){                                      //�ŧi�W�٥u������O�̼�,�q�A���קK�V�c
        speed=100;
    	   	//  speed = s; //�Ȥ���w1.2�ҥH���L1.2
    	   	
    	    System.out.println("Bike:bike()");   //�b�D�{���u��1�Ӹ}�񨮪��P�ɷ|�V�c��x�}��
    	   	    //�W����x�}�񨮴��b�ݩʤ��P�@�ӬOdouble
    	   //�H�W�O�ݩ�
    	  }
     Bike(double s){                                      //�ŧi�W�٥u������O�̼�,�q�A���קK�V�c
   	  speed=200;
   	//  speed = s; //�Ȥ���w1.2�ҥH���L1.2
   	
   //  System.out.println("Bike:bike()");   //�b�D�{���u��1�Ӹ}�񨮪��P�ɷ|�V�c��x�}��
   	    //�W����x�}�񨮴��b�ݩʤ��P�@�ӬOdouble
   //�H�W�O�ݩ�
   }

void upSpeed(){   //�n������~�వ����k ���󪫥󳣦��Ǧ^�� VOID�N�S���Ǧ^�� 
    //�z�L��k���ܳt��
speed = (speed<1)?1:(speed*1.2);   
} void upSpeed(int gear){   //gear���w ���O�]�O�n�I�s�[�t��
                               //""�P�W����""
speed = (speed<1)?1:(speed*(1.2+gear));   //�ƻs�Ĥ@�ӼW�[�ɦ�
}
void downSpeed(){
speed= (speed<1)?1:(speed*0.7);;
}
double getSpeed(){      //���{���N��  �o��O��4��n�[�o���Ǧ^�t��
return speed;
}	
}