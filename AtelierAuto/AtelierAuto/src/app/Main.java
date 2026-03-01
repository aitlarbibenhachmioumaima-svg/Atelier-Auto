 
package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import service.ReparationService;


public class Main extends javax.swing.JFrame {

   
    public Main() {
        initComponents();
         this.setTitle("Gestion d'atelier");
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        SearchByMarque = new javax.swing.JMenuItem();
        SearchByType = new javax.swing.JMenuItem();
        Menustat = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(204, 204, 204));

        fileMenu.setMnemonic('f');
        fileMenu.setText("Gestion");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Client");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Vehicule");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Reparation");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Logout");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Recherche");

        SearchByMarque.setMnemonic('t');
        SearchByMarque.setText("Par Marque");
        SearchByMarque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByMarqueActionPerformed(evt);
            }
        });
        editMenu.add(SearchByMarque);

        SearchByType.setMnemonic('y');
        SearchByType.setText("Par Type");
        SearchByType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByTypeActionPerformed(evt);
            }
        });
        editMenu.add(SearchByType);

        menuBar.add(editMenu);

        Menustat.setMnemonic('h');
        Menustat.setText("Statistiques");
        Menustat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenustatActionPerformed(evt);
            }
        });

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText(" total des coûts mensuels");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        Menustat.add(contentMenuItem);

        menuBar.add(Menustat);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
 

    desktopPane.removeAll();
    desktopPane.repaint();

    ClientFrame cf = new ClientFrame();
    desktopPane.add(cf);
    cf.setVisible(true);
    cf.toFront();

    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed


    desktopPane.removeAll();
    desktopPane.repaint();

    VehiculeFrame vf = new VehiculeFrame();
    desktopPane.add(vf);
    vf.setVisible(true);
    vf.toFront();

    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed


    desktopPane.removeAll();
    desktopPane.repaint();

    ReparationFrame rf = new ReparationFrame();
    desktopPane.add(rf);
    rf.setVisible(true);
    rf.toFront();

    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void SearchByTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByTypeActionPerformed
       SearchByType f = new SearchByType();
    desktopPane.add(f);
    f.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_SearchByTypeActionPerformed

    private void SearchByMarqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByMarqueActionPerformed
      SearchByMarque f = new SearchByMarque();
    desktopPane.add(f);
    f.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_SearchByMarqueActionPerformed

    private void MenustatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenustatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenustatActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
 System.out.println("GRAPHIQUE CLIQUE");

try {
    
    for (javax.swing.JInternalFrame f : desktopPane.getAllFrames()) {
        if (f instanceof GraphiqueForm) {
            f.toFront();
            f.setSelected(true);
            return;
        }
    }

    
    GraphiqueForm gf = new GraphiqueForm();

    
    desktopPane.add(gf);

    
    gf.setSize(900, 600);
    gf.setLocation(40, 40);

    
    gf.setVisible(true);

   
    gf.setSelected(true);

    desktopPane.repaint();

} catch (Exception e) {
    e.printStackTrace();
}       // TODO add your handling code here:
    }//GEN-LAST:event_contentMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new LoginFrame().setVisible(true); // Login أولاً
        }
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menustat;
    private javax.swing.JMenuItem SearchByMarque;
    private javax.swing.JMenuItem SearchByType;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
