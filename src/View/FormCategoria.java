/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import utilitarios.AceitaNumerosPonto;
import utilitarios.AceitaStrings;
import Model.Categoria;
import utilitarios.LimitarLetras;
import utilitarios.LimitarNumeros;
import Controller.CategoriaDAO;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Strong
 */
public class FormCategoria extends javax.swing.JFrame {

    private CategoriaDAO categoriaDAO;

    private void preencheTabela() {
        ArrayList<Categoria> categoria = new ArrayList<Categoria>();
        categoria = this.categoriaDAO.getCategoriasByCod();
        //Categoria[] categorias = this.categoriaDAO.getCategoriasByCod();
        DefaultTableModel tabela = (DefaultTableModel) tblCategoria.getModel();
        tabela.setNumRows(0);

        // for (int i = 0; i < categorias.length; i++) {
        for (Categoria c : categoria) 
        {
            if (c != null) 
            {
                Object[] obj = new Object[]{
                    c.getCodCategoria(),
                    c.getTipoCategoria()
                };
                tabela.addRow(obj);
            }
        }
        /*if (categorias[i] != null) {
         Object[] obj = new Object[]{
         categorias[i].getCodCategoria(),
         categorias[i].getTipo()
         };
         tabela.addRow(obj);
         }*/

    }

    public FormCategoria() {
        initComponents();
        this.categoriaDAO = new CategoriaDAO();
        preencheTabela();

        txtCod.setDocument(new AceitaNumerosPonto());
        txtCod.setDocument(new LimitarNumeros(6));
        txtTipo.setDocument(new AceitaStrings());
        txtTipo.setDocument(new LimitarLetras(25));
        txtPesquisar.setDocument(new AceitaStrings());
        txtPesquisar.setDocument(new LimitarLetras(25));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoOrdenar = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategoria = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblCod = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rbCodigo = new javax.swing.JRadioButton();
        rbTipo = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lblTipoP = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".: Cadastro de Categorias :.");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblCategoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCategoria.getTableHeader().setReorderingAllowed(false);
        tblCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategoria);
        if (tblCategoria.getColumnModel().getColumnCount() > 0) {
            tblCategoria.getColumnModel().getColumn(0).setResizable(false);
            tblCategoria.getColumnModel().getColumn(1).setResizable(false);
        }

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Categorias"));

        lblCod.setText("* Código:");

        txtCod.setEditable(false);
        txtCod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodFocusLost(evt);
            }
        });

        lblTipo.setText("* Tipo:");

        txtTipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTipoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTipoFocusLost(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Save.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Add.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Edit.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Trash.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordenar por:"));

        rbCodigo.setText("Código");
        rbCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbCodigoMouseClicked(evt);
            }
        });

        rbTipo.setText("Tipo");
        rbTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbTipoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbCodigo)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbTipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(rbTipo))
        );

        jLayeredPane1.setLayer(lblCod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtCod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCod)
                            .addComponent(lblTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCod)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
        );

        jPanel3.getAccessibleContext().setAccessibleName("Ordenar por");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTipoP.setText("Tipo:");

        txtPesquisar.setBackground(new java.awt.Color(255, 255, 204));
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        btnPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnPesquisarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblTipoP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar)
                .addGap(225, 225, 225))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoP)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int opcao = 0;

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    if (txtTipo.getText().equals(""))
    {
        JOptionPane.showMessageDialog(null, "É necessário preencher o tipo da categoria ! ","ATENÇÃO",JOptionPane.INFORMATION_MESSAGE);
        txtTipo.setBackground(java.awt.Color.RED);
        txtTipo.requestFocus();
    }
    else
    {
        if (opcao == 1) 
        {
            Categoria cat = new Categoria();

            cat.setCodCategoria(Integer.parseInt(txtCod.getText()));
            cat.setTipoCategoria(txtTipo.getText().toUpperCase());
                    
            if (this.categoriaDAO.inserir(cat) == true)
            {
                String cod = txtCod.getText();                               
                String tipo = txtTipo.getText();
                JOptionPane.showMessageDialog(null, "Categoria " + txtTipo.getText() + " adicionada com sucesso!");
                
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Erro ao adicionar categoria!");
            }
        } 
        else if (opcao == 2) 
        {
            Categoria cat = new Categoria();
            cat.setCodCategoria(Integer.parseInt(txtCod.getText()));
            cat.setTipoCategoria(txtTipo.getText().toUpperCase());

            if (this.categoriaDAO.editar(cat) == true) 
            {
                JOptionPane.showMessageDialog(null, "Categoria modificada com sucesso!");
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Erro ao modificar categoria!");
            }
        }
        preencheTabela();
        Limpar();
        Desabilitar();
        btnNovo.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnSalvar.setEnabled(false);
        lblTipoP.setEnabled(true);
        txtPesquisar.setEnabled(true);
        btnPesquisar.setEnabled(true);
    }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
