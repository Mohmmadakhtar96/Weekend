
public class Patient {
	private int ID;
	private String Name;
	
	
	private Patient(int ID, String Name) {
		this.ID = ID;
		this.Name = Name;
	}
	public int getID() {
		return this.ID;
		
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String toString() {

		return getID ()+ " " + getName ();
	}

}
