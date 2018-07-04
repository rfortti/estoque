/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Model.Pessoa;
import Controller.PessoaDAO;
import View.FormMenu;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utilitarios.AceitaNumeros;
import utilitarios.AceitaNumerosPonto;
import utilitarios.AceitaStrings;
import utilitarios.LimitarDigitos;
import utilitarios.LimitarLetras;
import utilitarios.LimitarNumeros;
/**
 *
 * @author Strong
 */
public class FormFuncionario extends javax.swing.JFrame {

    private PessoaDAO pessoaDAO;
              
    public FormFuncionario() {
        initComponents();
        this.pessoaDAO = new PessoaDAO();
        
        preencheTabela();
        //preencheTabela2(txtPesquisar.getText());
        
        txtID.setDocument(new AceitaNumerosPonto());
        txtID.setDocument(new LimitarNumeros(6));
        txtNome.setDocument(new AceitaStrings());
        txtNome.setDocument(new LimitarLetras(50));
        txtRG.setDocument(new AceitaNumerosPonto());
        txtRG.setDocument(new LimitarLetras(12));
        txtCPF.setDocument(new AceitaNumerosPonto());
        txtCPF.setDocument(new LimitarDigitos(14));
        txtBairro.setDocument(new AceitaStrings());
        txtBairro.setDocument(new LimitarLetras(30));
        txtCidade.setDocument(new AceitaStrings());
        txtCidade.setDocument(new LimitarLetras(30));
        txtFone.setDocument(new AceitaNumeros());
        txtFone.setDocument(new LimitarDigitos(14));
        txtPesquisar.setDocument(new AceitaStrings());
        txtPesquisar.setDocument(new LimitarLetras(50));
    }
    
    private void preencheTabela()
     {
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
            esquerda.setHorizontalAlignment(SwingConstants.LEFT);
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            direita.setHorizontalAlignment(SwingConstants.RIGHT);
            
        tblPessoa.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tblPessoa.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        tblPessoa.getColumnModel().getColumn(2).setCellRenderer(esquerda);
        tblPessoa.getColumnModel().getColumn(3).setCellRenderer(esquerda);
        tblPessoa.getColumnModel().getColumn(4).setCellRenderer(esquerda);
        tblPessoa.getColumnModel().getColumn(5).setCellRenderer(esquerda);
        tblPessoa.getColumnModel().getColumn(6).setCellRenderer(esquerda);
        tblPessoa.getColumnModel().getColumn(7).setCellRenderer(esquerda);
        tblPessoa.getColumnModel().getColumn(8).setCellRenderer(esquerda);
        tblPessoa.getColumnModel().getColumn(9).setCellRenderer(esquerda);
         
        tblPessoa.getColumnModel().getColumn(0).setPreferredWidth(5);//ID
        tblPessoa.getColumnModel().getColumn(1).setPreferredWidth(50);//Tipo
        tblPessoa.getColumnModel().getColumn(2).setPreferredWidth(100);//Nome
        tblPessoa.getColumnModel().getColumn(3).setPreferredWidth(60);//RG
        tblPessoa.getColumnModel().getColumn(4).setPreferredWidth(70);//CPF
        tblPessoa.getColumnModel().getColumn(5).setPreferredWidth(100);//Endereço
        tblPessoa.getColumnModel().getColumn(6).setPreferredWidth(50);//Bairro
        tblPessoa.getColumnModel().getColumn(7).setPreferredWidth(50);//Cidade
        tblPessoa.getColumnModel().getColumn(8).setPreferredWidth(70);//Fone
        tblPessoa.getColumnModel().getColumn(9).setPreferredWidth(100);//e-Mail
         
        ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
        pessoa = this.pessoaDAO.getFuncionario();
        
        DefaultTableModel tabela = (DefaultTableModel)tblPessoa.getModel();
        tabela.setNumRows(0);
        
        for (Pessoa f : pessoa) 
        {
            if (f != null) 
            {
                Object[] obj = new Object[]{
                    f.getP_id(),
                    f.getP_tipo(),    
                    f.getP_nome(),
                    f.getP_rg(),
                    f.getP_cpf(),
                    f.getP_endereco(),
                    f.getP_bairro(),
                    f.getP_cidade(),
                    f.getP_fone(),
                    f.getP_email()
                };
                tabela.addRow(obj);
            }
        }        
    }
    
