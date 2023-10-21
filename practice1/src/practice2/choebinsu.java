package practice2;

import java.util.Random;
import java.util.Scanner;

public class choebinsu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[]arr = new int[10];
		int [] mode = new int [10];
		
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		
	
	
		/*
		 * index -> 출현한 수
		 * index 값 -> index(출현한수)가 몇번나왔는지 저장하는 변수
		 * 
		 * "mode[3] = 5 ,=> 3번숫자가 5번 출현했다.
		 * 
		 * 
		 * arr => 1 2 2 3 1 4 2 2 4 3
		 * 
		 */
		
//		mode[1] -> 출현한 수  증가 -> 1
//		mode[2] -> 출현하수 증가 -> ->1
//		mode[2] -> 출현한수 증가 -> 2
//		mode[3] -> 출현하수 증가 -> 1
//		mode[1] -> 출현한수 증가 -> 2
//
//		mode++를 한다고 해서 값이 같은것끼리의 증가가 가능하게됨.
		
		int num = 0; //최빈수의 숫자
		int count = 0;//최빈수의 수가 몇번 나왔는지 계산
		
		
		for(int i=0; i<10; i++) {
			mode[arr[i]]++;
			if(mode[arr[i]] > count) {
				count = mode[arr[i]];
				num = arr[i];
			}
		}
		
		
		
		System.out.print("정답 : " +num +"("+count+")");
    
		
		
		
   } 

}