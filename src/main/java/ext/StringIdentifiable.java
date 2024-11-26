package ext;

import moe.nea.firm.Codec;

import java.util.function.Supplier;

public interface StringIdentifiable {
	static <E extends StringIdentifiable> Codec<E> createCodec(Supplier<E[]> supplier) {
		return null;
	}
}

