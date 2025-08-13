package com.example.util;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class IconLoader {
    public static ImageIcon loadIcon(String path, int size) {
        URL url = IconLoader.class.getResource(path);
        if (url == null) return null;
        Image img = new ImageIcon(url).getImage().getScaledInstance(size, size, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }
}
