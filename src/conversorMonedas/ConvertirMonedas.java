package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {


    public void ConvertirPesosADolares(double valor) {
        double monedaDolar = valor / 548.00;
        monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
    }

    public void ConvertirPesosAEuros(double valor) {
        double monedaEuro = valor / 297.51;
        monedaEuro = (double) Math.round(monedaEuro *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
    }

    public void ConvertirPesosALibras(double valor) {
        double monedaLibra = valor / 349.45;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
    }

    public void ConvertirPesosAYen(double valor) {
        double monedaYen = valor / 1.9631;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yuanes");
    }

    public void ConvertirPesosAWon(double valor) {
        double monedaWon = valor / 3.04;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
    }
}