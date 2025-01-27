package com.example.demo

import org.jetbrains.exposed.dao.id.IntIdTable

object Items: IntIdTable("items") {
    val testValue = text("testvalue")
}

object OtherItems: IntIdTable("otheritem") {
    val testValue = text("testvalue")
}

object Users: IntIdTable("users") {
    val firstId = integer("item_id")
    val secondId = integer("other_item_id")

    init {
        foreignKey(firstId to Items.id)
        foreignKey(secondId to OtherItems.id)
    }
}