class Calendar {
    enum class Day2 {
        MONDAY {
            override fun message() = "Hétfő van!"
        },
        TUESDAY {
            override fun message() = "Kedd van!"
        },
        WEDNESDAY {
            override fun message() = "Szerda van!"
        },
        THURSDAY {
            override fun message() = "Csütörtök van!"
        },
        FRIDAY {
            override fun message() = "Péntek van, majdnem hétvége!"
        },
        SATURDAY {
            override fun message() = "Szombat van, pihenés!"
        },
        SUNDAY {
            override fun message() = "Vasárnap van, nyugi nap!"
        };

        abstract fun message(): String
    }
}