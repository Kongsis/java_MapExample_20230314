package java_class;

import java.util.HashMap;
import java.util.Map;

public class StudentDTO {
	
	int no;
	int studetnNumber;
	String studentName;
	String studentMajor;
	String studentMobile;
	
	
	@Override
		public String toString() {
			return no+"\t"+studetnNumber+"\t"+studentName+"\t"+studentMajor+"\t"+studentMobile;
		}
}
