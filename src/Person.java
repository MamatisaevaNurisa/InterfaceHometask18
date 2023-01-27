public class Person implements Liveable{

    private String memberOfFamily;
    private String name;
    private int age;

    public Person(String memberOfFamily, String name, int age) {
        this.memberOfFamily = memberOfFamily;
        this.name = name;
        this.age = age;
    }

    public String getMemberOfFamily() {
        return memberOfFamily;
    }

    public void setMemberOfFamily(String memberOfFamily) {
        this.memberOfFamily = memberOfFamily;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void live() {
        System.out.println(name + "lives");
    }

    @Override
    public String toString() {
        return "Person: " +
                "memberOfFamily: " + memberOfFamily +
                " name: " + name  +
                ", age=" + age;
    }
}
