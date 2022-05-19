fun main(){

    var n = 1

    for(i in 1..100){

        if(n%3==0){

            if(n%5==0){

                print("Fizzbuzz, ")

            }else print("Fizz, ")

        }else if(n%5==0){

            print("Buzz, ")

        } else print("$n, ")
        n++
    }

}