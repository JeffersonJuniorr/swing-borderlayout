package com.example.config;

import com.example.util.IconLoader;

import javax.swing.*;
import java.awt.*;

public class ConfigLayout extends JFrame{
//    IconLoader iconLoader = new IconLoader();

    public void configureLookAndFeel() {
        // Tenta ativar o tema Nimbus para um visual mais moderno (opcional)
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ignored) { /* Fallback para o L&F padrão */ }
    }

    public void configureFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(8, 8));
        setSize(420, 300);
        setLocationRelativeTo(null); // centraliza

        // Ícone da janela (opcional, se existir)
        ImageIcon appIcon = IconLoader.loadIcon("/icon/app.png", 32);
        if (appIcon != null) {
            setIconImage(appIcon.getImage());
        }
    }
}
