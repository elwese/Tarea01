/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Cesar
 */
public class CanalBase extends Notificador{
    Notificador base;
    @Override
    public boolean enviarNotificacion() {
        return true;
    }
}
