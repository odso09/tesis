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
    
    List<Boolean> FSs;
    
    public Fibra (){
        
        FSs = new ArrayList<Boolean>();
    }
    
    public Fibra(List<Boolean> FSs) {
        this.FSs = FSs;
    }
    
    public List<Boolean> getFSs() {
        return FSs;
    }

    public void setFSs(List<Boolean> FSs) {
        this.FSs = FSs;
    }
}
