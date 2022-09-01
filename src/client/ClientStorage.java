package client;

import java.util.HashMap;

public class ClientStorage {
    private static HashMap<String, Client> clientMap = ClientGenerator.generateMap();

    public static HashMap<String, Client> getData() {
        return clientMap;
    }

    public static Client getById(String id) throws Exception {
        Client client = clientMap.get(id);

        if (client == null) {
            throw new Exception("Client with id " + id + " not found.");
        }

        return client;
    }
}