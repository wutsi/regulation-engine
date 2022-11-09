package com.wutsi.regulation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class CountryRegulationsTest {
    private val regulations = CountryRegulations()

    @Test
    fun getSupportCountryCodes() {
        assertEquals(listOf("CM"), regulations.getSupportCountryCodes())
    }

    @Test
    fun cm() {
        val country = regulations.get("CM")

        assertEquals("CM", country.code)
        assertEquals("XAF", country.currency)
        assertEquals("#,###,##0", country.numberFormat)
        assertEquals("#,###,##0 FCFA", country.monetaryFormat)
        assertEquals("FCFA", country.currencySymbol)
        assertEquals("dd MMM yyy", country.dateFormat)
        assertEquals("HH:mm", country.timeFormat)
        assertEquals("dd MMM yyy, HH:mm", country.dateTimeFormat)
    }

    @Test
    fun countryNotSupported() {
        assertThrows<IllegalStateException> {
            regulations.get("XX")
        }
    }
}
