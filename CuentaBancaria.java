/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Actividad 2: Implementación de TDA en Java
 * @author Ismael Flores
 */
public class CuentaBancaria {
    //Atributos encapsulados
    private String numCuenta;
    private String titular;
    protected float saldo; // Protected para que la clase hija pueda acceder o modificar si es necesario

    //Constructor con validaciones
    public CuentaBancaria(String titular, String numCuenta, float saldoInicial) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        // Validación del saldo
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0.0f;
        }
    }

    // Métodos de acceso get
    public String getTitular() {
        return titular;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    
    // Método Depositar
    public boolean depositar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            return true;
        }
        return false;
    }

    // Método Retirar
    public boolean retirar(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}
