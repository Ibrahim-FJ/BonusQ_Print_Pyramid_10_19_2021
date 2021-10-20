import java.lang.NumberFormatException

fun main(){
               
                 // Application to print a half pyramid using numbers.


    println("Enter the number of lines....")
    try {                                               // using try catch to handle the exception to nonInteger input
        val numberOfLines = readLine()!!.toInt()        // take the number of lines from the user
        for (lineCounter in 1 .. numberOfLines){        // 1st loop to print new line
            for(numberCounter in 1 .. lineCounter){     // 2nd loop to print the numbers in each line
                print("1 x $numberCounter  ")           // print the numbers
            }
            print("\n")                                 // print new line
        }

    }catch (exception : NumberFormatException){
        println("Wrong input, please try to enter only integer number, Error: $exception")      // print a message to the user with the error details
    }

}