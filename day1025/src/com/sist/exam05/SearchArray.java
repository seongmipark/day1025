package com.sist.exam05;

public class SearchArray {
	
	
	//search 메소드 body안에 예외 객체가 생성될 수 있다.
	//이와 같이 메소드안에서 예외가 발생될 때 
	//메소드안에서 직접 try~catch로 예외처리 할 수도 있고,
	//메소드 호출하는 쪽으로 예외를 전파할 수 있다.
	public static int search( int []arr, int value ) throws NotFoundException  {
		int index = -1; 
		// 왜 초기값을 -1을 줄까?
		// 배열의 인덱스는 0부터 시작하니 인덱스가 아닌값을 설정하기 위해 -1로 설정
		
		for(int i =0 ; i <arr.length  ; i++  ) {
			if(arr[i] == value) {
				index = i;
			}
		}
		
		//value을 배열에서 찾았는지 못찾았는지 어떻게 알 수 있나?
		//인덱스번호가 -1이면 못찾음
		if(index == -1) {
			throw new NotFoundException("배열에 찾는값 "+value+"가(이) 없습니다!");
		}
		
		return index;
	}
	
	//**메소드 호출하는쪽에서 예외처리
	public static void main(String[] args) {
		try {
		int []data = {2,4,10,9,6};
		int n = search(data, 100);
		//메소드 호출하는 쪽에서 예외처리를 해야 한다!
		System.out.println(n);
		}catch (NotFoundException e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
}
