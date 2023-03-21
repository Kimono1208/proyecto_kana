/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.kana;

/**
 *
 * @author chang
 */
public class Proveedor {
    private String nombreProveedor1;
    private String telefonoProveedor;
    private String direccionProveedor;

    public Proveedor(String nombreProveedor1, String telefonoProveedor, String direccionProveedor) {
        this.nombreProveedor1 = nombreProveedor1;
        this.telefonoProveedor = telefonoProveedor;
        this.direccionProveedor = direccionProveedor;
    }

    public String NombreProveedor1() {
        return nombreProveedor1;
    }

    public void setNombreProveedor1(String nombreProveedor1) {
        this.nombreProveedor1 = nombreProveedor1;
    }

    public String geTtelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "nombreProveedor=" + nombreProveedor1 + ", telefonoProveedor=" + telefonoProveedor +
                ", direccionProveedor=" +direccionProveedor + '}';
    }
}
