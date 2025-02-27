/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresanacional;

import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class EmpresaNacional {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Empleado empleado = new Empleado();

        int i = 0;
        int CantidadFacturas = 0;
        CantidadFacturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la catidad de Facturas"));
        for (i = 0; i <= CantidadFacturas; i++) {
            JOptionPane.showInputDialog(empleado.SolicitarDatos());

        }
        JOptionPane.showInputDialog(empleado.MostrarDatos());

    }

    
     
     
    
}
