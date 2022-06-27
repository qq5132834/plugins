package com.blueguagua.firstplugin.updatefile.form;

import javax.swing.*;

public class Pom {
    private JList list1;

    public Pom(){
        DefaultListModel dlm = new DefaultListModel();
        dlm.addElement("xixi");
        dlm.addElement("zizi");
        list1.setModel(dlm);
    }

    public JList getList1() {
        return list1;
    }

    public static void main(String[] args) {
        Pom pom = new Pom();

    }
}
