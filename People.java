package homeworkBonus;

public class People {

	String name, surname;
	
	public People (String new_name, String new_surname) {
		this.name = new_name;
		this.surname = new_surname;
	}
	
	public String get () {
		return name + " " + surname;
	}
}