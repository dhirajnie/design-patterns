package prototype;

import java.util.Arrays;

/**
 * A partially or fully initialized object that you copy(clone ) and make use of
 * Reason : Complicated object aren't designed from scratch they reiterate existing designs
 *
 */


public class Address {

    String streetName;
    int houseNumber;


    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    /**
     * Copy constructor
     *
     * @param other copy of the object that is  require
     */
    public Address(Address other) {
        this.streetName = other.streetName;
        this.houseNumber = other.houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}

class Person {
    String names[];
    Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    /**
     * Copy constructor
     *
     * @return
     */

    public Person(Person other) {
        this.names= other.names;
        this.address= new Address(other.address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }
}

class Demo {

    public static void main(String[] args) {
        Person john = new Person(new String[]{"John", "Smith"},
                new Address("London Road", 123));
        /**
         * THis is the swallow copy of the object
         */
        Person jane = john;
        /**
         * we require deep copy of the object
         */
        Person janeDeepCopied = new Person(john);
        janeDeepCopied.names=new String[]{"Jane","Smm"};
        janeDeepCopied.address.houseNumber=12;
        janeDeepCopied.address.streetName="Jane own street";
        System.out.println(john);
        System.out.println(janeDeepCopied);

    }
}