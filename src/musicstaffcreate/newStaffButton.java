package musicstaffcreate;


import javax.swing.*;
import java.awt.*;

public class newStaffButton extends msButton {



    newStaffButton(msToolbar p){

        super(p);

        //隱藏按鈕外誆

        //this.setBorderPainted(false);
        //this.setBorder(null);

        imageURL   = cldr.getResource("icon/add-file.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);

        this.setToolTipText("新增頁面");

    }
    public void doSomething(){
         this.parent.parent.tabbedPane.addTab("page",new JScrollPane(new msStaffPage(this.parent.parent.tabbedPane)));
    }

}
