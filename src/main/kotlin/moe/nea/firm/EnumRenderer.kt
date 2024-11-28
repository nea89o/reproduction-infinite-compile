package moe.nea.firm

interface EnumRenderer<E: Any> {
	companion object {
		fun <E: Enum<E>> default() = object: EnumRenderer<E> {}
	}
}