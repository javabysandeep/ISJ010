package objectClassMethods;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class Demo16ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {

        @AllArgsConstructor
        @ToString
        @NoArgsConstructor
        class Address {
            int houseNumber;
            String street;
            String city;
            String country;
        }

        @AllArgsConstructor
        @ToString
        @NoArgsConstructor
        class Employee implements Cloneable {
            int id;
            String name;
            int salary;
            //dependent object
            Address address;

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        Address address = new Address(1, "camp road", "Pune", "India");
        Employee employee1 = new Employee(1, "Sachin", 10000, address);

        Employee employee2 = (Employee) employee1.clone();
        System.out.println("address object it is shared");

        employee2.address.city="Mumbai";

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee1.address.hashCode());
        System.out.println(employee2.address.hashCode());

    }
}