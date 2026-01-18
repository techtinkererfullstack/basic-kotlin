//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


//    fun gradingCalculator() {
//        //Grading calculation with when
//        println("enter your Grade :")
//        val grade:Int = readLine()!!.trim().toInt()
//
//        when (grade) {
//            in 80..100 -> println("A+")
//            in 50..80 -> println("B+")
//            else -> println("Fail")
//        }
//    }
//
//    gradingCalculator()
//
//
//    //calculator making
//    fun calculator() {
//        print("enter first number: ")
//        val a = readln().toDouble()
//        print("enter first number: ")
//        val b = readln().toDouble()
//        print("enter operator + - * / :")
//        val operator = readln().toString()
//
//        val result = when (operator) {
//            "+" -> a + b
//            "-" -> a - b
//            "*" -> a * b
//            "/" -> if (b != 0.0) {
//                a / b
//            } else {
//                println("can not devide by zero")
//            }
//
//            else -> {
//                println("invalid operator")
//                return
//            }
//        }
//        println(result)
//    }
//
//    calculator()


//// 1. Positive/Negative/Zero: Take an integer and print whether it is positive, negative, or zero.
//fun positive_negative_number() {
//    println("Enter your number: ")
//    val number = readLine()!!.toInt()
//
//    if(number > 0 ) {
//        println("Your number is positive.")
//    } else if (number < 0) {
//        println("your number is negative.")
//    } else {
//        println("Your number is zero")
//    }
//}
//    positive_negative_number()

////2. Determine if a number is even or odd.
//fun negative_number() {
//    println("Enter your number: ")
//    val number = readLine()!!.toInt()
//    if(number % 2 ==0 ) {
//        println("Your number is even.")
//    } else {
//        println("number is odd")
//    }
//}
//    negative_number()

//    // 3.  Given an age, check if a person is eligible to vote (18 or older).
//    fun vote_eligibility() {
//        println("Enter your age: ")
//        val personAge = readLine()!!.toInt()
//
//        if (personAge > 18) {
//            println("Your age is $personAge Your are eligible for vote.")
//        } else {
//            println("Your age is $personAge and you are not eligible for vote.")
//        }
//    }

//    //4. Take two numbers and print which one is larger, or if they are equal.
//    fun largestNumber() {
//        println("Enter you first number :")
//        val number1 = readLine()!!.toInt()
//        println("Enter you second number :")
//        val number2 = readLine()!!.toInt()
//
//        if (number1 > number2) {
//            println("$number1 > $number2 first number is greater than second number")
//        } else if (number1 < number2) {
//            println("$number1 < $number2 first number is smallest than second number")
//        }
//    }


//    // 5.Given a score (0-100), print "Pass" if it's 50 or above, otherwise print "Fail."
//    fun calculatePassScore() {
//        println("Enter your score :")
//        val score = readLine()!!.toInt()
//
//        if (score > 50) {
//            println("pass")
//        } else if (score < 50) {
//            println("Fail")
//        }
//    }

//    //6. School Grading: Input a score and assign a grade: 90+ (A), 80-89 (B), 70-79 (C), 60-69 (D), below 60 (F).
//    fun calculateSchoolGrade() {
//        val grade = readLine()!!.toInt()
//
//        if (grade >= 90) {
//            println("A")
//        } else if (grade >= 80) {
//            println("B")
//        } else if (grade >= 70) {
//            println("C")
//        } else if (grade >= 60) {
//            println("D")
//        } else if (grade < 60) {
//            println("F")
//        }
//    }

    //7. Age Groups: Categorize a person based on age: 0-12 (Child), 13-19 (Teenager), 20-59 (Adult), 60+ (Senior).
//    println("Enter your age :")
//    val age = readLine()!!.toInt()
//
//    when (age) {
//        in 0..12 -> println("Child")
//        in 13..19 -> println("Teenager")
//        in 20..59 -> println("Adult")
//    }

    //8. BMI Calculator: Based on a BMI value, print: Underweight (<18.5), Normal (18.5-24.9), Overweight (25-29.9), or Obese (30+).
//    println("Enter your weight :")
//    val weight = readLine()!!.toDouble()
//
//    if (weight >= 0 && weight <= 18.5) {
//        println("Underweight")
//    } else if (weight >= 18.5 && weight <= 24.9) {
//        println("Normal")
//    } else if (weight >= 18.5 && weight <= 24.9) {
//        println("Overweight")
//    } else {
//        println("Obese")
//    }

    //9.1 Temperature Advice: Input temperature in Celsius: <0 (Freezing), 0-15 (Cold), 16-30 (Warm), 31+ (Hot).

//    solution using if else statement
//    println("Enter temperature :")
//    val temperature = readLine()!!.toInt()
//    if (temperature < 0) {
//        println("Freezing")
//    } else if (temperature >= 0 && temperature <= 15) {
//        println("cold")
//    } else if (temperature >= 16 && temperature <= 30) {
//        println("Warm")
//    } else {
//        println("Hot")
//    }

//    solution using when statement
//    println("Enter temperature :")
//    val temperature = readLine()!!.toInt()
//
//
    //    if (temperature < 0) {
//        println("Freezing")
//    } else if (temperature >= 0 && temperature <= 15) {
//        println("Cold")
//    } else if (temperature >= 16 && temperature <= 30) {
//        println("Warm")
//    } else {
//        println("Hot")
//    }

    //10 Number of Digits: Check if a positive number has 1, 2, 3, or "more than 3" digits.
//    println("Enter you number :")
//    val temperature = readLine()!!
//
//    println(temperature.length)
//    val radius = readLine()!!.toInt()
//    val pi = 3.14159
//    val volume = (4.0 / 3.0) * pi * radius * radius * radius
//    println("VOLUME = %.3f".format(volume))

