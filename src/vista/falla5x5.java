/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author cristian
 */
public class falla5x5 extends javax.swing.JFrame {

  boolean [] ver = new boolean[25];
          static int seleccion1;
    static int seleccion2;
      static ArrayList<Object> lista = new ArrayList<>();
     Integer imagen1[] ={0,0,0,0,1,1};
     Integer imagen2[] ={1,1,2,0,0,1};
     Integer imagen3[] ={0,2,0,1,0,1};
     Integer imagen4[] ={1,0,1,1,1,0};
     Integer imagen5[] ={4,0,1,1,0,1};
                       Integer imagen6[] ={0,2,0,1,0,1};
                       Integer imagen7[] ={1,0,1,1,1,0};
                       Integer imagen8[] ={2,1,2,1,0,1};
                       Integer imagen9[] ={3,2,0,1,1,1};
                       Integer imagen10[] ={4,0,1,1,0,1};
     Integer imagen11[] ={0,1,2,2,1,1};
     Integer imagen12[] ={1,2,1,2,0,1};
     Integer imagen13[] ={2,0,0,2,1,1};
     Integer imagen14[] ={3,1,2,2,0,1};
     Integer imagen15[] ={4,2,1,2,1,0};
                       Integer imagen16[] ={0,0,2,3,0,1};
                       Integer imagen17[] ={1,1,0,3,1,1};
                       Integer imagen18[] ={2,2,1,3,0,1};
                       Integer imagen19[] ={3,0,2,3,1,1};
                       Integer imagen20[] ={4,1,0,3,0,1};
     Integer imagen21[] ={0,2,1,4,1,0};
     Integer imagen22[] ={1,0,0,4,0,1};
     Integer imagen23[] ={2,1,2,4,1,0};
     Integer imagen24[] ={3,2,0,4,0,1};
     Integer imagen25[] ={4,0,1,4,1,1};
     
     
      
 
        Integer imagenAleatoria[]=null;

  

    public falla5x5() {
         initComponents();
     lista.add(imagen1);
     lista.add(imagen2);
     lista.add(imagen3);
     lista.add(imagen4);
     lista.add(imagen5);
                        lista.add(imagen6);
                        lista.add(imagen7);
                        lista.add(imagen8);
                        lista.add(imagen9);
                        lista.add(imagen10);
     lista.add(imagen11);
     lista.add(imagen12);
     lista.add(imagen13);
     lista.add(imagen14);
     lista.add(imagen15);
                        lista.add(imagen16);
                        lista.add(imagen17);
                        lista.add(imagen18);
                        lista.add(imagen19);
                        lista.add(imagen20);
     lista.add(imagen21);
     lista.add(imagen22);
     lista.add(imagen23);
     lista.add(imagen24);
     lista.add(imagen25);
     
     ver[0]=true;
     ver[1]=true; 
     ver[2]=true; 
     ver[3]=true;  
     ver[4]=true;
                  ver[5]=true; 
                  ver[6]=true; 
                  ver[7]=true;  
                  ver[8]=true; 
                  ver[9]=true; 
     ver[10]=true;
     ver[11]=true; 
     ver[12]=true; 
     ver[13]=true;  
     ver[14]=true;
                  ver[15]=true; 
                  ver[16]=true; 
                  ver[17]=true;  
                  ver[18]=true; 
                  ver[19]=true; 
     ver[20]=true;
     ver[21]=true; 
     ver[22]=true; 
     ver[23]=true;  
     ver[24]=true;
        initComponents();
        
      
 
     imagenAleatoria=((Integer[]) lista.get(seleccionarImagenBuscar()));
   
    
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/1.jpg"))); // NOI18N
        getContentPane().add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/3.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/4.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/5.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/6.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 217, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/7.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 217, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/8.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 217, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/9.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 217, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/11.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 371, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/12.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 371, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/13.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 371, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/14.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 371, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/15.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 371, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/16.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 534, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/17.jpg"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 534, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/18.jpg"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 534, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/19.jpg"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 534, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/20.jpg"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 534, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/21.jpg"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 699, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/22.jpg"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 699, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/23.jpg"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 699, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/24.jpg"))); // NOI18N
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 699, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/25.jpg"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 699, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pelo", "Piel", "Ojos", "Ropa", "Sexo", "Lentes" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 156, 51));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Rojo", "Castaño", "Rubio", "Blanco" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, 156, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes5x5/10.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 390, 125, 55));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanca", "Mestiza", "Negra", " " }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Verdes", "Azules", "Cafés", " " }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, -1, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negra", "Café", "Azul", "Verde", "Amarillo" }));
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, -1, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mujer", "Hombre" }));
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Con Lentes", "Sin Lentes" }));
        getContentPane().add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, -1, -1));

        jLabel1.setText("dgsdgsdgs");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ja", "ja", "ja" }));
        getContentPane().add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       jLabel1.setVisible(false);
       jComboBox8.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new falla5x5().setVisible(true);
            }
        });
    }
    
    public void visible(){
         img1.setVisible(ver[0]);
     jLabel2.setVisible(ver[1]);
     jLabel3.setVisible(ver[2]);
     jLabel4.setVisible(ver[3]);
     jLabel5.setVisible(ver[4]);
         jLabel6.setVisible(ver[5]);
         jLabel7.setVisible(ver[6]);
         jLabel8.setVisible(ver[7]);
         jLabel9.setVisible(ver[8]);
         jLabel10.setVisible(ver[9]);
           jLabel11.setVisible(ver[10]);
           jLabel12.setVisible(ver[11]);
           jLabel13.setVisible(ver[12]);
           jLabel14.setVisible(ver[13]);
           jLabel15.setVisible(ver[14]);
         jLabel16.setVisible(ver[15]);
         jLabel17.setVisible(ver[16]);
         jLabel18.setVisible(ver[17]);
         jLabel19.setVisible(ver[18]);
         jLabel20.setVisible(ver[19]);
     jLabel21.setVisible(ver[20]);
     jLabel22.setVisible(ver[21]);
     jLabel23.setVisible(ver[22]);
     jLabel24.setVisible(ver[23]);
     jLabel25.setVisible(ver[24]);
    }
    
     void comparacion(int x, int y){
            Integer [] vectorAuxiliar = null; 
    
          if((imagenAleatoria[x]==y)){
              
               for (int i=0;i<lista.size();i++){
                    
         vectorAuxiliar=(Integer[]) lista.get(i);
                   if(vectorAuxiliar[x]==y){
                  // ver[i]=true;
                   }else{
                        ver[i]=false;
                   }
               }  
              
              
          }else{
              
                   for (int i=0;i<lista.size();i++){
                    
         vectorAuxiliar=(Integer[]) lista.get(i);
                   if(vectorAuxiliar[x]==y){
                   ver[i]=false;
                   }else{
                      //  ver[i]=true;
                   }
               }   
              
              
              
          }
          
                     
     
         
         visible();
          
               
     
    }
      
      public int seleccionarImagenBuscar(){
            int aleatoria=(int)Math.floor(Math.random()*(0-4)+4);
     return aleatoria;}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel img1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
