package account.teil2;

public class Person {

    private String firstName;
    private String lastName;
    private Adress adress;

    public Person(String firstName, String lastName, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

}
