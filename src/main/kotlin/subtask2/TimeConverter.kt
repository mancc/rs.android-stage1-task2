package subtask2

class TimeConverter {

    // Time Converter function
    fun toTextFormat(hour: String, minute: String): String {
        val a = hour.toInt()
        val b = minute.toInt()
        if((a > 12) or (b > 60))
            return ""
        val words = arrayOf("", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
            "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
            "twenty six", "twenty seven", "twenty eight", "twenty nine")
        return when {
            b == 0 -> "${words[a]} o' clock"
            b == 30 -> "half past ${words[a]}"
            b == 15 -> "quarter past ${words[a]}"
            b == 45 -> "quarter to ${words[a + 1]}"
            b == 1 -> "one minute past ${words[a]}"
            b < 30 -> "${words[b]} minutes past ${words[a]}"
            b > 30 -> "${words[60 - b]} minutes to ${words[a + 1]}"
            else -> ""
        }
    }
}