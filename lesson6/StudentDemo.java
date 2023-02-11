package lesson6;
// 계속 읽어보면서 복습해보기

public class StudentDemo {

	public static void main(String[] args) {
		StudentMng sm = new StudentMng() ;		
		int maxClassNum = 3 ;
		
		for (int i = 0; i < maxClassNum; i++) {
			Student s = new Student() ;
			s.inputData();
			
			sm.makeClass(s);
		}
		
		sm.showClass();
		
	}

}
