
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
    
    
    /*public static List<Cidade> getCidades(){
        List<Cidade> lista = new ArrayList<>();
        String query = "SELECT id, nome "
                     + " FROM cidades ORDER BY nome ";
        ResultSet rs = Conexao.consultar(query);
        if( rs != null ){
            try {
                while ( rs.next() ) {                    
                    Cidade cid = new Cidade();
                    cid.setId( rs.getInt( 1 ) );
                    cid.setNome( rs.getString( 2 ) );
                    lista.add( cid );
                }
            } catch (Exception e) {
            }
        }
        return lista;
    }*/
    
    public static List<Produto> getProduto(){
        List<Produto> lista = new ArrayList();
        String query = "Select id, nome,tipo,preco FROM produto order by nome";
        ResultSet rs = Conexao.consultar(query);
        if(rs != null){
            try{
                while(rs.next()){
                    Produto pd = new Produto();
                    pd.setId(rs.getInt(1));
                    pd.setNome(rs.getString(2));
                    pd.setTipo(rs.getString(3));
                    pd.setPreco(rs.getDouble(4));
                    lista.add(pd);
                    
                    
                }
            } catch (Exception e){
                
            }
            
        }
        return lista;
    }
    
}
