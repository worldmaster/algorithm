package practice;

public class student {

	
	//학생정보를 저장할 수 있는 이름과 학번 필드 생성
	private String name;
	private String no;
	
	
	//기본생성자 생성
	public student() {
		
	}
	
	
	public student(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", no=" + no + "]";
	}
	
	
	
	
	
}
