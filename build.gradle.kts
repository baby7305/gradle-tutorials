plugins {
    java
}

task("getname", {
    inputs.dir("src");
    outputs.file("info.txt")
    doFirst {
        var srcdir = fileTree("src")
        var infotext = file("info.txt")
        infotext.writeText("")
        srcdir.forEach {
            if (it.isFile) {
                Thread.sleep(1000)
                infotext.appendText(it.absolutePath)
                infotext.appendText("\r\n")
            }
        }
    }
})