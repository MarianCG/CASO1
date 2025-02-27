/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresanacional;

import javax.swing.JOptionPane;

/**
 *@param1 CantidadDatos 
 * @author maria
 */
public class Empleado {

    private String NombreCliente = " ";
    private float CedulaCliente = 0;
    private float CodigoFactura = 0;
    private float MontoFactura = 0;
    private String Mes = " ";
    private int opcion = 0;

    public Empleado() {

    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public float getCedulaCliente() {
        return CedulaCliente;
    }

    public void setCedulaCliente(float CedulaCliente) {
        this.CedulaCliente = CedulaCliente;
    }

    public float getCodigoFactura() {
        return CodigoFactura;
    }

    public void setCodigoFactura(float CodigoFactura) {
        this.CodigoFactura = CodigoFactura;
    }

    public float getMontoFactura() {
        return MontoFactura;
    }

    public void setMontoFactura(float MontoFactura) {
        this.MontoFactura = MontoFactura;
    }

    public String SolicitarDatos() {
        StringBuilder sb = new StringBuilder();
        NombreCliente = JOptionPane.showInputDialog("Favor ingrese el nombre del cliente");
        CedulaCliente = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cedula del cliente"));
        CodigoFactura = Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo de la factura"));
        MontoFactura = Integer.parseInt(JOptionPane.showInputDialog("ingrese el monto de la factura"));
        Mes = JOptionPane.showInputDialog("ingrese el mes de la factura");
        return sb.toString();
    }

    public String MostrarDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append(NombreCliente + "\n" + CedulaCliente + "\n" + CodigoFactura + "\n" + MontoFactura + "\n" + Mes);
        return sb.toString();
    }
}





    
    

   
    
    

