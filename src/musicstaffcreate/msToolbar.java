package musicstaffcreate;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class msToolbar extends JPanel {

    MainWin parent;
    msBaseMenu baseMenu;
    msEditBar editBar;


    msToolbar(MainWin p){

        parent = p;

        baseMenu = new msBaseMenu(this);
        editBar = new msEditBar(this);
        this.setLayout(new BorderLayout());

        this.add(baseMenu,BorderLayout.NORTH);
        this.add(editBar,BorderLayout.SOUTH);

        this.setPreferredSize(new Dimension(0,95));



    }


}
