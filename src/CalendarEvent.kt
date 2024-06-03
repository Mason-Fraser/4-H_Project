data class CalendarEvent(
    var title: String,
    var description: String,
    var startTime: EventTime,
    var tags: Array<String>,
    var endTime: EventTime?
)
