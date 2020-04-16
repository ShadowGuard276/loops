class Student {

     private int rno;				// rno & name are instance variables
     private String name;
     private static String college = "CCC";		// college is static variable	

public Student(int rno, String name) {		// rno & name are local variables
      this.rno = rno;				// this.rno & this.name refers to instance variables
      this.name = name;
}

public void showData() {			// instance method
       System.out.println("Rno : "+rno);
       System.out.println("Name : "+name);
}

public static void showCollege() {		// static method
        System.out.println("College : "+college);
}

static {    
    college = "XYZ";
    System.out.println("initializing static variable, college");
}
}
class ArrayOfObjs {
public static void main(String [] args) {
System.out.println("in main( )");
Student [ ] s = new Student[3];
int i, k = 0;
for(i = 0; i < s.length; i++)  {
        s[i] = new Student(Integer.parseInt(args[k]), args[k+1]);	
        k = k+2;
}

for(i = 0; i < s.length; i++)  {
        s[i].showData();
        Student.showCollege();
        System.out.println();
}
}
static {
	System.out.println("in Static block");
}
}

//	java  ArrayOfObjs 	101         Sam  	102  	Mike  	103  	John
//		               args[0]     args[1]	args[2]     args[3]	args[4]     args[5]	

