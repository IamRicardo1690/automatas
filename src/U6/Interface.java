/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U6;
//hola hola
import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *3222222
 * @author Ricardo S.
 */
public class Interface extends javax.swing.JFrame {

    static String diccionario[]={"#include","<","iostream.h",">","void","main","(",
        ")","{","int","var",";","}"};

    static int grafo[][]={
    {0,1,0,0,0,0,0,0,0,0,0,0,0},
    {0,0,1,0,0,0,0,0,0,0,0,0,0},
    {0,0,0,1,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,1,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,1,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,1,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,1,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,1,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,1,0,0,0},
    {0,0,0,0,0,0,0,0,0,0,1,0,0},
    {0,0,0,0,0,0,0,0,0,0,0,1,0},
    {0,0,0,0,0,0,0,0,0,0,0,0,1},
    };

   // static String codigo="#include<iostream.h> void main(){ int a;}";

    static String delimitador=" <>(){};";
    static int Panterior=-1,Pactual=-1,linea=0;

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }

    void leerCodigo(File fichero){
        Scanner s;
        try {
            s=new Scanner(fichero);
            String linea="";
            while(s.hasNextLine()){
                linea+=s.nextLine();
                linea+="\n";
            }
            s.close();
            txacodigo.setText(linea);
            analizador_Sintact(linea);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }


    void analizador_Sintact(String codigo){
        txaresult.setText("");
        StringTokenizer lineas=new StringTokenizer(codigo,"\n");
        StringTokenizer tokens;

        while(lineas.hasMoreTokens()){
            linea++;
            String err="";
            tokens=new StringTokenizer(lineas.nextToken(),delimitador,true);
            while(tokens.hasMoreTokens()){
                String token=tokens.nextToken().trim();
                if(!token.equals("")){
                    System.out.println(token);
                    Pactual=regresa(token);
                    if(Panterior>0){
                        if(grafo[Panterior][Pactual]==0){
                            err="Error de Sintaxis "+diccionario[Panterior]+", en linea: "+linea;
                            System.out.println(err);
                            txaresult.setText(err);
                        }
                    }
                    Panterior=Pactual;
                }
            }
        }
    }

    static int regresa(String token){
        for(int i=0;i<diccionario.length;i++){
            if(token.equals(diccionario[i]))
                return i;
        }
        if(Character.isLetter(token.charAt(0)))
            return 10;
        else
            return 0;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txacodigo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaresult = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txacodigo.setColumns(20);
        txacodigo.setRows(5);
        jScrollPane1.setViewportView(txacodigo);

        txaresult.setColumns(20);
        txaresult.setRows(5);
        jScrollPane2.setViewportView(txaresult);

        jLabel1.setText("Código");

        jLabel2.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addComponent(jScrollPane2))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fc=new JFileChooser();
        FileNameExtensionFilter filter=new FileNameExtensionFilter("TXT & txt","txt");

        fc.setFileFilter(filter);
        int selec=fc.showOpenDialog(new JDialog());

        if(selec==JFileChooser.APPROVE_OPTION)
        {
            File fichero= fc.getSelectedFile();

            leerCodigo(fichero);

        }
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txacodigo;
    private javax.swing.JTextArea txaresult;
    // End of variables declaration//GEN-END:variables
}
