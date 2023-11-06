package com.example.demo1

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.ui.Messages

class PrintAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
//        Messages.showMessageDialog("Hello", "Print Action", Messages.getInformationIcon())

        val editor: Editor? = event.getData(PlatformDataKeys.EDITOR)

        val selectedText = editor?.selectionModel?.selectedText

        Messages.showMessageDialog(selectedText, "Selected Text in Editor", Messages.getInformationIcon())


    }
}