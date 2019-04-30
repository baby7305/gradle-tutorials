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

task("haha",{
    var haha="baby" //扫描时执行
    doFirst {}      //运行时执行
    doLast {}       //运行时执行
})