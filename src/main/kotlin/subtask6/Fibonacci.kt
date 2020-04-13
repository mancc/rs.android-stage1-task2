package subtask6

class Fibonacci {

    //Fibonacci function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var a = 0
        var b = 1
        while(a * b <= n){
            if(a * b == n) return intArrayOf(a, b, 1)
            b += a
            a = b - a
        }
        return intArrayOf(a, b, 0)
    }
}