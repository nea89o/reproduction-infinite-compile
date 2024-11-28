package moe.nea.firm

import ext.StringIdentifiable
import kotlin.enums.enumEntries


abstract class ManagedConfig {
	protected fun <E : Any> choice(
		codec: Codec<E>,
		renderer: EnumRenderer<E>,
	) {}

	protected inline fun <reified E> choice(
	) where E : Enum<E>, E : StringIdentifiable {
		return choice(
			StringIdentifiable.createCodec { enumValues<E>() },
			EnumRenderer.default(),
		)
	}
}
