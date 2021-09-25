package Banco;

import javax.swing.JOptionPane;
import Banco.Cajero;
import Banco.Cliente;

public class MainReto3 {

    public static void main(String[] args) {
        int nCuenta, sexo, antiguedad;
        String tipoCuenta = null, opcion, numeroDocumento, nombre, direccion, telefono, fechaIngreso;
        double saldo, monto, cantidad, salario;
        CuentaReto3 c1 = new CuentaReto3();

        do {
            opcion = JOptionPane.showInputDialog("Seleccione una opción:\n"
                    + "1. Crea Cajero \n"
                    + "2. Crear Cliente \n"
                    + "3. Crear cuenta \n"
                    + "4. Consignar \n"
                    + "5. Mostrar cuenta \n"
                    + "6. retirar \n"
                    + "7. Mostrar saldo \n"
                    + "8. Salir");

            switch (opcion) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Crear cajero");
                    numeroDocumento = JOptionPane.showInputDialog("Ingrese su numero de identificación");
                    nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                    direccion = JOptionPane.showInputDialog("Ingrese su dirección completa");
                    telefono = JOptionPane.showInputDialog("Ingrese su numero telefónico");
                    fechaIngreso = JOptionPane.showInputDialog("Ingrese su fecha de Ingreso a la empresa: AA/MM/DD");
                    salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario asignado"));
                    Cajero cj = new Cajero(fechaIngreso, salario, numeroDocumento, nombre, direccion, telefono);

                    cj.Mostrar();//abstract
                    cj.Atender();//abstract
                    cj.Despachar();
                    cj.Agradecer();//polimorfismo
                    cj.ReportarVentas();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Crear cliente");
                    numeroDocumento = JOptionPane.showInputDialog("Ingrese su numero de identificación");
                    nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                    direccion = JOptionPane.showInputDialog("Ingrese su dirección completa");
                    telefono = JOptionPane.showInputDialog("Ingrese su numero telefónico");
                    antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese años de antigüedad con el banco"));

                    while (true) {
                        sexo = Integer.parseInt(JOptionPane.showInputDialog("seleccione un numero, segun su sexo: \n"
                                + "1. Masculino \n"
                                + "2. Femenino"));
                        break;
                    }
                    Cliente clt = new Cliente(antiguedad, sexo, numeroDocumento, nombre, direccion, telefono);
                    clt.Mostrar();//abstract
                    clt.Atender();//abstract
                    clt.Activar();
                    clt.Agradecer();//polimorfismo
                    clt.Calificar();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Crear cuenta");
                    while (true) {
                        tipoCuenta = JOptionPane.showInputDialog("Ingrese el tipo de cuenta Ahorros/Corriente");
                        if (tipoCuenta.equals("Ahorros") || tipoCuenta.equals("Corriente")) {
                            break;
                        }
                    }
                    nCuenta = (int) (Math.random() * 10000000 + 1);
                    System.out.println(nCuenta);
                    saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad con la que va a abrir su cuenta: "));
                    c1 = new CuentaReto3(nCuenta, tipoCuenta, saldo);
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Consignar");
                    nCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la cuenta"));
                    if (nCuenta == c1.getnumeroCuenta()) {
                        cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a consignar: "));
                        c1.Consignar(cantidad);
                    } else {
                        JOptionPane.showMessageDialog(null, "La cuenta no existe ...");
                    }
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Mostrar cuenta");
                    nCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la cuenta"));
                    if (nCuenta == c1.getnumeroCuenta()) {
                        c1.MostrarCuenta();
                    } else {
                        JOptionPane.showMessageDialog(null, "La cuenta no existe ...");
                    }
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Retirar");
                    nCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la cuenta"));
                    if (nCuenta == c1.getnumeroCuenta()) {
                        monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar:"));
                        c1.Retirar(monto);
                    } else {
                        JOptionPane.showMessageDialog(null, "La cuenta no existe ...");
                    }
                    break;
                case "7":
                    JOptionPane.showMessageDialog(null, "Mostrar saldo");
                    nCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la cuenta"));
                    if (nCuenta == c1.getnumeroCuenta()) {
                        c1.MostrarSaldo();
                    } else {
                        JOptionPane.showMessageDialog(null, "La cuenta no existe...");
                    }
                    break;
                case "8":
                    JOptionPane.showMessageDialog(null, "Salir del Programa!!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opción no válida ...");
                    break;
            }
        } while (!opcion.equals("8"));

    }
}
