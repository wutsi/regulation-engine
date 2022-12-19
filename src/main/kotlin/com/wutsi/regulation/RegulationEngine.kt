package com.wutsi.regulation

class RegulationEngine {
    companion object {
        const val MAX_PRODUCTS = 50
        const val MAX_PICTURES = 5
        const val MAX_DIGITAL_DOWNLOAD_FILES = 5
    }

    private val countries = listOf(
        Country.CM
    )

    fun supportedLanguages(): List<String> =
        listOf("en", "fr")

    fun supportedCountries(): List<String> =
        countries.map { it.code }

    fun country(code: String): Country =
        countries.find { it.code.equals(code, ignoreCase = true) }
            ?: throw CountryNotSupportedException("Country not supported: $code")

    fun maxPictures() = MAX_PICTURES

    fun maxProducts() = MAX_PRODUCTS

    fun maxDigitalDownloadFiles() = MAX_DIGITAL_DOWNLOAD_FILES
}
