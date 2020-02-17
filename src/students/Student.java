package students;

public class Student {

	public static void main(String[] args) {

		Students s = new Students();
		s.setName("Bikash");
		s.setId(1);
		s.setRollno(21);
		s.setAddress("Pokhara");
		
		AdmissionService as = new AdmissionService();
		as.admit(s);
		
		
		Students s2 = new Students();
		s2.setName("Donald");
		s2.setId(2);
		s2.setRollno(101);
		s2.setAddress("White house");
		
		AdmissionService a = new AdmissionService();
		a.admit(s2);
	}
}