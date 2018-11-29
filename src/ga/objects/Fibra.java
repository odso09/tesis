/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga.objects;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author odso0
 */
public class Fibra {
    
    List<Boolean> FS;
    
    public Fibra (){
        
        FS = new ArrayList<Boolean>();
    }
    
    public Fibra(List<Boolean> FS) {
        this.FS = FS;
    }
    
    public List<Boolean> getFS() {
        return FS;
    }

    public void setFS(List<Boolean> FS) {
        this.FS = FS;
    }
}
