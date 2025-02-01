public class Pokémon {
    private int id;
    private String nombre;
    private int fuerza;
    private int defensa;
    private int vida;
    private int nivel;
    private String tipo;

    public Pokémon(int id, String nombre, int fuerza, int defensa, int vida, int nivel, String tipo) {
        this.id = id;
        this.defensa = defensa;
        this.fuerza = fuerza;
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
    
	public void recibirDaño(int daño){
		this.vida -= daño;
		if (this.vida < 0) {
			this.vida = 0;
		}
	}
}
