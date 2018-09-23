package exercise1.model;

public class Employee {
int id,age;
String firstName, surname, position;
public Employee(int id, int age, String firstName, String surname, String position)   {
	super();
	this.id = id;
	this.age = age;
	this.firstName = firstName;
	this.surname = surname;
	this.position = position;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}

public String toString() {
    return  firstName + " "
            + surname;
}

}
