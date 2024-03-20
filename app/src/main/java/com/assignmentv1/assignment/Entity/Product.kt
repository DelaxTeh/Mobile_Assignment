package com.assignmentv1.assignment.Entity

import android.widget.ImageView

class Product(
    img: Int,
    title: String,
    desc: String,
    price: Double
) {
    // Properties with custom getters and setters
    var img: Int = img
        private set // Private setter to prevent modification outside the class
    var title: String = title
        get() = field.capitalize() // Custom getter to capitalize the title
        set(value) {
            field = value // Standard setter
        }
    var desc: String = desc
        set(value) {
            field = value.trim() // Custom setter to trim leading and trailing whitespace
        }
    var price: Double = price
        set(value) {
            field = if (value < 0) 0.0 else value // Custom setter to ensure price is non-negative
        }

    // Getter-only property (read-only)
    val productID: Int
        get() = generateProductID()

    companion object {
        private var productCount = 0

        private fun generateProductID(): Int {
            productCount++
            return productCount
        }
    }

    init {
        // Initialize product ID when a new product is created
        productID
    }
}
