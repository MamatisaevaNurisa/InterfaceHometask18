import java.util.Arrays;

public class Family {

Person [] people;

public Family(Person [] people ){
    this.people = people;
}

    @Override
    public String toString() {
        return "Family: " +
                "people:" + Arrays.toString(people);
    }
}
