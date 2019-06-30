package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?):Pair<String?, String?>{

        val parts : List<String>? = fullName?.split(" ")

        var firstName = parts?.getOrNull(0)
        if (firstName.isNullOrBlank()) firstName = "null"
        var lastName = parts?.getOrNull(1)
        if (lastName.isNullOrBlank()) lastName = "null"
//        return Pair(firstName, lastName)
        return firstName to lastName    }
}