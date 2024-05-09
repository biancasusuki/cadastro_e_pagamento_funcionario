package poo.at4;

public class Vendedor extends Funcionario {
    private double vendas;
    private double salario;

    public Vendedor() {}

    public Vendedor(String nome, String matricula, double salario, double vendas) {
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public double calculaComissao() {
        if (vendas >= 2000 && vendas < 4000) {
            return vendas * 0.1;
        } else if (vendas >= 4000 && vendas < 8000) {
            return vendas * 0.15;
        } else if (vendas >= 8000) {
            return vendas * 0.2;
        } else {
            return 0;
        }
    }

    @Override
    public double calculaPagamento() {
        return getSalario() + calculaComissao();
    }
}

// BIANCA GARCIA SUSUKI