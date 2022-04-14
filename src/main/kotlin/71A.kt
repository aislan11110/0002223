

fun receberStr(s:String):String{
    return if(s.length>10){
        s[0]+(s.length-2).toString()+s[s.length-1]
    } else {
        s
    }

}

    

fun main (){
    var x = readln().toInt()
    var y = 0
    while(y!=x){
        println(receberStr(readln()))
        y++
    }
}