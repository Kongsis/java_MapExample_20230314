package java_class;

import java.util.HashMap;
import java.util.Map;

public class StudentDTO {
	//int : 값의범위-23~23억 까지 표현 / long 이 더 큰값의 범위 표현
	//long 기본값 : 0 / Long 기본값 : null
	private Long id; // 관리번호
	private String studetnNumber; // 학번
	private String studentName; // 이름
	private String studentMajor; // 전공
	private String studentMobile; // 전화번호
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudetnNumber() {
		return studetnNumber;
	}
	public void setStudetnNumber(String studetnNumber) {
		this.studetnNumber = studetnNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentMajor() {
		return studentMajor;
	}
	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}
	public String getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", studetnNumber=" + studetnNumber + ", studentName=" + studentName
				+ ", studentMajor=" + studentMajor + ", studentMobile=" + studentMobile + "]";
	}
}
