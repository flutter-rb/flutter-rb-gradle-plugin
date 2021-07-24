package com.smlnskgmail.jaman.flutterrb

import groovy.json.JsonOutput
import org.gradle.api.Plugin
import org.gradle.api.Project

class InfoPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task('prepareInfo') {
            doLast {
                def output = [
                        'version': project.version
                ]
                def outputFile = new File(
                        "$project.rootDir.path/flutter_rb_gradle_plugin_output.json"
                )
                outputFile.write(
                        JsonOutput.prettyPrint(
                                JsonOutput.toJson(output)
                        )
                )
            }
        }
    }
}
