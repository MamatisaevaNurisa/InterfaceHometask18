public class Hostel extends LivingPlace {

    private String nameOfHostel;
    public Hostel(Family family,String nameOfHostel) {
        super(family);
        this.nameOfHostel = nameOfHostel;
    }

    public String getNameOfHostel() {
        return nameOfHostel;
    }

    public void setNameOfHostel(String nameOfHostel) {
        this.nameOfHostel = nameOfHostel;
    }

    @Override
    public void payRent() {
        System.out.println("Arsen's family live in a hostel");
        System.out.println("They pay rent");
    }

    @Override
    public void payUtilities() {
        System.out.println("They don't pay utilities");
    }

    @Override
    public String toString() {
        return "Hostel: " +
                "nameOfHostel: " + nameOfHostel +
                "family=" + family;
    }
}
