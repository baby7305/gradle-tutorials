package com.actia.vehicle.app

import org.apache.commons.httpclient.HttpClient
import org.apache.commons.httpclient.methods.GetMethod
import java.io.File

fun main(args: Array<String>) {
    var client= HttpClient()
    var  range=1..15
    for (i in range){
        var method = GetMethod("http://img1.mm131.com/pic/946/${i}.jpg")
        client.executeMethod(method)
        var  responseBody=method.getResponseBody()
        method.releaseConnection()
        var file= File("${i}.jpg")
        file.writeBytes(responseBody)
    }
}