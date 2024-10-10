package com.mycompany.proyecto2_poo;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

public class Proyecto2_POO {

    public static void main(String[] args) {

        // Creación de ventana principal
        JFrame ventana = new JFrame("Menus Desplegables");
        ventana.setSize(400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null); // No layout manager

        // Creación de la barra de menú
        JMenuBar barraMenu = new JMenuBar();
        ventana.setJMenuBar(barraMenu);

        // Creación del menú "Opciones"
        JMenu menuOpciones = new JMenu("Opciones");
        barraMenu.add(menuOpciones);

        // Creación de los submenús "Información personal" y "Cliente"
        JMenuItem infoPersonal = new JMenuItem("Información personal");
        JMenuItem cliente = new JMenuItem("Cliente");
        menuOpciones.add(infoPersonal);
        menuOpciones.add(cliente);

        // Creación de la opción "Salir"
        JMenuItem salir = new JMenuItem("Salir");
        barraMenu.add(salir);

        // Acción para salir de la ventana principal
        salir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Acción para abrir la ventana de Información personal
        infoPersonal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirVentanaInformacionPersonal();
            }
        });

        // Acción para abrir la ventana de Cliente
        cliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirVentanaCliente();
            }
        });

        ventana.setVisible(true); // Mostrar ventana
    }

    // Método para abrir la ventana de Información personal
    public static void abrirVentanaInformacionPersonal() {
        JFrame ventanaPersonal = new JFrame("Información Personal");
        ventanaPersonal.setSize(500, 500);
        ventanaPersonal.setLayout(null);

        // Componentes de la ventana de Información personal
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(50, 30, 100, 30);
        ventanaPersonal.add(nombreLabel);

        JTextField nombreField = new JTextField();
        nombreField.setBounds(150, 30, 150, 30);
        ventanaPersonal.add(nombreField);

        JLabel apellidoLabel = new JLabel("Apellido:");
        apellidoLabel.setBounds(50, 70, 100, 30);
        ventanaPersonal.add(apellidoLabel);

        JTextField apellidoField = new JTextField();
        apellidoField.setBounds(150, 70, 150, 30);
        ventanaPersonal.add(apellidoField);

        JLabel edadLabel = new JLabel("Edad:");
        edadLabel.setBounds(50, 110, 100, 30);
        ventanaPersonal.add(edadLabel);

        JTextField edadField = new JTextField();
        edadField.setBounds(150, 110, 50, 30);
        ventanaPersonal.add(edadField);

        JLabel sexoLabel = new JLabel("Sexo:");
        sexoLabel.setBounds(50, 150, 100, 30);
        ventanaPersonal.add(sexoLabel);

        String[] opcionesSexo = {"Hombre", "Mujer", "Otro"};
        JComboBox<String> sexoComboBox = new JComboBox<>(opcionesSexo);
        sexoComboBox.setBounds(150, 150, 100, 30);
        ventanaPersonal.add(sexoComboBox);

        JLabel fechaNacimientoLabel = new JLabel("Fecha de Nacimiento:");
        fechaNacimientoLabel.setBounds(50, 190, 150, 30);
        ventanaPersonal.add(fechaNacimientoLabel);

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd/MM/yyyy");
        dateChooser.setBounds(200, 190, 150, 30);
        ventanaPersonal.add(dateChooser);

        JLabel telefonoLabel = new JLabel("Teléfono:");
        telefonoLabel.setBounds(50, 230, 100, 30);
        ventanaPersonal.add(telefonoLabel);

        JTextField telefonoField = new JTextField();
        telefonoField.setBounds(150, 230, 150, 30);
        ventanaPersonal.add(telefonoField);

        JLabel correoLabel = new JLabel("Correo Electrónico:");
        correoLabel.setBounds(50, 270, 150, 30);
        ventanaPersonal.add(correoLabel);

        JTextField correoField = new JTextField();
        correoField.setBounds(200, 270, 150, 30);
        ventanaPersonal.add(correoField);

        // Botón para salir
        JButton salirButton = new JButton("Salir");
        salirButton.setBounds(100, 350, 100, 30);
        ventanaPersonal.add(salirButton);

        salirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventanaPersonal.dispose();
            }
        });
        
        //Boton para guardar
        JButton guardarButton = new JButton("Guardar");
        guardarButton.setBounds(200, 350, 100, 30);
        ventanaPersonal.add(guardarButton);
        
        ventanaPersonal.setVisible(true);
    }

    // Método para abrir la ventana de Cliente
    public static void abrirVentanaCliente() {
        JFrame ventanaCliente = new JFrame("Información Cliente");
        ventanaCliente.setSize(400, 300);
        ventanaCliente.setLayout(null);

        // Componentes de la ventana de Cliente
        JLabel clienteLabel = new JLabel("N° Cliente:");
        clienteLabel.setBounds(50, 50, 100, 30);
        ventanaCliente.add(clienteLabel);

        JTextField clienteField = new JTextField();
        clienteField.setBounds(150, 50, 150, 30);
        ventanaCliente.add(clienteField);

        JLabel puestoLabel = new JLabel("Puesto:");
        puestoLabel.setBounds(50, 90, 100, 30);
        ventanaCliente.add(puestoLabel);

        JTextField puestoField = new JTextField();
        puestoField.setBounds(150, 90, 150, 30);
        ventanaCliente.add(puestoField);

        JLabel salarioLabel = new JLabel("Salario:");
        salarioLabel.setBounds(50, 130, 100, 30);
        ventanaCliente.add(salarioLabel);

        JTextField salarioField = new JTextField();
        salarioField.setBounds(150, 130, 150, 30);
        ventanaCliente.add(salarioField);

        // Botón para salir
        JButton salirButton = new JButton("Salir");
        salirButton.setBounds(100, 200, 100, 30);
        ventanaCliente.add(salirButton);
        
        salirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventanaCliente.dispose();
            }
        });
        
        //Boton para guardar
        JButton guardarButton = new JButton("Guardar");
        guardarButton.setBounds(200, 200, 100, 30);
        ventanaCliente.add(guardarButton);

        ventanaCliente.setVisible(true);
    }
}