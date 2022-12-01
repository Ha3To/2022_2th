package sec01.exam05;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;	//ClassCastException  발생 가능
		}
	}
}

class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}

//instanceof 연산자로 타입 변환 가능 여부를 미리 파악