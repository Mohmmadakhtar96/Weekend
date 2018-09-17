
public class Doctor {
	private String Name;
	private String Type;
	private int Level;

	public Doctor(String Name, String Type, int Level) {
		this.Name = Name;
		this.Type = Type;
		this.Level = Level;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return this.Type;
		
	}
	public int getLevel() {
		return this.Level;
	}
	
	public void setType(String Type) {
		this.Type = Type;
	}
	public void setLevel(int Level) {
		this.Level = Level;
	}
	public String toString() {

		return getName()+ " ," +getType()+ " ," +getLevel();
}

}
