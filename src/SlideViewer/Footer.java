
package SlideViewer;


public class Footer extends Element{
    private String left;
    private String right;
    private String center;
    
    
     public Footer(String line) {
        String[] footer = line.split("=");        
    
        if(footer[0].equalsIgnoreCase("left")){        
            this.left = footer[1];
        }
        if(footer[0].equalsIgnoreCase("center")){ 
            this.center = footer[1];
        }
        if(footer[0].equalsIgnoreCase("right")){ 
            this.right = footer[1];
        }
    }
     
    public String print(){
     return"";
    }    
    
}