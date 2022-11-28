package edu.kamase.Exercises_15.Observer;

public class GothamCity {
    public static void main(String [] args){
        Batperson bruce = new Batperson("Batman");
        Batperson dick = new Batperson("Nightwing");
        Batperson barbra = new Batperson("Batgirl");

        Batsignal signal = new Batsignal();
        signal.registerObserver(bruce);
        signal.registerObserver(dick);
        signal.registerObserver(barbra);

        signal.setActiveCrime("a robbery");
        signal.removeObserver(dick);
        signal.setActiveCrime("a weird plot with two boats");

        //Superperson clark = new Superperson("Superman");
        //signal.registerObserver(clark);
        signal.setActiveCrime("a supervillain ");
    }
}
