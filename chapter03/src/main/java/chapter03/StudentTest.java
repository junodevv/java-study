package chapter03;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();	// 자식을 생성하는 정상 생성자
		s1.setGrade(1);
		
		
		Person p1 = s1;		// 업캐스팅,Upcasting, 암시적(implicity) 만약 명시한다면 Person p1 = (Person)s1; 
		p1.setName("둘리");
		
		Student s2 = (Student)p1;	// 다운캐스팅,Downcasting(명시적, explicity) -> 왜냐면 자식이 여러명이기 때문에 지정해줘야함
		s2.setMajor("Computer Science");
		// 위와 같은 의미
		// ((Student)p1).setMajor("Computer Science");
	}

}
