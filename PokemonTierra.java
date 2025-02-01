public class PokemonTierra extends Pokémon {
    private String ataqueEspecial;
    private int dañoAtaqueEspecial;
    private String debilidad;
    private int extraDañoAire;

    public PokemonTierra (int id, String nombre, int fuerza, int defensa, int vida,  int nivel, String tipo, String ataqueEspecial, int dañoAtaqueEspecial, String debilidad, int extraDañoAire) {
        super(id, nombre, fuerza, defensa, vida, nivel, tipo); 
        this.ataqueEspecial = ataqueEspecial;
        this.dañoAtaqueEspecial = dañoAtaqueEspecial;
        this.debilidad = debilidad;
        this.extraDañoAire = extraDañoAire;
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

	public int getExtraDañoAire() {
		return extraDañoAire;
	}

	public void setExtraDañoAire(int extraDañoAire) {
		this.extraDañoAire = extraDañoAire;
	}
}
