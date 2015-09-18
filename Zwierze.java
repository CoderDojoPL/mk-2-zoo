import greenfoot.*;

public class Zwierze extends Actor
{
    String nazwa;
    GreenfootSound dzwiek;
    public void act(){
    if (Greenfoot.mousePressed(this)){
      getWorld().showText("To jest "+this.nazwa, 400, 50);
      this.dzwiek.play();}
    
    }    
}
