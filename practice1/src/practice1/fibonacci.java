package practice1;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		//배열의 크기가 100인 배열생성
		int[]arr = new int[100];

		arr[1] = 1;
		arr[2] = 2;
		
		//arr[3] = ? 3 = arr[1] + arr[2]
		
		
		
		for(int i = 3; i < 100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int i =1; i<=10; i++) {
			System.out.println(arr[i] + "");
		}
		
		//응용으로 내가 입력한 수 12항까지 만약 더한수를 구하고 싶다면?-------------------------
		
		int[]arr1 = new int[100];
		Scanner sc = new Scanner(System.in);
		
		arr[1] = 1;
		arr[2] = 1;
		
		
		
		for(int i = 3; i < 100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		System.out.println("몇항까지의 합을 알고싶니?");
		int number = sc.nextInt();
		
		
		
		for(int i=1; i<=number; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
	}

}
