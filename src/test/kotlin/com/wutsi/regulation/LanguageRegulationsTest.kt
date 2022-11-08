package com.wutsi.regulation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LanguageRegulationsTest {
    private val language = LanguageRegulations()

    @Test
    fun getSupportedLanguages() {
        assertEquals(listOf("en", "fr"), language.getSupportLanguageCodes())
    }
}
