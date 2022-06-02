public class Patient{
	
    private String name;
    private int age;
    private int height;
    private char gender;
    /*private Medication[] meds;*/
    /*private Doctor doctor;*/


      /*Constructor*/
    Patient( String name, int age, int height, char gender,  String [] meds) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
       /* setMeds(meds);*/
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

	public Char getGender() {
		return this.gender;
	}

	public void setGender(Char gender) {
		this.gender = gender;
	}

	/*
	public String[] getMeds() {
		return this.meds;
	}

	public void setMeds(String[] meds) {
		this.meds = new String[meds.length];

		for(int p = 0; p < meds.length; p++ ){
			this.meds[p] = meds[p].clone();
		}

	}*/

    

  
    




}