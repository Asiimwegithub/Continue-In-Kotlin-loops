fun main(args: Array<String>) {
    //we go with a while loop
    //we wanna print numbers from 1-10 but we need to escape 5
    var x = 1
   while (x<=10){
       if(x%3==0){
           x++
           continue
       }
       println(x)
       x++
   }
}
