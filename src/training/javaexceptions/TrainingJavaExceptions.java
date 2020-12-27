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
public class TrainingJavaExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Product camisa = new Product();
            camisa.setDescricao("Camisa Polo");
            camisa.setPreco(30.0);

            Product bone = new Product();
            bone.setDescricao("Boné Infantil");
            bone.setPreco(21.0);

            Sell venda = new Sell();
            venda.adicionar(camisa);
            venda.adicionar(bone);

            System.out.println("Total da venda: " + venda.getTotal());
        } catch (SellException e) {
            System.out.println("Erro ao processar total: "
                    + e.getMessage()
                    + " - Codigo: "
                    + e.getCodigo()
            );
        } catch (RuntimeException e) {
            System.out.println("Erro em tempo de execução: " + e.getMessage());
        } finally {
            System.out.println("Processamento encerrado");
        }
    }
    
}
