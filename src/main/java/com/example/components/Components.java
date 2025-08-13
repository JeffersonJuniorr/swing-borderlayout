package com.example.components;

import javax.swing.*;
import java.awt.*;

import static com.example.util.IconLoader.loadIcon;

public class Components extends JFrame {

    private JButton createButton(String text, String iconPath, String tooltipHtml, int mnemonic) {
        JButton b = new JButton(text);
        ImageIcon icon = loadIcon(iconPath, 18);
        if (icon != null) {
            b.setIcon(icon);
        }
        b.setToolTipText(tooltipHtml);
        b.setMnemonic(mnemonic);
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b.setFocusPainted(false);
        b.setBorder(new javax.swing.border.EmptyBorder(8, 12, 8, 12)); // mais área clicável
        return b;
    }

    public void addComponents() {
        JButton btnNorte  = createButton(
                "NORTE", "/icons/north.png",
                "<html><b>Ir para o Norte</b><br/>Atalho: Alt+N</html>", 'N');

        JButton btnSul    = createButton(
                "SUL", "/icons/south.png",
                "<html><b>Ir para o Sul</b><br/>Atalho: Alt+S</html>", 'S');

        JButton btnOeste  = createButton(
                "OESTE", "/icons/west.png",
                "<html><b>Ir para o Oeste</b><br/>Atalho: Alt+O</html>", 'O');

        JButton btnLeste  = createButton(
                "LESTE", "/icons/east.png",
                "<html><b>Ir para o Leste</b><br/>Atalho: Alt+L</html>", 'L');

        JButton btnCentro = createButton(
                "CENTRO", "/icons/center.png",
                "<html><b>Ação do Centro</b><br/>Atalho: Alt+C</html>", 'C');

        // Ações simples de demonstração
        btnNorte.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Clique em NORTE!", "Ação", JOptionPane.INFORMATION_MESSAGE));
        btnSul.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Clique em SUL!", "Ação", JOptionPane.INFORMATION_MESSAGE));
        btnOeste.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Clique em OESTE!", "Ação", JOptionPane.INFORMATION_MESSAGE));
        btnLeste.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Clique em LESTE!", "Ação", JOptionPane.INFORMATION_MESSAGE));
        btnCentro.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Clique em CENTRO!", "Ação", JOptionPane.INFORMATION_MESSAGE));

        add(btnNorte,  BorderLayout.NORTH);
        add(btnSul,    BorderLayout.SOUTH);
        add(btnOeste,  BorderLayout.WEST);
        add(btnLeste,  BorderLayout.EAST);
        add(btnCentro, BorderLayout.CENTER);
    }

}
