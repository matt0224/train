
package  tw.test;

import java.util.Scanner;

public class PW1 {

	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			System.out.println("�A��J���Ƥ��O��ƱK�X");
		}
	}

	static void test() {
		Locks locks = new Locks();
		boolean result = true;
		while (result == true) {
			int setinput = set();
			if (setinput >= 1000 && setinput <= 9999) {
				locks.setPassword(setinput);
				while (true) {
					int getinput = get();
					if (getinput == locks.getPassword()) {

						result = false;
						break;
					} else {
						System.out.println("�K�X���~,�Э��s��J");
						continue;
					}
				}
			} else {
				System.out.println("�K�X�n����1000~9999������");
				continue;
			}
		}

	}

	static int set() {
		Scanner a = new Scanner(System.in);
		System.out.println("�п�J�A�n�]�w���K�X:");
		int setinput = a.nextInt();
		return setinput;

	}

	static int get() {
		Scanner a = new Scanner(System.in);
		System.out.println("�п�J�����K�X:");
		int getinput = a.nextInt();
		return getinput;
	}

}

class Locks {
	private int password;

	public void setPassword(int password) {
		this.password = password;
	}

	public int getPassword() {
		return password;
	}
}
