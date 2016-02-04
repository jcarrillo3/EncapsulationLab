/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments;

/**
 *
 * @author Juan
 */
public class VideoGame {
    private String character;
    private String weapon;
    private String team;

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    
    private void shootOponents(String shootBtn){
        System.out.println("you got them!");
    }
    private void jumpObstacles(String jumpBtn){
        System.out.println("Nice jump!");
    }
    private void dodgeBullets(String dodgeBtn){
        System.out.println("That was close.");
    }
    
    public void winGame(String shoot, String jump, String dodge){
        this.shootOponents(shoot);
        this.jumpObstacles(jump);
        this.dodgeBullets(dodge);
        System.out.println("You win!");
    }
}
