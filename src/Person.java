
public class Person {
	private String Name;
	private String SuperPower;

	Person(String Name, String SuperPower) {
		this.Name = Name;
		this.SuperPower = SuperPower;
	}
	@Override public String toString(){
		return String.format(Name + " hAz entrd dA fi3ld wif " + SuperPower + "!!!!!11!!1111111");
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSuperPower() {
		return SuperPower;
	}

	public void setSuperPower(String superPower) {
		SuperPower = superPower;
	}

}
