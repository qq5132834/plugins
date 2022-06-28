package com.blueguagua.firstplugin.updatefile;

import com.blueguagua.firstplugin.updatefile.form.Pom;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;
import org.sonarlint.intellij.editor.SonarLintHighlighting;

import java.util.Collections;

public class SonarLintToolWindowFactory implements ToolWindowFactory {

    private static Project project;
    private static SonarLintHighlighting sonarLintHighlighting;

    public static Project getProject(){
        return project;
    }

    public static SonarLintHighlighting getSonarLintHighlighting(){
        return sonarLintHighlighting;
    }

    @Override
    public void createToolWindowContent(@NotNull Project pro, @NotNull ToolWindow toolWindow) {
//        project = pro;
//        sonarLintHighlighting = new SonarLintHighlighting(pro);
        //sonarLintHighlighting.highlightFlowsWithHighlightersUtil(null, "helloworld", Collections.emptyList());
        //
        Pom pom = new Pom();
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(pom.getList1(), "", false);
        toolWindow.getContentManager().addContent(content);
    }

}
