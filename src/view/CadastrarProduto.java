/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ProdutoDAO;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author guilherme
 */
public class CadastrarProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarProduto
     */
    public CadastrarProduto() {
        initComponents();
        
    }
    
    public void esconder(){
        txtNome.setVisible(false);
        txtPreco.setVisible(false);
        txtTipo.setVisible(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastrar Produto");

        texto.setText("Nome:");

        jLabel2.setText("Tipo:");

        jLabel3.setText("Preço:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipo)
                            .addComponent(txtPreco)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       /* String erro = "";
        String nome = txtNome.getText();
        
        if( nome.isEmpty() ){
            erro += "Nome\n";
        }
        
        String tipo = "";
        String tipo = txtTipo.getText();
        
            if(tipo.isEmpty()  ){
                erro += "tipo\n";
            }
        
        
        Double preco = "";
        Double preco = txtPreco.getText();
        
        if(preco.isEmpty){
            erro += "preco\n";
        }
        
        if( ! erro.isEmpty() ){
            JOptionPane.showMessageDialog(this, 
                "Você esqueceu de preencher os seguintes campos\n"
                + erro );
            
            
        }else{
            
           // Cliente cli = new Cliente();
            
            if( rbPF.isSelected() ){
                CadastrarProduto cp = new CadastrarProduto();
                cp.setNome( txtNome.getText());
                cp.setTipo( txtTipo.getText());
                cp.setPreco( txtPreco.getText());
                
                ProdutoDAO.inserir( cp );
            }
            limpar();    
            
       
}
        
         private void limpar(){
        txtNome.setText("");
        txtTipo.setText("");
        txtPreco.setText("");
        esconder();
    }*/
       /*
       // Cliente cli = new Cliente();
            
            if( rbPF.isSelected() ){
                ClientePF pf = new ClientePF();
                pf.setNome( nome );
                pf.setCidade( cid );
                pf.setEmail( txtEmail.getText() );
                pf.setReceberEmail( cbReceberEmail.isSelected() );
                pf.setCpf( cpf_cnpj );
                pf.setTipo( Cliente.PESSOA_FISICA );
                ClienteDAO.inserir( pf );
            }else{
                ClientePJ pj = new ClientePJ();
                pj.setNome( nome );
                pj.setCidade( cid );
                pj.setEmail( txtEmail.getText() );
                pj.setReceberEmail( cbReceberEmail.isSelected() );
                pj.setCnpj( cpf_cnpj );
                pj.setTipo( Cliente.PESSOA_JURIDICA);
                ClienteDAO.inserir( pj );
            }
            limpar();
        }
    }                                         

    private void limpar(){
        txtNome.setText("");
        txtEmail.setText("");
        txtCPF.setText("");
        txtCNPJ.setText("");
        cmbCidade.setSelectedIndex( 0 );
        cbReceberEmail.setSelected( false );
        buttonGroupTipo.clearSelection();
        esconder();
    }  */
       
       //CadastrarProduto pro = new CadastrarProduto();
        Produto pro = new Produto();
       
       
       pro.setNome(txtNome.getText());
       pro.setTipo(txtTipo.getText());
       pro.setPreco(Double.valueOf(txtPreco.getText()));
       ProdutoDAO.inserir(pro);
       this.dispose();
       
       
       /*String nome = txtNome.getText();
        if( nome.isEmpty() ){
            JOptionPane.showMessageDialog(this, 
                    "Você deve preencher o nome!");
        }else{
            Cidade cid = new Cidade();
            cid.setNome( nome );
            CidadeDAO.inserir( cid );
            txtNome.setText("");
        }
    }                                         
*/
       
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel texto;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
