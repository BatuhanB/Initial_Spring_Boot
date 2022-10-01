package com.initial.initial.dto

import com.initial.initial.model.Customer
import com.initial.initial.model.Transaction
import java.math.BigDecimal
import java.time.LocalDateTime

data class AccountDto(
    val id: String?,
    val balance: BigDecimal?,
    val creationDate: LocalDateTime?,
    val customer: AccountCustomerDto?,
    val transaction: Set<TransactionDto>?
)
