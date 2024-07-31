package org.legacy.view;

import lombok.Getter;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import org.legacy.utils.RecommendedObjectiveList;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.image.BufferedImage;

@Getter
public class ObjectiveBox extends JPanel {
    String tittle;
    String description;
    BufferedImage icon;
    RecommendedObjectiveList Objectives;

    public ObjectiveBox(String tittle, BufferedImage icon, RecommendedObjectiveList Objectives, String description){
        this.tittle = tittle;
        this.description = description;
        this.icon = icon;
        this.Objectives = Objectives;
        build();
    }
    public void build(){
        final Font rsFont = FontManager.getRunescapeFont();
        final Font rsBoldFont = FontManager.getRunescapeBoldFont();
        setBackground(ColorScheme.LIGHT_GRAY_COLOR);
        setVisible(true);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        JLabel objectiveIcon = new JLabel(new ImageIcon(icon));
        JLabel objectiveTittle = new JLabel(tittle);
        objectiveTittle.setFont(rsBoldFont);
        JTextArea objectiveDescription = new JTextArea(description);
        objectiveDescription.setLineWrap(true);
        objectiveDescription.setWrapStyleWord(true);
        objectiveDescription.setEditable(false);
        objectiveDescription.setOpaque(true); // Makes JTextArea look like JLabel (FLIPPED TEMPORARILY)
        objectiveDescription.setFocusable(false);
        objectiveDescription.setBorder(null); // Remove border to look like JLabel
        objectiveDescription.setFont(rsFont);
        gbc.gridx =0;
        gbc.gridy =0;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(objectiveIcon,gbc);
        gbc.gridx =1;
        gbc.gridy =0;
        gbc.gridwidth=4;
        gbc.gridheight=1;
        gbc.weightx = 0.9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(objectiveTittle,gbc);
        gbc.gridx =0;
        gbc.gridy =1;
        gbc.gridwidth=5;
        gbc.gridheight=1;
        gbc.weighty = .9;
        gbc.weightx=1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(objectiveDescription,gbc);
        setBorder(new LineBorder(Color.BLACK, 1));
        validate();
        repaint();
    }
}
