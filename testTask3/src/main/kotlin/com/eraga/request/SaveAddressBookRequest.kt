package com.eraga.request

import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class SaveAddressBookRequest (
    @get:NotNull
    @get:Size(min = 1, max = 50)
    val name: String?,

    @get:NotNull
    @get:Size(min = 1, max = 50)
    val region: String?,

    @get:Size(min = 0, max = 50)
    val city: String,

    @get:NotNull
    @get:Size(min = 1, max = 50)
    val contact: String?,

    @get:Size(min = 0, max = 100)
    val notes: String
)
