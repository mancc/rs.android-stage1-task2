package subtask5

import kotlin.reflect.KClass
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Blocks {

    // Blocks function
    fun getData(a: Array<*>, b: KClass<*>): Any {
        when(b){
            Int::class -> {
                var result = 0
                for (c in a){
                    if (c is Int){
                        result+=c
                    }
                }
                return result
            }
            String::class -> {
                var result = ""
                for (c in a){
                    if (c is String){
                        result+=c
                    }
                }
                return result
            }
            else -> {
                var result = LocalDate.now()
                var check = false
                for (c in a) {
                    if (c is LocalDate) {
                        if ((!check) || (c > result)) {
                            check = true
                            result = c
                        }
                    }
                }
                return result.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
        }
    }
}