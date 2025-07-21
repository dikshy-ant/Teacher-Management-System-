
/**
 * This class is a child class of the Teacher class. This class contains department, yearsOfExperience,gradedScore and hasGraded
 * as it's attributes.It has various accessor methods of its attributes and a mutator method and a displaymethod to display the details 
 * which has the same signature as the Teacher class
 * * @DikshyantChapagain
 * @1/19/2024
 */
public class Lecturer extends Teacher //defining the class
//extends is used to establish relationship between the two classes
{    
//Defining the attributes or instance variables of the Lecturer class which has private access modifier
  private String department;
  private int yearsOfExperience;
  private int gradedScore;
  private boolean hasGraded;
// defining the constructor which initializes the instance variables. Constructor has no return type
public Lecturer(int teacherId,String teacherName,String address,String workingType,String employmentStatus,double workinghours,String department,int yearsOfExperience)
{
  super(teacherId,teacherName,address,workingType,employmentStatus);
  this.department = department;
  this.yearsOfExperience = yearsOfExperience;
  super.setworkinghours(workinghours); // calling the setter method from the parent class
  this.gradedScore = 0;
  this.hasGraded = false;
  
}
//defining the accessor method or getter method 
public String getdepartment() //getter method for department
{
    return department;
}

public int getyearsOfExperience() //getter method for yearsOfExperience
{
    return yearsOfExperience;
}

public int getgradedScore() //getter method for gradedScore
{
    return gradedScore;
}

public boolean gethasGraded() //getter method for hasGraded
{
    return hasGraded;
}

//mutator or setter method for graded Score (setter method must have void return type)

public void setgradedScore(int gradedScore)
{
this.gradedScore=gradedScore;
}

public void gradeAssignment(int gradedScore,String Department,int YearsOfExperience) //method to grade the assignment
{
  if(YearsOfExperience >= 5 && this.department.equals(department)) {
    if(gradedScore >= 70) {
       System.out.println("The Grade is A");
    }
    else if(gradedScore >= 60) {
        System.out.println("The Grade is B");
    }
    else if(gradedScore >= 50) {
        System.out.println(" The Grade is C");
    }
    else if(gradedScore >= 40) {
       System.out.println(" The Grade is D");
    }
    else {
        System.out.println(" The Grade is E");
    }
    this.gradedScore = gradedScore;
    this.hasGraded = true;
 }
 else {
     System.out.println("Assignment has not been graded");
 }
 
}
public void display() //method to display the details of the lecturer
{
  super.display();  //super is used to access the method from the parent class
  System.out.println("Department "+department);
  System.out.println("YearsOfExperience "+yearsOfExperience);
  
  if(hasGraded) {
      System.out.println("GradedScore "+gradedScore);
  }
  else {
      System.out.println("not graded yet");
  }
}

public String strDisplay() {
   StringBuilder info = new StringBuilder();
   info.append(super.strDisplay());
   info.append("Department ").append(department).append("\n");
   info.append("years of experience ").append(yearsOfExperience).append("\n");
   
  if(hasGraded) {
  info.append("Graded Score ").append(gradedScore).append("\n");
   }
  else{
   info.append("not graded. ");
 }
        
        
return info.toString();
  }
  
}


