public class Combate {
    private Pokémon pokemon1;
    private Pokémon pokemon2;
    private Entrenador entrenador1;
    private Entrenador entrenador2;

    public Combate(Pokémon pokemon1, Pokémon pokemon2, Entrenador entrenador1, Entrenador entrenador2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    public void iniciarCombate() {
        while (pokemon1.getVida() > 0 && pokemon2.getVida() > 0) {
            atacar(pokemon1, pokemon2);
            if (pokemon2.getVida() <= 0) {
                System.out.println(pokemon1.getNombre() + " del entrenador " + entrenador1.getNombre() + " gana el combate!");
                break;
            }

            atacar(pokemon2, pokemon1);
            if (pokemon1.getVida() <= 0) {
                System.out.println(pokemon2.getNombre() + " del entrenador " + entrenador2.getNombre() + " gana el combate!");
                break;
            }
        }
    }

    private void atacar(Pokémon atacante, Pokémon defensor) {
        int extraDaño = calcularExtraDaño(atacante, defensor);
        int dañoBase = (atacante.getFuerza() + atacante.getNivel()) - defensor.getDefensa();
        int dañoTotal = dañoBase + extraDaño;

        if (dañoTotal < 0) {
            dañoTotal = 1; 
        }

        System.out.println( "Turno de: " + atacante.getNombre() + " que ataca a: " + defensor.getNombre() + "...");
        System.out.println(" - Daño base: " + dañoBase);
        if (extraDaño > 0) {
            System.out.println(" - Extra daño por ventaja de tipo: " + extraDaño);
        }
        System.out.println(" - Daño total causado: " + dañoTotal);

        defensor.recibirDaño(dañoTotal);
        System.out.println("A" + defensor.getNombre() + " le queda " + defensor.getVida() + " de vida.");
    }

    private int calcularExtraDaño(Pokémon atacante, Pokémon defensor) {
        if (atacante instanceof PokemonFuego && defensor.getTipo().equals("Tierra")) {
            return ((PokemonFuego) atacante).getExtraDañoTierra();
        }
        if (atacante instanceof PokemonAgua && defensor.getTipo().equals("Fuego")) {
            return ((PokemonAgua) atacante).getExtraDañoFuego();
        }
        if (atacante instanceof PokemonTierra && defensor.getTipo().equals("Aire")) {
            return ((PokemonTierra) atacante).getExtraDañoAire();
        }
        if (atacante instanceof PokemonAire && defensor.getTipo().equals("Agua")) {
            return ((PokemonAire) atacante).getExtraDañoAgua();
        }
        return 0;
    }
}
