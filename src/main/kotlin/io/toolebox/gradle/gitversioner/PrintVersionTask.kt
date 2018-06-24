package io.toolebox.gradle.gitversioner

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

open class PrintVersionTask : DefaultTask() {
    @Input
    lateinit var versioner: Versioner
    @Input
    lateinit var startFrom: StartFrom
    @Input
    lateinit var match: Match

    @TaskAction
    fun printVersion() {
        println(versioner.version(startFrom, match))
    }
}
