/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class StrategyDP {
     public static void main(String[] args) {
        // TODO code application logic here
        Chess mychess=new Chess();
       mychess.ExecuteNextStep();
       mychess.SetLevel(new MediumMode());
        mychess.ExecuteNextStep();
       
    }
}
