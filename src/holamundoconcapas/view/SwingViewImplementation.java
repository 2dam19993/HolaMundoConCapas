/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import javax.swing.JDialog;
import javax.swing.JOptionPane;


/**
 *
 * @author 2dam
 */
public class SwingViewImplementation  extends javax.swing.JFrame implements View{
    //private String saludo;
    @Override
    public void showGreeting(String saludo) {
        /*
        initComponents();
        JOptionPane pane= new JOptionPane(saludo);
        JDialog dialog = pane.createDialog("Mensaje");
        dialog.show();
        */
        JOptionPane.showMessageDialog(null, saludo);
        /*
        JFrame frame=new JFrame("Sample view");
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LO MISMO PERO NULL POR FRAME
        */
    }
    
    /**
     * Creates new form VentanaSaludo
     */
     public SwingViewImplementation() {
        /*
        initComponents();
        JOptionPane pane= new JOptionPane(saludo);
        JDialog dialog = pane.createDialog("Mensaje");
        dialog.show();
        */
        
    }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

   

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}