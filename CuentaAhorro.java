/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ismael Flores
 */
public class CuentaAhorro extends CuentaBancaria {
    // Atributo propio del modelo
    private float tasaInteresMensual;

    // Constructor que utiliza super() para la herencia
    public CuentaAhorro(String titular, String numCuenta, float saldoInicial, float tasaInteresMensual) {
        super(titular, numCuenta, saldoInicial);
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public float getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    // Método Lógico 3: Generar un resumen de la cuenta
    public String obtenerResumen() {
        return "Titular: " + getTitular() + "\nCuenta: " + getNumCuenta() + "\nSaldo Actual: $" + getSaldo();
    }

    // Método Lógico 4 (RECURSIVO): Proyección de saldo con interés compuesto
    public float proyectarSaldoRecursivo(int mesesRestantes, float saldoAcumulado) {
        // Caso base: cuando ya no quedan meses por calcular
        if (mesesRestantes == 0) {
            return saldoAcumulado;
        }
        
        // Condición de avance: calculamos el nuevo saldo y restamos un mes
        float nuevoSaldo = saldoAcumulado + (saldoAcumulado * (tasaInteresMensual / 100));
        System.out.println("Proyectando mes " + mesesRestantes + " de vuelta, saldo parcial: " + nuevoSaldo);
        
        return proyectarSaldoRecursivo(mesesRestantes - 1, nuevoSaldo);
    }
}
