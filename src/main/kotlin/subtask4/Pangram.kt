package subtask4

import java.lang.StringBuilder

@Suppress("IMPLICIT_CAST_TO_ANY")
class Pangram {

    // Pangram function
    fun getResult(inputString: String): String {
        if (inputString.replace("""\s""".toRegex(), "").isEmpty()) {
            return ""
        }
        val vowels = setOf('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y')
        var tempString = inputString.replace("""[^a-zA-Z]""".toRegex(), "").toLowerCase()
        tempString = tempString.replace("""(.)(?=.*\1)""".toRegex(), "")
        val words = inputString.trim().split("""\s+""".toRegex())
        val numbersAndWords = ArrayList<Pair<Int, String>>()
        if (tempString.length == 26) {
            for (word in words) {
                var numberOfVowels = 0
                val st = StringBuilder(word)
                for (index in st.indices) {
                    if (st[index] in vowels) {
                        numberOfVowels++
                        st[index] = st[index].toUpperCase()
                    }
                }
                numbersAndWords.add(numberOfVowels to st.toString())
            }
        } else {
            for (word in words) {
                var numberOfVowels = 0
                val numberOfNonLetters = word.replace("""[a-zA-Z]""".toRegex(), "").length
                val st = StringBuilder(word)
                for (index in st.indices) {
                    if (st[index] in vowels) {
                        numberOfVowels++
                    } else {
                        st[index] = st[index].toUpperCase()
                    }
                }
                numbersAndWords.add(st.length - numberOfVowels - numberOfNonLetters to st.toString())
            }
        }
        numbersAndWords.sortBy { val first = it.first
            first
        }
        return numbersAndWords.joinToString(" ") {"${it.first}${it.second}"}
    }
}