package ext;

import moe.nea.firm.InterfaceA;
import moe.nea.firm.InterfaceC;

public interface JavaHelper {
	static <E extends InterfaceC> InterfaceA<E> createInterfaceA() {
		return null;
	}
}

