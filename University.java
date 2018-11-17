package homeworkBonus;

public class University {
	String name;
	int years;
	
	public University (String uni_name, int uni_years) {
		this.name = uni_name;
		this.years = uni_years;
	}
	public String commitment (){
		return name + ", " + years;	
	}
}
