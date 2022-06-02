import java.util.HashSet;
import java.util.Hashtable;

 /*Each HMS contains: 
    patient database
    doctor set
    medication set */ 

public class HMS  {

    private Hashtable<Patient, Integer> pd;
    private HashSet<Doctor> docSet;
    private HashSet<Medication> meds;

   
    HMS(){
        this.pd = new Hashtable<Patient, Integer>();
        this.docSet = new HashSet<Doctor>();
        this.meds = new HashSet<Medication>();

    }

    public Hashtable<Patient, Integer> getPatientDatabase(){
        return this.pd;
    }
    public void setPatientDatabase(Hashtable<Patient, Integer> pd){
        this.pd = pd;
    }

    public void setDocSet(HashSet<Doctor> docSet) {
        this.docSet = docSet;
    }


    public HashSet<Doctor> getDocSet() {
        return this.docSet;
    }


    public void setMeds(HashSet<Medication> meds) {
        this.meds = meds;
    } 

    public HashSet<Medication> getMeds() {
        return this.meds;
    }

    public static void main(String[] args) {

        HMS hms1 = new HMS();

        
    }

    
}
