package Oops_Java;
  class Pokemon{
      int power;
    String type;
    Pokemon(String type , int power){
        this.power = power;
        this.type = type;
    }
    int getPower(){
        return power;
    }
    void print(){ //getter
        System.out.println(this.power+" "+this.type);
    }
}
public class RevisionOOPS {
     public static void main(String[] args) {
//        Pokemon p1 = new Pokemon();
//        p1.name = "Pikachu";
//        p1.type = "Electric";
//        p1.attack = 70;
//        Pokemon p2 = new Pokemon();
//        p2.name = "Charizard";
//        p2.type = "Fire";
//        p2.attack = 110;
//        Pokemon p3 = p1; // p3 is shallow copy of p1(can control)
//        p3.type = "Water";
//        System.out.println(p1.type);

        Pokemon pikachu = new Pokemon("Electric",70);
//        pikachu.power = "Fire";
        Pokemon jigglypuff = new Pokemon("Fairy",50);
//         System.out.println(pikachu.getPower());
        pikachu.print();;
        jigglypuff.print();

        final int x = 89;  // x cannot be changed

    }
}
