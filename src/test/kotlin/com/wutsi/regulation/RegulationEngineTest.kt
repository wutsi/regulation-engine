package com.wutsi.regulation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertTrue

internal class RegulationEngineTest {
    private val engine = RegulationEngine()

    @Test
    fun supportedCountries() {
        assertEquals(listOf("CM"), engine.supportedCountries())
    }

    @Test
    fun countryCM() {
        val country = engine.country("CM")

        assertEquals("CM", country.code)
        assertEquals("XAF", country.currency)
        assertEquals("#,###,##0", country.numberFormat)
        assertEquals("#,###,##0 FCFA", country.monetaryFormat)
        assertEquals("FCFA", country.currencySymbol)
        assertEquals("dd MMM yyy", country.dateFormat)
        assertEquals("HH:mm", country.timeFormat)
        assertEquals("dd MMM yyy, HH:mm", country.dateTimeFormat)
        assertTrue(country.supportsStore)
        assertTrue(country.supportsBusinessAccount)
    }

    @Test
    fun countryNotSupported() {
        assertThrows<CountryNotSupportedException> {
            engine.country("XX")
        }
    }

    @Test
    fun supportedLanguages() {
        assertEquals(listOf("en", "fr"), engine.supportedLanguages())
    }

    @Test
    fun maxPictures() {
        assertEquals(RegulationEngine.MAX_PICTURES, engine.maxPictures())
    }

    @Test
    fun maxProducts() {
        assertEquals(RegulationEngine.MAX_PRODUCTS, engine.maxProducts())
    }
}
