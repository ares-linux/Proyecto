
package ventacarr_aln;


public class Emplecar_aln {
        private String idemple;
        private String Nombre;
        private String Apellido;
        private String Fecha_nac;
        private String email;
        private String telefono;
        private String foto;

    public Emplecar_aln()
    {
            this.idemple="00-01";
            this.Apellido="Lopez";
            this.Nombre="GAto";
            this.Fecha_nac="2005-11-07";
            this.email="Juanillo.gmaill.com";
            this.telefono="777-777-7777";
            this.foto="C:fotossoft\\empleados\\buss.jpg";
            
    }
public void registrar()
{
 System.out.println("Registrando empleado");
}

    /**
     * @return the idemple
     */
    public String getIdemple() {
        return idemple;
    }

    /**
     * @param idemple the idemple to set
     */
    public void setIdemple(String idemple) {
        this.idemple = idemple;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Fecha_nac
     */
    public String getFecha_nac() {
        return Fecha_nac;
    }

    /**
     * @param Fecha_nac the Fecha_nac to set
     */
    public void setFecha_nac(String Fecha_nac) {
        this.Fecha_nac = Fecha_nac;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }
}
        
    

