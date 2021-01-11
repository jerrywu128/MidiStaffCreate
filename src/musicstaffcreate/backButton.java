package musicstaffcreate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class backButton extends JButton{

    msStaffPage parent;

    ClassLoader cldr ;
    URL imageURL;
    public ImageIcon icon ;

    backButton(msStaffPage p){

       parent =p;

        //隱藏按鈕外誆

        //this.setBorderPainted(false);
        //this.setBorder(null);
        cldr = this.getClass().getClassLoader();
        imageURL   = cldr.getResource("icon/reply-message.png");
        icon = new ImageIcon(imageURL);
        this.setIcon(icon);

        this.setToolTipText("返回上一步");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doSomething();
            }
        });

    }
    public void doSomething(){
        if((parent.parent.parent.toolbar.editBar.inputtype==inputType.Cursor)){
           if(parent.notes.size()>0) {
             parent.panel.remove(parent.notes.lastElement());
             parent.notes.remove(parent.notes.lastElement());
             parent.panel.repaint();
         }
        }
    }

}
