package programPractice;

final class Demo11 {

	public static void main(String[] args) {

		Animal pet = new Dog();
		pet.makeNoise();
		pet.noNoise();
		System.out.println(pet.var);

	}
}

class Animal {
	protected static int var = 0;

	public Animal() {
		makeNoise();
		noNoise();
		var++;

	}

	public void makeNoise() {
		System.out.println("Silence");
		System.out.println(var);
	}

	public void noNoise() {
		System.out.println("No Silence");
		System.out.println(var);
	}
}

class Dog extends Animal {
	protected static int var = 10;

	public Dog() {
		makeNoise();
		var++;
	}

	public void makeNoise() {
		System.out.println("Woof");
		System.out.println(var);
	}
}
