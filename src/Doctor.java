public class Doctor{

    enum Field {
        Cardiology,
       Neuorology,
       Radiology
    }   

    private String name;
    private Field field;
    private int exp;
    
    Doctor(String name, String tempField, int exp){
        this.name  = name;
        
        if(exp >= 0){ 
            this.exp = exp; 
        }else{
            System.err.println("Invalid Year ");
        }
        try{

        Field f = Enum.valueOf(Field.class, tempField);
        switch (f){

            case Cardiology:
            field = Field.Cardiology;        
            break;

            case Neuorology:
            field = Field.Neuorology;
            break;


            case Radiology:
            field = Field.Radiology;
            break; 

   }

    }
    catch (IllegalArgumentException e){
        System.err.println("Specilization not recognized by System");
    }

       

    }
/***** For TESTING ******/ 

/*
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Field getField() {
        return this.field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public int getExp() {
        return this.exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }



    @Override
    public String toString() {
        return "{" +
            " name ='" + getName() + "'" +
            ", field ='" + getField() + "'" +
            ", exp ='" + getExp() + "'" +
            "}";
    }
public static void main(String[] args){
Doctor doc = new Doctor("Lewis John", "Medicine", -5);

System.out.print(doc.toString());

}
*/




    
}