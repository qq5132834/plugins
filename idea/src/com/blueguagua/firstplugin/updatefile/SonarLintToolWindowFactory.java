package com.blueguagua.firstplugin.updatefile;

import com.blueguagua.firstplugin.mouseRight.action.window.NoteWindow;
import com.blueguagua.firstplugin.updatefile.form.Pom;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.openapi.wm.ToolWindowType;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.intellij.ui.content.ContentManager;
import org.jetbrains.annotations.NotNull;
//import org.sonarlint.intellij.actions.SonarLintToolWindow;
//import org.sonarlint.intellij.issue.IssueManager;
//import org.sonarlint.intellij.issue.hotspot.LocalHotspot;
//import org.sonarlint.intellij.ui.vulnerabilities.TaintVulnerabilitiesPanel;
//
//import static org.sonarlint.intellij.actions.SonarLintToolWindow.buildVulnerabilitiesTabName;
//import static org.sonarlint.intellij.util.SonarLintUtils.getService;

public class SonarLintToolWindowFactory implements ToolWindowFactory {

    public static final String TOOL_WINDOW_ID = "SonarLint";
    public static final String TAB_LOGS = "Log";
    public static final String TAB_CURRENT_FILE = "Current file";
    public static final String TAB_ANALYSIS_RESULTS = "Report";
    public static final String TAB_TAINT_VULNERABILITIES = "Taint vulnerabilities";

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
//        ContentManager contentManager = toolWindow.getContentManager();
//        addIssuesTab(project, contentManager);
//        addAnalysisResultsTab(project, contentManager);
//        addTaintIssuesTab(project, contentManager);
//        addLogTab(project, toolWindow);
//        toolWindow.setType(ToolWindowType.DOCKED, null);
//        SonarLintToolWindow sonarLintToolWindow = getService(project, SonarLintToolWindow.class);
//        contentManager.addContentManagerListener(sonarLintToolWindow);
//        LocalHotspot activeHotspot = sonarLintToolWindow.getActiveHotspot();
//        if (activeHotspot != null) {
//            sonarLintToolWindow.show(activeHotspot);
//        }

        Pom pom = new Pom();
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(pom.getList1(), "", false);

        //
        toolWindow.getContentManager().addContent(content);

    }

//    private static void addIssuesTab(Project project, @NotNull ContentManager contentManager) {
//        IssueManager issueManager = getService(project, IssueManager.class);
//        CurrentFileController scope = new CurrentFileController(project, issueManager);
//        SonarLintIssuesPanel issuesPanel = new SonarLintIssuesPanel(project, scope);
//        Content issuesContent = contentManager.getFactory()
//                .createContent(
//                        issuesPanel,
//                        TAB_CURRENT_FILE,
//                        false);
//        issuesContent.setCloseable(false);
//        contentManager.addDataProvider(issuesPanel);
//        contentManager.addContent(issuesContent);
//    }

//    private static void addAnalysisResultsTab(Project project, @NotNull ContentManager contentManager) {
//        SonarLintAnalysisResultsPanel resultsPanel = new SonarLintAnalysisResultsPanel(project);
//        Content analysisResultsContent = contentManager.getFactory()
//                .createContent(
//                        resultsPanel,
//                        TAB_ANALYSIS_RESULTS,
//                        false);
//        analysisResultsContent.setCloseable(false);
//        contentManager.addDataProvider(resultsPanel);
//        contentManager.addContent(analysisResultsContent);
//    }

//    private static void addTaintIssuesTab(Project project, @NotNull ContentManager contentManager) {
//        TaintVulnerabilitiesPanel vulnerabilitiesPanel = new TaintVulnerabilitiesPanel(project);
//        Content analysisResultsContent = contentManager.getFactory()
//                .createContent(
//                        vulnerabilitiesPanel,
//                        buildVulnerabilitiesTabName(0),
//                        false);
//        analysisResultsContent.setCloseable(false);
//        contentManager.addDataProvider(vulnerabilitiesPanel);
//        contentManager.addContent(analysisResultsContent);
//    }


//    private static void addLogTab(Project project, ToolWindow toolWindow) {
//        Content logContent = toolWindow.getContentManager().getFactory()
//                .createContent(
//                        new SonarLintLogPanel(toolWindow, project),
//                        TAB_LOGS,
//                        false);
//        logContent.setCloseable(false);
//        toolWindow.getContentManager().addContent(logContent);
//    }
}
