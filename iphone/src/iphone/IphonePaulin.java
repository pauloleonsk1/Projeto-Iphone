package iphone;

public class IphonePaulin {
	public static void main(String[] args) {

		Iphone iphone = new Iphone();
		
		//Telefone
		iphone.atender();
		iphone.ligar("21971174711");
		iphone.iniciarCorreioVoz();
		
		//Navegador Internet
		iphone.adicionarNovaAba();
		iphone.exibirPagina("www.youtube.com.br");
		iphone.atualizarPagina();
		
		//Reprodutor Musical
		iphone.selecionarMusica("Green Day - Stray Heart");
		iphone.pausar();
		iphone.tocar();
	}

}
