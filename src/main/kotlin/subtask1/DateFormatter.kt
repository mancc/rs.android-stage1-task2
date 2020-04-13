package subtask1

import java.time.format.DateTimeFormatter
import java.time.format.ResolverStyle
import java.time.LocalDate
import java.util.*

class DateFormatter {

    // Date Formatter function
    fun toTextDay(day: String, month: String, year: String): String {
        val inputString = "$day.$month.$year"
        val strToDateFormatter = DateTimeFormatter.ofPattern("d.M.uuuu").withResolverStyle(ResolverStyle.STRICT)
        return try {
            val date = LocalDate.parse(inputString, strToDateFormatter)
            val toStringFormatter = DateTimeFormatter.ofPattern("d MMMM, EEEE", Locale("ru"))
            val formattedDate = date.format(toStringFormatter)
            formattedDate
        } catch (e: Exception) {
            "Такого дня не существует"
        }
    }
}
