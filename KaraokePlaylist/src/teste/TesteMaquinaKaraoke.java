package teste;

import org.junit.jupiter.api.Test;

import model.MaquinaKaraoke;

class TesteMaquinaKaraoke {

	@Test
	void testeMaquinaKaraoke() {
		MaquinaKaraoke maquina = new MaquinaKaraoke();
		maquina.start();
	}

}
