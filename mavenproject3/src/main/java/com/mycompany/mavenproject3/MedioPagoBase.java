package com.mycompany.mavenproject3;

public class MedioPagoBase {
    protected String identificador;

    public MedioPagoBase(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }
}
