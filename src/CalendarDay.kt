class CalendarDay(
    val date: CalendarDate,
    private var event: CalendarEvent
) {
    init {

    }
    fun printInfo(){
        val endTime = if (event.endTime != null) {
            "End Time, ${event.endTime?.hour}:${event.endTime?.minute}  ${event.endTime?.period}"
        } else {
            ""
        }
        val tagsString = if (event.tags.isNotEmpty()) {
            event.tags.joinToString(", ")
        } else {
            "None"
        }
        println("Title, ${event.title}\n" +
                "Description, ${event.description}\n" +
                "Tags, $tagsString\n" +
                "StartTime, ${event.startTime.hour}:${event.startTime.minute} ${event.startTime.period}\n" +
                endTime
        )
    }
}