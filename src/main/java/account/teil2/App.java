package account.teil2;

public class App {
    public static void main(String[] args) {

        Person moritz = new Person("Moritz", "lehmann");
        Person yanik = new Person("Yanik", "Kohler");
        Person joel = new Person("Joel", "Christinet");
        Person tobias = new Person("Tobias", "Saile");
        Person gian = new Person("Gian", "Rüegsegger");
        Person ricardo = new Person("Rivardo", "Fernandes");

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
        System.out.println("Der Gewinner ist " + accounts[index].getOwner().getFirstName() + " " + accounts[index].getOwner().getLastName() + " und hat einen Betrag von " + accounts[index].getSaldo() + " " + Account.waehrung);
    }
}
