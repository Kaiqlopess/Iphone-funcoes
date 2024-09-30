package iphone;

import iphone.funçoes.AparelhoTelefonico;
import iphone.funçoes.NavegadorDeInternet;
import iphone.funçoes.ReprodutorMusical;

public class iphone  {
	public static void main(String[] args) {
		
		 System.out.println("Navegadddor de internet");
		 System.out.println("");
		 
		 NavegadorDeInternet nv = new NavegadorDeInternet();
		 
		 nv.adicionarNovaPagina();
		 nv.atualizarPagina();
		 nv.exibirPagina();
		 
		 System.out.println("");
		 System.out.println("Aparelho telefonico");
		 System.out.println("");
		 
		 AparelhoTelefonico app = new AparelhoTelefonico();
		 
		 app.atender();
		 app.ligar();
		 app.iniciarCorreioVoz();
		 
		 System.out.println("");
		 System.out.println("Reprodutor Muusical");
		 System.out.println("");
		 
		 ReprodutorMusical msc = new ReprodutorMusical();
		 
		 msc.selecionarMusica();
		 msc.pausar();
		 msc.Tocar();

			 
		 
		 		 
	}
}
