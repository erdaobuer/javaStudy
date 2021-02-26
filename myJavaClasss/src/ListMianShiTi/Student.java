package ListMianShiTi;

public class Student {
	private String name;
	private int age;
	private String gender;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student() {
		super();
	}

	public Student(String name, int age, String gender, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}

	@Override
	public boolean equals(Object student) {
		Student otherStu = (Student)student;
		return this.name.equals(otherStu.name) && this.age == otherStu.age && this.gender.equals(otherStu.gender)
				&& this.address.equals(otherStu.address);
	}
}
