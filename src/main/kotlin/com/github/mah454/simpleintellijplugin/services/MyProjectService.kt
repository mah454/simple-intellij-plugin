package com.github.mah454.simpleintellijplugin.services

import com.github.mah454.simpleintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
