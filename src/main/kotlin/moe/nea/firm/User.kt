package moe.nea.firm

import ext.StringIdentifiable

object User : ManagedConfig("test") {
	val option by choice("name") { TestEnum.A }

	enum class TestEnum : StringIdentifiable {
		A, B, C;
	}
}
fun main() {
	User.option
}