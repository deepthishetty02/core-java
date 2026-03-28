class College{
static String name="mandavya";
static String[] studentNames={"mia","gagana","navya","gunav","ragav"};
static String[]   gender={"f","f","f","m","m"};


static void getNames(){
	System.out.println("Studen Names");
	for(String name:studentNames){
		System.out.println(name);
	}
	
	static String[] getGender(){
		return gender;
	}
}

}