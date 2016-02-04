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
public class Player {
    private VideoGame game;
    
    public void playGame(String shoot, String jump, String dodge){
        VideoGame game = new VideoGame();
        game.winGame(shoot, jump, dodge);
        this.game = game;
    }
}
