package iphone;

import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.NavegadorInternet;
import iphone.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	//Reprodutor musical
	public void tocar() {
		System.out.println("Tocando música com o Iphone.");
		
	}

	public void pausar() {
		System.out.println("Música pausada no Iphone.");
		
	}

	public void selecionarMusica(String musica) {
		System.out.println("Tocando " + musica + " no Iphone.");
		
	}

	//Navegador Internet
	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina a partir da url: " + url + " no Iphone.");
		
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba no navegador do Iphone.");
		
	}

	public void atualizarPagina() {
		System.out.println("Atualizando pagina no navegador do Iphone.");
		
	}

	//Aparelho telefonico
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero + " pelo Iphone.");
		
	}

	public void atender() {
		System.out.println("Atendendo chamada no Iphone.");
		
		
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz no Iphone.");
		
	}
	
}
