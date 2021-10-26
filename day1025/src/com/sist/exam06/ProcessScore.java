package com.sist.exam06;

import com.sist.exam05.NotFoundException;

public class ProcessScore {
	
	public static double score(double []arr) throws IllegalScore{
		
		double tot = 0; 
		for(int i =0 ; i <arr.length ; i++ ) {
		
			if(arr[i]<0) { //음수가 있음 예외발생
				throw new IllegalScore("성적은 음수가 될 수 없습니다!");
			}
			
		tot = tot+arr[i]; //총점 구하고
		}
		
		double avg = tot/arr.length; //평균 구하고 반환
		return avg;
	}


	public static void main(String[] args) {
		
		//메소드가호출하는쪽에서 예외처리
			try {
			double []score = {80,40,30,50,70,50};
			double avg = ProcessScore.score(score);
			System.out.printf("평균: %.1f",avg);
			}catch(IllegalScore e){
				System.out.println("예외발생:"+e.getMessage());
			}
		}
	}


