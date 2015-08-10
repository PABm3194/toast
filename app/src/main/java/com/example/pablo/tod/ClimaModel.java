package com.example.pablo.tod;

import java.io.Serializable;

/**
 * Created by Salvador on 27/05/2015.
 */
public class ClimaModel implements Serializable {
    private String dia;
    private String temperatura;
    private String clima;



    public ClimaModel(String dia, String temperatura, String clima) {
        this.dia = dia;
        this.temperatura = temperatura;
        this.clima = clima;

    }

    public ClimaModel() {
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }


}
