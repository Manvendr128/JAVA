package OOPS;
class pokemon{
    int power;
    String type;
    pokemon(String type,int power){
        this.power = power;
        this.type = type;
    }
    pokemon(){

    }
    void print(){ // getter
        System.out.println(this.power +" " + this.type);
    }
}
class legendarypokemon extends pokemon{
    // this is child class or subclass or derived class
    String ability;

}
class strongypokemon extends pokemon{
    // this is child class or subclass or derived class
    int speed;
}
class godpokemon extends legendarypokemon{
    char tag;
}
public class inheritance {
    public static void main(String[] args) {
        legendarypokemon mewtwo = new legendarypokemon();
        mewtwo.ability = "pressure";
        pokemon pikachu = new pokemon();
//        pickachu iske pass whi property hai isme kiuch extend nhi hoga
        godpokemon dialga = new godpokemon();
//        dialga. ISPE PASS JYADA PROPERTY HAI



    }
}
