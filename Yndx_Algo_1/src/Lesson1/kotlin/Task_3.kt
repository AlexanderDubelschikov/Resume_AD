package Lesson1.kotlin

fun main (args:Array<String>){
    var numbers = mutableListOf<String>()
    var numbers2 = mutableListOf<String>()
    var help: String

    for (i in 0..3)
    {
        numbers.add(readLine()!!)
    }

    for (i in 0..3)
    {
        help=numbers[i].filter { it.isDigit() }
        when(help.length)
        {
            11->help = help.drop(1)
            10->help=help
            8->{
                help = help.drop(1)
                help = "495" + help
            }
            7->help="495" + help
        }
        numbers2.add(help)
    }

    for (i in 1..3)
    {
        if (numbers2[0]==numbers2[i])
            println("YES")
        else
            println("NO")
    }
}
