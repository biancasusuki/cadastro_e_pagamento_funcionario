package poo.at4;
import javax.swing.JOptionPane;

public class POOAT4 {

    public static void main(String[] args) {
        Caixa caixa = new Caixa("José da Silva", "123", 15, 30);
        Vendedor vendedor = new Vendedor("Maria Souza", "456", 2000, 5000);

        vendedor.setVendas(7000);
        System.out.println("Comissão do vendedor: " + vendedor.calculaComissao());
        System.out.println("Pagamento do vendedor: " + vendedor.calculaPagamento());

        double horas = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas: "));
        caixa.acrescentaHoras(horas);
        caixa.imprimir();
    }

}

// BIANCA GARCIA SUSUKI
