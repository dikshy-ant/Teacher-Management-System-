
/**
 * This is a child class of the parent class Teacher.It has salary,specialization,academicqualifications,performanceIndex and isCertifiied 
 * as its attributes it has different accessor and mutator methods.It has a removeTutor() method to remove the details if is Certified is 
 * false and a display method which have the same signature as the display in the Teacher class.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutor extends Teacher //defining the class
//extends is used to establish inheritancce between the two classes
{
 //instance variables 
 private double salary;
 private String specialization;
 private String academicqualifications;
 private int performanceIndex;
 private boolean isCertified;
 //defining the constructor 
 //constructor does not have a return type
 public Tutor(int teacherId,String teacherName,String address,String workingType,String employmentStatus,double workinghours,double salary,String specialization,String academicqualifications,int performanceIndex)
 {
   super(teacherId,teacherName,address,workingType,employmentStatus);
   this.salary = salary;
   this.specialization = specialization;
   super.setworkinghours(workinghours); //calling the setter method to set the workinghours
   this.academicqualifications = academicqualifications;
   this.performanceIndex = performanceIndex;
   this.isCertified = false; //it is a boolean value and false is taken as a default value
   
 }
 
 //defining the acessor method or the getter method for each attribute
 
 public double getsalary() //getter method for salary
 {
    return salary;
 }

 public String getspecialization() //getter method for specialization
 {
     return specialization;   
 }
 
 public String getacademiqualifications() //getter method for academicqualifications
 {
    return academicqualifications;
 }
 
 public int getperformanceIndex() //getter method for performanceIndex
 {
     return performanceIndex;
 }
 
 public boolean getisCertified() //getter method for isCertified
 {
    return isCertified;
 }
 
 public double getworkinghours() //getter method for the workinghours which is from the parentclass
 {
    return workinghours;
 }
 
 //method to set the salary 
 public void setSalary(double salary, int performanceIndex)
 {
     if(performanceIndex>5 && getworkinghours()>20) {
         double appraisal = 0;                    // appraisal here is a local variable which is declared only in the SetSalarymethod
         if(performanceIndex>=5 && performanceIndex<=7) {
          appraisal = 0.05;   
          }

         else if(performanceIndex>=8 && performanceIndex<=9) {
             appraisal = 0.10;
         }
         else if(performanceIndex == 10) {
             appraisal = 0.20;
         }
          
        double newSalary = salary * appraisal;
        this.salary = salary+ newSalary;
        this.isCertified = true;
        
        }
        else {   
        this.isCertified = false;
        System.out.println("Salary can't be approved");
        }

}


// method to remove the tutor if the tutor has not been certified
public void removeTutor()
{
  if(!isCertified) {
   this.salary = 0 ;
   this.specialization = null ;
   this.academicqualifications = null; 
   this.performanceIndex = 0;
   this.isCertified = false;
  }
  else {
    System.out.println("Cannot remove the tutor");
  }
}

// method to display the details of the tutor class is required
public void display()
{
    if(!isCertified) {
        super.display(); // super is used to access the method from the parent class
        System.out.println("The Tutor can't be Certified");
    }
    else {
        super.display();
        System.out.println("salary is "+salary);
        System.out.println("specialization is "+specialization);
        System.out.println("academic qualification is "+academicqualifications);
        System.out.println("performanceIndex is "+performanceIndex);
    }
}

public String strDisplay() {
   StringBuilder info = new StringBuilder();
   if(!isCertified) {
    info.append(super.strDisplay());
    info.append("The tutor can't be Certified ");
  } else {
      info.append(super.strDisplay());
      info.append("Salary is ").append(salary).append("\n");
      info.append("academic Qualification ").append(academicqualifications).append("\n");
      info.append("performanceIndex ").append(performanceIndex).append("\n");
  }

        
        
  return info.toString();
  }




}