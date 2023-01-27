public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Dad", "Ali", 49);
        Person person2 = new Person("Mom", "Aida", 45);
        Person person3 = new Person("Son", "Rasul", 6);
        Person person4 = new Person("Daughter", "Guliya", 2);

        Person person5 = new Person("Husband", "Nurlan", 30);
        Person person6 = new Person("Wife", "Janyl", 25);

        Person person7 = new Person("Dad", "Arsen", 55);
        Person person8 = new Person("Mother", "Asel", 48);
        Person person9 = new Person("Daughter", "Aliya", 16);

        Person[] people1 = {person1, person2, person3, person4};
        Family family1 = new Family(people1);
        Apartment apartment = new Apartment(family1);
        System.out.println(apartment);
        System.out.println("quantity of family members: " + apartment.family.people.length);
        apartment.payRent();
        apartment.payUtilities();

        System.out.println("****************************** ");

        Person[] people2 = {person5, person6};
        Family family2 = new Family(people2);
        Dormitory dormitory = new Dormitory(family2,"Flower");
        System.out.println(dormitory);
        System.out.println("quantity of family members: " + dormitory.family.people.length);
        apartment.payRent();
        apartment.payUtilities();

        System.out.println("**********************");

        Person [] people3 = {person7, person8,person9};
        Family family3 = new Family(people3);
        Hostel hostel = new Hostel(family3, "STAR");
        System.out.println(hostel);
        System.out.println("quantity of family members: " + hostel.family.people.length);
        hostel.payRent();
        hostel.payUtilities();



    }

}