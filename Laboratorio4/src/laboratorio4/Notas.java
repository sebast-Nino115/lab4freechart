
package laboratorio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
public class Notas extends javax.swing.JFrame {
    DefaultTableModel md=new DefaultTableModel();
    DefaultTableModel md2=new DefaultTableModel();
    double totalA=0.0,totalR=0.0;

    public Notas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Notas");
        md2.addColumn("Nombres");
        md2.addColumn("Definitiva");
        md2.addColumn("Resultado");
        TablaNotas.setModel(md);
        TablaDefinitivas.setModel(md2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TablaNotas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDefinitivas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        Nestudiantes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Nnotas = new javax.swing.JTextField();
        CrearT_Notas = new javax.swing.JButton();
        CDefinitivas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        MostrarHis = new javax.swing.JButton();
        Estadistica = new javax.swing.JButton();
        Exportar = new javax.swing.JButton();
        CargarArchivo = new javax.swing.JButton();
        ExportD = new javax.swing.JButton();
        NombreA = new javax.swing.JTextField();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TablaNotas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Notas de los estudiantes.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Notas Definitivas.");

        TablaDefinitivas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaDefinitivas);

        jLabel3.setText("cantidad de estudiantes:");

        Nestudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NestudiantesActionPerformed(evt);
            }
        });

        jLabel4.setText("Numero de notas corte:");

        Nnotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NnotasActionPerformed(evt);
            }
        });

        CrearT_Notas.setText("Crear tabla");
        CrearT_Notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearT_NotasActionPerformed(evt);
            }
        });

        CDefinitivas.setText("Calcular definitiva");
        CDefinitivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDefinitivasActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre estudiante:");

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre Archivo:");

        MostrarHis.setText("Mostrar Datos");
        MostrarHis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarHisActionPerformed(evt);
            }
        });

        Estadistica.setText("Estadistica del curso");
        Estadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticaActionPerformed(evt);
            }
        });

        Exportar.setText("Exportar Notas");
        Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarActionPerformed(evt);
            }
        });

        CargarArchivo.setText("Cargar");
        CargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarArchivoActionPerformed(evt);
            }
        });

        ExportD.setText("Exportar Definitivas");
        ExportD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportDActionPerformed(evt);
            }
        });

        NombreA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreAActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(51, 51, 51)
                        .addComponent(Nestudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(CrearT_Notas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(46, 46, 46)
                        .addComponent(Nnotas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(CDefinitivas))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(MostrarHis))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Estadistica)
                        .addGap(31, 31, 31)
                        .addComponent(ExportD)
                        .addGap(23, 23, 23)
                        .addComponent(Exportar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(50, 50, 50)
                        .addComponent(NombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(CargarArchivo))))
            .addGroup(layout.createSequentialGroup()
                .addGap(780, 780, 780)
                .addComponent(Salir))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Nestudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CrearT_Notas))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Nnotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(CDefinitivas)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(MostrarHis)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Estadistica)
                            .addComponent(ExportD)
                            .addComponent(Exportar))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(NombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(CargarArchivo)))
                .addGap(47, 47, 47)
                .addComponent(Salir))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NestudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NestudiantesActionPerformed
        
    }//GEN-LAST:event_NestudiantesActionPerformed

    private void NnotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NnotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NnotasActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void CrearT_NotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearT_NotasActionPerformed
       if(!Nestudiantes.getText().equals("")&&!Nnotas.getText().equals("")){
           
       md=new DefaultTableModel();
       md.addColumn("Nombres");
       int columnas=Integer.parseInt(Nnotas.getText());
       for(int i=0;i<columnas;i++)
       {
         md.addColumn("Nota "+( i+1));
       }
       int filas=Integer.parseInt(Nestudiantes.getText());

       for(int i=0;i<filas;i++)
       {
         md.addRow(new Object[columnas]);
       }
       TablaNotas.setModel(md);
       Nestudiantes.setText("");
       Nnotas.setText("");
       }
       else {
           JOptionPane.showMessageDialog(null, "Ingrese el numero de estudiantes y de notas");
       }
    }//GEN-LAST:event_CrearT_NotasActionPerformed

    private void CDefinitivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDefinitivasActionPerformed
        double  Aprobo=0.0,Reprobo=0.0;
        totalA=0;totalR=0;
        double suma=0.0; 
        double NumeroN=TablaNotas.getColumnCount()-1;
        String resultado="",n="";
        double[] promedio=new double[TablaNotas.getRowCount()];
        
        DefaultTableModel md;
        String data[][]={};
        String cab[]={"Nombre","Definitiva","Resultado"};
        md=new DefaultTableModel(data,cab);
        for (int j=0;j<TablaNotas.getRowCount();j++)
        {
            suma=0;
            for (int i = 1; i < TablaNotas.getColumnCount(); i++) {
                suma+=Double.parseDouble(TablaNotas.getValueAt(j,i).toString());
            }
            promedio[j]=suma/NumeroN;
            if (promedio[j]<3) {resultado="Reprobado";totalR++;}
            else{resultado="Aprobado";totalA++;}
            n=TablaNotas.getValueAt(j,0).toString();
            
            String datos[]={n,Double.toString(promedio[j]),resultado};
            md.addRow(datos);
        }
               
        TablaDefinitivas.setModel(md);
    }//GEN-LAST:event_CDefinitivasActionPerformed

    private void MostrarHisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarHisActionPerformed
        int j=0;
        boolean esta=false;
        for (int i = 0; i < TablaNotas.getRowCount(); i++) {
            String t=TablaNotas.getValueAt(i,0).toString();
            String tf= Nombre.getText();
            if (t.equals(tf)) {
              j=i; 
              esta=true;
            }
        }
        if (esta) {
        DefaultCategoryDataset dts=new DefaultCategoryDataset();
        String s="";
        for (int i = 1; i < TablaNotas.getColumnCount(); i++) {
            s="nota "+Integer.toString(i);
            dts.addValue(Double.parseDouble(TablaNotas.getValueAt(j,i).toString()),"NOTAS",s);
        }
        JFreeChart ch= ChartFactory.createLineChart(TablaNotas.getValueAt(j,0).toString(),"N° NOTA","NOTA",dts,PlotOrientation.VERTICAL,true,true,false);
        ChartPanel panel=new ChartPanel(ch);
        JFrame ventana= new JFrame("");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        ventana.add(panel);
        }
        else{
        JOptionPane.showMessageDialog(null, "El nombre ingresado no se encuentra."
                + "\nIngrese un nombre diferente.");
        }
        Nombre.setText("");                                         
    }//GEN-LAST:event_MostrarHisActionPerformed

    private void EstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticaActionPerformed
        DefaultPieDataset dts=new DefaultPieDataset();
        dts.setValue("Aprobados",totalA);
        dts.setValue("Reprobados",totalR);
        JFreeChart ch= ChartFactory.createPieChart("Estadistica",dts,true,true,false);
        ChartPanel panel=new ChartPanel(ch);
        JFrame ventana= new JFrame("");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        ventana.add(panel);
    }//GEN-LAST:event_EstadisticaActionPerformed

    private void NombreAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreAActionPerformed

    private void ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarActionPerformed
        ArrayList<String[]> lista=new ArrayList<String[]>();
        for (int i = 0; i < TablaNotas.getRowCount(); i++) {
            String[] aux =new String[TablaNotas.getColumnCount()];
            for (int j = 0; j < TablaNotas.getColumnCount(); j++) {
            aux[j]=(String) TablaNotas.getValueAt(i, j);
            }
            lista.add(aux);
        }
        if (NombreA != null) {
            Exportar(lista,";",NombreA.getText()+".csv");
        }
        else {
            Exportar(lista,";","TablaNotas.csv");
        }
        NombreA.setText("");
    }//GEN-LAST:event_ExportarActionPerformed

    private void CargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarArchivoActionPerformed
        Extraer(NombreA.getText());
        NombreA.setText("");
    }//GEN-LAST:event_CargarArchivoActionPerformed

    private void ExportDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportDActionPerformed
         ArrayList<String[]> lista2=new ArrayList<String[]>();
        for (int i = 0; i < TablaDefinitivas.getRowCount(); i++) {
            String[] aux =new String[TablaDefinitivas.getColumnCount()];
            for (int j = 0; j < TablaDefinitivas.getColumnCount(); j++) {
            aux[j]=(String) TablaDefinitivas.getValueAt(i, j);
            }
            lista2.add(aux);
        }
         if (NombreA != null) {
            Exportar(lista2,";",NombreA.getText()+".csv");}
         else {Exportar(lista2,";","TablaDefinitivas.csv");}
         NombreA.setText("");
    }//GEN-LAST:event_ExportDActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
         if (JOptionPane.showConfirmDialog(rootPane, "¿Salir de la aplicación?",
                "Notas", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION)
        {System.exit(0);
        }
        else{
                setDefaultCloseOperation(0);
        } 
    }//GEN-LAST:event_SalirActionPerformed
    public void Extraer(String a){
    
        File currentDirFile = new File(".");
        //buscar el archivo en el computador
        String path=System.getProperty("user.dir");
        LogicaNotas archivo=new LogicaNotas(path+"\\"+a+".csv");
        try{
             List<Estructura> lista=archivo.crearListado();
             md=new DefaultTableModel();
             md.addColumn("Nombres");
             for (int i = 1; i < lista.get(0).Nota.size(); i++) {
                md.addColumn("Nota "+i);
            }
             for (int i = 0; i < lista.size(); i++) {
                md.addRow(lista.get(i).Nota.toArray());
            }
            TablaNotas.setModel(md);
        }
        catch(FileNotFoundException ex){
            Logger.getLogger(Notas.class.getName()).log(Level.SEVERE,null,ex);
        }

    }
    public void Exportar(ArrayList<String[]> thingsToWrite, String separator, String fileName){
    try (FileWriter writer = new FileWriter(fileName)){
        for (String[] strings : thingsToWrite) {
            for (int i = 0; i < strings.length; i++) {
                writer.append(strings[i]);
                if(i < (strings.length-1))
                    writer.append(separator);
            }
            writer.append(System.lineSeparator());
        }
        writer.flush();
    } catch (IOException e) {
        e.printStackTrace();
    }
} 
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
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CDefinitivas;
    private javax.swing.JButton CargarArchivo;
    private javax.swing.JButton CrearT_Notas;
    private javax.swing.JButton Estadistica;
    private javax.swing.JButton ExportD;
    private javax.swing.JButton Exportar;
    private javax.swing.JButton MostrarHis;
    private javax.swing.JTextField Nestudiantes;
    private javax.swing.JTextField Nnotas;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreA;
    private javax.swing.JButton Salir;
    private javax.swing.JTable TablaDefinitivas;
    private javax.swing.JTable TablaNotas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
