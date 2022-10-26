fun main() {

    fun secondsToMinute(seconds: Int): String {
        val minutes = seconds / 60
        return when {
            minutes in 11..14 -> "минут"
            minutes % 10 == 1 -> "минуту"
            minutes % 10 in 2..4 -> "минуты"
            else -> "минут"
        }
    }

    fun ago(seconds: Int) = when (seconds) {
        in 0..59 -> "Был(а) в сети недавно"
        in 60..59 * 60 -> "Был(а) в сети ${seconds / 60} ${secondsToMinute(seconds)} назад"
        else -> "Давно"
    }

    println(ago(48))
    println(ago(1500))
}
