package Model;

public class Contact {

    private int id;
    private String name;
    private String phoneNumeber;


    public Contact() {
    }

    public Contact(int id, String name, String phoneNumeber) {
        this.id = id;
        this.name = name;
        this.phoneNumeber = phoneNumeber;
    }

    public Contact(String name, String phoneNumeber) {
        this.name = name;
        this.phoneNumeber = phoneNumeber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumeber() {
        return phoneNumeber;
    }

    public void setPhoneNumeber(String phoneNumeber) {
        this.phoneNumeber = phoneNumeber;
    }
}
