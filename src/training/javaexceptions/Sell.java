/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.javaexceptions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jptru
 */
public class Sell {
    List<Product> itens = new ArrayList<>();

    public void adicionar(Product item) {
        if (item == null) {
            throw new IllegalArgumentException("Item não pode ser nulo");
        }

        itens.add(item);
    }

    public double getTotal() {
        double total = 0;

        for (Product item : itens) {
            total += item.getPreco();
        }

        return total;
    }
}
