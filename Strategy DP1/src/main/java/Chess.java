/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Chess {
   public int x;
   public int y;
   public ILevelDifficulty behaviour;
   
   public void SetLevel(ILevelDifficulty behaviour){
   this.behaviour = behaviour;
   }
   public Chess(){
   behaviour = new EasyMode();
   }
   public void ExecuteNextStep(){
   behaviour.Level();
   
   }
    
    
    
    
}
