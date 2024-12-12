/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

fun printEven(numbers: IntArray) {
    println("Even Numbers:")
    for (num in numbers) {
        if (num % 2 == 0) {
            println(num)
        }
    }
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Print the entire array
    println("All Numbers: ${numbers.joinToString()}")

    // Call the function to print even numbers
    printEven(numbers)
}



