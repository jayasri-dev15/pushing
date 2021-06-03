package com.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;


@SuppressWarnings("restriction")
public class ExcelToDrlDemo {
public static void main(String args[]) {
// create an input stream
InputStream ist =null;
try {
// assign the excel to the input stream
// mention the local directory path where your excel is kept
// you can take any decision table (excel sheet) for testing
ist= new FileInputStream("C:/Users/890165/eclipse-workspace/new workspace/Exam/src/Sample.xls");
} catch (FileNotFoundException e) {
e.printStackTrace();
}
// create compiler class instance
SpreadsheetCompiler sc = new SpreadsheetCompiler();
// compile the excel to generate the (.drl) file
String drl=sc.compile(ist, InputType.XLS);
// check the generated (.drl) file
System.out.println("Generate DRL file is –: ");
System.out.println(drl);
}
}


