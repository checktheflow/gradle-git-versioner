plugins {
    id("io.toolebox.git-versioner")
}

versioner {
    startFrom {
        major = 1
        minor = 1
        patch = 1
    }
    match {
        major = "trex"
        minor = "stego"
        patch = "compy"
    }
    tag {
        prefix = "x"
    }
    pattern {
        pattern = "%M.%m.%p(-%c)"
    }
}

tasks.create("printVersionEarly") {
    versioner.apply()
    val version = project.version
    doLast {
        println(version)
    }
}
