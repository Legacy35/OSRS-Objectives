package org.legacy.view;

import net.runelite.client.ui.ColorScheme;
import org.legacy.utils.IconUtils;
import org.legacy.utils.RecommendedObjectiveList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ObjectivesListPanel extends JPanel {

    public ObjectivesListPanel (){
        setLayout(new GridBagLayout());
        //setLayout(new GridLayout(0,1,2,10));
        setBorder(new EmptyBorder(10, 0, 15, 0));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx =0;
        gbc.gridy =0;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL; // Ensures the component takes the entire width
        gbc.insets = new Insets(5, 0, 5, 0); // Optional: add padding between components
        ObjectiveBox test = new ObjectiveBox("test", IconUtils.loadImage("ObjSymbol-nano.png"),new RecommendedObjectiveList(), "testing");
        add(test,gbc);
        String testString= "This is a much more detailed lora ipsum testing detail we should. \n also see how new lines do\n in this scenario...";
        for(int i =0; i<10;i++) {
            ObjectiveBox test1 = new ObjectiveBox("test", IconUtils.loadImage("ObjSymbol-nano.png"), new RecommendedObjectiveList(), testString);
            gbc.gridy +=1;
            add(test1,gbc);
            testString+="Wow another line was added "+i+"\n";
        }

        setBackground(ColorScheme.PROGRESS_COMPLETE_COLOR);
    }

    public void updatePanel() {
    }
}
