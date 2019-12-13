
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pedido;


/**
 *
 * @author guilherme
 */
public class PedidoDAO {
    
     public static int inserir (Pedido pedido){
    
        String query =  "INSERT INTO pedido (data) VALUES ('"+pedido.getData()+"')";
        
        int id = Conexao.executarComRetornoId(query);
     //   JOptionPane.showMessageDialog(null, "id: " + id);
        return id;
        
    }
    
    public static void editar(Pedido pedido){
        
        /*String query = "UPDATE produto SET "
           + " nome =         '" + produto.getNome()           + "' , "
           + " preco =        '" + produto.getPreco()          + "' , "
           + " quantidade =     '" + produto.getQuantidade()                    + "' , "
           + " categoria =  " + produto.categoria()    + "  , "
           + " codCategoria =     " + produto.getCategoria().getId() + "    "
           + " WHERE id = " + produto.getId();
        Conexao.executar(query);*/
        
        String query = "UPDATE pedido SET" + "data = '" + pedido.getData()+ "'," + " preco = '" + " where id =" + pedido.getId();
        
        Conexao.executar(query);
    
    
    }
    
    public static void excluir(int id){
        String query = "DELETE FROM pedido "
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
    
    public static List<Pedido> getPedido(){
        List<Pedido> lista = new ArrayList();
        String query = "Select id, data FROM pedido order by data";
        ResultSet rs = Conexao.consultar(query);
        if(rs != null){
            try{
                while(rs.next()){
                    Pedido pd = new Pedido();
                    pd.setId(rs.getInt(1));
                    pd.setData(rs.getString(2));
                    lista.add(pd);
                    
                    
                }
            } catch (Exception e){
                
            }
            
        }
        return lista;
    }
    
}