    private void preencheTabela2(String desc)
     {
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
            esquerda.setHorizontalAlignment(SwingConstants.LEFT);
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            direita.setHorizontalAlignment(SwingConstants.RIGHT);
            
        tblPessoa.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tblPessoa.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        tblPessoa.getColumnModel().getColumn(2).setCellRenderer(esquerda);
        tblPessoa.getColumnModel().getColumn(3).setCellRenderer(esquerda);
        tblPessoa.getColumnModel().getColumn(4).setCellRenderer(esquerda);
        tblPessoa.getColumnModel().getColumn(5).setCellRenderer(esquerda);
        tblPessoa.getColumnModel().getColumn(6).setCellRenderer(esquerda);
        tblPessoa.getColumnModel().getColumn(7).setCellRenderer(esquerda);
        tblPessoa.getColumnModel().getColumn(8).setCellRenderer(esquerda);
        tblPessoa.getColumnModel().getColumn(9).setCellRenderer(esquerda);
         
        tblPessoa.getColumnModel().getColumn(0).setPreferredWidth(5);//ID
        tblPessoa.getColumnModel().getColumn(1).setPreferredWidth(50);//Tipo
        tblPessoa.getColumnModel().getColumn(2).setPreferredWidth(100);//Nome
        tblPessoa.getColumnModel().getColumn(3).setPreferredWidth(60);//RG
        tblPessoa.getColumnModel().getColumn(4).setPreferredWidth(70);//CPF
        tblPessoa.getColumnModel().getColumn(5).setPreferredWidth(100);//Endereço
        tblPessoa.getColumnModel().getColumn(6).setPreferredWidth(50);//Bairro
        tblPessoa.getColumnModel().getColumn(7).setPreferredWidth(50);//Cidade
        tblPessoa.getColumnModel().getColumn(8).setPreferredWidth(70);//Fone
        tblPessoa.getColumnModel().getColumn(9).setPreferredWidth(100);//e-Mail
                       
        DefaultTableModel tabela = (DefaultTableModel)tblPessoa.getModel();
        tabela.setNumRows(0);
        PessoaDAO pessoa = new PessoaDAO();
         
        for (Pessoa fcn : pessoa.getFindByTipo(2,desc)) // parametro 2 = Busac por Funcionário 
        {
            if (fcn != null) 
            {
                tabela.addRow(new Object[]{
                    fcn.getP_id(),
                    fcn.getP_tipo(),    
                    fcn.getP_nome(),
                    fcn.getP_rg(),
                    fcn.getP_cpf(),
                    fcn.getP_endereco(),
                    fcn.getP_bairro(),
                    fcn.getP_cidade(),
                    fcn.getP_fone(),
                    fcn.getP_email()
                });
                //tabela.addRow(obj);
            }
        }
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
        tblPessoa = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblFone = new javax.swing.JLabel();
        txtFone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblTipoP = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".: Cadastro de Pessoas :.");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblPessoa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Nome", "RG", "CPF", "Endereço", "Bairro", "Cidade", "Fone", "email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPessoa.getTableHeader().setReorderingAllowed(false);
        tblPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPessoa);
        if (tblPessoa.getColumnModel().getColumnCount() > 0) {
            tblPessoa.getColumnModel().getColumn(0).setResizable(false);
            tblPessoa.getColumnModel().getColumn(1).setResizable(false);
            tblPessoa.getColumnModel().getColumn(2).setResizable(false);
            tblPessoa.getColumnModel().getColumn(3).setResizable(false);
            tblPessoa.getColumnModel().getColumn(4).setResizable(false);
            tblPessoa.getColumnModel().getColumn(5).setResizable(false);
            tblPessoa.getColumnModel().getColumn(6).setResizable(false);
            tblPessoa.getColumnModel().getColumn(7).setResizable(false);
            tblPessoa.getColumnModel().getColumn(8).setResizable(false);
            tblPessoa.getColumnModel().getColumn(9).setResizable(false);
        }

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("[ C a d a s t r o  d e  F u n c i o n á r i o s ]"));

        lblID.setText("* ID:");

        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });

        lblTipo.setText("* Tipo:");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
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

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fornecedor", "Funcionário" }));
        cbTipo.setEnabled(false);

        lblNome.setText("* Nome:");

        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });

        lblRG.setText("RG:");

        txtRG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRGFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRGFocusLost(evt);
            }
        });

        lblCPF.setText("* CPF:");

        txtCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCPFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCPFFocusLost(evt);
            }
        });

        lblEndereco.setText("* Endereço:");

        txtEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEnderecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEnderecoFocusLost(evt);
            }
        });

        lblBairro.setText("* Bairro:");

        txtBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBairroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBairroFocusLost(evt);
            }
        });

        lblCidade.setText("* Cidade:");

        txtCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCidadeFocusLost(evt);
            }
        });

        lblFone.setText("* Fone:");

        txtFone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFoneFocusLost(evt);
            }
        });

        lblEmail.setText("E-mail:");

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        jLayeredPane1.setLayer(lblID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblRG, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtRG, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblBairro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtBairro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblFone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtFone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCidade)
                                    .addComponent(lblEndereco)
                                    .addComponent(lblEmail)))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblID)
                                    .addComponent(lblNome))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                            .addComponent(lblFone)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(lblBairro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblRG)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addComponent(lblCPF)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCPF))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNome)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRG)
                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFone)
                    .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTipoP.setText("Nome:");

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

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Clear.png"))); // NOI18N
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(lblTipoP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTipoP)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 126, Short.MAX_VALUE)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int opcao = 0;
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    if (cbTipo.getSelectedIndex() == -1 || txtNome.getText().equals("") || txtCPF.getText().equals("") || 
            txtEndereco.getText().equals("") || txtBairro.getText().equals("") || 
            txtCidade.getText().equals("") || txtFone.getText().equals(""))
    {
        JOptionPane.showMessageDialog(null, "É necessário preencher o(s) campo(s) obrigatório(s)\n "
                + "indicados com ' * ' ! ","ATENÇÃO",JOptionPane.INFORMATION_MESSAGE);
        txtNome.requestFocus();
    }
    else
    {
        if (opcao == 1)
        {
            Pessoa p = new Pessoa();       
                      
            p.setP_id(Integer.parseInt(txtID.getText()));
            p.setP_tipo(cbTipo.getSelectedItem().toString());
            p.setP_nome(txtNome.getText().toUpperCase());
            p.setP_rg(txtRG.getText());
            p.setP_cpf(txtCPF.getText());
            p.setP_endereco(txtEndereco.getText().toUpperCase());
            p.setP_bairro(txtBairro.getText().toUpperCase());
            p.setP_cidade(txtCidade.getText().toUpperCase());
            p.setP_fone(txtFone.getText());
            p.setP_email(txtEmail.getText().toLowerCase());
                    
            if (this.pessoaDAO.inserir(p) == true)
            {   
                Integer id = Integer.parseInt(txtID.getText());
                String tipo = (cbTipo.getSelectedItem().toString()); 
                String nome = txtNome.getText();
                String rg = txtRG.getText();
                String cpf = txtCPF.getText();
                String endereco = txtEndereco.getText();
                String bairro = txtBairro.getText();
                String cidade = txtCidade.getText();
                String fone = txtFone.getText();
                String email = txtEmail.getText();
                                                
                JOptionPane.showMessageDialog(null, "Pessoa adicionada com sucesso!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Erro ao adicionar pessoa!");
            }
        }
        else if (opcao == 2)
        {
            Pessoa p = new Pessoa();
            p.setP_id(Integer.parseInt(txtID.getText()));
            p.setP_tipo(cbTipo.getSelectedItem().toString());
            p.setP_nome(txtNome.getText().toUpperCase());
            p.setP_rg(txtRG.getText());
            p.setP_cpf(txtCPF.getText());
            p.setP_endereco(txtEndereco.getText().toUpperCase());
            p.setP_bairro(txtBairro.getText().toUpperCase());
            p.setP_cidade(txtCidade.getText().toUpperCase());
            p.setP_fone(txtFone.getText());
            p.setP_email(txtEmail.getText().toLowerCase());
            
            if (this.pessoaDAO.editar(p) == true)
            {
                JOptionPane.showMessageDialog(null, "Pessoa modificada com sucesso!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Erro ao modificar pessoa!");
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
        PessoaDAO pesDAO = new PessoaDAO();
        
        lblTipoP.setEnabled(false);
        txtPesquisar.setEnabled(false);
        btnPesquisar.setEnabled(false);
        txtID.setText(String.valueOf(pesDAO.AutoIncCod()));
        
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
        Pessoa p = new Pessoa();
        p.setP_id(Integer.parseInt(txtID.getText()));
        
       int dialogButton = JOptionPane.showConfirmDialog (null, "Tem certeza que deseja excluir?","Warning",0);// 0 = botão Sim e Não

       if (dialogButton == JOptionPane.YES_OPTION)
       {
        if (this.pessoaDAO.excluir(p) == true)
        {
            JOptionPane.showMessageDialog(null, "Pessoa excluida!");
            Limpar();
            Desabilitar();
            btnNovo.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnSalvar.setEnabled(false);
            
            preencheTabela();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro ao excluir pessoa!");
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
        preencheTabela();
        
        cbTipo.setSelectedIndex(1); //Funcionário
        
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
       
       txtID.setBackground(java.awt.Color.white);
              
       txtPesquisar.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:       
                
        try
        {
            if (txtPesquisar.getText() == null)
            {
                JOptionPane.showMessageDialog(null, "Pessoa não encontrada!");                                
                Limpar();          
                DefaultTableModel tabela = (DefaultTableModel)tblPessoa.getModel();
                tabela.setNumRows(0);
            }
            else
            {
                btnClear.setEnabled(true);
                btnPesquisar.setEnabled(false);
                txtPesquisar.setEnabled(false);
                preencheTabela2(txtPesquisar.getText());
            }
        }
        catch(Exception e)
        {
            Limpar();
            cbTipo.setSelectedItem(1);
            JOptionPane.showMessageDialog(null, cbTipo.getSelectedItem() +" não encontrado!");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tblPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPessoaMouseClicked
        // TODO add your handling code here:
        btnNovo.setEnabled(false);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(false);
       
        int linhaselecionada = tblPessoa.getSelectedRow(); //pega a linha selecionada
        txtID.setText(tblPessoa.getValueAt(linhaselecionada, 0).toString());
        cbTipo.setSelectedItem(tblPessoa.getValueAt(linhaselecionada, 1).toString());
        txtNome.setText(tblPessoa.getValueAt(linhaselecionada, 2).toString());
        txtRG.setText(tblPessoa.getValueAt(linhaselecionada, 3).toString());
        txtCPF.setText(tblPessoa.getValueAt(linhaselecionada, 4).toString());
        txtEndereco.setText(tblPessoa.getValueAt(linhaselecionada, 5).toString());
        txtBairro.setText(tblPessoa.getValueAt(linhaselecionada, 6).toString());
        txtCidade.setText(tblPessoa.getValueAt(linhaselecionada, 7).toString());
        txtFone.setText(tblPessoa.getValueAt(linhaselecionada, 8).toString());
        txtEmail.setText(tblPessoa.getValueAt(linhaselecionada, 9).toString());
        
    }//GEN-LAST:event_tblPessoaMouseClicked

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        // TODO add your handling code here:
        txtID.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_txtIDFocusLost

    private void txtIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusGained
        // TODO add your handling code here:
        txtID.setBackground(java.awt.Color.yellow);
    }//GEN-LAST:event_txtIDFocusGained

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        // TODO add your handling code here:
        txtNome.setBackground(java.awt.Color.yellow);
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        // TODO add your handling code here:
        txtNome.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtRGFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRGFocusGained
        // TODO add your handling code here:
        txtRG.setBackground(java.awt.Color.yellow);
    }//GEN-LAST:event_txtRGFocusGained

    private void txtRGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRGFocusLost
        // TODO add your handling code here:
        txtRG.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_txtRGFocusLost

    private void txtCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFFocusGained
        // TODO add your handling code here:
        txtCPF.setBackground(java.awt.Color.yellow);
    }//GEN-LAST:event_txtCPFFocusGained

    private void txtCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFFocusLost
        // TODO add your handling code here:
        txtCPF.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_txtCPFFocusLost

    private void txtEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnderecoFocusGained
        // TODO add your handling code here:
        txtEndereco.setBackground(java.awt.Color.yellow);
    }//GEN-LAST:event_txtEnderecoFocusGained

    private void txtEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnderecoFocusLost
        // TODO add your handling code here:
        txtEndereco.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_txtEnderecoFocusLost

    private void txtBairroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBairroFocusGained
        // TODO add your handling code here:
        txtBairro.setBackground(java.awt.Color.yellow);
    }//GEN-LAST:event_txtBairroFocusGained

    private void txtBairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBairroFocusLost
        // TODO add your handling code here:
        txtBairro.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_txtBairroFocusLost

    private void txtCidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCidadeFocusGained
        // TODO add your handling code here:
        txtCidade.setBackground(java.awt.Color.yellow);
    }//GEN-LAST:event_txtCidadeFocusGained

    private void txtCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCidadeFocusLost
        // TODO add your handling code here:
        txtCidade.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_txtCidadeFocusLost

    private void txtFoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFoneFocusGained
        // TODO add your handling code here:
        txtFone.setBackground(java.awt.Color.yellow);
    }//GEN-LAST:event_txtFoneFocusGained

    private void txtFoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFoneFocusLost
        // TODO add your handling code here:
        txtFone.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_txtFoneFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        txtEmail.setBackground(java.awt.Color.yellow);
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        txtEmail.setBackground(java.awt.Color.white);
    }//GEN-LAST:event_txtEmailFocusLost

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

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja limpar todos os campos ?", "Warning", 0);// 0 = botão Sim e Não

        if (dialogButton == JOptionPane.YES_OPTION) {
            btnClear.setEnabled(false);
            Limpar();
            
            //rupoOrdenar.clearSelection();
            btnPesquisar.setEnabled(true);
            txtPesquisar.setText("");
            txtPesquisar.setEnabled(true);
            txtPesquisar.requestFocus();
                                    
            DefaultTableModel tabelaPessoas = (DefaultTableModel) tblPessoa.getModel();
            tabelaPessoas.setNumRows(0);
        }
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(FormCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.ButtonGroup grupoOrdenar;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblFone;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipoP;
    private javax.swing.JTable tblPessoa;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFone;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtRG;
    // End of variables declaration//GEN-END:variables

public void Habilitar()
{
    txtID.setEnabled(false);
    cbTipo.setEnabled(false);
    txtNome.setEnabled(true);
    txtRG.setEnabled(true);
    txtCPF.setEnabled(true);
    txtEndereco.setEnabled(true);
    txtBairro.setEnabled(true);
    txtCidade.setEnabled(true);
    txtFone.setEnabled(true);
    txtEmail.setEnabled(true);
    txtNome.requestFocus();//recebe o foco
}

public void Desabilitar()
{
    txtID.setEnabled(false);
    cbTipo.setEnabled(false);
    txtNome.setEnabled(false);
    txtRG.setEnabled(false);
    txtCPF.setEnabled(false);
    txtEndereco.setEnabled(false);
    txtBairro.setEnabled(false);
    txtCidade.setEnabled(false);
    txtFone.setEnabled(false);
    txtEmail.setEnabled(false);
}

public void Limpar()
{
    txtID.setText("");
    cbTipo.setSelectedIndex(1);
    txtNome.setText("");
    txtRG.setText("");
    txtCPF.setText("");
    txtEndereco.setText("");
    txtBairro.setText("");
    txtCidade.setText("");
    txtFone.setText("");
    txtEmail.setText("");
    txtID.requestFocus();
}

}
