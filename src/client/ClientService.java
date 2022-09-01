package client;

import java.util.HashMap;

public class ClientService {
    public static void addClient(String firstName, String lastName, String phoneNumber) throws Exception {
        addClient(firstName + " " + lastName, phoneNumber);
    }

    public static void addClient(String name, String phoneNumber) throws Exception {
        HashMap<String, Client> clientMap = ClientStorage.getData();

        if (clientMap.values().stream().anyMatch(client -> client.getPhoneNumber().equals(phoneNumber))) {
            throw new Exception("Client with phone number " + phoneNumber + " is already in the client database.");
        }

        Client client = new Client(name, phoneNumber);

        clientMap.put(client.getId(), client);
    }
}