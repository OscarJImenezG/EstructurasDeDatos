package definitivo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Inicio extends javax.swing.JFrame {

    int xMouse, yMouse;

    public JPanel getContent() {
        return content;
    }
    
    public void modificarJPanel(Object ob){
        content.removeAll();
        content.add((Component) ob, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    public void setContent(JPanel content) {
        this.content = content;
    }
    

    public Inicio() {
        initComponents();
        
        Page1 p1 = new Page1();
        p1.setSize(543,290);
        p1.setLocation(0,0);
        
        this.modificarJPanel(p1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        Timer relojTimer = new Timer(1000, new definitivo.Inicio.RelojListener());
        relojTimer.start();
        jSeparator2 = new javax.swing.JSeparator();
        barra = new javax.swing.JPanel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(216, 255, 237));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Roboto Medium", 0, 22)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Estructura de datos");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        hora.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        hora.setText("00:00:00 MM");
        jPanel1.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fecha.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        fecha.setText(new Fecha().toString());
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 110, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 490, 10));

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 490, 20));

        content.setBackground(new java.awt.Color(216, 255, 237));
        content.setName(""); // NOI18N
        content.setPreferredSize(new java.awt.Dimension(490, 258));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 490, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void formMousePressed(java.awt.event.MouseEvent evt) {                                  
        xMouse = evt.getX();
        yMouse = evt.getY();
    }                                 

    private void formMouseDragged(java.awt.event.MouseEvent evt) {                                  
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }                                 

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    public static class Hora extends Date {    
        
        
    }
    private class RelojListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            hora.setText(sdf.format(new Hora()));
        }
    }
    public static class Fecha extends GregorianCalendar {
        private static String[] meses = {"Enero"
                , "Febrero"
                , "Marzo"
                , "Abril"
                , "Mayo"
                , "Junio"
                , "Julio"
                , "Agosto"
                , "Septiembre"
                , "Octubre"
                , "Noviembre"
                , "Diciembre"};

        @Override
        public String toString() {
            return Integer.toString(this.get(Calendar.DATE)) + "-" + meses[this.get(Calendar.MONTH)] + "-" + Integer.toString(this.get(Calendar.YEAR));
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel barra;
    private javax.swing.JPanel content;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel titulo;
    // End of variables declaration                   
}

