
public class Patient{

	private enum Sex{
		Male, 
		Female
	}
    private String name;
    private int age;
    private int height;
    private Sex sex;
    private Medicine[] prescriptions;
    private Doctor[] doctors;


      /*Constructor*/
    Patient(String name, int age, int height, String sex, Medicine[] presciptions, Doctor[] doctors) {
        this.name = name;
        this.age = age;
        this.height = height;

		try{
		Sex temp = Enum.valueOf(Sex.class , sex.substring(0,1).toUpperCase());
			
			switch(temp){
				case Male:
				this.sex = Sex.Male;
				break;

				case Female:
				this.sex = Sex.Female;
				break;
			}
	
		}
		catch (IllegalArgumentException e){
			System.err.println("Invalid Gender given");
		}
      
		this.prescriptions = presciptions;
		this.doctors = doctors; 



    }

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getSex() {
		return this.sex.toString();
	}

	public void setGender(String sex) {
		try{
			Sex temp = Enum.valueOf(Sex.class , sex.substring(0,1).toUpperCase());
				
				switch(temp){
					case Male:
					this.sex = Sex.Male;
					break;
	
					case Female:
					this.sex = Sex.Female;
					break;
				}
		
			}
			catch (IllegalArgumentException e){
				System.err.println("Invalid Gender given");
			}
	}

	
	public Medicine[] getMeds() {

		return prescriptions;
	}

	public void setMeds(String[] meds) {
		this.meds = new String[meds.length];

		for(int p = 0; p < meds.length; p++ ){
			this.meds[p] = meds[p].clone();
		}

	}

    

  
    




}