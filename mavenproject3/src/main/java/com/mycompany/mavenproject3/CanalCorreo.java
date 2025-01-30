package com.mycompany.mavenproject3;

package com.mycompany.mavenproject3;

public class CanalCorreo extends CanalBase{
    private String direccion;
    
    @Override
    public boolean enviarNotificacion() {
        System.out.println("Enviando notificacion por Correo.....");
        return true;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
