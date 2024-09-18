public class PotatoHead
{ 

//instance variables - to be used in all methods in the class 
private int armCount ; private boolean hasShoes; private String earColor; private String eyeColor ; 
/*************************************************************************/ 

//constructors 
//default constructor 
public PotatoHead() 
{ 
	armCount = 0;
	hasShoes = false;
	earColor = "colorless";
	eyeColor = "colorless";
}
//initializer/ parameterized constructor 
public PotatoHead (int arm, boolean shoe, String ear, String eye) 
{
armCount = arm;
hasShoes = shoe;
earColor = ear;
eyeColor = eye; 
} 
/******************************************************/ 

//Accessor Methods 
public String getArmCount() 
{ 
return "I have " + armCount + " arms!"; 
} 
public String getHasShoes() 
{ 
return "It is " + hasShoes + " that I am wearing shoes"; 
} 
public String getEarColor() 
{ 
return "My ears are " + earColor; 
} 
public String getEyeColor() 
{ 
return "My eyes are " + eyeColor; 
} 
/**********************************************************************/ 

//mutator methods 
public void setArmCount(int n) 
{ 
               armCount = n; 
} 
public void setHasShoes(boolean t) 
{ 
               hasShoes = t; 
} 
public void setEarColor(String a) 
{ 
               earColor = a; 
} 
public void setEyeColor(String b) 
{ 
               eyeColor = b; 
} 

/********************************************************************/ 

//Other methods 
/*****************************************************/


//toString 
public String toString() 
{ 
return "The Potato Head object holds data relevant to a customizable Mr. Potato Head. There are 4 mutator methods: \n1. setArmCount(int) - sets the amount of arms your Potato Head has.\n2. setHasShoes(boolean) - sets whether or not the Potato Head has shoes.\n3. setEyeColor(String) - sets the eye color of the potato head. \n4. setEarColor(String) - sets the ear color of the potato head.\n------------------\nThe object also contains 4 accesor methods: getArmCount(), getHasShoes(), getEyeColor(), and getEarColor().\nThese accesor methods return the data relevant to their title."; } 
/*****************************************************/ //main method 
public static void main (String [] args) 
{ 
PotatoHead jim = new PotatoHead();
PotatoHead bob = new PotatoHead(1, true, "black", "black");
String arms = bob.getArmCount();
jim.setHasShoes(true);
String kicks = jim.getHasShoes();
String eyes = bob.getEyeColor();
String ears = bob.getEarColor();
System.out.println(arms);
System.out.println(kicks);
System.out.println(eyes + " " + ears);



} 
}
