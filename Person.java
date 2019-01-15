# SAP_Initial_Taskts

import java.util.*;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private String address;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = "UNKNOWN";
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            this.lastName = "UNKNOWN";
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null){
            this.address = address;
        }
        else {
            this.address = "UNKNOWN";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = 1;
        if (age > 0)
            this.age = age;
    }

    public Person() {
        this("First", "Last", "Earth", 1);
    }

    public Person(String firstName, String lastName, String address, int age) {
        setAddress(address);
        setAge(age);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Person(Person person) {
        this(person.firstName, person.lastName, person.address, person.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return age == person.getAge() && firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) && address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAddress(), getAge());
    }

    @Override
    public int compareTo(Person person) {
        if (person == null) {
            return 0;
        }
        if (age == person.age && firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) && address.equals(person.address)) {
            return 1;
        }
        return 0;
    }

    public static Person[] sort(Person[] people){
        Arrays.sort(people, (p1,p2)-> {
            if (p2 == null) {
                return 1;
            }
            if (p1 == null) {
                return -1;
            }
            if (p1.getFirstName().compareTo(p2.getFirstName()) < 0) {
                return -1;
            }
            if (p1.getFirstName().compareTo(p2.getFirstName()) > 0) {
                return 1;
            }
            return 0;
        });
        return  people;
    }


    public static void main(String[] args) {
        Person person1 = new Person("Sophie", "Peneva", "Mladost 1", 20);
        Person person2 = new Person("Boris", "Penev", "Mladost", 21);
        Person person3 = new Person("Boriana", "Peneva", "Oslo", 46);
        Person[] people = new Person[]{person1,person2,person3};
        people = sort(people);
        for (int i = 0; i < 3; i++) {
            System.out.println(people[i]);
        }
    }
}
