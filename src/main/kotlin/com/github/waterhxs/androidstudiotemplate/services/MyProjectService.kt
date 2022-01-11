package com.github.waterhxs.androidstudiotemplate.services

import com.intellij.openapi.project.Project
import com.github.waterhxs.androidstudiotemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
