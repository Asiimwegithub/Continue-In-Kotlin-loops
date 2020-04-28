fun main(args: Array<String>) {
    //we go with a for loop
    //we wanna print numbers from 1-10 but we need to escape 5
    var x= 1
   for(x in 1..10){
       if(x==2 ||x== 8){
           continue
       }
       println(x)
   }
}
