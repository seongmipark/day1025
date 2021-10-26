package com.sist.exam06;

import com.sist.exam05.NotFoundException;

public class ProcessScore {
	
	public static double score(double []arr) throws IllegalScore{
		
		double tot = 0; 
		for(int i =0 ; i <arr.length ; i++ ) {
		
			if(arr[i]<0) { //������ ���� ���ܹ߻�
				throw new IllegalScore("������ ������ �� �� �����ϴ�!");
			}
			
		tot = tot+arr[i]; //���� ���ϰ�
		}
		
		double avg = tot/arr.length; //��� ���ϰ� ��ȯ
		return avg;
	}


	public static void main(String[] args) {
		
		//�޼ҵ尡ȣ���ϴ��ʿ��� ����ó��
			try {
			double []score = {80,40,30,50,70,50};
			double avg = ProcessScore.score(score);
			System.out.printf("���: %.1f",avg);
			}catch(IllegalScore e){
				System.out.println("���ܹ߻�:"+e.getMessage());
			}
		}
	}


