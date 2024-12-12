/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
fun main() {
    
    
    val num =arrayOf<Int>(1,2,3,4,5)
    
        num.set(0,10)
        num.set(1,4)
        num.set(3,8)
        num.set(4,5)
        
         for(i in num.indices) 
         {
             println(num[i])
         }
    
    
}
