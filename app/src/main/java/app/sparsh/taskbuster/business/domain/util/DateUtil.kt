package app.sparsh.taskbuster.business.domain.util

import com.google.firebase.Timestamp
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DateUtil
@Inject
constructor(private val dateFormat: SimpleDateFormat) {

    fun removeTimeFromDateString(dateString: String): String {
        return dateString.substring(0, dateString.indexOf(" "))
    }

    fun convertFirebaseTimestampToStringDate(timestamp: Timestamp): String {
        return dateFormat.format(timestamp.toDate())
    }

    fun convertStringDateToFirebaseTimestamp(dateString: String): Timestamp {
        return Timestamp(dateFormat.parse(dateString))
    }

    fun getCurrentTimestamp(): String {
        return dateFormat.format(Date())
    }

}