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
public class Computadora implements ElectronicItems{
    private String procesador;
    private String memRAM;
    private String memROM;

    public Computadora() {
    }

    public Computadora(String procesador, String memRAM, String memROM) {
        this.procesador = procesador;
        this.memRAM = memRAM;
        this.memROM = memROM;
    }

    public String getMemROM() {
        return memROM;
    }

    public void setMemROM(String memROM) {
        this.memROM = memROM;
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
        return "Computadora{" + "procesador=" + procesador + ", memRAM=" + memRAM + ", memROM=" + memROM + '}';
    }    
    
}
