public class Apartment extends LivingPlace{

    public Apartment(Family family) {
        super(family);

    }

    @Override
    public void payRent() {
        System.out.println("Ali's family live in Apartment");
        System.out.println("They don't pay rent");
    }

    @Override
    public void payUtilities() {
        System.out.println("They pay utilities");
    }

    @Override
    public String toString() {
        return "Apartment: " +
                "family" + family;

    }
}
