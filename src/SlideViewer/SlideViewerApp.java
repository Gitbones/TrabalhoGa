/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlideViewer;

/**
 *
 * @author W.Oliveira
 */
public class SlideViewerApp {
    public static void main(String[] args){
        try{
            PresentationLoader pl = new PresentationLoader();
            Presentation pp = pl.loader("presentation.txt");
            Navigator nav = new Navigator(pp.getSlide());
        }
        catch(Exception e){
            System.out.println(e);
        }          
    } 
}
