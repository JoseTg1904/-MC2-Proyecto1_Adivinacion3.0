/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author chepe
 */
public class Truco extends javax.swing.JFrame {

    /**
     * Creates new form Truco
     */
    public Truco(int cantidad) {
        initComponents();
        porcion = MostrarCartas.cartas.subList(0, cantidad);
        this.setVisible(true);
    }

    private Truco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        izquierdo = new javax.swing.JButton();
        centro = new javax.swing.JButton();
        derecho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Truco");

        izquierdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdoActionPerformed(evt);
            }
        });

        centro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centroActionPerformed(evt);
            }
        });

        derecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(centro, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(derecho, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(izquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(centro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(derecho, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void izquierdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdoActionPerformed
        //regresando los contadores de las cartas a sus valores originales
        carta1 = 0;
        carta2 = 1;
        carta3 = 2;

        //limpiando el arreglo de la porcion de cartas seleccionadas
        porcion.clear();

        //llenando el arreglo con el nuevo ordenamieno de cartas
        for (int i = 0; i < derecha.size(); i++) {
            porcion.add(derecha.get(i));
        }
        for (int i = 0; i < izquierda.size(); i++) {
            porcion.add(izquierda.get(i));
        }
        for (int i = 0; i < central.size(); i++) {
            porcion.add(central.get(i));
        }

        //limpiando los sub mazos
        izquierda.clear();
        derecha.clear();
        central.clear();

        validarFinal();
    }//GEN-LAST:event_izquierdoActionPerformed

    private void centroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centroActionPerformed
        //regresando los contadores de las cartas a sus valores originales
        carta1 = 0;
        carta2 = 1;
        carta3 = 2;

        //limpiando el arreglo de la porcion de cartas seleccionadas
        porcion.clear();

        //llenando el arreglo con el nuevo ordenamiento de cartas
        for (int i = 0; i < derecha.size(); i++) {
            porcion.add(derecha.get(i));
        }
        for (int i = 0; i < central.size(); i++) {
            porcion.add(central.get(i));
        }
        for (int i = 0; i < izquierda.size(); i++) {
            porcion.add(izquierda.get(i));
        }

        //limpiando los sub mazos
        izquierda.clear();
        derecha.clear();
        central.clear();

        validarFinal();
    }//GEN-LAST:event_centroActionPerformed

    private void derechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechoActionPerformed
        //regresando los contadores de las cartas a sus valores originales
        carta1 = 0;
        carta2 = 1;
        carta3 = 2;

        //limpiando el arreglo de la porcion de cartas seleccionadas
        porcion.clear();

        //llenando el arreglo con el nuevo ordenamiento de cartas
        for (int i = 0; i < central.size(); i++) {
            porcion.add(central.get(i));
        }
        for (int i = 0; i < derecha.size(); i++) {
            porcion.add(derecha.get(i));
        }
        for (int i = 0; i < izquierda.size(); i++) {
            porcion.add(izquierda.get(i));
        }

        //limpiando los sub mazos
        izquierda.clear();
        derecha.clear();
        central.clear();

        validarFinal();
    }//GEN-LAST:event_derechoActionPerformed

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
            java.util.logging.Logger.getLogger(Truco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Truco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Truco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Truco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Truco().setVisible(true);
            }
        });
    }

    //arreglo para la porcion de la baraja a usar
    List<Integer> porcion = new ArrayList<Integer>();

    //arreglos de los tres montones de cartas 
    List<Integer> izquierda = new ArrayList<Integer>();
    List<Integer> central = new ArrayList<Integer>();
    List<Integer> derecha = new ArrayList<Integer>();

    //variable para almacenar la cantidad de lanzamientos
    int lanzamientos = 0;

    //variable que almacena la posicion inicial de las cartas
    int carta1 = 0;
    int carta2 = 1;
    int carta3 = 2;

    //variable para validar un uso del timer
    int aux = 0;

    public void validarFinal() {
        //variables para obtener la posicion final de la carta y la carta adivinada
        int posicion = 0;
        int result = 0;

        //instancia de la clase que mostrara la carta adivinada
        Resultado resultado = new Resultado();

        //obteniendo la posicion de la carta adivinada 
        posicion = (porcion.size() + 1) / 2;

        //obteniendo la carta adivinada
        for (int i = 0; i < posicion; i++) {
            result = porcion.get(i);
        }

        //validando cada caso de la cantidad de cartas seleccionadas
        if (porcion.size() == 3) {
            //validando que se hayan cumplido la cantidad de lanzamientos necesaarios para el ordenamiento
            if (lanzamientos == 1) {
                //mostrando la ventana con la carta adivinada
                resultado.setVisible(true);
                this.dispose();
                resultado.mostrarResultado(result);
            }
        } else if (porcion.size() == 9) {
            if (lanzamientos == 2) {
                resultado.setVisible(true);
                this.dispose();
                resultado.mostrarResultado(result);
            } else {
                vacio();
            }
        } else if (porcion.size() > 14 && porcion.size() < 28) {
            if (lanzamientos == 3) {
                resultado.setVisible(true);
                this.dispose();
                resultado.mostrarResultado(result);
            } else {
                vacio();
            }
        } else if (porcion.size() > 32 && porcion.size() < 82) {
            if (lanzamientos == 4) {
                resultado.setVisible(true);
                this.dispose();
                resultado.mostrarResultado(result);
            } else {
                vacio();
            }
        } else if (porcion.size() > 86) {
            if (lanzamientos == 5) {
                resultado.setVisible(true);
                this.dispose();
                resultado.mostrarResultado(result);
            } else {
                vacio();
            }
        }
    }

    public void vacio() {
        //evitando que presionen los botones hasta que finalice el llenado de los submazos
        izquierdo.setEnabled(false);
        centro.setEnabled(false);
        derecho.setEnabled(false);

        //instancia para crear un timer
        Timer timer1 = new Timer();

        //obteniendo la imagen de fondo
        Image imagen = new ImageIcon(getClass().getResource("/imagenes/trasera.jpg")).getImage();

        //redimensionando la imagen
        imagen = imagen.getScaledInstance(275, 400, Image.SCALE_SMOOTH);

        //creando el icono de la imagen para agregarla a la etiqueta
        ImageIcon ima = new ImageIcon(imagen);

        //poninedo la imagen en los tres sub mazos
        izquierdo.setDisabledIcon(ima);
        centro.setDisabledIcon(ima);
        derecho.setDisabledIcon(ima);

        //iniciando el timer
        TimerTask task1;
        task1 = new TimerTask() {
            @Override
            public void run() {
                //esperar solo una llamada del timer para mostrar las cartas
                aux++;
                if (aux == 2) {
                    aux = 0;
                    posicionar();
                    //cancelando el timer 
                    timer1.cancel();
                }
            }
        };
        timer1.schedule(task1, 1, 2500);
    }

    public void posicionar() {
        //instancia para crear un timer
        Timer timer = new Timer();

        //iniciando el timer
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                //validando que la ultima carta no se pase del tamaño del arreglo
                if (carta3 < porcion.size()) {
                    //obteniendo la imagen de fondo
                    Image imagen = new ImageIcon(getClass().getResource("/imagenes/" + porcion.get(carta1) + ".jpg")).getImage();

                    //redimensionando la imagen
                    imagen = imagen.getScaledInstance(275, 400, Image.SCALE_SMOOTH);

                    //creando el icono de la imagen para agregarla a la etiqueta
                    ImageIcon ima = new ImageIcon(imagen);

                    //agregando la imagen al boton y el valor al arreglo 
                    izquierdo.setDisabledIcon(ima);
                    izquierdo.setIcon(ima);
                    izquierda.add(porcion.get(carta1));

                    //obteniendo la imagen de fondo
                    imagen = new ImageIcon(getClass().getResource("/imagenes/" + porcion.get(carta2) + ".jpg")).getImage();

                    //redimensionando la imagen
                    imagen = imagen.getScaledInstance(275, 400, Image.SCALE_SMOOTH);

                    //creando el icono de la imagen para agregarla a la etiqueta
                    ima = new ImageIcon(imagen);

                    //agregando la imagen al boton y el valor al arreglo
                    centro.setDisabledIcon(ima);
                    centro.setIcon(ima);
                    central.add(porcion.get(carta2));

                    //obteniendo la imagen de fondo
                    imagen = new ImageIcon(getClass().getResource("/imagenes/" + porcion.get(carta3) + ".jpg")).getImage();

                    //redimensionando la imagen
                    imagen = imagen.getScaledInstance(275, 400, Image.SCALE_SMOOTH);

                    //creando el icono de la imagen para agregarla a la etiqueta
                    ima = new ImageIcon(imagen);

                    //agregando la imagen al boton y el valor al arreglo
                    derecho.setDisabledIcon(ima);
                    derecho.setIcon(ima);
                    derecha.add(porcion.get(carta3));

                    //modificando la posicion de los botones
                    carta1 += 3;
                    carta2 += 3;
                    carta3 += 3;
                } else {
                    //cancelando el timer
                    timer.cancel();

                    //aumentando la cantidad de lanzamientos realizados
                    lanzamientos++;

                    //dejando que el usuario seleccione el mazo donde se encuentra su carta
                    JOptionPane.showMessageDialog(Truco.this, "Seleccione el mazo donde quedo su carta");
                    izquierdo.setEnabled(true);
                    centro.setEnabled(true);
                    derecho.setEnabled(true);
                }
            }
        };
        timer.schedule(task, 1, 2500);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton centro;
    private javax.swing.JButton derecho;
    private javax.swing.JButton izquierdo;
    // End of variables declaration//GEN-END:variables
}
