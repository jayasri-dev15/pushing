import java.lang.*;     // importing language package

public class Sample    //Class name should be same as file name

{

	public static void main(String[] args)  // The main method is the entry point of program execution so it should be public ; without arguments code cannot run
	
	{
		System.out.println("Hello All !!! ");  // output statements
       // System.out.println(args[0]);           //It shows as java.lang.ArrayIndexOutOfBoundsException: 0
	}

}


//NOTE
//------ JDK = Java Development Kit
//------ JRE = Java Runtime Environment
//------ JVM = Java Virtual Machine

// JDK is the byte code creating machine specially designed for java compilation
// JRE converts the human code to byte code to execute in JDK
// JVM being an interpreter converts the byte code to machine code and gives the output (executes the byte code)

//Sample.java (by user) =====>javac Sample.java (for compilation) =====> Sample.class (JRE performs this) =====> java Sample (JVM does this) ======>Output

//JVM is the heart of the java to be platform independent