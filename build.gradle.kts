plugins {
    java
}

task("getname", {
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