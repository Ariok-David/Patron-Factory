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
public class Tablet implements ElectronicItems{
    private String procesador;
    private String memRAM;
    private Boolean escrituraTactil;

    public Tablet() {
    }

    public Tablet(String procesador, String memRAM, Boolean escrituraTactil) {
        this.procesador = procesador;
        this.memRAM = memRAM;
        this.escrituraTactil = escrituraTactil;
    }

    public Boolean getEscrituraTactil() {
        return escrituraTactil;
    }

    public void setEscrituraTactil(Boolean escrituraTactil) {
        this.escrituraTactil = escrituraTactil;
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
        return "Tablet{" + "procesador=" + procesador + ", memRAM=" + memRAM + ", escrituraTactil=" + escrituraTactil + '}';
    }
    
}
