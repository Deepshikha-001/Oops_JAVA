package com.OOPS;
class Pokemon{
    int power;
    String type;
    Pokemon(String type, int power){
        this.power = power;
        this.type = type;
    }

    Pokemon(){}
    void print(){    // getter
        System.out.println(this.power+" "+this.type);
    }
}


// class LegendaryPokemon extends Pokemon{  // child class (Inheritance (extends))
//      String ability;
// }
// class NewPokemon  extends LegendaryPokemon{  // child class (Inheritance (extends))
//      int strength;
// }



class LegendaryPokemon extends Pokemon{  // child class (Inheritance (extends))
     String ability;

    LegendaryPokemon(String type, int power, String ability){
        super(type, power);        //Constructor chaining (super())  calling parent constructor
        this.ability = ability;
    }

    LegendaryPokemon(){}

    @Override     //Method overriding
    void print(){    // getter
        System.out.println(power+" "+type+" "+ability);
    }
}

class NewPokemon extends LegendaryPokemon{
    int strength;

    NewPokemon(String type, int power, String ability, int strength){
        super(type, power, ability);
        this.strength = strength;
    }

    NewPokemon(){}

    @Override
    void print(){
        System.out.println(power+" "+type+" "+ability+" "+strength);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Electric", 100);
        pikachu.print();

        LegendaryPokemon mewtwo = new LegendaryPokemon("Psychic", 300, "Pressure");
        mewtwo.print();

        NewPokemon turtle = new NewPokemon("fire", 400, "Angry", 45 );
        turtle.print();
    }
}
