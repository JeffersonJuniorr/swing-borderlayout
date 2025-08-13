package com.example.ui;

import com.example.components.Components;
import com.example.config.ConfigLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.net.URL;

/**
 * BorderLayout com botões que possuem ícones, tooltips e mnemonics.
 * Ícones esperados no classpath: /icons/north.png, /icons/south.png, /icons/west.png,
 * /icons/east.png, /icons/center.png, /icons/app.png
 */
public class BorderLayoutDemo extends JFrame {
    public static void main(String[] args) {

        Components components = new Components();
        ConfigLayout configLayout = new ConfigLayout();

        components.addComponents();
        configLayout.configureLookAndFeel();
        configLayout.configureFrame();

        SwingUtilities.invokeLater(() -> {
            BorderLayoutDemo frame = new BorderLayoutDemo();
            frame.setVisible(true);
        });
    }
}
