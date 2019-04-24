task("open-door", {
    println("open-door")
})

task("put-elephant", {
    println("put-elephant")
}).dependsOn("open-door")

task("close-door", {
    println("close-door")
}).dependsOn("put-elephant")