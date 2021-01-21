package account.teil2;

public class App {
    public static void main(String[] args) {

        Person moritz = new Person("Moritz", "lehmann", new Adress(1234, "Bahnhofstrasse", 7, "Dotzigen"));
        Person yanik = new Person("Yanik", "Kohler", new Adress(4321, "Solothurnstrasse", 91, "Biel"));
        Person joel = new Person("Joel", "Christinet", new Adress(3665, "Kilchweg", 16, "Wattenwil"));
        Person tobias = new Person("Tobias", "Saile", new Adress(9876, "Wasweissich", 12, "Dafragstdumich"));
        Person gian = new Person("Gian", "Rüegsegger", new Adress(3000, "KeineAhnnung", 21, "Uetendorf"));
        Person ricardo = new Person("Ricardo", "Fernandes", new Adress(3200, "Jucktmichnicht", 123, "Bümpliz"));

        Person[] persons = {moritz, joel, yanik, tobias, gian, ricardo};

        Account[] accounts = Account.createAccountsForPeople(persons);

        for (Account account : accounts) {
            try {
                account.zahleEin(RandomHelper.getRandomDouble(1, 1000));
                account.hebeAb(RandomHelper.getRandomDouble(1, account.getSaldo()));
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }

        int index = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getSaldo() > accounts[index].getSaldo()) {
                index = i;
            }
        }
        System.out.println("Der Gewinner ist " + accounts[index].getOwner().getFirstName() + " " + accounts[index].getOwner().getLastName() + " und hat einen Betrag von " + accounts[index].getSaldo() + " " + Account.waehrung +
                ". Er wohnt in " + accounts[index].getOwner().getAdress().getCity());
    }
}
