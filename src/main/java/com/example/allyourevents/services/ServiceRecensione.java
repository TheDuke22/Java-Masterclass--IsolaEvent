package com.example.allyourevents.services;

import com.example.allyourevents.repositories.RepoCRUDRecensione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ServiceRecensione {
    private RepoCRUDRecensione repoRec;

    public ServiceRecensione(RepoCRUDRecensione repoRec){
        this.repoRec = repoRec;
    }

    public boolean creaRecensione(String titolo, String descrizione, int valutazione, UUID prenotazione){
        return repoRec.creaRecensione(titolo,descrizione,valutazione,prenotazione);
    }
}
