package com.example.demo.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VoitureTest {

    @Test
    void creerVoitureAvecConstructeurVide() {
        Voiture v = new Voiture();
        assertEquals(0, v.getPrix());
        assertNull(v.getMarque());
    }

    @Test
    void creerVoitureAvecMarqueEtPrix() {
        Voiture v = new Voiture("Renault", 15000);
        assertEquals("Renault", v.getMarque());
        assertEquals(15000, v.getPrix());
    }

    @Test
    void modifierMarque() {
        Voiture v = new Voiture("Peugeot", 10000);
        v.setMarque("Toyota");
        assertEquals("Toyota", v.getMarque());
    }

    @Test
    void modifierPrix() {
        Voiture v = new Voiture("BMW", 30000);
        v.setPrix(25000);
        assertEquals(25000, v.getPrix());
    }

    @Test
    void modifierId() {
        Voiture v = new Voiture();
        v.setId(42);
        assertEquals(42, v.getId());
    }

    @Test
    void toStringContientMarqueEtPrix() {
        Voiture v = new Voiture("Ferrari", 200000);
        v.setId(1);
        String s = v.toString();
        assertTrue(s.contains("Ferrari"));
        assertTrue(s.contains("200000"));
    }
}
