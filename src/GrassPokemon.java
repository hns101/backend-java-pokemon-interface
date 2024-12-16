import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    final String type = "grass";

    final List<String> attacks = Arrays.asList("leafStorm", "solarBeam","leechSeed" , "leaveBlade" );

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leafStorm");
        int damagePoints = 33;
        switch (gymPokemon.getType()) {
            case "fire" -> {
                damagePoints -= 1;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }
            case "electric" -> {
                damagePoints += 2;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            case "water" -> {
                damagePoints -= 3;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            default -> {
                damagePoints -= 5;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }

        }


    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with solarBeam");
        int damagePoints = 50;
        switch (gymPokemon.getType()) {
            case "fire" -> {
                damagePoints -= 1;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }
            case "electric" -> {
                damagePoints += 2;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            case "water" -> {
                damagePoints -= 3;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            default -> {
                damagePoints -= 5;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }


        }
    }
    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " steals HP from " + gymPokemon.getName() + " with leechSeed");
        int damagePoints = 30;
        switch (gymPokemon.getType()) {
            case "fire" -> {
                damagePoints -= 1;
                System.out.println(pokemon.getName() + " steals " + damagePoints + " HP from " + gymPokemon.getName());
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                pokemon.setHp(pokemon.getHp() + damagePoints);
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
                System.out.println(pokemon.getName() + " HP = " + pokemon.getHp());
            }
            case "electric" -> {
                damagePoints += 2;
                System.out.println(pokemon.getName() + " steals " + damagePoints + " HP from " + gymPokemon.getName());
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                pokemon.setHp(pokemon.getHp() + damagePoints);
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
                System.out.println(pokemon.getName() + " HP = " + pokemon.getHp());

            }
            case "water" -> {
                damagePoints -= 3;
                System.out.println(pokemon.getName() + " steals " + damagePoints + " HP from " + gymPokemon.getName());
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                pokemon.setHp(pokemon.getHp() + damagePoints);
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
                System.out.println(pokemon.getName() + " HP = " + pokemon.getHp());

            }
            default -> {
                damagePoints -= 5;
                System.out.println(pokemon.getName() + " steals " + damagePoints + " HP from " + gymPokemon.getName());
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                pokemon.setHp(pokemon.getHp() + damagePoints);
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
                System.out.println(pokemon.getName() + " HP = " + pokemon.getHp());
            }


        }

    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leaveBlade");
        int damagePoints = 69;
        switch (gymPokemon.getType()) {
            case "fire" -> {
                damagePoints -= 1;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }
            case "electric" -> {
                damagePoints += 2;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            case "water" -> {
                damagePoints -= 3;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            default -> {
                damagePoints -= 5;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }


        }

    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }
}
