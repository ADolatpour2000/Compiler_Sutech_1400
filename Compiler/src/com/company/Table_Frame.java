package com.company;
import java.lang.String;
import javax.swing.*;
import java.awt.*;

public class Table_Frame {
    private JFrame f;
    private String Addess;

    public Table_Frame(String Address) {
        this.Addess = Address;
        Identifier_Table identifier_table = new Identifier_Table(Addess);
        Show_Identifier(identifier_table);
        Show_Token(identifier_table);
    }

    private void Show_Identifier(Identifier_Table identifier_table){
        f=new JFrame();
        String[] column ={"ID Number","Identifier","Type","value"};
        JTable jt=new JTable(identifier_table.getTable(),column);
        jt.setBounds(30,40,200,300);
        jt.setSelectionBackground(Color.LIGHT_GRAY);
        jt.setBackground(Color.CYAN);
        jt.setGridColor(Color.gray);
        JScrollPane sp = new JScrollPane(jt);
        JMenuBar jm= new JMenuBar();
        f.add(sp);
        f.setTitle("Identifier");
        f.setBackground(Color.orange);
        jt.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        f.pack();
        f.setSize(300,400);
        f.setVisible(true);
    }

    private void Show_Token(Identifier_Table identifier_table){
        f=new JFrame();
        String column[] = {"Token","Type"};
        JTable jt=new JTable(identifier_table.Token_Table(identifier_table),column);
        jt.setBounds(30,40,200,300);
        jt.setSelectionBackground(Color.LIGHT_GRAY);
        jt.setBackground(Color.CYAN);
        jt.setGridColor(Color.gray);
        JScrollPane sp = new JScrollPane(jt);
        JMenuBar jm= new JMenuBar();
        f.add(sp);
        f.setTitle("Token");
        f.setBackground(Color.CYAN);
        jt.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        f.pack();
        f.setSize(300,400);
        f.setVisible(true);
    }
}