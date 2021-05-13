package day0425.homeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//2.map을 이용
// Employee 클래스를 생성
//String name, int salary, String address 를 갖는 클래스를 만들고
//키에 사번을 넣고 , value에 Emplyee객체를 넣을 수 있는 map을 만들어
// 3명의 객체를 만들어 넣고
// 사용자로부터 입력받은 입력받은 사번의 이름과 연봉, 주소를 출력하시오
public class HomeWork2 {

	public static void main(String[] args) {
		Map<String, Employee> people = new HashMap<String,Employee>();
		people.put("001", new Employee("홍길동", 100,"서울"));
		people.put("002", new Employee("홍길만", 200,"제주도"));
		people.put("003", new Employee("홍길순", 400,"북한"));
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("검색하고 싶은 사람의 사번을 적어주세요");
	String number = sc.next();
	
	Employee e = people.get(number);
	
	if( e != null) {
		System.out.println("이름 :" + e.name + ", 연봉 :" + e.salary + ", 주소 :" + e.address);	
	}
	else {
		System.out.println("찾으려는 사람 없음");
	}
	
	//연봉 비교 : people의 map으로 들어가 객체 Employee의 연봉으로 들어가야 한다. 
	// 입력받은 숫자 이상의 연봉을 받는 사람은?
	System.out.println("연봉을 입력해주세요");
	int salary = sc.nextInt();
	for(String key : people.keySet()) {
		Employee e1 = people.get(key);
		if((people.get(key).getSalary()) >= salary) {
			System.out.println("이름 :"+e.getName()+", 연봉 :"+ e.getSalary() + ", 주소"+e.getAddress());
		}
	}
	
	
	
	}
}
