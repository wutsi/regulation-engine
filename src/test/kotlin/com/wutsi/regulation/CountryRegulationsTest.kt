package com.wutsi.regulation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CountryRegulationsTest {
    private val country = CountryRegulations()

    @Test
    fun getSupportCountryCodes() {
        assertEquals(listOf("CM"), country.getSupportCountryCodes())
    }
}
