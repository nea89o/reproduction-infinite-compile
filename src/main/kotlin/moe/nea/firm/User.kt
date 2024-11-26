package moe.nea.firm

import ext.StringIdentifiable
import kotlin.enums.enumEntries

object User : ManagedConfig("test") {
	val option by choice("name") { TestEnum.A }
	val optionAlt by choice("name", enumEntries<TestEnum>(),
	                        StringIdentifiable.createCodec { enumValues<TestEnum>() },
	                        EnumRenderer.default<TestEnum>()) { TestEnum.A }

	enum class TestEnum : StringIdentifiable {
		A, B, C;
	}
}
fun main() {
	User.option
}