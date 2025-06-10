package filterMap

data class FilterResult(
val olderThan25: List<Person>,
val names: List<String>,
val isAnyoneOlderThan30: Boolean
)

