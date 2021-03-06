package SlideViewer;

import javax.swing.JOptionPane;

public class SlideViewerApp {
    public static void main(String[] args){
        try {
          PresentationLoader pl = new PresentationLoader();
          Presentation pp = pl.loader("presentation.txt");    
          SlideDesigner sd = new SlideDesigner();
          Navigator nav = new Navigator(pp.getSlides());
          System.out.println(sd.drawSlide(pp.getSlide(nav.getCurrent()), nav.getCurrent(), pp.getFoo()));
            
            int op = 0;
            do {
                try{                   
                    op = ReadData.readInt("1-Anterior, 2-Proximo, 3-Especifico, 0-Sair"); 
                    switch (op) {
                        case 1:
                                nav.previous();
                                System.out.println(sd.drawSlide(pp.getSlide(nav.getCurrent()), nav.getCurrent(), pp.getFoo()));
                            break;
                        case 2:
                                nav.next();
                                System.out.println(sd.drawSlide(pp.getSlide(nav.getCurrent()), nav.getCurrent(), pp.getFoo()));
                            break;
                        case 3:
                            int num = ReadData.readInt("Numero do slide: ");                            
                                nav.Goto(num);
                                System.out.println(sd.drawSlide(pp.getSlide(nav.getCurrent()), nav.getCurrent(), pp.getFoo()));
                        case 0:
                            break;                        
                    }                    
                }catch (NumberFormatException ex) {
                    op = 0;
                }catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                    op = -1;
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "A apresentação acabou, digite 0 para sair");
                }         
            }while (op != 0);
            
            } catch (Exception ex) {
                System.out.println("Erro ao criar a apresentação.");
        }
        
    } 
}
