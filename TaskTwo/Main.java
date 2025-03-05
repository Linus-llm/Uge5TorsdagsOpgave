import java.util.Scanner;
class Main{ //2.a created main class with a main method
public static void main(String[] args){
System.out.println("Please type your name:");  //2.b created println to display message
Scanner scan = new Scanner(System.in); //2.c creating scanner object
String name = scan.nextLine(); //2.d declaring string variable and assigning it to what the scanner scanned
System.out.println("Hello! "+name+" please type your age:"); //2.e 
int age = scan.nextInt(); //2.f
scan.nextLine();
System.out.println(name+" you are "+age+" years old!"); //2.g
int yearsToRetirement = 67-age; //2.h
System.out.println(name+" you have "+yearsToRetirement+" years till retirement!"); //2.h
}

}