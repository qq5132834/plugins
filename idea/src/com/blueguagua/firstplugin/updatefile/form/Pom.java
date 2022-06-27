package com.blueguagua.firstplugin.updatefile.form;

import javax.swing.*;
import java.util.*;

public class Pom {

    public final static String FILE = "";
    public final static List<PomContent> POM_CONTENTS = new ArrayList<>();
    public final static Map<String, PomContent> MAP = new HashMap<>();

    static {
        POM_CONTENTS.add(new PomContent().setFile(FILE).setLine(1).setStart(1).setEnd(3));
        POM_CONTENTS.add(new PomContent().setFile(FILE).setLine(3).setStart(4).setEnd(7));
        POM_CONTENTS.add(new PomContent().setFile(FILE).setLine(5).setStart(2).setEnd(3));
        POM_CONTENTS.stream().forEach(e->{
            MAP.put(e.getTip(), e);
        });
    }

    private JList list1;

    public Pom(){
        DefaultListModel dlm = new DefaultListModel();
        POM_CONTENTS.stream().map(e->e.getTip()).forEach(dlm::addElement);
        list1.setModel(dlm);
        this.list1.addListSelectionListener(e->{
            Arrays.stream(list1.getSelectedIndices()).forEach(index->{
                PomContent pomContent = MAP.get(list1.getModel().getElementAt(index));

            });
        });
    }

    public JList getList1() {
        return list1;
    }


    public static class PomContent{
        private int line;
        private int start;
        private int end;
        private String tip = UUID.randomUUID().toString();
        private String file;

        public int getLine() {
            return line;
        }

        public PomContent setLine(int line) {
            this.line = line;
            return this;
        }

        public int getStart() {
            return start;
        }

        public PomContent setStart(int start) {
            this.start = start;
            return this;
        }

        public int getEnd() {
            return end;
        }

        public PomContent setEnd(int end) {
            this.end = end;
            return this;
        }

        public String getFile() {
            return file;
        }

        public PomContent setFile(String file) {
            this.file = file;
            return this;
        }

        public String getTip() {
            return tip;
        }

    }

}