//  11.  Leap Year: Determine if a given year is a leap year (Divisible by 4, but if divisible by 100, it must also be divisible by 400).
//    println("enter your year:")
//    val year = readLine()!!.toInt()
//    if (year % 4 == 0) {
//        println("leap year")
//        if (year % 100 == 0) {
//            if (year % 400 == 0) {
//                println("leap year")
//            }
//        }
//    } else {
//        println("not a leap year")
//    }

    //12.  Triangle Validity: Given three angles, check if they form a valid triangle (sum must be 180).
//    println("first angle:")
//    val angle1 = readLine()!!.toInt()
//    println("second angle:")
//    val angle2 = readLine()!!.toInt()
//    println("third angle:")
//    val angle3 = readLine()!!.toInt()
//
//    val validTriangle = angle1 + angle2 + angle3 == 180
//    if (validTriangle) {
//        println("Sum of 3 angles is 180 so it is a valid triangle")
//    } else {
//        println("It is not a valid triangle")
//    }

//    13. Quadrant Finder: Given $(x, y)$ coordinates, determine which quadrant the point lies in (1st, 2nd, 3rd, or 4th).
//    println("enter x value: ")
//    val x = readLine()!!.toInt()
//    println("enter y value: ")
//    val y = readLine()!!.toInt()
//    val result = when {
//        x > 0 && y > 0 -> "1st Quadrant"
//        x < 0 && y > 0 -> "2nd Quadrant"
//        x < 0 && y < 0 -> "3rd Quadrant"
//        x > 0 && y < 0 -> "4th Quadrant"
//        x == 0 && y == 0 -> "Origin"
//        else -> "On an Axis"
//    }
//    println("The point ($x, $y) is in the ${result}.")

//    14.Largest of Three: Take three numbers and find the absolute maximum using only if-else blocks.
//    println("enter x value: ")
//    val x = readLine()!!.toInt()
//    println("enter y value: ")
//    val y = readLine()!!.toInt()
//    println("enter z value: ")
//    val z = readLine()!!.toInt()
//
//    if (x > y && y > z) {
//        println("value of x is $x the largest number")
//    } else if (y > z) {
//        println("value of y is $y the largest number")
//    } else {
//        println("value of z is $z the largest number")
//    }
//  15  Check if a number is divisible by both 5 and 11, only 5, only 11, or neither.
//    println("enter x value: ")
//    val number = readLine()!!.toInt()
//    if (number % 5 == 0 && number % 11 == 0) {
//        println("number $number is divisible by both 5 & 11")
//    } else if (number % 5 == 0) {
//        println("number $number is divisible by 5")
//    } else if (number % 11 == 0) {
//        println("number $number is divisible by 11")
//    } else {
//        println("number $number is not divisible by both 5 or 11")
//    }

//    16. Electricity Bill: Calculate cost based on units: First 100 units ($5/unit), next 100 ($7/unit), above 200 ($10/unit).
//    println("Enter your unit: ")
//    val unit: Int = readLine()!!.toInt()
//    if (unit < 100) {
//        val cost: Int = unit * 5
//        println("your $unit total cost is $cost")
//    } else if (unit > 100) {
//        val cost: Int = (100 * 5) + (unit - 100) * 7
//        println("your $unit total cost is $cost")
//    } else if (unit > 200) {
//        val cost: Int = (100 * 5) + ((unit - 100) * 7) + ((unit - 200) * 10)
//        println("your $unit total cost is $cost")
//    } else {
//        println("Enter positive number")
//    }

//    17. Weekend or Weekday: Given a number (1-7), print if it’s a "Weekday" or "Weekend."
//    println("Enter your number: ")
//    val day: Int = readLine()!!.toInt()
//
//    when (day) {
//        7 -> println("Weekend")
//        in 1..6 -> println("Weekday")
//        else -> println("Invalid input! Please enter a number between 1 and 7")
//    }

//    18. Rock Paper Scissors: Given two inputs (e.g., "Rock" and "Paper"), declare the winner or a tie.
//    println("Enter player 1 name: ")
//    val player1: String = readLine()!!.lowercase()
//    println("Enter Player 2 name: ")
//    val player2: String = readLine()!!.lowercase()
//
//    println("Choose: ")
//    val rock: String = readLine()!!.lowercase()
//    println("Choose: ")
//    val scissor: String = readLine()!!.lowercase()
//
//    if (player1 && rock == player2 && rock) {
//
//    }
//   19 Login System: Check if a username equals "Admin" AND password equals "1234". Print "Access Granted," "Wrong Password," or "Unknown User."
//    println("Enter your Username:")
//    val username: String = readln()!!.toString()
//    println("Enter your Password:")
//    val password: String = readln()!!.toString()
//
//    if (username == "Admin" && password == "1234") {
//        println("Access Granted")
//    } else {
//        println("Wrong password or Unknown User")
//    }
//    20. Discount Calculator: Based on purchase amount: <$100 (No discount), $100-$500 (10% off), >$500 (20% off).
//    println("Enter your Purchase Amount: ")
//    val purchase: Int = readLine()!!.toInt()
//    if (purchase < 100) {
//        val discount: Int = 0
//        println("your $purchase total discount is $discount")
//    } else if (purchase >= 100 && purchase <= 500) {
//        val discount: Int = 0 + (purchase * 10) / 100
//        println("your $purchase total discount is $discount")
//    } else if (purchase > 500) {
//        val discount: Int = (purchase * 20) / 100
//        println("your $purchase total discount is $discount")
//    } else {
//        println("No Available Discount for you right now.")
//    }

}










