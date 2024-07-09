/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Cuenta {
    private double saldo;
    private int numeroConsignaciones;
    private int numeroRetiros;
    private double tasaAnual;
    private double comisionMensual;

    public Cuenta() {
    }

    public Cuenta(double saldo, int numeroConsignaciones, int numeroRetiros, double tasaAnual, double comisionMensual) {
        this.saldo = saldo;
        this.numeroConsignaciones = numeroConsignaciones;
        this.numeroRetiros = numeroRetiros;
        this.tasaAnual = tasaAnual;
        this.comisionMensual = comisionMensual;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConsignaciones() {
        return numeroConsignaciones;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numeroConsignaciones = numeroConsignaciones;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

    public double getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(double tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public double getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(double comisionMensual) {
        this.comisionMensual = comisionMensual;
    }
     public void imprimir(){
             System.out.println("DATOS CUENTA BANCARIA\n"+
                     "Saldo:"+getSaldo()+"\n"+
                     "Numero de Deposito:"+getNumeroRetiros()+"\n"+
                     "Numero de Comisiones:"+getNumeroConsignaciones()+"\n"+
                     "Numero de Retiros:"+getNumeroRetiros()+"\n"+
                     "Tasa Interes Anual:"+getTasaAnual()+"\n"+
                     "Comision Anual:"+getComisionMensual());
     }
        public void deposito(double valorDepositar){
             setSaldo(getSaldo()+valorDepositar);
             setNumeroConsignaciones(getNumeroConsignaciones()+1);
         }
        public void retiro(double valorRetirar){
            if (valorRetirar>getSaldo()){
                System.out.println("Los fondos son insificientes" 
                        + "para rea;izar el retiro");
            }else{
                setSaldo(getSaldo()-valorRetirar);
                setNumeroRetiros(getNumeroRetiros()+1);
            }
        }
}