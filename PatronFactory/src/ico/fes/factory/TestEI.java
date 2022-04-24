/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.factory;

import java.util.Scanner;

/**
 *
 * @author Ariok León
 */
public class TestEI {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        System.out.println("¿Que caracteristicas deseas ver?");
        System.out.println(ElectronicItems.COMPUTADORA_GAMER + " Computadora Gamer");
        System.out.println(ElectronicItems.COMPUTADORA_GMEDIA + " Computadora Gama Media");
        System.out.println(ElectronicItems.COMPUTADORA_BASICA + " Computadora Basica");
        System.out.println(ElectronicItems.SMARTHPHONE_GAMER + " Smarthphone Gamer");
        System.out.println(ElectronicItems.SMARTHPHONE_GMEDIA + " Smarthphone Gama media");
        System.out.println(ElectronicItems.SMARTHPHONE_BASICO + " Smarthphone Basico");
        System.out.println(ElectronicItems.TABLET_GALTA + " Tablet Gama alta");
        System.out.println(ElectronicItems.TABLET_GMEDIA + " Tablet Gama media");
        System.out.println(ElectronicItems.TABLET_GBAJA + " Tablet Gama baja");
        try {
            System.out.println("Elije un numero:");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste un numero");
        }
        ElectronicItems item = ElectronicItemsFactory.createElectronicItem(eleccion);
        System.out.println(item.toString());
    }
}
