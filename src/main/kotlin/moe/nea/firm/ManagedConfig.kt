package moe.nea.firm

import ext.StringIdentifiable
import kotlin.enums.enumEntries


abstract class ManagedConfig(val identifier: String) {
	protected fun <E : Any> choice(
		codec: Codec<E>,
		renderer: EnumRenderer<E>,
	): ManagedOption<E> {
		return TODO()
	}

	protected inline fun <reified E> choice(
	): ManagedOption<E> where E : Enum<E>, E : StringIdentifiable {
		return choice(
			StringIdentifiable.createCodec { enumValues<E>() },
			EnumRenderer.default(),
		)
	}
}
