/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.kana;
import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Alumnos UTJCCD
 */
public class ProyectoKana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado  = new Scanner(System.in);
     Scanner sc = new Scanner(System.in);
    ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<inventario> inventarios = new ArrayList<>();
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        // TODO code application logic here
    int opcion=-1;
    final String USUARIO = "Dulcev";
    final String CONTRASEÑA = "Dulcev1";
    String usu, contra;
    do{
        System.out.println("Bienvenido");
        System.out.println("Introduzca usuario");
        usu = teclado.next();
        System.out.println("Introduzca contraseña");
        contra = teclado.next();
        if (!usu.equals(USUARIO)|| !contra.equals(CONTRASEÑA)) {
            System.out.println("usuario y/o contraseña incorectos");
        }
    }while (!(usu.equals(USUARIO) && contra.equals(CONTRASEÑA)));            
             
    do{
       System.out.println("Bienvenido "+ USUARIO);
       System.out.println("Elige una opción:\n1) Registrar cliente\n2) Registrar producto en inventario\n3) Registrar proveedor\n4) Ver lista\n0) Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del cliente: ");
                    String nombreCliente = sc.nextLine();
                    System.out.println("Ingrese el teléfono del cliente: ");
                    String telefonoCliente = teclado.next();
                    System.out.println("Ingrese la dirección del cliente: ");
                    String direccionCliente = sc.nextLine();
                    clientes.add(new Cliente(nombreCliente, telefonoCliente, direccionCliente));
                    System.out.println("¡Cliente registrado exitosamente!\n");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombreProducto = sc.nextLine();
                    System.out.println("Ingrese la descripción del producto: ");
                    String descripcionProducto = sc.nextLine();
                    System.out.println("Ingrese el precio del producto: ");
                    double precioProducto = teclado.nextDouble();
                    System.out.println("Ingrese la cantidad del producto: ");
                    int cantidadProducto = teclado.nextInt();
                    System.out.println("Ingrese el nombre del proveedor: ");
                    String nombreProveedor = sc.nextLine();
                    System.out.println("Ingrese la fecha de ingreso (DD/MM/YYYY): ");
                    String fechaIngreso = teclado.next();
                    inventarios.add(new inventario (nombreProducto, descripcionProducto, precioProducto, cantidadProducto, nombreProveedor, fechaIngreso));
                    System.out.println("¡Producto registrado exitosamente!\n");
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del proveedor: ");
                    String nombreProveedor1 = sc.nextLine();
                    System.out.println("Ingrese el teléfono del proveedor: ");
                    String telefonoProveedor = teclado.next();
                    System.out.println("Ingrese la dirección del proveedor: ");
                    String direccionProveedor = sc.nextLine();
                    proveedores.add(new Proveedor (nombreProveedor1, telefonoProveedor, direccionProveedor));
                    System.out.println("¡Proveedor registrado exitosamente!\n");
                    break;
                case 4:
                    System.out.println("\n---- Clientes ----");
                    for (Cliente c : clientes) {
                        System.out.println(c.toString());
                    }
                    System.out.println("\n---- Inventarios ----");
                    for (inventario i : inventarios) {
                        System.out.println(i.toString());
                    }
                    System.out.println("\n---- Proveedores ----");
                    for (Proveedor p : proveedores) {
                        System.out.println(p.toString());
                    }
                    break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 0);
    }
}
    
       
   
   
   
   
   
   
   
   
    