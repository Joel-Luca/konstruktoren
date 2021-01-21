package account.teil2;

public class Adress {

    private int plz;
    private String streat;
    private int housenumber;
    private String city;

    public Adress(int plz, String streat, int housenumber, String city) {
        this.plz = plz;
        this.streat = streat;
        this.housenumber = housenumber;
        this.city = city;
    }

    public int getPlz() {
        return plz;
    }

    public String getStreat() {
        return streat;
    }

    public int getHousenumber() {
        return housenumber;
    }

    public String getCity() {
        return city;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public void setStreat(String streat) {
        this.streat = streat;
    }

    public void setHousenumber(int housenumber) {
        this.housenumber = housenumber;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
