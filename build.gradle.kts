task("open-door", {
    doFirst {
        println("open-door")
    }
})

task("put-elephant", {
    doFirst {
        println("put-elephant")
    }
}).dependsOn("open-door")

task("close-door", {
    doFirst {
        println("close-door")
    }
}).dependsOn("put-elephant")