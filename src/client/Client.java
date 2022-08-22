package client;

public class Client {
    private String idClient;
    private String name;
    private String phoneNumber;

    public Client(String idClient, String name, String phoneNumber) {
        this.idClient = idClient;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getIdClient() {
        return idClient;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
