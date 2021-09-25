package Banco;

import javax.swing.JOptionPane;

public class CuentaReto3 {

    private int numeroCuenta;
    private String tipoCuenta;
    private double saldo;

    public int getnumeroCuenta() {
        return numeroCuenta;
    }

    public void setnumeroCuenta(int nCuenta) {
        this.numeroCuenta = nCuenta;
    }

    public String getTipo() {
        return tipoCuenta;
    }

    public void setTipo(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CuentaReto3() {
    }

    public CuentaReto3(int nCuenta, String tipoCuenta, double saldo) {
        this.numeroCuenta = nCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }
//metodos
    public void MostrarCuenta() {
        JOptionPane.showMessageDialog(null, "Datos de la cuenta: \n"
                + "Número de cuenta:" + numeroCuenta
                + "\nTipo de cuenta: " + tipoCuenta
                + "\nSaldo de la cuenta:" + saldo);
    }

    public void Consignar(double cantidad) {
        double original = getSaldo();
         if (cantidad<0) {
            JOptionPane.showMessageDialog(null, "cantidad insuficiente");
        } else {
            original += cantidad;
            setSaldo(original);
        }
    }

   public void Retirar(double monto){
        double original = getSaldo();
        if (monto > saldo) {
            JOptionPane.showMessageDialog(null, "fondos insuficientes");
        } else {
            original -= monto;
            setSaldo(original);
        }
    }

    public void MostrarSaldo() {
        JOptionPane.showMessageDialog(null, "Su Saldo es: " + saldo);
    }
}
