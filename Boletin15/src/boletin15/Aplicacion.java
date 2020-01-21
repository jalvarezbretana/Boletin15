/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import notaprimertrimestre.NotaMedia;
import persoal.Persoal;

/**
 *
 * @author jalvarezbretana
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persoal alu = new Persoal("612345678", "juan@gmail.com");
        NotaMedia nota1 = new NotaMedia();
        float nota = (nota1.calcularNotaMedia());
        Academica aca1 = new Academica("Juan", nota, alu);

        System.out.println(aca1.toString());
    }

}
