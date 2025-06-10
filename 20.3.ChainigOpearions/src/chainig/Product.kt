package chainig

class Product {
    fun allProduct(): dataProductResult { //
        var products :List<dataProduct> = listOf(
            dataProduct("Laptop", 1200.0),
            dataProduct("Mouse", 30.0),
            dataProduct("Keyboard", 80.0),
            dataProduct("Laptop Bag", 50.0)
        )
        var totalPriceAfterDiscount :Double =products.filter { it.Price>50 }.map { it.Price*0.9 }
            .sum()
        return dataProductResult (
                products = products,
                totalPriceAfterDiscount = totalPriceAfterDiscount
        )
    }
}