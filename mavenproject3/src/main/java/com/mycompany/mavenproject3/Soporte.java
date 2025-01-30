package com.mycompany.mavenproject3;

public Soporte(String nombre, String apellido, String usuario, String contraseña) {
        super(nombre, apellido, usuario, contraseña);
    }

    public Soporte() {
    }
    
    public boolean resolverIncidente(Usuario usuario){
        return true;
    }
    public boolean derivarProblema(Administrador administrador){
        return true;
    }
}
