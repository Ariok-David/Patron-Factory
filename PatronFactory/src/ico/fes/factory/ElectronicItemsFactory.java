/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.factory;

import ico.fes.clases.Computadora;
import ico.fes.clases.Smarthphone;
import ico.fes.clases.Tablet;

/**
 *
 * @author Ariok León
 */
public class ElectronicItemsFactory {
    public static ElectronicItems createElectronicItem(int tipo){
        switch (tipo){
            case ElectronicItems.COMPUTADORA_GAMER:
                return new Computadora("Core i9 10ma Gen", "16GB", "2TB");
                
            case ElectronicItems.COMPUTADORA_GMEDIA:
                return new Computadora("Core i3 8va Gen", "12GB", "1TB");
                
            case ElectronicItems.COMPUTADORA_BASICA:
                return new Computadora("Core Pentium 8va Gen", "8GB", "500GB");
                
            case ElectronicItems.SMARTHPHONE_GAMER:
                return new Smarthphone("SnapDragon 870", "8GB", "AMOLED");
                
            case ElectronicItems.SMARTHPHONE_GMEDIA:
                return new Smarthphone("SnapDragon 620", "6GB", "OLED");
                
            case ElectronicItems.SMARTHPHONE_BASICO:
                return new Smarthphone("SnapDragon 420", "4GB", "LCD");
                
            case ElectronicItems.TABLET_GALTA:
                return new Tablet("SnapDragon 870", "16GB", true);
                
            case ElectronicItems.TABLET_GMEDIA:
                return new Tablet("SnapDragon 620", "8GB", true);
                
            case ElectronicItems.TABLET_GBAJA:
                return new Tablet("SnapDragon 420", "6GB", false);
            default:
                throw new AssertionError();
        }
    }
}
