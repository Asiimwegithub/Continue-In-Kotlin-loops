fun main(args: Array<String>) {
    //we go with a do while loop
    //we wanna print numbers from 1-10 but we need to escape 5
    var x= 1
    do {
        if (x==5){
            x++
            continue
        }
        println(x)
        x++
    }while(x<=10)
//we run again
}

