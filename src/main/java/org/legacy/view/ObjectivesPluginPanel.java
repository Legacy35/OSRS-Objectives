package org.legacy.view;


import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.PluginPanel;
import java.awt.BorderLayout;

import org.legacy.core.ObjectivesManager;
import javax.swing.*;


public class ObjectivesPluginPanel extends PluginPanel{
    ObjectivesManager objectivesManager;
    boolean errorPanelActive =true;
    PluginHeaderPanel header;
    PluginFooterPanel footer;
    ObjectivesListPanel objectives;
    JTextArea errorLabel;

    public ObjectivesPluginPanel(ObjectivesManager objectivesManager) {
        setLayout(null);
        build();
        updatePanel();
        this.objectivesManager = objectivesManager;
    }
    public void updatePanel(){
        if(objectivesManager == null){
            errorPanelActive= true;
            errorLabel.setVisible(errorPanelActive);
            footer.setVisible(!errorPanelActive);
            objectives.setVisible(!errorPanelActive);
            buildError("\n    Log In To Load Objectives...");
            revalidate();
            repaint();
        }
        else if(objectivesManager.isIntialized() && errorPanelActive){
            errorPanelActive = false;
            errorLabel.setVisible(errorPanelActive);
            footer.setVisible(!errorPanelActive);
            objectives.setVisible(!errorPanelActive);
            add(objectives, BorderLayout.CENTER);
            revalidate();
            repaint();
        }
        else if(objectivesManager.isIntialized()){
            objectives.updatePanel();
            repaint();
        }else{
            errorPanelActive= true;
            errorLabel.setVisible(errorPanelActive);
            footer.setVisible(!errorPanelActive);
            objectives.setVisible(!errorPanelActive);
            buildError("\n    Log in to load Objectives...");
            revalidate();
            repaint();
        }

    }

    public void build(){


        setLayout(new BorderLayout());
        header = new PluginHeaderPanel();
        add(header, BorderLayout.PAGE_START);
        footer = new PluginFooterPanel();
        add(footer, BorderLayout.PAGE_END);
        objectives = new ObjectivesListPanel();
        
        errorLabel = new JTextArea();
        errorLabel.setLineWrap(true);
        errorLabel.setWrapStyleWord(true);
        errorLabel.setEditable(false);
        errorLabel.setOpaque(false); // Makes JTextArea look like JLabel (FLIPPED TEMPORARILY)
        errorLabel.setFocusable(false);
        errorLabel.setBorder(null); // Remove border to look like JLabel
        errorLabel.setFont(FontManager.getRunescapeFont());
        errorLabel.setForeground(ColorScheme.PROGRESS_ERROR_COLOR);
        add(errorLabel, BorderLayout.CENTER);



    }
    public void buildError(String errorMessage){
        errorLabel.setFont(FontManager.getRunescapeBoldFont());
        errorLabel.setText(errorMessage);
    }
    public void passObjectiveManager(ObjectivesManager objectivesManager){
        this.objectivesManager=objectivesManager;
    }

}
