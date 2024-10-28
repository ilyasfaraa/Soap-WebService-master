package com.ilyas;

import com.ilyas.ws.BanqueService;
import jakarta.xml.ws.Endpoint;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8084/banque", new BanqueService());
        System.out.println("Server is running on " + "http://0.0.0.0:8084/banque");
    }
}