package com.wutsi.regulation

class Country(
    val code: String,
    val currency: String,
    val currencySymbol: String,
    val numberFormat: String,
    val monetaryFormat: String,
    val dateFormat: String,
    val dateFormatShort: String,
    val timeFormat: String,
    val dateTimeFormat: String,
    val supportsBusinessAccount: Boolean,
    val supportsStore: Boolean
) {
    companion object {
        val CM = Country(
            code = "CM",
            currency = "XAF",
            currencySymbol = "FCFA",
            numberFormat = "#,###,##0",
            monetaryFormat = "#,###,##0 FCFA",
            dateFormat = "dd MMM yyy",
            dateFormatShort = "dd MMM",
            timeFormat = "HH:mm",
            dateTimeFormat = "dd MMM yyy, HH:mm",
            supportsBusinessAccount = true,
            supportsStore = true
        )
    }
}
