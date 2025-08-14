package com.example.config;

import com.example.util.IconLoader;

import javax.swing.*;
import java.awt.*;

public class ConfigLayout{
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

    public void configureFrame(JFrame frame) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(8, 8));
        frame.setSize(420, 300);
        frame.setLocationRelativeTo(null); // centraliza

        // Ícone da janela (opcional, se existir)
        ImageIcon appIcon = IconLoader.loadIcon("/icon/app.png", 32);
        if (appIcon != null) {
            frame.setIconImage(appIcon.getImage());
        }
    }
}
