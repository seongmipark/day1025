//��Ű����� �ֹι�ȣ���� Ȯ��
package com.sist.exam04;

import java.util.Scanner;
public class ValidJuminNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jumin;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���(-����)==>");
		jumin = sc.next();
		
		
		//�� = 11-{(2����+3����+4����+5����+6����+7����+8����+9����+2����+3����+4����+5����) mod 11}
		//�Ұ�ȣ �ȿ� �ִ� ���� ����� ���� 11�� ������ ���� �������� 11���� �� ���� ���̴�.
		//(��, 10�� 0, 11�� 1�� ǥ���Ѵ�.)
		
		int []n = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		//800101-1234567
		//�ε��� 6��°�� ��꿡 �������� �ʰ�.
		//���ڿ� ���̴� 14
		//�ݺ������ؾ��� �ε����� 12 => i < jumin.length() -1
		
		int sum = 0;
		for(int i = 0 ; i<jumin.length() -1 ; i++ ) {
			if( i != 6) {
			sum = sum + Integer.parseInt(jumin.charAt(i)+"")*n[i];
			}
		}
		sum = sum%11;
		sum = 11 - sum;
		
		if(sum == 10) {
			sum = 0;
		}
		if(sum == 11) {
			sum = 1;
		}
		
		int check  = Integer.parseInt(jumin.charAt(13)+"");
		//charAt()�� ����� char
		//char�� ���ڿ�(String)���� ����� ���Ͽ�
		//""�� �ٿ� ���ڿ��� �����.
		
		if(sum == check) {
			System.out.println("�ùٸ� �ֹε�Ϲ�ȣ �Դϴ�.");
		}else {
			try {
			throw new InValidJuminNumberException("�ùٸ� �ֹι�ȣ ������ �ƴմϴ�.");
			//�� ������ ����?
			//�츮�� ���� InValidJuminNumberException��
			//RuntimeException�� �ļ��� �ƴ϶� ����ó���� �ؾ��Ѵ�.
			}catch(InValidJuminNumberException e) {
				System.out.println("���� �߻�:"+ e.getMessage());
				
			}
		}
	}

}
