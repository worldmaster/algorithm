package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//student객체에 이름과 학번을 저장 
		student st = new student("정승훈","201804069");
		student st1 = new student("홍길동","201904069");
		student st2= new student("면접관","202004069");

		
//		ArrayList list = new ArrayList<student>(); 여기서 <stduent> 타입을 지정해줘야 for문에서 list를 반복문으로 사용가능함.
		
		ArrayList <student>list = new ArrayList<student>();
		
		//리스트에 학생 정보들을 담아줌.
		list.add(st);
		list.add(st1);
		list.add(st2);
		
		
		//검색여부
		
		
		while(true) {
			
			System.out.println("계속 검색을 할거면 y 아니면 n을 입력하세요 :");
			String input = sc.next();
			
			if(input.equals("y")) {
				System.out.println("학생이름을 입력하세요 :");
				String name = sc.next();
				boolean flag = false;
				
				for(student stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println("해당 학생의 학번은" + stu.getNo());
						flag = true;
					}
				}
				
				if(!flag) {
					System.out.println("해당 학생이 없습니다.");
				}
				
			}
			else if(input.equals("n")) {
				break;
			}
			
		
			
		}
		
		
	}

}
