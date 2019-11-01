/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.full.sight.oshi;

//libs para atualizar em tempo real
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
//lib para mostrar nome do SO
import oshi.PlatformEnum;

public class TelaMonitFS extends javax.swing.JFrame {

    MonitoramentoFS tela = new MonitoramentoFS();
    Timer t;

    void labelsMemoria() {
        t = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                /*
        pbMemoriaUtilizada.setValue(tela.verMemoriaUsadaPb());

        pbMemoriaDisponivel.setValue(tela.verMemoriaPb());
                 */
                lbMemoriaUti.setText(tela.verMemoriaUsada(tela.hal.getMemory()));

                lbMemoriaDisponivel.setText(tela.verMemoriaDisponivel(tela.hal.getMemory()).toString());

                lbMemoriaTotal.setText(tela.verMemoriaTotal(tela.hal.getMemory()));
            }
        });

        t.start();
    }

    void labelsCpu() {
        t = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                lbPorcentagem.setText(tela.verPorcentagemCpu());

                lbFrequenciaCpu.setText(tela.verUsoCPU(tela.hal.getProcessor()));

                lbSO.setText(tela.verSO(PlatformEnum.LINUX));

                lbThreads.setText(tela.verThreads());

                lbPortasLogicas.setText(tela.verPortasLogicas());

                lbPortasLogicas2.setText(tela.verQtdProcessos());

            }
        });
        taProcessos.setText(tela.printProcesses(tela.os, tela.hal.getMemory()));

        t.start();

    }

    void labelsDisco() {
        lbEspacoLivre.setText(tela.verEspacoLivre());

        lbEspacoUti.setText(tela.verEspacoUtilizado());

        lbEspacoTotal.setText(tela.verEspacoTotal());
    }

    public TelaMonitFS() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTela = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        jpRam = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbMemoriaUti = new javax.swing.JLabel();
        lbMemoriaDisponivel = new javax.swing.JLabel();
        lbMemoriaTotal = new javax.swing.JLabel();
        lbMemoriaUtilizada = new javax.swing.JLabel();
        jpCpu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbPorcentagem = new javax.swing.JLabel();
        lbFrequenciaCpu = new javax.swing.JLabel();
        lbSO = new javax.swing.JLabel();
        lbThreads = new javax.swing.JLabel();
        lbPortasLogicas = new javax.swing.JLabel();
        lbPorcentagemCpu = new javax.swing.JLabel();
        lbPorcentagemCpu1 = new javax.swing.JLabel();
        lbPorcentagemCpu2 = new javax.swing.JLabel();
        jpDisco = new javax.swing.JPanel();
        lbDisco = new javax.swing.JLabel();
        lbEspacoLivre = new javax.swing.JLabel();
        lbEspacoUti = new javax.swing.JLabel();
        lbEspacoTotal = new javax.swing.JLabel();
        lbEspacoUtilizado = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnExecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taProcessos = new javax.swing.JTextArea();
        lbPortasLogicas2 = new javax.swing.JLabel();
        lbPortaLogicas1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpTela.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbLogo.setBackground(new java.awt.Color(0, 0, 0));
        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aluno\\Desktop\\ProjetoII\\full-sight-oshi\\src\\main\\java\\com\\mycompany\\autenticacao\\LogoEmpresa.png")); // NOI18N
        jpTela.add(lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 190, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RAM");

        lbMemoriaUti.setForeground(new java.awt.Color(0, 0, 255));
        lbMemoriaUti.setText("Memória utilizada:");

        lbMemoriaDisponivel.setForeground(new java.awt.Color(0, 0, 255));
        lbMemoriaDisponivel.setText("Memória disponível:");

        lbMemoriaTotal.setForeground(new java.awt.Color(0, 0, 255));
        lbMemoriaTotal.setText("Memória total:");

        javax.swing.GroupLayout jpRamLayout = new javax.swing.GroupLayout(jpRam);
        jpRam.setLayout(jpRamLayout);
        jpRamLayout.setHorizontalGroup(
            jpRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRamLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpRamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMemoriaDisponivel, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(lbMemoriaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpRamLayout.createSequentialGroup()
                        .addComponent(lbMemoriaUti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMemoriaUtilizada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpRamLayout.setVerticalGroup(
            jpRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRamLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMemoriaUti)
                    .addComponent(lbMemoriaUtilizada, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbMemoriaDisponivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbMemoriaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jpTela.add(jpRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 260, 110));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CPU");

        lbPorcentagem.setForeground(new java.awt.Color(0, 0, 255));
        lbPorcentagem.setText("Porcentagem de uso: ");

        lbFrequenciaCpu.setForeground(new java.awt.Color(51, 51, 255));
        lbFrequenciaCpu.setText("Frequencia:");

        lbSO.setForeground(new java.awt.Color(51, 51, 255));
        lbSO.setText("Sistema Operacional:");

        lbThreads.setForeground(new java.awt.Color(51, 51, 255));
        lbThreads.setText("Threads:");

        lbPortasLogicas.setForeground(new java.awt.Color(51, 51, 255));
        lbPortasLogicas.setText("Porta Lógicas:");

        javax.swing.GroupLayout jpCpuLayout = new javax.swing.GroupLayout(jpCpu);
        jpCpu.setLayout(jpCpuLayout);
        jpCpuLayout.setHorizontalGroup(
            jpCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCpuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFrequenciaCpu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbThreads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPortasLogicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpCpuLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpCpuLayout.createSequentialGroup()
                        .addComponent(lbPorcentagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPorcentagemCpu, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpCpuLayout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(lbPorcentagemCpu1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
            .addGroup(jpCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpCpuLayout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(lbPorcentagemCpu2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpCpuLayout.setVerticalGroup(
            jpCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCpuLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSO)
                .addGap(9, 9, 9)
                .addGroup(jpCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPorcentagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPorcentagemCpu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbFrequenciaCpu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbThreads)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPortasLogicas)
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(jpCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpCpuLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(lbPorcentagemCpu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(95, 95, 95)))
            .addGroup(jpCpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpCpuLayout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(lbPorcentagemCpu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(85, 85, 85)))
        );

        jpTela.add(jpCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 170));

        lbDisco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbDisco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDisco.setText("Disco");

        lbEspacoLivre.setForeground(new java.awt.Color(0, 0, 255));
        lbEspacoLivre.setText("Espaço Livre:");

        lbEspacoUti.setForeground(new java.awt.Color(0, 0, 255));
        lbEspacoUti.setText("Espaço Utilizado:");

        lbEspacoTotal.setForeground(new java.awt.Color(0, 0, 255));
        lbEspacoTotal.setText("Espaço Total:");

        javax.swing.GroupLayout jpDiscoLayout = new javax.swing.GroupLayout(jpDisco);
        jpDisco.setLayout(jpDiscoLayout);
        jpDiscoLayout.setHorizontalGroup(
            jpDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDiscoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEspacoLivre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbEspacoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpDiscoLayout.createSequentialGroup()
                        .addComponent(lbDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpDiscoLayout.createSequentialGroup()
                        .addComponent(lbEspacoUti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEspacoUtilizado, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpDiscoLayout.setVerticalGroup(
            jpDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDiscoLayout.createSequentialGroup()
                .addComponent(lbDisco)
                .addGap(18, 18, 18)
                .addComponent(lbEspacoLivre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDiscoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbEspacoUti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbEspacoUtilizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEspacoTotal)
                .addGap(0, 56, Short.MAX_VALUE))
        );

        jpTela.add(jpDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 260, 150));

        btnExecutar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExecutar.setForeground(new java.awt.Color(0, 0, 255));
        btnExecutar.setText("Executar");
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarActionPerformed(evt);
            }
        });

        taProcessos.setColumns(20);
        taProcessos.setRows(5);
        jScrollPane1.setViewportView(taProcessos);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnExecutar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExecutar))
        );

        jpTela.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 330, 340));

        lbPortasLogicas2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbPortasLogicas2.setText("Quantidade de Processos:");
        jpTela.add(lbPortasLogicas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 160, -1));

        lbPortaLogicas1.setForeground(new java.awt.Color(0, 0, 255));
        jpTela.add(lbPortaLogicas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 160, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarActionPerformed
        labelsMemoria();
        labelsCpu();
        labelsDisco();
    }//GEN-LAST:event_btnExecutarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMonitFS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMonitFS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMonitFS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMonitFS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMonitFS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecutar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpCpu;
    private javax.swing.JPanel jpDisco;
    private javax.swing.JPanel jpRam;
    private javax.swing.JPanel jpTela;
    private javax.swing.JLabel lbDisco;
    private javax.swing.JLabel lbEspacoLivre;
    private javax.swing.JLabel lbEspacoTotal;
    private javax.swing.JLabel lbEspacoUti;
    private javax.swing.JLabel lbEspacoUtilizado;
    private javax.swing.JLabel lbFrequenciaCpu;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbMemoriaDisponivel;
    private javax.swing.JLabel lbMemoriaTotal;
    private javax.swing.JLabel lbMemoriaUti;
    private javax.swing.JLabel lbMemoriaUtilizada;
    private javax.swing.JLabel lbPorcentagem;
    private javax.swing.JLabel lbPorcentagemCpu;
    private javax.swing.JLabel lbPorcentagemCpu1;
    private javax.swing.JLabel lbPorcentagemCpu2;
    private javax.swing.JLabel lbPortaLogicas1;
    private javax.swing.JLabel lbPortasLogicas;
    private javax.swing.JLabel lbPortasLogicas2;
    private javax.swing.JLabel lbSO;
    private javax.swing.JLabel lbThreads;
    private javax.swing.JTextArea taProcessos;
    // End of variables declaration//GEN-END:variables
}
