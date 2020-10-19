package TestelkaJavaForBeginners.GettersAndSetters;

public class Customers {

    private String name;
    private String lastName;
    private int age;
    private Address address;

    public Address getAddress() {
        return copy(address);
    }

    public void setAddress(Address address ) {
        this.address = copy(address);
    }

    public void setAge(int age){
        if (age<0) throw new IllegalArgumentException("Age cannot be a negative number");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private Address copy(Address addressToCopy) {
        Address address = new Address(addressToCopy.getCity(), addressToCopy.getStreet(), addressToCopy.getApartament());
        return address;
    }
}
