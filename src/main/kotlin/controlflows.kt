fun main(args: Array<String>) {
//    if statement
    //if...else statement
    //if elseif...else statement
    var num=5
    if (num<20){
        println("It's true")
    } else
        println("It's false")

    var nambari =230
    if (nambari<0){
        println("It's negative")
    } else if (nambari>0 && nambari<10){
        println("It's a single digit number")
    } else if (nambari>=10 && nambari<100){
        println("It's a  double digit number")
    } else
        println("Number has 3 or more digits")
}