// TODO add your handling code here:
        opcao = 1;
        CategoriaDAO catDAO = new CategoriaDAO();
        
        lblTipoP.setEnabled(false);
        txtPesquisar.setEnabled(false);
        btnPesquisar.setEnabled(false);
        txtCod.setText(String.valueOf(catDAO.AutoIncCod()));

        Habilitar();

        btnNovo.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        opcao = 2;

        lblTipoP.setEnabled(false);
        txtPesquisar.setEnabled(false);
        btnPesquisar.setEnabled(false);

        Habilitar();

        btnNovo.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        Categoria cat = new Categoria();
        cat.setCodCategoria(Integer.parseInt(txtCod.getText()));

        int dialogButton = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir a categoria selecionada ?", "Warning", 0);// 0 = botão Sim e Não

        if (dialogButton == JOptionPane.YES_OPTION) {
            if (this.categoriaDAO.excluir(cat) == true) {
                JOptionPane.showMessageDialog(null, "Categoria excluida!");
                Limpar();
                Desabilitar();
                btnNovo.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnSalvar.setEnabled(false);

                preencheTabela();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao excluir categoria!");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        lblTipoP.setEnabled(true);
        txtPesquisar.setEnabled(true);
        txtPesquisar.setText("");
        btnPesquisar.setEnabled(true);
        Limpar();
        btnNovo.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnSalvar.setEnabled(false);
        Desabilitar();
        txtPesquisar.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        lblTipoP.setEnabled(true);
        txtPesquisar.setEnabled(true);
        txtPesquisar.requestFocus();
        btnPesquisar.setEnabled(true);

        Desabilitar();

        btnNovo.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnSalvar.setEnabled(false);

        txtCod.setBackground(java.awt.Color.white);

        grupoOrdenar.add(rbCodigo);
        grupoOrdenar.add(rbTipo);

        rbCodigo.setSelected(true);// inicia selecionado
        txtPesquisar.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        lblTipoP.setEnabled(false);
        txtPesquisar.setEnabled(false);
        btnPesquisar.setEnabled(false);
        Habilitar();
        btnNovo.setEnabled(false);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(false);

        String tipocategoria = String.valueOf(txtPesquisar.getText());
        Categoria cat = this.categoriaDAO.getCategoriaByTipo(tipocategoria);

        try {
            if (cat == null) {
                JOptionPane.showMessageDialog(null, "Categoria não encontrada!");

                lblTipoP.setEnabled(true);
                txtPesquisar.setEnabled(true);
                btnPesquisar.setEnabled(true);
                Desabilitar();
                btnNovo.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnSalvar.setEnabled(false);

                txtPesquisar.setText("");
                txtPesquisar.requestFocus();
            } else {
                Desabilitar();
                txtCod.setText(String.valueOf(cat.getCodCategoria()));
                txtTipo.setText(cat.getTipoCategoria());
            }
        } catch (Exception e) {
            txtCod.setText("");
            txtTipo.setText("");
            JOptionPane.showMessageDialog(null, "Categoria não encontrada!");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tblCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriaMouseClicked
        // TODO add your handling code here:
        int linhaselecionada = tblCategoria.getSelectedRow(); //pega a linha selecionada
        txtCod.setText(tblCategoria.getValueAt(linhaselecionada, 0).toString());
        txtTipo.setText(tblCategoria.getValueAt(linhaselecionada, 1).toString());

        btnNovo.setEnabled(false);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(false);
    }//GEN-LAST:event_tblCategoriaMouseClicked

    private void txtCodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodFocusLost
        // TODO add your handling code here:
        txtCod.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_txtCodFocusLost

    private void txtCodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodFocusGained
        // TODO add your handling code here:
        txtCod.setBackground(java.awt.Color.yellow);
    }//GEN-LAST:event_txtCodFocusGained

    private void txtTipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTipoFocusGained
        // TODO add your handling code here:
        txtTipo.setBackground(java.awt.Color.yellow);
    }//GEN-LAST:event_txtTipoFocusGained

    private void txtTipoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTipoFocusLost
        // TODO add your handling code here:
        txtTipo.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_txtTipoFocusLost

    private void rbCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbCodigoMouseClicked
        // TODO add your handling code here:
        if (rbCodigo.isSelected()) {
            ArrayList<Categoria> categoria = new ArrayList<Categoria>();
            categoria = this.categoriaDAO.getCategoriasByCod();
            //Categoria[] categorias = this.categoriaDAO.getCategoriasByCod();
            DefaultTableModel tabela = (DefaultTableModel) tblCategoria.getModel();
            tabela.setNumRows(0);

            //for (int i = 0; i < categoria.size(); i++) {
            //categoria.get(i).getCodCategoria();
            
            for (Categoria c : categoria) 
            {
                if (c != null) 
                {
                    Object[] obj = new Object[]{
                        c.getCodCategoria(),
                        c.getTipoCategoria()
                    };
                    tabela.addRow(obj);
                }
            }
        }

                /*
                 for (int i = 0; i < categorias.length; i++) {
                 if (categorias[i] != null) {
                 Object[] obj = new Object[]{
                 categorias[i].getCodCategoria(),
                 categorias[i].getTipo()
                 };
                 tabela.addRow(obj);
                 }
                 }*/

    }//GEN-LAST:event_rbCodigoMouseClicked

    private void rbTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbTipoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rbTipoMouseClicked

    private void btnPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPesquisarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarKeyPressed

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) //pressionou ENTER
        {
            btnPesquisar.doClick(); //clicou no botão Entrar 
        }
    }//GEN-LAST:event_txtPesquisarKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCategoria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCategoria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCategoria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCategoria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup grupoOrdenar;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipoP;
    private javax.swing.JRadioButton rbCodigo;
    private javax.swing.JRadioButton rbTipo;
    private javax.swing.JTable tblCategoria;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

    public void Habilitar() {
        txtCod.setEnabled(false);
        txtTipo.setEnabled(true);
        txtTipo.requestFocus();//recebe o foco
    }

    public void Desabilitar() {
        txtCod.setEnabled(false);
        txtTipo.setEnabled(false);
    }

    public void Limpar() {
        txtCod.setText("");
        txtTipo.setText("");
        txtTipo.requestFocus();
    }

}
