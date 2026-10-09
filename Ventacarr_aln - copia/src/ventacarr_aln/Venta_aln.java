/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventacarr_aln;

/**
 *
 * @author LABORATORIO
 */
public class Venta_aln {
 
    
    
        public String Fecha;
        public String Folio;
        public String Cliente;
        public String Hora;
        public String Producto;
        public String Preciouni;
        public String Monto;
        public String Vendedor;
        public String Iva;
        public String Subtotal;
        public String Cantidad;
        public String Total;
    

 public Venta_aln ()
{
            
            this.Fecha="00-00";
            this.Folio="";
            this.Cliente="";
            this.Hora="";
            this.Producto="";
            this.Preciouni="";
            this.Monto="";
            this.Vendedor="";
            this.Iva="";
            this.Subtotal="";
            this.Cantidad="";
            this.Total="";
             }


public String getTelefono()
{
        return Fecha;
    
}

public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
}