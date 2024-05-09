package poo.at4;

import javax.swing.JOptionPane;

public class Caixa extends Funcionario {
    private double valorHora;
    private double horasTrabalhadas;
    
    public Caixa() {
        
    }
    
    public Caixa(String nome, String matricula, double valorHora, double horasTrabalhadas) {
        super(nome, matricula);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public double getValorHora() {
        return valorHora;
    }
    
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public void acrescentaHoras(double horas) {
        horasTrabalhadas += horas;
    }
    
    @Override
    public double calculaPagamento() {
        return valorHora * horasTrabalhadas;
    }
    
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome
                + "\nMatrícula: " + matricula
                + "\nValor da Hora: " + valorHora
                + "\nHoras Trabalhadas: " + horasTrabalhadas
                + "\nPagamento: R$ " + calculaPagamento());
    }
}

// BIANCA GARCIA SUSUKI