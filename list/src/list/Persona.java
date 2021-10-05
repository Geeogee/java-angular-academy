package list;

import java.util.Objects;

public class Persona {
	private int age;
	private String firstname;
	private String lastname;
	
	public Persona(int _age, String _firstname, String _lastname) {
		this.age = _age;
		this.firstname = _firstname;
		this.lastname = _lastname;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public String getLastname() {
		return this.lastname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, firstname, lastname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return age == other.age && Objects.equals(firstname, other.firstname)
				&& Objects.equals(lastname, other.lastname);
	}
	
	
}
