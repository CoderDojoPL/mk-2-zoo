import greenfoot.*;

public class Podworko extends World
{
    public void poczatek(){    
        Kot kotek = new Kot();
        addObject(kotek, 150, 200);
        Pies piesek = new Pies();
        addObject(piesek, 150, 400);
        Kaczka kaczuszka = new Kaczka();
        addObject(kaczuszka, 400, 200);
        Kogut kogucik = new Kogut();
        addObject(kogucik, 400, 400);
        Wilk wilczek = new Wilk();
        addObject(wilczek, 650, 200);
        Kon konik = new Kon();
        addObject(konik, 650, 400);
        
        showText("Kliknij dowolne zwierzę", 400, 50);
    }
    
    public Podworko()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
       poczatek();
        
        
        
    }
}
