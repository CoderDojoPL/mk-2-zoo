import greenfoot.*;

/**
 * Write a description of class Wilk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wilk extends Zwierze
{
    public Wilk(){
    nazwa = "wilk";
    dzwiek = new GreenfootSound("wilk.wav");
    } 
    
    public void act(){
    if (Greenfoot.mousePressed(this)){
      getWorld().showText("Jestem lisem, ale udaję wilka ;) ", 400, 50);
      dzwiek.play();}
    
    }
}
