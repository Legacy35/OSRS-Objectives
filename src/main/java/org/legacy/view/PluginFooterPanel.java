package org.legacy.view;

import net.runelite.client.ui.ColorScheme;

import javax.swing.*;

public class PluginFooterPanel extends JPanel {
    public PluginFooterPanel(){
        add(new JLabel("Footer"));
        setBackground(ColorScheme.PROGRESS_ERROR_COLOR);
    }
}
