package practicaguiadatabla;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormTabla extends javax.swing.JFrame {

    public FormTabla() {
        initComponents();
        Lista l = new Lista();
        l.agregarNodo(15);
        l.agregarNodo(5);
        l.agregarNodo(52);
        l.agregarNodo(8);
        l.agregarNodo(75);
        l.agregarNodo(33);
        l.agregarNodo(25);
        l.agregarNodo(3);
        l.agregarNodo(78);
        l.agregarNodo(18);
        l.agregarNodo(20);

        int arregloNodos[] = new int[l.getCantNodos()];
        arregloNodos = l.imprimirLista();
        DefaultTableModel modelo = new DefaultTableModel();
        String[] cabecera = {"Nodos", "Alfa", "Beta"};
        modelo.setColumnIdentifiers(cabecera);
        Object[] datos = new Object[l.getCantNodos()];
        for (int i = 0; i < l.getCantNodos(); i++) {
            datos[0] = arregloNodos[i];
            datos[1] = "a";
            datos[2] = "b";
            modelo.addRow(datos);
        }
        tbPersonas.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbPersonas = new javax.swing.JTable();
        btnListadoDePersona = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPersonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPersonas);

        btnListadoDePersona.setText("Listado De Persona");
        btnListadoDePersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoDePersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListadoDePersona))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListadoDePersona)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListadoDePersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoDePersonaActionPerformed
        // TODO add your handling code here:
        Persona[] arrPersonas = new Persona[5];
        for (int i = 0; i < 5; i++) {
            arrPersonas[i] = new Persona(null, null, 0);
        }

        arrPersonas[0] = new Persona("Ana", "Jimenez", 18);
        arrPersonas[1] = new Persona("Laura", "Etrada", 19);
        arrPersonas[2] = new Persona("Samuel", "Rodriguez", 18);
        arrPersonas[3] = new Persona("Jonathan", "Gutierrez", 20);
        arrPersonas[4] = new Persona("Ivan", "Montes", 19);

        DefaultTableModel modeloPersona = new DefaultTableModel();
        String[] cabecera = {"No.", "Nombre", "Apellido", "Edad"};
        modeloPersona.setColumnIdentifiers(cabecera);
        Object[] datosPersona = new Object[arrPersonas.length];

        for (int i = 0; i < arrPersonas.length; i++) {
            datosPersona[0] = i + 1;
            datosPersona[1] = arrPersonas[i].getNombre();
            datosPersona[2] = arrPersonas[i].getApellido();
            datosPersona[3] = arrPersonas[i].getEdad();
            modeloPersona.addRow(datosPersona);
        }
        tbPersonas.setModel(modeloPersona);
    }//GEN-LAST:event_btnListadoDePersonaActionPerformed

    private void tbPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPersonasMouseClicked
        // TODO add your handling code here:
        int numRenglon = tbPersonas.getSelectedRow();
        int numColmuna = tbPersonas.getSelectedColumn();
        String valor = tbPersonas.getValueAt(numRenglon, numColmuna).toString();
        JOptionPane.showMessageDialog(null, "Valor: " + valor + "\n" + "Renglón/Columna: " + numRenglon + ", " + numColmuna);
    }//GEN-LAST:event_tbPersonasMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListadoDePersona;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPersonas;
    // End of variables declaration//GEN-END:variables
}
