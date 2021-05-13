package day0425;
//예외가 2가지
public class Ex03 {

	public static void main(String[] args) {
		int[] numArr = new int[5];
		
		try {
		for(int i = 1; i <= 5; i++) {
			int num = (int)(Math.random()*5); //인덕스예외와 0이 나올 수 있는 경우 발생
			numArr[i] = 10/num;
		}
		}
		//한개가 catch되면 두번째 catch는 넘어간다 (0이 발생할 경우에는 arrayIndex는 안간다)
		//배열이 넘어갔을 때는 먼저 arrayInex예외 캐치갔다가 캐치안되면 그제서야 그 뒤의 예외상황으로 간다. 
		catch(ArithmeticException e) { //e는 지역변수로 처리되기 때문에 가능
			System.out.println("0을 나누려 했네!!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기를 넘어가려 했음");
		}
		

	}

}
