import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HMS  {

    private HashMap<Patient, Doctor[]> pd;
    private HashSet<Doctor> docSet;
   /* private HashSet<Doctor> docSet;*/
    

   
    HMS(){
        
        this.pd = new HashMap<Patient, Doctor[]>();
        this.docSet = new HashSet<Doctor>();
      

    }

    public HashMap<Patient, Doctor[]> getPatientDatabase(){
        return this.pd;
    }
    public bool addDoctor(Doctor in ){
        if (docSet.contains(in) == false){
            docSet.add(in);
            return true;
        }
        return false;

    }
    public bool removeDoctor(Doctor in){
        if (docSet.contains(in)){
            docSet.remove(in);
            return true;
        }
        return false;
    }

    public Doctor findDoctor(String Name){
        if (docSet.isEmpty()){
            return null;
        }

        Doctor out;
        Iterator<Doctor> iter = docSet.iterator();

        while(iter.hasNext()){
             out = iter.next();
            if (out.getName().equals(Name)){
                return out;
            }
        }
        
        return null; 

    }
    public bool addPatient(){
      
    }

    public bool patienFound(){

    }

    public bool removePatient(){} 

   

    /* Will contain the driver code for HMS*/
    public static void main(String[] args) {

        HMS hms1 = new HMS();

        
    }

    
}
