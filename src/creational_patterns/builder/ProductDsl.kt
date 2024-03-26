package creational_patterns.builder

class  ProductDsl private constructor(
    val name: String,
    val description: String?,
    val color: String?
){
    companion object {
        inline fun dslProduct(name: String, block: Builder.() -> Unit) =
            Builder(name).apply(block).build()
    }

    class Builder(
        private var name: String,
        private var description: String? = null,
        private var color: String? = null
    ) {
        fun description(value: String?) = apply { this.description = value }
        fun color(value:String) = apply { this.color = value }
        fun build() = ProductDsl(name, description, color)
    }
}