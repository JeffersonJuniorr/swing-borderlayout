package com.example.ui;

import com.example.components.Components;
import com.example.config.ConfigLayout;

import javax.swing.*;

/**
 * BorderLayout com botões que possuem ícones, tooltips e mnemonics.
 * Ícones esperados no classpath: /icons/north.png, /icons/south.png, /icons/west.png,
 * /icons/east.png, /icons/center.png, /icons/app.png
 */
public class BorderLayoutDemo{
    public static void main(String[] args) {

        ConfigLayout configLayout = new ConfigLayout();
        configLayout.configureLookAndFeel();

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            Components components = new Components();

            configLayout.configureFrame(frame);
            components.addComponents(frame);
            frame.setVisible(true);
        });
    }
}
