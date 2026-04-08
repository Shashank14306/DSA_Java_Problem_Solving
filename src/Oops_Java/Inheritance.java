package Oops_Java;
class Pokemons{
    int power;
    String type;
    Pokemons(String type , int power){
        this.power = power;
        this.type = type;
    }
    Pokemons(){}
    void print(){
        System.out.println(this.power+" "+this.type);
    }
}
class  StrongPokemon extends Pokemons{
    int speed;
}
class LegendaryPokemon extends Pokemons{
    String ability;
}
class GodPokemon extends LegendaryPokemon{
    char tag;
}
public class Inheritance {
    public static void main(String[] args) {
        LegendaryPokemon mewtwo = new LegendaryPokemon();
        mewtwo.ability = "Pressure";
        Pokemons pikachu  = new Pokemons();
        GodPokemon dialga = new GodPokemon();
        dialga.ability = "Fire";
    }
}
