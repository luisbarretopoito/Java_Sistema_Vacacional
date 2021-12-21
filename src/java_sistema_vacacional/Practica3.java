package java_sistema_vacacional;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jordan
 */
public class Practica3 extends javax.swing.JFrame {

    FondodePanel fondo = new FondodePanel();
    
    public Practica3() {
        this.setContentPane(fondo);
        initComponents();
        setTitle("Panel Central");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icon.png")).getImage());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Practica1 bienvenido = new Practica1();
        jLabel2.setText("Bienvenido " + bienvenido.name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/panelcentral.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel2.setText("Bienvenido");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Período vacacional del empleado:");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Nombres:");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Apellidos:");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Departamento:");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Antigüedad:");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Sexo:");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Resultado del cálculo:");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel10.setText("© Dulcitos Company");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel10.setOpaque(true);

        jTextField1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Calidad", "Ingenieria", "Laborales", "Compras" }));

        jComboBox2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menor a 12 meses", "Entre 12 y 50 meses", "Mayor a 50 meses" }));

        jComboBox3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "No definido" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setText("Nuevo cálculo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(223, 223, 223))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(95, 95, 95)
                                                .addComponent(jLabel7))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)))
                                .addGap(98, 98, 98)
                                .addComponent(jLabel8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel10)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)))
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed

    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Practica1 login = new Practica1();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jTextField1.setText("");
        jTextField2.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jTextArea1.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nombres = jTextField1.getText().trim();
        String apellidos = jTextField2.getText().trim();
        String departamento = jComboBox1.getSelectedItem().toString();
        String antiguedad = jComboBox2.getSelectedItem().toString();
        String sexo = jComboBox3.getSelectedItem().toString();

        if (nombres.equals("") || apellidos.equals("")) {
            Icon icono = new ImageIcon(getClass().getResource("/imagenes/stopicon.png"));
            JOptionPane.showMessageDialog(rootPane, "Completa todos los campos", "Atencion", JOptionPane.PLAIN_MESSAGE, icono);
        } else {
            if (departamento.equals("Calidad")) {
                if (antiguedad.equals("Menor a 12 meses")) {
                    if (sexo.equals("Masculino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 5 dias de vacaciones");
                    } else if (sexo.equals("Femenino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 5 dias de vacaciones");
                    } else if (sexo.equals("No definido")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 5 dias de vacaciones"); 
                    }
                }
                if (antiguedad.equals("Entre 12 y 50 meses")) {
                    if (sexo.equals("Masculino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 10 dias de vacaciones");
                    } else if (sexo.equals("Femenino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 10 dias de vacaciones");
                    } else if (sexo.equals("No definido")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 10 dias de vacaciones"); 
                    }
                }
                if (antiguedad.equals("Mayor a 12 meses")) {
                    if (sexo.equals("Masculino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 15 dias de vacaciones");
                    } else if (sexo.equals("Femenino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 15 dias de vacaciones");
                    } else if (sexo.equals("No definido")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 15 dias de vacaciones"); 
                    }
                }
            }
            if (departamento.equals("Ingenieria")) {
                if (antiguedad.equals("Menor a 12 meses")) {
                    if (sexo.equals("Masculino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 6 dias de vacaciones");
                    } else if (sexo.equals("Femenino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 6 dias de vacaciones");
                    } else if (sexo.equals("No definido")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 6 dias de vacaciones"); 
                    }
                }
                if (antiguedad.equals("Entre 12 y 50 meses")) {
                    if (sexo.equals("Masculino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 12 dias de vacaciones");
                    } else if (sexo.equals("Femenino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 12 dias de vacaciones");
                    } else if (sexo.equals("No definido")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 12 dias de vacaciones"); 
                    }
                }
                if (antiguedad.equals("Mayor a 12 meses")) {
                    if (sexo.equals("Masculino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 18 dias de vacaciones");
                    } else if (sexo.equals("Femenino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 18 dias de vacaciones");
                    } else if (sexo.equals("No definido")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 18 dias de vacaciones"); 
                    }
                }
            }
            if (departamento.equals("Laborales")) {
                if (antiguedad.equals("Menor a 12 meses")) {
                    if (sexo.equals("Masculino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 7 dias de vacaciones");
                    } else if (sexo.equals("Femenino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 7 dias de vacaciones");
                    } else if (sexo.equals("No definido")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 7 dias de vacaciones"); 
                    }
                }
                if (antiguedad.equals("Entre 12 y 50 meses")) {
                    if (sexo.equals("Masculino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 14 dias de vacaciones");
                    } else if (sexo.equals("Femenino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 14 dias de vacaciones");
                    } else if (sexo.equals("No definido")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 14 dias de vacaciones"); 
                    }
                }
                if (antiguedad.equals("Mayor a 12 meses")) {
                    if (sexo.equals("Masculino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 21 dias de vacaciones");
                    } else if (sexo.equals("Femenino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 21 dias de vacaciones");
                    } else if (sexo.equals("No definido")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 21 dias de vacaciones"); 
                    }
                }
            }
            if (departamento.equals("Compras")) {
                if (antiguedad.equals("Menor a 12 meses")) {
                    if (sexo.equals("Masculino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 5 dias de vacaciones");
                    } else if (sexo.equals("Femenino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 5 dias de vacaciones");
                    } else if (sexo.equals("No definido")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 5 dias de vacaciones"); 
                    }
                }
                if (antiguedad.equals("Entre 12 y 50 meses")) {
                    if (sexo.equals("Masculino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 10 dias de vacaciones");
                    } else if (sexo.equals("Femenino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 10 dias de vacaciones");
                    } else if (sexo.equals("No definido")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 10 dias de vacaciones"); 
                    }
                }
                if (antiguedad.equals("Mayor a 12 meses")) {
                    if (sexo.equals("Masculino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 15 dias de vacaciones");
                    } else if (sexo.equals("Femenino")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 15 dias de vacaciones");
                    } else if (sexo.equals("No definido")) {
                        jTextArea1.setText("El trabajador " + nombres + " " + apellidos + " del departamento " + departamento
                                + " con antiguedad " + antiguedad + " de sexo " + sexo + " tiene derecho a 15 dias de vacaciones"); 
                    }
                }
            }
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
            java.util.logging.Logger.getLogger(Practica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    class FondodePanel extends JPanel {
        
        private Image imagen;
        
        @Override
        public void paint(Graphics g) {
            
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondoinicio.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
        
    }
}
