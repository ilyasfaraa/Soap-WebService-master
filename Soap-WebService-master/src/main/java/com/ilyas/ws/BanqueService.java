package com.ilyas.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "conversion")
    public double conversion(@WebParam(name = "montant") double montant) {
        return montant * 1.11;
    }

    @WebMethod(operationName = "getCompte")
    public Compte getCompte(@WebParam(name = "code")  int code) {
        return new Compte(code, Math.random()*1234, new Date());
    }

    @WebMethod(operationName = "listComptes")
    public List<Compte> listComptes() {
        return List.of(new Compte(1, Math.random()*1234, new Date()),
                new Compte(2, Math.random()*1234, new Date()));
    }
}

