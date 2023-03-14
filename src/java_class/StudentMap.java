package java_class;

import java.util.*;

public class StudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, StudentDTO> studentMap = new HashMap<>();
		
		StudentDTO studentDTO1 = new StudentDTO();
		studentDTO1.no = 1;
		studentDTO1.studetnNumber = 1111;
		studentDTO1.studentName = "김자바";
		studentDTO1.studentMajor = "컴퓨터공학";
		studentDTO1.studentMobile = "010-1111-1111";
		studentMap.put(1,studentDTO1);
//		System.out.println(studentMap.get(1));
		
		StudentDTO studentDTO2 = new StudentDTO();
		studentDTO2.no = 2;
		studentDTO2.studetnNumber = 2222;
		studentDTO2.studentName = "이자바";
		studentDTO2.studentMajor = "경영학";
		studentDTO2.studentMobile = "010-2222-2222";
		studentMap.put(2,studentDTO2);
//		System.out.println(studentMap.get(2));
		
		StudentDTO studentDTO3 = new StudentDTO();
		studentDTO3.no = 3;
		studentDTO3.studetnNumber = 3333;
		studentDTO3.studentName = "박자바";
		studentDTO3.studentMajor = "전자공학";
		studentDTO3.studentMobile = "010-3333-3333";
		studentMap.put(3,studentDTO3);
//		System.out.println(studentMap.get(3));
		
		
		for(int st  : studentMap.keySet()) {
			System.out.println(studentMap.get(st).toString());
		}
		
	}

}
