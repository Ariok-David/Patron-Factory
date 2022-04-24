/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.clases;

import ico.fes.factory.ElectronicItems;

/**
 *
 * @author Ariok León
 */
public class Smarthphone implements ElectronicItems{
    private String procesador;
    private String memRAM;
    private String tipoPantalla;

    public Smarthphone() {
    }

    public Smarthphone(String procesador, String memRAM, String tipoPantalla) {
        this.procesador = procesador;
        this.memRAM = memRAM;
        this.tipoPantalla = tipoPantalla;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemRAM() {
        return memRAM;
    }

    public void setMemRAM(String memRAM) {
        this.memRAM = memRAM;
    }

    @Override
    public String toString() {
        return "Smarthphone{" + "procesador=" + procesador + ", memRAM=" + memRAM + ", tipoPantalla=" + tipoPantalla + '}';
    }
    
}
