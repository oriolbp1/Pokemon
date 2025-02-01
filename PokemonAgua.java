public class PokemonAgua extends Pokémon {
    private String ataqueEspecial;
    private int dañoAtaqueEspecial;
    private String debilidad;
    private int extraDañoFuego;

    public PokemonAgua(int id, String nombre, int fuerza, int defensa, int vida, int nivel, String tipo, String ataqueEspecial, int dañoAtaqueEspecial, String debilidad, int extraDañoFuego) {
        super(id, nombre, fuerza, defensa, vida, nivel, tipo); 
        this.ataqueEspecial = ataqueEspecial;
        this.dañoAtaqueEspecial = dañoAtaqueEspecial;
        this.debilidad = debilidad;
        this.extraDañoFuego = extraDañoFuego;
    }

    public String getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(String ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDañoAtaqueEspecial() {
        return dañoAtaqueEspecial;
    }

    public void setDañoAtaqueEspecial(int dañoAtaqueEspecial) {
        this.dañoAtaqueEspecial = dañoAtaqueEspecial;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

	public int getExtraDañoFuego() {
		return extraDañoFuego;
	}

	public void setExtraDañoFuego(int extraDañoFuego) {
		this.extraDañoFuego = extraDañoFuego;
	}
}
