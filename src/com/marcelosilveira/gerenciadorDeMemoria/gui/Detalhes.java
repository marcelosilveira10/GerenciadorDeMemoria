/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.marcelosilveira.gerenciadorDeMemoria.gui;

import com.marcelosilveira.gerenciadorDeMemoria.model.Processo;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTextPane;

/**
 *
 * @author PC
 */
public class Detalhes extends javax.swing.JFrame {

    /**
     * Creates new form Detalhes
     */
    
    public Detalhes(ArrayList<Processo> processo[]) {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        mostraProcessos(processo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneProcessosBestFit = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPaneProcessosNextFit = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPaneProcessosWorstFit = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPaneProcessosFirstFit = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel7.setText("Estatísticas");

        jLabel9.setText("Estatísticas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTextPaneProcessosBestFit.setEditable(false);
        jScrollPane2.setViewportView(jTextPaneProcessosBestFit);

        jTextPaneProcessosNextFit.setEditable(false);
        jScrollPane3.setViewportView(jTextPaneProcessosNextFit);

        jTextPaneProcessosWorstFit.setEditable(false);
        jScrollPane4.setViewportView(jTextPaneProcessosWorstFit);

        jTextPaneProcessosFirstFit.setEditable(false);
        jScrollPane5.setViewportView(jTextPaneProcessosFirstFit);

        jLabel1.setText("First Fit");

        jLabel2.setText("Next Fit");

        jLabel3.setText("Best Fit");

        jLabel4.setText("Worst Fit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void mostraProcessos(ArrayList<Processo> processo[]){
       JTextPane[] smemorias = new JTextPane[4];
        int i;
        smemorias[0]=jTextPaneProcessosFirstFit;
        smemorias[1]=jTextPaneProcessosNextFit;
        smemorias[2]=jTextPaneProcessosBestFit;
        smemorias[3]=jTextPaneProcessosWorstFit;
       
        for(i=0;i<4;i++){
            StringBuffer sb = new StringBuffer();
            for(Processo p : processo[i]){
                if(p.isFinalizado())
                    sb.append(p.getNome().toString() +"  Tamanho "+p.getTamanhoMemoria()+" MB"+"  Finalizado "+"  Tempo Criação "+ p.getTempoCriacao() +"  Tempo de Espera "+ (p.getTempoAlocacao()-p.getTempoCriacao()) +"  Tempo Finalização "+p.getTempoFinalizacao() +"\n");
                else
                    if(p.isAlocado())
                        sb.append(p.getNome().toString() +"  Tamanho "+p.getTamanhoMemoria()+" MB"+ "  Em Execução "+ "  Tempo Criação "+ p.getTempoCriacao()+"  Tempo de Espera "+ (p.getTempoAlocacao()-p.getTempoCriacao())+"\n");
                    else
                        sb.append(p.getNome().toString() +"  Tamanho "+p.getTamanhoMemoria()+" MB"+ "  Em Espera "+"  Tempo Criação "+ p.getTempoCriacao() +"\n");
            }
            smemorias[i].setText(sb.toString());
        }
        
   }

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTextPaneProcessosBestFit;
    private javax.swing.JTextPane jTextPaneProcessosFirstFit;
    private javax.swing.JTextPane jTextPaneProcessosNextFit;
    private javax.swing.JTextPane jTextPaneProcessosWorstFit;
    // End of variables declaration//GEN-END:variables
}
