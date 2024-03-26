package creational_patterns.builder

class Product private constructor(
    val name: String,
    val description: String?
){
    class Builder(
        private var name: String,
        private var description: String? = null
    ) {
        fun description(value: String?) = apply { this.description = value }

        fun build(): Product {
            return Product(name, description)
        }
    }
}