package org.legacy.view;

import net.runelite.client.ui.ColorScheme;
import org.legacy.utils.IconUtils;

import javax.swing.*;
import java.util.Objects;

public class PluginHeaderPanel extends JPanel {
    public PluginHeaderPanel(){

        add(new JLabel(new ImageIcon(Objects.requireNonNull(IconUtils.loadImage("ObjLogo-small.png")))));
        setBackground(ColorScheme.BORDER_COLOR);
    }
}
