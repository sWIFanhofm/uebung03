package ueb03;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {
	@Test
	void testStack() {
		Stack<Character> cs = new StackImpl<>();

		// zu Beginn muss der Stack leer sein!
		assertEquals(0, cs.size());

		// ...und entsprechend eine NoSuchElementException werfen, wenn man pop ruft!
		assertThrows(NoSuchElementException.class, cs::pop);

		// jetzt ein paar Werte pushen
		char[] a = {'a', 'b', 'c'};
		for (char c : a)
			cs.push(c);
		// ...Groesse checken
		assertEquals(3, cs.size());

		// ...und rückwärts!
		for (int i = a.length-1; i >= 0; i--)
			assertEquals(a[i], (char) cs.pop());

		// Jetzt muss er wieder leer sein!
		assertEquals(0, cs.size());
	}
}
