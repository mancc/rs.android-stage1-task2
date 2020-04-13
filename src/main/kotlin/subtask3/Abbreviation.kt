package subtask3

class Abbreviation {

    // Abbreviation function
    fun abbreviationFromA(a: String, b: String): String {
        var parameterA = 0
        b.forEach { parameterB ->
            parameterA = a.indexOf(ignoreCase = true, char = parameterB, startIndex = parameterA + 1)
            if(parameterA == -1) return "NO"
        }
        return "YES"
    }
}