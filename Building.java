package homeworkBonus;

public class Building {

	int floors, apartments;
	
	public Building(int floors_num, int apartments_num) {
		this.floors = floors_num;
		this.apartments = apartments_num;
	}
	
	public int all_apartments() {
		return floors * apartments;
	}
}
