package java_class;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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
	//두 객체의 필드값이 모두 일치하는지 판단하려면 hashCode(), equals() 메서드를 재정의하자
	@Override
	public int hashCode() {
		return Objects.hash(id, studentMajor, studentMobile, studentName, studetnNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDTO other = (StudentDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(studentMajor, other.studentMajor)
				&& Objects.equals(studentMobile, other.studentMobile) && Objects.equals(studentName, other.studentName)
				&& Objects.equals(studetnNumber, other.studetnNumber);
	}
	
	
}
