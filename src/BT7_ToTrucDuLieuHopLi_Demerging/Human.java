package BT7_ToTrucDuLieuHopLi_Demerging;

public class Human {
    private int name;
    private String age;
    private int address;

    public Human() {
    }

    public Human(int name, String age, int address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name=" + name +
                ", age='" + age + '\'' +
                ", address=" + address +
                '}';
    }
}
