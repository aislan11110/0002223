package round806
private fun readInt() = readln().toInt() // single int
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

private fun questão(s:String):String{
    var yes = "yes"
    var stolower = s.toLowerCase()
    for(i in stolower.indices){
        if(stolower[i]== yes[i]){
            continue
        } else {
            return "NO"
        }
    }
    return "YES"
}

fun main (){
    var x = readInt()
    var y = 0

    while(x!=y){
        println(questão(readln()))
        y++
    }
}