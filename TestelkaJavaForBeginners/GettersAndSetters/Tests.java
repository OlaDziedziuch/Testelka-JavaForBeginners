package TestelkaJavaForBeginners.GettersAndSetters;

import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void example (){
        Customers customers = new Customers();
        customers.setAge(15);
        System.out.println(customers.getAge() + " years old");
        int age = 22;
        int age2 = customers.getAge();
        age2 = 99;
        System.out.println(customers.getAge() + " years old");
    // konsola wypluwa te sama wartosc
    }

    @Test
    public void gettersAndSettersObjectsTest() {
        Customers customers = new Customers();
        Address address = new Address("Kraków", "Fiołkowa", "12/1");
        customers.setAddress(address);
        Address address2 = customers.getAddress();
        System.out.println("Adres: " + customers.getAddress().getStreet() + " "
        + customers.getAddress().getApartament() + " "
        + customers.getAddress().getCity());
        address2.setCity("Gdańsk");
        System.out.println("Adres: " + customers.getAddress().getStreet() + " "
                + customers.getAddress().getApartament() + " "
                + customers.getAddress().getCity());

    }

}
