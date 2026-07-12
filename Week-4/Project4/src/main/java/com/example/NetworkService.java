package com.example;
public class NetworkService {
    private NetworkClient client;
    public NetworkService(NetworkClient client) {
        this.client = client;
    }
    public String establishConnection() {
        return client.connect();
    }
}