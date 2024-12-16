import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    final String type = "water";
    final List<String> attacks = Arrays.asList("surf", "hydroPump","hydroCanon" , "rainDance" );

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with surf");
        int damagePoints = 57;
        switch (gymPokemon.getType()) {
            case "fire" -> {
                damagePoints += 2;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }
            case "electric" -> {
                damagePoints -= 1;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            case "water" -> {
                damagePoints -= 5;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            default -> {
                damagePoints -= 3;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }

        }
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with hydroPump");
        int damagePoints = 32;
        switch (gymPokemon.getType()) {
            case "fire" -> {
                damagePoints += 2;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }
            case "electric" -> {
                damagePoints -= 1;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            case "water" -> {
                damagePoints -= 5;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            default -> {
                damagePoints -= 3;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }

        }
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with hydroCanon");
        int damagePoints = 77;
        switch (gymPokemon.getType()) {
            case "fire" -> {
                damagePoints += 2;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }
            case "electric" -> {
                damagePoints -= 1;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            case "water" -> {
                damagePoints -= 5;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            default -> {
                damagePoints -= 3;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }

        }
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " does rainDance");
        switch (gymPokemon.getType()) {
            case "fire" -> {
                System.out.println("Has no effect on " + gymPokemon.getName());
            }
            case "electric" -> {
                System.out.println("Has no effect on " + gymPokemon.getName());

            }
            case "water" -> {
                System.out.println("Has no effect on " + gymPokemon.getName());
            }
            default -> {
                System.out.println("Has effect on " + gymPokemon.getName() + " it gives 15HP");
                gymPokemon.setHp((gymPokemon.getHp() + 15));
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
