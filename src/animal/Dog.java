package animal;

public class Dog extends Animal {

	public String name;
	public String breed;

	@Override
	public String sound(String sound) {
		return "Woof Woof!";
	}

}
