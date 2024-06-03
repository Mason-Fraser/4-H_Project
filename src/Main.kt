fun main() {
    val firstDay = CalendarDay(
        CalendarDate(),
        CalendarEvent(
            title = "First Event",
            description = "This is an event",
            startTime = EventTime(1, 30, Period.PM),
            tags = arrayOf("School", "Math"),
            endTime = EventTime(2, 30, Period.PM)
        )
    )
    firstDay.printInfo()
}