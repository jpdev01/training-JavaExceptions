/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.javaexceptions;

/**
 *
 * @author jptru
 */
public class SellException extends RuntimeException{
    private int codigo;

    public SellException(int codigo, String message) {
        super(message);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
