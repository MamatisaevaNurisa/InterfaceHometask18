public abstract class LivingPlace {
  Family family;

    public LivingPlace(Family family) {
        this.family = family;
    }

    public abstract void payRent();
    public abstract void payUtilities();

    @Override
    public String toString() {
        return "LivingPlace: " +
                "family:" + family ;
    }

}
