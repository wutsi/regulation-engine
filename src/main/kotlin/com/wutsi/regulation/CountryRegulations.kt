package com.wutsi.regulation

class CountryRegulations {
    private val countries = listOf(
        Country.CM
    )

    fun getSupportCountryCodes(): List<String> =
        countries.map { it.code }

    fun get(code: String): Country =
        countries.find { it.code.equals(code, ignoreCase = true) }
            ?: throw CountryNotSupportedException("Country not supported: $code")
}
