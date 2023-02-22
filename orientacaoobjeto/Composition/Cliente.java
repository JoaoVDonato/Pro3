package orientacaoobjeto.Composition;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;
    Cliente(String nome) {
        this.nome = nome;
    }

    List<Compra> compras = new ArrayList<>();

    double obterValorTotal() {
        double total = 0;
        for(Compra compra: compras) {
            total += compra.obterValorTotal();
        }
        return total;
    }


    
}
