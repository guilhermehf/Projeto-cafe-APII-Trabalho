
package dao;

import javax.swing.JOptionPane;
import model.Produto;


public class ProdutoDAO {
    
    public static void inserir (Produto produto){
    
//    String query = "INSERT INTO produto ( nome, preco, tipo) VALUES ( " 
//                    + " '" + produto.getNome()  + "' , "  
//                    + "  " + produto.getPreco() + "  , "
//                    + "  '" + produto.getTipo()    + "' ) ";
//        JOptionPane.showMessageDialog(null, query);
//        Conexao.executar(query);
//        
        
    String query =  "INSERT INTO produto (nome, preco, tipo) VALUES ('"+produto.getNome()+"', "+produto.getPreco()+",'"+produto.getTipo()+"')";
    
   // JOptionPane.showMessageDialog(null, query);
    Conexao.executar(query);
    
        
    }
    
    public static void editar(Produto produto){
        
        /*String query = "UPDATE produto SET "
           + " nome =         '" + produto.getNome()           + "' , "
           + " preco =        '" + produto.getPreco()          + "' , "
           + " quantidade =     '" + produto.getQuantidade()                    + "' , "
           + " categoria =  " + produto.categoria()    + "  , "
           + " codCategoria =     " + produto.getCategoria().getId() + "    "
           + " WHERE id = " + produto.getId();
        Conexao.executar(query);*/
        
        String query = "UPDATE produto SET" + "nome = '" + produto.getNome()+ "'," + " preco = '" + produto.getPreco() + "' ," + " tipo = '" + produto.getTipo() + " where id =" + produto.getId();
        
        Conexao.executar(query);
    
    
    }
    
    public static void excluir(int id){
        String query = "DELETE FROM produto "
                     + " WHERE id = " + id;
        Conexao.executar(query);
    }
    
}
