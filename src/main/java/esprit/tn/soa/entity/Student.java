package esprit.tn.soa.entity;

public class Student {

		private final String cin;
		private final String nombre;
		private final String email;
		
		public Student(String cin, String nombre, String email) {
			
			this.cin = cin;
			this.nombre = nombre;
			this.email = email;
		}
		
		public String getCin() {
			return cin;
		}
		public String getNombre() {
			return nombre;
		}
		public String getEmail() {
			return email;
		}
		
		
}
