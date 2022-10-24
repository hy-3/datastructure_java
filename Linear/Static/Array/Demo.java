class Student {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
}

public class Demo {
	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4};
		Student[] studentArr = new Student[3];
		studentArr[0] = new Student("Yamada", 50);
		studentArr[1] = new Student("Sato", 100);
		studentArr[2] = new Student("Suzuki", 20);
		for (int i : intArr) {
			System.out.println(i);
		}
		for (Student student : studentArr) {
			System.out.println(student.getName() + ": " + student.getScore());
		}
	}
}