
public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;

	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		setLigado(true);
	}

	@Override
	public void desligar() {
		setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("esta ligado: " + getLigado());
		System.out.println("esta tocando: " + getTocando());
		System.out.print("volume: " + getVolume());
		for (int i = 0; i <= this.getVolume(); i += 10) {
			System.out.print("|");
		} 
		System.out.println("");
	}

	@Override
	public void fecharMenu() {
		System.out.println("fechando menu");
	}

	@Override
	public void maisVolume() {
		if (this.getLigado() == true) {
			setVolume(getVolume() + 5);
		} else {
			System.out.println("não é possivel realizar ação pois o aparelho esta desligado");
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado() == true) {
			setVolume(getVolume() - 5);
		} else {
			System.out.println("não é possivel realizar ação pois o aparelho esta desligado");
		}
	}

	@Override
	public void ligarMudo() {
        if(this.getLigado() == true && this.getVolume() >0) {
        	this.setVolume(0);
        }
	}

	@Override
	public void desligarMudo() {
       if(this.getLigado() == true && this.volume == 0) {
    	   this.setVolume(50);
       }
	}

	@Override
	public void play() {
      if(this.getLigado() == true && !(this.getTocando())) {
    	  this.setTocando(true);
    	  System.out.println("Tocando...");
      }else {
    	  System.out.println("impossivel dar play, o aparelho esta desligado");
      }
	}

	@Override
	public void pause() {
        if(this.getLigado() == true && this.getTocando()) {
        	this.setTocando(false);
        	System.out.println("Pausado...");
        }else {
        	System.out.println("imposivel pausar, o aparelho está desligado");
        }
	}

}
