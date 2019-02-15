package Entities;

public class Person {

    private String fname;
    private String lname;
    private int age;
    private static int numberOfPersonsCreated;
    
 public Person(){
        System.out.println("You just created a Person");
        numberOfPersonsCreated++;
    }

    public static int getNumberOfPersonsCreated(){
        return numberOfPersonsCreated;
    }

    public void setFName(String orisma){
        fname = orisma;
    }
    public String getFName(){
        return fname;
    }
    
    public void setLName(String orisma){
        lname = orisma;
    } 

    public String getLName(){
        return lname;
    }

    public void setAge(int orisma){
        age = 12;
    }
    
    public int getAge(){
        return age;
    }   
    
}   
    
    
    
    
    
    
    
    
    


    



