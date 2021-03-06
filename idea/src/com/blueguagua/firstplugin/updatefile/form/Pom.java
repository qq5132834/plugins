package com.blueguagua.firstplugin.updatefile.form;

import com.blueguagua.firstplugin.updatefile.PfcDocumentListener;
import com.blueguagua.firstplugin.updatefile.SonarLintToolWindowFactory;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.RangeMarker;
import com.intellij.openapi.util.Key;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
            PomContent pomContent = MAP.get(list1.getModel().getElementAt(list1.getSelectedIndices()[0]));
            System.out.println(pomContent.getTip());

            RangeMarker rangeMarker = new RangeMarker() {
                    @NotNull
                    @Override
                    public Document getDocument() {
                        Document document = PfcDocumentListener.getDocument();
                        System.out.println(document.getClass().getSimpleName());
                        return document;
                    }

                    @Override
                    public int getStartOffset() {
                        return 1;
                    }

                    @Override
                    public int getEndOffset() {
                        return 2;
                    }

                    @Override
                    public boolean isValid() {
                        return false;
                    }

                    @Override
                    public void setGreedyToLeft(boolean b) {

                    }

                    @Override
                    public void setGreedyToRight(boolean b) {

                    }

                    @Override
                    public boolean isGreedyToRight() {
                        return false;
                    }

                    @Override
                    public boolean isGreedyToLeft() {
                        return false;
                    }

                    @Override
                    public void dispose() {

                    }

                    @Nullable
                    @Override
                    public <T> T getUserData(@NotNull Key<T> key) {
                        return null;
                    }

                    @Override
                    public <T> void putUserData(@NotNull Key<T> key, @Nullable T t) {

                    }
                };

                SonarLintToolWindowFactory.getSonarLintHighlighting()
                        .highlightFlowsWithHighlightersUtil(rangeMarker, "?????????helloworld=" + pomContent.getTip(), Collections.emptyList());



//            Arrays.stream(list1.getSelectedIndices()).forEach(index->{
//                PomContent pomContent = MAP.get(list1.getModel().getElementAt(index));
//                System.out.println(pomContent.getTip());
//
//                SonarLintToolWindowFactory.getSonarLintHighlighting()
//                        .highlightFlowsWithHighlightersUtil(rangeMarker, "?????????helloworld=" + pomContent.getTip(), Collections.emptyList());
//
//
//            });
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

