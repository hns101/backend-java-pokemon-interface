import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    final String type = "electric";
    final List<String> attacks = Arrays.asList("thunderPunch", "electroBall","thunder" , "voltTackle" );

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunderPunch");
        int damagePoints = 33;
        switch (gymPokemon.getType()) {
            case "fire" -> {
                damagePoints -= 3;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }
            case "electric" -> {
                damagePoints -= 5;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            case "water" -> {
                damagePoints += 2;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            default -> {
                damagePoints -= 1;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }

        }


    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with electroBall");
        int damagePoints = 83;
        switch (gymPokemon.getType()) {
            case "fire" -> {
                damagePoints -= 3;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }
            case "electric" -> {
                damagePoints -= 5;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            case "water" -> {
                damagePoints += 2;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            default -> {
                damagePoints -= 1;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }

        }


    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunder");
        int damagePoints = 60;
        switch (gymPokemon.getType()) {
            case "fire" -> {
                damagePoints -= 3;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }
            case "electric" -> {
                damagePoints -= 5;
                System.out.println(gymPokemon.getName() + "  get's charged up by " + damagePoints + " HP");
                gymPokemon.setHp((gymPokemon.getHp() + damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            case "water" -> {
                damagePoints += 2;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            default -> {
                damagePoints -= 1;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }

        }


    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with voltTackle");
        int damagePoints = 46;
        switch (gymPokemon.getType()) {
            case "fire" -> {
                damagePoints -= 3;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }
            case "electric" -> {
                damagePoints -= 5;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            case "water" -> {
                damagePoints += 2;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            default -> {
                damagePoints -= 1;
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
