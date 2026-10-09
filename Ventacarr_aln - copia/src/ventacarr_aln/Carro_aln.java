/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventacarr_aln;

/**
 *
 * @author LABORATORIO
 */
public class Carro_aln {
   
        private String Nserie;
        private String marca;
        private String modelo;
        private String año;
        private String precio;
        private String foto;

    public Carro_aln(){
    this.Nserie="000000000000000";
    this.año="2008";
    this.modelo="Del año del caldo";
    this.marca="HONDA";
    this.precio="CINCUENTA MIL PESOS";
    this.foto="C:\\buss.jpg";
}
    public void registrar()
{
 System.out.println("Registrando empleado");
}

    /**
     * @return the idemple
     */
    public String getIdemple() {
        return Nserie;
    }
}
