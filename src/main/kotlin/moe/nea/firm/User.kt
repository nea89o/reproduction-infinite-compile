package moe.nea.firm

import ext.StringIdentifiable
import kotlin.enums.enumEntries

object User : ManagedConfig("test") {
	val option by choice<TestEnum>()
	val optionAlt by choice<TestEnum>(enumEntries<TestEnum>(),
	                        StringIdentifiable.createCodec { enumValues<TestEnum>() },
	                        EnumRenderable.default(),
	                        )

	enum class TestEnum : StringIdentifiable {
		A, B, C;
	}
}
fun main() {
	User.option
}
