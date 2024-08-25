package lista3_6;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lista3_6 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        int distancia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a distância do frete: "));
        while(distancia < 0){
            distancia = Integer.parseInt(JOptionPane.showInputDialog(null, "Distancia inválida, digite novamente: "));
        }
        float valor = Float.parseFloat (JOptionPane.showInputDialog(null, "Digite o valor da encomenda"));
        if(distancia >= 0 && distancia <= 100){
            valor *= 0.2;
        } else if(distancia >= 101 && distancia <= 300){
            valor *= 0.17;
        } else if(distancia >= 301 && distancia <= 500){
            valor *= 0.15;
        } else if(distancia >= 501 && distancia <= 1000){
            valor *= 0.13;
        } else if(distancia > 1000){
            valor *= 0.1;
        }
        JOptionPane.showMessageDialog(null, "O valor do frete é R$" + df.format(valor));
    }    
}
