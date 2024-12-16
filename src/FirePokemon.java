import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    final String type = "fire";

    final List<String> attacks = Arrays.asList("inferno", "pyroBall","fireLash" , "flametrower" );

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }



    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with inferno");
         int damagePoints = 70;
        switch (gymPokemon.getType()){
            case "fire" -> {
            damagePoints -= 5;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }
            case "electric" -> {
                damagePoints -= 3;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            case "water" -> {
                damagePoints -= 1;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            default -> {
                damagePoints += 2;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }

        }
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with pyroBall");
        int damagePoints = 44;
        switch (gymPokemon.getType()) {
            case "fire" -> {
                damagePoints -= 5;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }
            case "electric" -> {
                damagePoints -= 3;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            case "water" -> {
                damagePoints -= 1;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

            }
            default -> {
                damagePoints += 2;
                System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
            }

        }}

        public void fireLash (Pokemon pokemon, Pokemon gymPokemon){
            System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with fireLash");
            int damagePoints = 33;
            switch (gymPokemon.getType()) {
                case "fire" -> {
                    damagePoints -= 5;
                    System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                    gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                    System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
                }
                case "electric" -> {
                    damagePoints -= 3;
                    System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                    gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                    System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

                }
                case "water" -> {
                    damagePoints -= 1;
                    System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                    gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                    System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

                }
                default -> {
                    damagePoints += 2;
                    System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                    gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                    System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
                }

            }

        }

        public void flameThrower (Pokemon pokemon, Pokemon gymPokemon){
            System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with flameThrower");
            int damagePoints = 64;
            switch (gymPokemon.getType()) {
                case "fire" -> {
                    damagePoints -= 5;
                    System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                    gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                    System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
                }
                case "electric" -> {
                    damagePoints -= 3;
                    System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                    gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                    System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

                }
                case "water" -> {
                    damagePoints -= 1;
                    System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                    gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                    System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());

                }
                default -> {
                    damagePoints += 2;
                    System.out.println(gymPokemon.getName() + " damage points " + damagePoints);
                    gymPokemon.setHp((gymPokemon.getHp() - damagePoints));
                    System.out.println(gymPokemon.getName() + " HP = " + gymPokemon.getHp());
                }

            }

        }

        @Override
        public String getType () {
            return type;
        }

        @Override
        public List<String> getAttacks () {
            return attacks;
        }

    }
