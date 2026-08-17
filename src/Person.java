public class Person {
    //attributs
    public String lastName;
    public String firstName;
    public int age;
    public String address;
    public City bornCity;

    public Person(String lastName, String firstName, int age, String address, City bornCity) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.bornCity = bornCity;
    }
    public Person(String lastName, String firstName, int age ) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = "unknown";
    }
    public Person(String lastName, String firstName) {
        this.age = 0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = "unknown";
    }
    //accesseurs

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getBornCity() {
        return bornCity;
    }

    public void setBornCity(City bornCity) {
        this.bornCity = bornCity;
    }

    public String toString() {
        return "Person [lastName=" + getLastName() +
                ", firstName=" + getFirstName() +
                ", age=" + getAge() +
                ", address=" + getAddress() +
                "]BornCity " + getBornCity();
        }
    }
