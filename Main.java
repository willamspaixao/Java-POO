import javax.swing.*;
import java.util.ArrayList;
public class Main {


    public static void buscaConta(String numero, ArrayList<Conta> contas)
    {
        for (int i = 0; i < contas.size(); i++) {
            Conta temp = contas.get(i);
            if (temp.getNumero().equals(numero)){
                System.out.print("\nConta número "+numero+" localizada");
                temp.mostrarDados();
                return;
            }
        }
        System.out.println("Conta não localizada");
    }

    public static void main(String[] args)
    {
       ArrayList<Conta> contas = new ArrayList<>();

        Conta conta1 = new Conta("12.345-6",100);
        Conta conta2 = new Conta("78.910-1",200);
        ContaPoupanca conta3 = new ContaPoupanca("52.6633-1",1000);
        ContaPoupanca conta4 = new ContaPoupanca("33.123-1",1500);
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        contas.add(conta4);

        for (int i = 0; i < contas.size(); i++) {
            Conta contaTemp = contas.get(i);
            if(contaTemp instanceof ContaPoupanca)
            {
                ((ContaPoupanca) contaTemp).renderJuros(5);
               // contas.set(i,contaTemp);
               // contas.get(i).mostrarDados();
                contaTemp.mostrarDados();
            }
        }
       String a = JOptionPane.showInputDialog("Insira o número da conta: a ser pesquisada ");
        //int numero = (Integer.parseInt(JOptionPane.showInputDialog("Insira algo da conta: ")));
         buscaConta(a, contas);

        System.out.println(conta3.getSaldo());
       // ContaCorrente cc= new ContaCorrente("12.345-6",100);
       //cc.creditar(200.00);
       //cc.debitar(100.00);
       //System.out.println("Saldo: "+cc.getSaldo());

    }
}