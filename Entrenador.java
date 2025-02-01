import java.util.ArrayList;
import java.util.List;


public class Entrenador {
	private String nombre;
	private String apodo;
	private int experiencia;
	private int tamañoPokedex; 
	private int duelosGanados;
	private List<Pokémon> equipo;
	
	public Entrenador(String nombre, String apodo, int experiencia, int tamañoPokedex, int duelosGanados){
		this.nombre = nombre;
		this.apodo = apodo;
		this.experiencia = experiencia;
		this.tamañoPokedex = tamañoPokedex;
		this.equipo = new ArrayList<>();
	}
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public int getTamañoPokedex() {
		return tamañoPokedex;
	}
	public void setTamañoPokedex(int tamañoPokedex) {
		this.tamañoPokedex = tamañoPokedex;
	}
	public int getDuelosGanados() {
		return duelosGanados;
	}
	public void setDuelosGanados(int duelosGanados) {
		this.duelosGanados = duelosGanados;
	}

	public List<Pokémon> getEquipo() {
		return equipo;
	}

	public void agregarPokemon(Pokémon pokemon) {
        if (equipo.size() < tamañoPokedex) {
	            equipo.add(pokemon);
	            System.out.println(pokemon.getNombre() + " ha sido agregado al equipo de " + nombre);
	        } else {
	            System.out.println("El equipo de " + nombre + " ya tiene el máximo de " + tamañoPokedex +" Pokémon.");
	        }
	    }

	    public void mostrarEquipo() {
	        System.out.println("Equipo de " + nombre + ":");
	        for (Pokémon pokemon : equipo) {
	            System.out.println("- " + pokemon.getNombre());
	        }
	    }
}

