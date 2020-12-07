package musicstaffcreate;
//This is a StaffPage you can edit note in this panel.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicButtonUI;



public class msStaffPage extends JScrollPane{

    msTabbedPane parent;
    static int count=0;
    int id;

    JPanel  panel;
    msLabel staffTitle,authorTitle;


    msStaffPage(msTabbedPane p){
        parent = p;
        count++;
        id=count;
        this.getVerticalScrollBar().setUnitIncrement(10);




        panel = new JPanel(){

            public void paintComponent(Graphics g){

                int l=0;
                int x[]={370,600,830,1050};//分隔線位置

                g.setColor(Color.black);

                for(int i=0;i<10;i++) {
                    for(int j=0;j<5;j++) {
                        g.drawLine(100, 155+ j*10 + l, 1050, 155 + j*10 + l);
                    }//五線
                    g.setFont(new Font("", 0, 90));
                    g.drawString("\uD834\uDD1E", 110, 202+l);
                    for(int k=0;k<4;k++) {
                        g.setFont(new Font("", Font.BOLD, 80));
                        g.drawLine(x[k], 195 + l, x[k], 155 + l);
                     }//小節數
                    l+=125;
                }






                g.setFont(new Font("", 0, 18));
                g.drawString("-" + id + "-", 565, 1390);
            }


        };
        this.panel.setLayout(null);

        staffTitle = new msLabel("軟體開發中",SwingConstants.CENTER);
        staffTitle.setLocation(450,33);
        staffTitle.setFont(new Font("標楷體",0,30));
        staffTitle.setSize(new Dimension(250,75));

        panel.add(staffTitle);


        authorTitle = new msLabel("author",SwingConstants.CENTER);
        authorTitle.setLocation(989,90);
        authorTitle.setFont(new Font("標楷體",0,17));
        authorTitle.setSize(new Dimension(75,75));
        panel.add(authorTitle);




        this.panel.setBackground(Color.white);
        this.panel.setPreferredSize(new Dimension(0,1400));



        this.parent.setVisible(true);

        this.setViewportView(panel);


    }



}


