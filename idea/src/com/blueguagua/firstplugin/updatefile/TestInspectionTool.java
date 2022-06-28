package com.blueguagua.firstplugin.updatefile;

import com.intellij.codeInspection.AbstractBaseJavaLocalInspectionTool;
import com.intellij.codeInspection.ProblemsHolder;
import com.intellij.psi.JavaElementVisitor;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiField;
import org.jetbrains.annotations.NotNull;

/***
 * 所有的变量都提示 this is an error.
 * 例如: private int anInt = 0;
 */

//public class TestInspectionTool extends AbstractBaseJavaLocalInspectionTool {
//
//    @NotNull
//    @Override
//    public PsiElementVisitor buildVisitor(@NotNull ProblemsHolder holder, boolean isOnTheFly) {
//        return new JavaElementVisitor() {
//            @Override
//            public void visitField(PsiField field) {
//                super.visitField(field);
//                holder.registerProblem(field, "this is an error");
//            }
//        };
//    }
//}