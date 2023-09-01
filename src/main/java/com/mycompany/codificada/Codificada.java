package com.mycompany.codificada;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Codificada extends JFrame implements ActionListener {

    JLabel titulo, perrGrand, perrMed, perrPeq, horas, img;
    JTextField txtGrand, txtMed, txtPeq, txtHoras;
    JButton btnCalcularCosto;

    public static void main(String[] args) {
        Codificada codi = new Codificada();
    }

    public Codificada() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(187, 246, 231));
        setLayout(null);

        titulo = new JLabel("CALCULADORA DE PASEO PARA PERRITOS");
        add(titulo);
        titulo.setBounds(50, 30, 400, 20);
        titulo.setFont(new Font("Britannic Bold", 1, 20));
        
        img = new JLabel(new ImageIcon("C:\\Users\\mh684\\OneDrive\\Imágenes\\guauguau.jpg"));
        img.setBounds(100, 60, 300, 180);
        add(img);  

        perrGrand = new JLabel("Perros Grandes: ");
        add(perrGrand);
        perrGrand.setBounds(130, 250, 200, 20);
        txtGrand = new JTextField(10);
        add(txtGrand);
        txtGrand.setBounds(250, 250, 100, 20);

        perrMed = new JLabel("Perros Medianos:");
        add(perrMed);
        perrMed.setBounds(130, 290, 200, 20);
        txtMed = new JTextField(10);
        add(txtMed);
        txtMed.setBounds(250, 290, 100, 20);

        perrPeq = new JLabel("Perros Pequeños:");
        add(perrPeq);
        perrPeq.setBounds(130, 330, 200, 20);
        txtPeq = new JTextField(10);
        add(txtPeq);
        txtPeq.setBounds(250, 330, 100, 20);

        horas = new JLabel("Numero de Horas:");
        add(horas);
        horas.setBounds(130, 370, 200, 20);
        txtHoras = new JTextField(10);
        add(txtHoras);
        txtHoras.setBounds(250, 370, 100, 20);

        btnCalcularCosto = new JButton("Calcular Costo");
        add(btnCalcularCosto);
        btnCalcularCosto.setBounds(180, 410, 120, 25);
        btnCalcularCosto.addActionListener(this);
        btnCalcularCosto.setBackground(new Color(255, 153, 153));

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        if (accion.equals("Calcular Costo")) {
            int grande, mediano, pequeño, hor, totP, cosT;
            grande = Integer.parseInt(txtGrand.getText());
            mediano = Integer.parseInt(txtMed.getText());
            pequeño = Integer.parseInt(txtPeq.getText());
            hor = Integer.parseInt(txtHoras.getText());
            totP = grande + mediano + pequeño;

            cosT = (grande * 10000 + mediano * 5000 + pequeño * 3000) * hor;
            if (totP > 1) {
                cosT = (int) (cosT - (cosT * 0.1));
            }
            JOptionPane.showMessageDialog(null, "Costo total : " + cosT, "COSTO DEL PASEO", JOptionPane.INFORMATION_MESSAGE);

        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
