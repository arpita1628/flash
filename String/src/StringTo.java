
 class StringTo {
  int rollno;
  String name;
  String city;
  
  StringTo(int rollno,String name,String city)
  {
	  this.rollno=rollno;
	  this.name=name;
	  
	  this.city=city;
	  
  }
    public String toString() {
    	return rollno+" "+name+" "+city;
    }
   public static void main(String[] args) {
	   StringTo s=new StringTo(01, "arpita", "bnt");
	   StringTo s1=new StringTo(02,"anita", "bgk");
	   System.out.println(s);
	   System.out.println(s1);
}   
 }
