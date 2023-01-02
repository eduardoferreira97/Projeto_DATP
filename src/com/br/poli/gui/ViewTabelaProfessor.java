package com.br.poli.gui;

import com.br.poli.datp.Professor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author a_dem
 */
public class ViewTabelaProfessor extends javax.swing.JInternalFrame {   
    ArrayList<Professor> ListProf;
    
    public void LoadTableProf(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Nome"}, 0);
        jTableProfessor.setModel(modelo);
        jTableProfessor.getColumnModel().getColumn(0).setPreferredWidth(50);
        for(int i=0;i<ListProf.size();i++){
            Object linha[] = new Object[]{ListProf.get(i).getNome()};
            modelo.addRow(linha);
        
        
        }
    }   


    
    //Método para inicializar a janela de tabela de professores.
    public ViewTabelaProfessor() {
        initComponents();
        //setLocationRelativeTo(null);

        ListProf = new ArrayList();
        
        jButtonProfessorCancel.setEnabled(false);
        jButtonProfessorSave.setEnabled(false);
        jButtonProfessorRemove.setEnabled(true);
        jTextFieldProfessorName.setEnabled(false);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProfessor = new javax.swing.JTable();
        jButtonProfessorAdd = new javax.swing.JButton();
        jButtonProfessorRemove = new javax.swing.JButton();
        jButtonProfessorEdit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonProfessorSave = new javax.swing.JButton();
        jButtonProfessorCancel = new javax.swing.JButton();
        jTextFieldProfessorName = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jTableProfessor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProfessor);

        jButtonProfessorAdd.setText("Adicionar");
        jButtonProfessorAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfessorAddActionPerformed(evt);
            }
        });

        jButtonProfessorRemove.setText("Remover");
        jButtonProfessorRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfessorRemoveActionPerformed(evt);
            }
        });

        jButtonProfessorEdit.setText("Editar");
        jButtonProfessorEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfessorEditActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Professor"));

        jLabel1.setText("Nome do Professor:");

        jButtonProfessorSave.setText("Salvar");
        jButtonProfessorSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfessorSaveActionPerformed(evt);
            }
        });

        jButtonProfessorCancel.setText("Cancelar");
        jButtonProfessorCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfessorCancelActionPerformed(evt);
            }
        });

        jTextFieldProfessorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProfessorNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonProfessorSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProfessorCancel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldProfessorName)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldProfessorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProfessorCancel)
                    .addComponent(jButtonProfessorSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonProfessorAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProfessorEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProfessorRemove)
                        .addGap(0, 118, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProfessorAdd)
                    .addComponent(jButtonProfessorRemove)
                    .addComponent(jButtonProfessorEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProfessorAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfessorAddActionPerformed
        //Método será responsável por incluir novos professores.
        jTextFieldProfessorName.setText("");
        jTextFieldProfessorName.setEnabled(true);
        jButtonProfessorSave.setEnabled(true);
        jButtonProfessorCancel.setEnabled(true);
    }//GEN-LAST:event_jButtonProfessorAddActionPerformed

    private void jButtonProfessorCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfessorCancelActionPerformed
        //Método será usado para cancelar o cadastro de algum professor.
        jButtonProfessorCancel.setEnabled(false);
        jButtonProfessorSave.setEnabled(false);
    }//GEN-LAST:event_jButtonProfessorCancelActionPerformed

    private void jButtonProfessorRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfessorRemoveActionPerformed
        //Método será usado para remover os dados de algum professor da tabela.
    }//GEN-LAST:event_jButtonProfessorRemoveActionPerformed

    private void jButtonProfessorSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfessorSaveActionPerformed
        //Metodo para salvar o cadastro de um novo professor
        Professor P = new Professor(jTextFieldProfessorName.getText());
        ListProf.add(P);
        LoadTableProf();
        jTextFieldProfessorName.setText("");
        jTextFieldProfessorName.setEnabled(false);
        jButtonProfessorSave.setEnabled(false);
        jButtonProfessorCancel.setEnabled(false);
        
    }//GEN-LAST:event_jButtonProfessorSaveActionPerformed

    private void jButtonProfessorEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfessorEditActionPerformed
        //Método para Habilitar edicao de um professor na tabela.
    }//GEN-LAST:event_jButtonProfessorEditActionPerformed

    private void jTextFieldProfessorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProfessorNameActionPerformed
        
    }//GEN-LAST:event_jTextFieldProfessorNameActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonProfessorAdd;
    private javax.swing.JButton jButtonProfessorCancel;
    private javax.swing.JButton jButtonProfessorEdit;
    private javax.swing.JButton jButtonProfessorRemove;
    private javax.swing.JButton jButtonProfessorSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProfessor;
    private javax.swing.JTextField jTextFieldProfessorName;
    // End of variables declaration//GEN-END:variables
}
