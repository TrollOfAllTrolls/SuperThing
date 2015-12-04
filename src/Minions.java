
public class Minions {
	private String Name;
	private int Eyes;
	private String Color;
	private String Master;

	Minions(String Name, int Eyes, String Color, String Master) {
		this.Name = Name;
		this.Eyes = Eyes;
		this.Color = Color;
		this.Master = Master;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getEyes() {
		return Eyes;
	}

	public void setEyes(int Eyes) {
		this.Eyes = Eyes;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getMaster() {
		return Master;
	}

	public void setMaster(String master) {
		Master = master;
	}

}
