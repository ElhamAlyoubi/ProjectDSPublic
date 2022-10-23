/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

/**
 *
 * @author Elham
 */
public class PokemonLLNode {
   /*
    Data Members
private Pokemon pokemon;
private PokemonLLNode next;
Operations/Methods
PokemonLLNode () // one or more Constructors

ALL getter and setter methods. 
And any other methods you need.

    */ 
     //Data Members
private Pokemon pokemon;
private PokemonLLNode next;
PokemonLLNode (){
   
}
PokemonLLNode (Pokemon p,PokemonLLNode n){
    pokemon=p;
    next=n;
}
//ALL getter and setter methods. 

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public PokemonLLNode getNext() {
        return next;
    }

    public void setNext(PokemonLLNode next) {
        this.next = next;
    }
  //*****8And any other methods you need*******.      
}
