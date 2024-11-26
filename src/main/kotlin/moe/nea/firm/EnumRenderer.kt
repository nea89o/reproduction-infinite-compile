package moe.nea.firm

interface EnumRenderer<E: Any> {
	fun getName(option: ManagedOption<E>, value: E): String
	companion object {
		fun <E: Enum<E>> default() = object: EnumRenderer<E> {
			override fun getName(option: ManagedOption<E>, value: E): String {
				return value.name.lowercase()
			}

		}
	}
}