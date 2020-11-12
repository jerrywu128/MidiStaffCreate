package musicstaffcreate;
//This is a StaffPage you can edit note in this panel.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicButtonUI;



public class msStaffPage extends JScrollPane{

    msTabbedPane parent;
    static int count=0;
    int id;

    JPanel  panel;

    msStaffPage(msTabbedPane p){
        parent = p;
        count++;
        id=count;
        panel = new JPanel(){

            public void paint(Graphics g){

                int l=0;

                g.setColor(Color.black);

                for(int i=0;i<10;i++) {
                    g.drawLine(100, 195+l, 1050, 195+l);
                    g.drawLine(100, 185+l, 1050, 185+l);
                    g.drawLine(100, 175+l, 1050, 175+l);
                    g.drawLine(100, 165+l, 1050, 165+l);
                    g.drawLine(100, 155+l, 1050, 155+l);
                    g.setFont(new Font("", 0, 80));
                    g.drawString("\uD834\uDD1E", 110, 202+l);
                    g.setFont(new Font("", Font.BOLD, 80));
                    g.drawLine(370, 195+l, 370, 155+l);
                    g.setFont(new Font("", Font.BOLD, 80));
                    g.drawLine(600, 195+l, 600, 155+l);
                    g.setFont(new Font("", Font.BOLD, 80));
                    g.drawLine(830, 195+l, 830, 155+l);
                    g.setFont(new Font("", Font.BOLD, 80));
                    g.drawLine(1050, 195+l, 1050, 155+l);

                    l+=125;
                }

                g.setFont(new Font("標楷體",0,30));
                g.drawString("軟體開發中",500,83);

                g.setFont(new Font("標楷體",0,17));
                g.drawString("author",1000,133);

                g.drawString("-" + id + "-", 550, 1390);
            }
        };
        this.panel.setBackground(Color.white);
        this.panel.setPreferredSize(new Dimension(0,1400));



        this.parent.setVisible(true);

        this.setViewportView(panel);


    }



}


