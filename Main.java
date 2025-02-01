import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del Entrenador 1: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingresa el apodo del Entrenador 1: ");
        String apodo1 = scanner.nextLine();
        Entrenador entrenador1 = new Entrenador(nombre1, apodo1, 100, 6, 0);

        System.out.print("Ingresa el nombre del Entrenador 2: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingresa el apodo del Entrenador 2: ");
        String apodo2 = scanner.nextLine();
        Entrenador entrenador2 = new Entrenador(nombre2, apodo2, 95, 6, 0);

        List<Pokémon> pokemonsDisponibles = inicializarPokemons();

        int eleccion1;
        Pokémon pokemon1;
        do {
            System.out.println("Pokémon disponibles para elegir:");
            for (int i = 0; i < pokemonsDisponibles.size(); i++) {
                System.out.println((i + 1) + ". " + pokemonsDisponibles.get(i).getNombre() + " - Nivel:" + pokemonsDisponibles.get(i).getNivel() + " (" + pokemonsDisponibles.get(i).getTipo() + ")");
            }

            System.out.print(entrenador1.getNombre() + ", elige tu Pokémon (ingresa el número): ");
            while (!scanner.hasNextInt()) {
                System.out.println("️Entrada no válida. Debes ingresar un número.");
                scanner.next();
            }
            eleccion1 = scanner.nextInt() - 1;
            scanner.nextLine(); 

            if (eleccion1 < 0 || eleccion1 >= pokemonsDisponibles.size()) {
                System.out.println("Número fuera de rango. Elige un número entre 1 y " + pokemonsDisponibles.size());
            }
        } while (eleccion1 < 0 || eleccion1 >= pokemonsDisponibles.size());

        pokemon1 = pokemonsDisponibles.remove(eleccion1); 
        entrenador1.agregarPokemon(pokemon1);

        int eleccion2;
        Pokémon pokemon2;
        do {
            System.out.println("Pokémon disponibles para elegir:");
            for (int i = 0; i < pokemonsDisponibles.size(); i++) {
                System.out.println((i + 1) + ". " + pokemonsDisponibles.get(i).getNombre() + " - Nivel: " + pokemonsDisponibles.get(i).getNivel() + " (" + pokemonsDisponibles.get(i).getTipo() + ")");
            }

            System.out.print(entrenador2.getNombre() + ", elige tu Pokémon (ingresa el número): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Debes ingresar un número.");
                scanner.next();
            }
            eleccion2 = scanner.nextInt() - 1;
            scanner.nextLine(); 

            if (eleccion2 < 0 || eleccion2 >= pokemonsDisponibles.size()) {
                System.out.println("Número fuera de rango. Elige un número entre 1 y " + pokemonsDisponibles.size());
            }
        } while (eleccion2 < 0 || eleccion2 >= pokemonsDisponibles.size());

        pokemon2 = pokemonsDisponibles.remove(eleccion2);
        entrenador2.agregarPokemon(pokemon2);

        System.out.println("Equipos:");
        entrenador1.mostrarEquipo();
        entrenador2.mostrarEquipo();
        
        System.out.println("Entrenador: " + entrenador1.getNombre() + ", Apodo: " + entrenador1.getApodo() + ", XP: " + entrenador1.getExperiencia() + ", Duelos ganados: " + entrenador1.getDuelosGanados());
        System.out.println("Pokémon que entrena: " + pokemon1.getNombre() + ", Nivel: " + pokemon1.getNivel() + ", Tipo: " + pokemon1.getTipo() + ", Ataque: " + pokemon1.getFuerza() + ", Defensa: " + pokemon1.getDefensa());
     
        System.out.println("Entrenador: " + entrenador2.getNombre() + ", Apodo: " + entrenador2.getApodo() + ", XP: " + entrenador2.getExperiencia() + ", Duelos ganados: " + entrenador2.getDuelosGanados());
        System.out.println("Pokémon que entrena: " + pokemon2.getNombre() + ", Nivel: " + pokemon2.getNivel() + ", Tipo: " + pokemon2.getTipo() + ", Ataque: " + pokemon2.getFuerza() + ", Defensa: " + pokemon2.getDefensa());
        
        String iniCombate;
        do {
            System.out.println("¿Empezar combate? Escribe 'OK' para continuar.");
            iniCombate = scanner.nextLine().trim();
            
            if (iniCombate.equalsIgnoreCase("OK")) { 
                break; 
            } else {
                System.out.println("Entrada no válida. Escribe 'OK' para empezar el combate.");
            }
        } while (true); 

        System.out.println("¡Comienza el combate entre " + entrenador1.getNombre() + " con " + pokemon1.getNombre() + " y " + entrenador2.getNombre() + " con " + pokemon2.getNombre() + "! ⚔️");
        Combate combate = new Combate(pokemon1, pokemon2, entrenador1, entrenador2);
        combate.iniciarCombate();

        scanner.close();
    }

    private static List<Pokémon> inicializarPokemons() {
        List<Pokémon> pokemons = new ArrayList<>();
        pokemons.add(new PokemonFuego(6, "Charizard", 80, 60, 200, 50, "Fuego", "Llamarada", 90, "Agua", 15));
        pokemons.add(new PokemonAgua(7, "Blastoise", 75, 80, 220, 50, "Agua", "Hidrobomba", 85, "Planta", 15));
        pokemons.add(new PokemonTierra(389, "Torterra", 70, 70, 220, 45, "Tierra", "Terremoto", 85, "Aire", 12));
        pokemons.add(new PokemonAire(398, "Staraptor", 85, 60, 180, 48, "Aire", "Golpe Aéreo", 80, "Eléctrico", 10));
        return pokemons;
    }
}
