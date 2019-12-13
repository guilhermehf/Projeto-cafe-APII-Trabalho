
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Prodpad;

/**
 *
 * @author guilherme
 */
public class ProdpadDAO {
    
    public static void inserir (Prodpad prodpad){

        String query =  "INSERT INTO prodped (codPedido, codProduto, preco, qtd) VALUES ("+prodpad.getCodPedido()+", "+prodpad.getCodProduto()+", "+prodpad.getPreco()+" , "+prodpad.getQtd()+" )";

        Conexao.executar(query); 
    }
    
    public static void editar(Prodpad prodpad){
        
        /*String query = "UPDATE produto SET "
           + " nome =         '" + produto.getNome()           + "' , "
           + " preco =        '" + produto.getPreco()          + "' , "
           + " quantidade =     '" + produto.getQuantidade()                    + "' , "
           + " categoria =  " + produto.categoria()    + "  , "
           + " codCategoria =     " + produto.getCategoria().getId() + "    "
           + " WHERE id = " + produto.getId();
        Conexao.executar(query);*/
        
        String query = "UPDATE prodped SET" + "codPedido = '" + prodpad.getCodPedido()+ "'," + " codProduto = '" + prodpad.getCodProduto() + "' ," + " tipo = '" + prodpad.getPreco() + "qtd = '" + prodpad.getQtd()+ " where id =" + prodpad.getId();
        
        Conexao.executar(query);
    
    
    }
    
    public static void excluir(int id){
        String query = "DELETE FROM prodpad "
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
    
    public static List<Prodpad> getProdpad(){
        List<Prodpad> lista = new ArrayList<>();
        String query = "Select id, codPedido,codProduto,preco,qtd FROM prodpad order by id";
        ResultSet rs = Conexao.consultar(query);
        if(rs != null){
            try{
                while(rs.next()){
                    Prodpad pd = new Prodpad();
                    pd.setId(rs.getInt(1));
                    pd.setCodPedido(rs.getInt(20));
                    pd.setCodProduto(rs.getInt(20));
                    pd.setPreco(rs.getDouble(20));
                    pd.setQtd(rs.getInt(20));
                    lista.add(pd);
                    
                    
                }
            } catch (Exception e){
                
            }
            
        }
        return lista;
    }
    
}
