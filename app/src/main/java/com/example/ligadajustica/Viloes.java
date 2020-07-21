package com.example.ligadajustica;

import com.example.ligadajustica.Membros;

import java.util.Date;

public class Viloes extends Membros {

    private String rival;
    private String esconderijo;
    private Date dataAtaques;

    public String getRival() {
        return rival;
    }

    public void setRival(String rival) {
        this.rival = rival;
    }

    public String getEsconderijo() {
        return esconderijo;
    }

    public void setEsconderijo(String esconderijo) {
        this.esconderijo = esconderijo;
    }

    public Date getDataAtaques() {
        return dataAtaques;
    }

    public void setDataAtaques(Date dataAtaques) {
        this.dataAtaques = dataAtaques;
    }
}
