
/**
 * This is the parent Teacher Class. This class contains teacherId,teacherName,adress,workingType,employmentStatus, and workinghours
 * as it's attribute.It has different accessor and mutator methods and a display method to display the details of the Teacherclass
 *
 * @DikshyantChapagain
 * @1/19/2024
 */
public class Teacher //defining the class 
{  
  //Defining the  attributes of Teacher which has access modifier "private"//
  // instance varibale is made private so that only the classes which use them can access them//
  private int teacherId;  
  private String teacherName;
  private String address;
  private String workingType;
  private String employmentStatus;
  protected double workinghours; //protected is used so that Other classes can access it 
  
  //Defining the constructor which initialises the instance variable//
  // constructor does not have a return type//
  public Teacher(int teacherId,String teacherName,String address,String workingType,String employmentStatus)
  {
      this.teacherId = teacherId;
      this.teacherName = teacherName;
      this.address = address;
      this.workingType = workingType;
      this.employmentStatus = employmentStatus;   
  }
  
  // Making a Getter method for each attribute// 
  
  
  public int getteacherId() //getter method for teacherID attribute
  {
      return teacherId;
  }
 
  public String getteacherName() //getter method for teacherName attribute
  {
      return teacherName;
  }
  
  public String getaddress() //getter method for Address attribute
  {
      return address;
  }
  
  public String getworkingType()//getter method for workingType attribute
  {
      return workingType;
  }
  
  public String getemploymentStatus()//getter method for employmentStatus
  {
      return employmentStatus;
  }
  
  public void setworkinghours (double workinghours) //setter method for working hours
  {
      this.workinghours = workinghours;
  }
  
  
  public void display() // a display method that gives the teacher Id, teacher name, address, working type, and employment status

  {
    System.out.println("Teacher'sname is "+teacherName);
    System.out.println("Teacher's id is "+teacherId);
    System.out.println("Teacher's Address is "+address);
    System.out.println("Teacher's workingType is "+workingType);
    System.out.println("Teacher's employmentstatus "+employmentStatus);
    
    if(workinghours == 0) { // if working hours is not assigned then a suitable message should be assigned
        System.out.println("Teacher's working hour not assigned");

    }
    else {
        System.out.println("Teacher's workinghours"+workinghours);
    }
  }
  
  //adding a new method in the Teacher class so that the info will be shown in the GUI
  public String strDisplay() {
      StringBuilder info = new StringBuilder();
      
      info.append("Teacher's name is ").append(teacherName).append("\n");
      info.append("Teacher id is ").append(teacherId).append("\n");
      info.append("Teacher'Address is ").append(address).append("\n");
      info.append("Teacher's employmentstatus is ").append(employmentStatus).append("\n");
      
      
        if(workinghours == 0) { // if working hours is not assigned then a suitable message should be assigned
        info.append("wokring hours is  ").append(workinghours).append("\n");

        }
        else {
        info.append("working hours is").append(workinghours).append("\n");
        }   
      
       return info.toString();
  }
  
}
