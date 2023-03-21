/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.kana;

/**
 *
 * @author chang
 */
public class inventario {
    private String nombreProducto;
    private String descripcionProducto;
    double precioProducto;
    int cantidadProducto;
    private String nombreProveedor;
    private String fechaIngreso;
    public inventario(String nombreProducto, String descripcionProducto, double precioProducto
            ,int cantidadProducto, String nombreProveedor, String fechaIngreso) {
        this.nombreProducto = nombreProducto;
        this. descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
        this.nombreProveedor = nombreProveedor;
        this.fechaIngreso = fechaIngreso;
    }
     public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
     public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProdructo) {
        this.descripcionProducto = descripcionProdructo;
    }
     public double getPrecioProducto() {
        return (double) precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
      public int getCantidadProducto() {
        return (int) cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
     public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
     public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", descripcionProducto=" + descripcionProducto +
                ", precioProducto=" + precioProducto +", cantidadProducto=" + cantidadProducto +", nombreProveedor=" + nombreProveedor +
                ", fechaIngreso=" + fechaIngreso ;
    }
}
