package com.br.poli.gui;
/**
 *
 * @author a_dem
 */
public class ViewDATP extends javax.swing.JFrame {

    public ViewDATP() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jTelaPrincipal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jGuiaPrincipal = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuArquivoPainelAulas = new javax.swing.JMenuItem();
        jMenuArquivoDisciplinas = new javax.swing.JMenuItem();
        jMenuTabelas = new javax.swing.JMenu();
        jMenuTabelaSala = new javax.swing.JMenuItem();
        jMenuTabelaProfessor = new javax.swing.JMenuItem();
        jMenuTabelaMateria = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem9.setText("jMenuItem9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 768));

        jTelaPrincipal.setBackground(new java.awt.Color(0, 0, 51));
        jTelaPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTelaPrincipal.setToolTipText("");

        jTelaPrincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jTelaPrincipalLayout = new javax.swing.GroupLayout(jTelaPrincipal);
        jTelaPrincipal.setLayout(jTelaPrincipalLayout);
        jTelaPrincipalLayout.setHorizontalGroup(
            jTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTelaPrincipalLayout.createSequentialGroup()
                .addGap(3164, 3164, 3164)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jTelaPrincipalLayout.setVerticalGroup(
            jTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTelaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jGuiaPrincipal.setAlignmentX(0.0F);
        jGuiaPrincipal.setMaximumSize(new java.awt.Dimension(233, 23));

        jMenuArquivo.setText("Arquivo");

        jMenuArquivoPainelAulas.setText("Painel de Aulas");
        jMenuArquivoPainelAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuArquivoPainelAulasActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuArquivoPainelAulas);

        jMenuArquivoDisciplinas.setText("Disciplinas");
        jMenuArquivoDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuArquivoDisciplinasActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuArquivoDisciplinas);

        jGuiaPrincipal.add(jMenuArquivo);

        jMenuTabelas.setText("Tabelas");

        jMenuTabelaSala.setText("Sala");
        jMenuTabelaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTabelaSalaActionPerformed(evt);
            }
        });
        jMenuTabelas.add(jMenuTabelaSala);

        jMenuTabelaProfessor.setText("Professor");
        jMenuTabelaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTabelaProfessorActionPerformed(evt);
            }
        });
        jMenuTabelas.add(jMenuTabelaProfessor);

        jMenuTabelaMateria.setText("Matéria");
        jMenuTabelaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTabelaMateriaActionPerformed(evt);
            }
        });
        jMenuTabelas.add(jMenuTabelaMateria);

        jGuiaPrincipal.add(jMenuTabelas);

        jMenuSobre.setText("Sobre");
        jGuiaPrincipal.add(jMenuSobre);
        jGuiaPrincipal.add(jMenu3);

        setJMenuBar(jGuiaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTelaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuArquivoPainelAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuArquivoPainelAulasActionPerformed
    
    }//GEN-LAST:event_jMenuArquivoPainelAulasActionPerformed
   
    private void jMenuArquivoDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuArquivoDisciplinasActionPerformed
        //Método para mostrar na tela a tabela de disciplinas
        ViewTabelaDisciplina viewTabDis = new ViewTabelaDisciplina();
        jTelaPrincipal.add(viewTabDis);
        viewTabDis.setVisible(true);
        
    }//GEN-LAST:event_jMenuArquivoDisciplinasActionPerformed

    private void jMenuTabelaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelaProfessorActionPerformed
        //Método para mostrar na tela a tabela de professores.
        ViewTabelaProfessor viewTabProf = new ViewTabelaProfessor();
        jTelaPrincipal.add(viewTabProf);
        viewTabProf.setVisible(true);
    }//GEN-LAST:event_jMenuTabelaProfessorActionPerformed

    private void jMenuTabelaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelaSalaActionPerformed
        //Método para mostrar na tela a tabela de salas.
        ViewTabelaSalas viewTabSal = new ViewTabelaSalas();
        jTelaPrincipal.add(viewTabSal);
        viewTabSal.setVisible(true);
    }//GEN-LAST:event_jMenuTabelaSalaActionPerformed

    private void jMenuTabelaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTabelaMateriaActionPerformed
        //Método para mostrar na tela a lista de matérias
        ViewTabelaMaterias viewTabMat = new ViewTabelaMaterias();
        jTelaPrincipal.add(viewTabMat);
        viewTabMat.setVisible(true);
    }//GEN-LAST:event_jMenuTabelaMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDATP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDATP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDATP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDATP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDATP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jGuiaPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuItem jMenuArquivoDisciplinas;
    private javax.swing.JMenuItem jMenuArquivoPainelAulas;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JMenuItem jMenuTabelaMateria;
    private javax.swing.JMenuItem jMenuTabelaProfessor;
    private javax.swing.JMenuItem jMenuTabelaSala;
    private javax.swing.JMenu jMenuTabelas;
    private javax.swing.JDesktopPane jTelaPrincipal;
    // End of variables declaration//GEN-END:variables
}
