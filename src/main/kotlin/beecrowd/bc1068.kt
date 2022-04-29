package beecrowd

import java.util.*



fun responde(a:String){
    var pilharef = Stack<Int>()
    var boleano = true
    for (i in a.indices){
        if(a[i]=='('){
            pilharef.push(1)
        } else if(a[i]==')'){
            if(pilharef.size==0){
                boleano=false
                break
            } else {
                pilharef.pop()
            }
        }
    }
    if(pilharef.size!=0){
        boleano=false
    }
    if(boleano){
        println("correct")
    } else if(!boleano){
        println("incorrect")
    }
}

fun main(args: Array<String>){
    var sc = Scanner(System.`in`)
    while(sc.hasNext()){
        var a = sc.next()
        responde(a)
    }
}
