package Lesson1.kotlin

fun main(args:Array<String>){

    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    var c = readLine()!!.toInt()

    if (a+b>c && a+c>b && b+c>a)
        println("YES")
    else
        println("NO")
}