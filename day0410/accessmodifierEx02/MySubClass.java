package accessmodifierEx02;

import accessmodifierEx01.MyClass;

public class MySubClass extends MyClass{
	void printInfo() {
		System.out.println(publicNum);
		System.out.println(protectedNum); // 상속받으면 사용가능
		//System.out.println(defaultNum); // 불가능
		//System.out.println(privateNum);
	}

}
