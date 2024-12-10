/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Cesar
 */
public class CanalSMS extends CanalBase{
    String numero;
    @Override
    public boolean enviarNotificacion() {
        return true;
        //envia por sms
    }
}
