public class Dormitory extends LivingPlace{

    private String nameOfDormitory;

    public Dormitory(Family family,String nameOfDormitory) {
        super(family);
        this.nameOfDormitory = nameOfDormitory;
    }

    public String getNameOfDormitory() {
        return nameOfDormitory;
    }

    public void setNameOfDormitory(String nameOfDormitory) {
        this.nameOfDormitory = nameOfDormitory;
    }

    @Override
    public void payRent() {
        System.out.println("Nurlan's family live in the Dormitory");
        System.out.println("They pay rent");
    }

    @Override
    public void payUtilities() {
        System.out.println("They dont pay utilities");
    }

    @Override
    public String toString() {
        return "Dormitory: " +
                "nameOfDormitory: " + nameOfDormitory + '\'' +
                "family: " + family;
    }
}

