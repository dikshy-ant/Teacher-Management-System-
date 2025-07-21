/**
 * class to create a gui that stores teacher info in a arraylist
 *
 * @dikshyant chapagain
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.awt.Color; 
import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TeacherGUI  {

private JFrame frame;

private JButton lectAdd, tutoAdd, gradeAssign, salarySet, tutoRemove, displayButton, addLect, buttonClear, addTuto,buttonClear2,
gradeButton,buttonClear3,buttonClear4,setSalary,removeTuto,buttonClear5,buttonClear6, display1,display2;

private JPanel  panel, mainContent,mainContent2, mainContent3, mainContent4,mainContent5,mainContent6,headingPanel;

private JLabel  titleLabel,teacherIdLectLabel,teacherIdTutoLabel,teacherIdGALabel,teacherIdSalaryLabel,teacherIdRemoveLabel,
teacherNameLabel,addressLabel,workingTypeLabel,employmentStatusLabel,workingHoursLabel,departmentLabel,yearsOfExperinenceLabel,
teacherIdDisplayLabel1,teacherIdDisplayLabel2,gradedScoresLabel,specializationLabel,academicQualificationsLabel,performanceIndexLabel, salaryLabel,
workingHoursLectLabel,departmentLectLabel ;
//for lecturer
private JTextField teacherIdLectTF,teacherNameLectTF,addressLectTF,workingTypeLectTF,employmentStatusLectTF,gradedScoreLectTF,
yearsOfExperienceLectTF,workingHoursLectTF,departmentLectTF;
//for tutor
private JTextField teacherIdTutoTF,teacherNameTutoTF,addressTutoTF,workingTypeTutoTF,employmentStatusTutoTF,workingHoursTutoTF,
salaryTutoTF,specializationTutoTF,academicqualificationsTutoTF,performanceIndexTutoTF;
//for garde assignment
private JTextField teacherIdGATF,gradedScoreGATF,departmentGATF,yearsOfExperienceGATF;
// set Salary
private JTextField teacherIdSalaryTF, salarySalaryTF,performanceIndexSalaryTF;
// remove
private JTextField teacherIdRemoveTF;
// display
private JTextField teacherIdLecDisplayTF,teacherIdTutDisplayTF;


//---------------------Importing Color-------------------------------------------------------

private Color white = new Color(0xFFC3C0);
private Color cornflowerBlue = new Color(100, 149, 200);

//Array List
public ArrayList<Teacher> teacherList = new ArrayList<>();


//------------------------------------------------CONSTRUCTOR------------------------------------------------------------
public TeacherGUI() {
frame = new JFrame("Dikshyant Chapagain 23049061");
frame.setSize(860,555);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





//------------------------------------------------BUTTONS TO CHANGE THE PANELS-----------------------------

lectAdd = new JButton("Add a lecturer");
lectAdd.setPreferredSize(new Dimension(120,60));
tutoAdd = new JButton("Add a Tutor");
tutoAdd.setPreferredSize(new Dimension(120,60));
gradeAssign = new JButton("Assign Grades");
gradeAssign.setPreferredSize(new Dimension(120,60));
salarySet = new JButton("Set Salary");
salarySet.setPreferredSize(new Dimension(120,60));
tutoRemove = new JButton("Remove Tutor");
tutoRemove .setPreferredSize(new Dimension(120,60));
displayButton = new JButton("Display");
displayButton.setPreferredSize(new Dimension(120,60));





//adding the button to the side of the frame
panel = new JPanel(new GridLayout(6,1));
panel.add(lectAdd);
panel.add(gradeAssign);
panel.add(tutoAdd);
panel.add(salarySet);
panel.add(tutoRemove);
panel.add(displayButton);


lectAdd.setBackground(cornflowerBlue);
gradeAssign.setBackground(cornflowerBlue);
tutoAdd.setBackground(cornflowerBlue);
salarySet.setBackground(cornflowerBlue);
tutoRemove.setBackground(cornflowerBlue);
displayButton.setBackground(cornflowerBlue);

lectAdd.setFont(new Font("Arial",Font.BOLD,12));
gradeAssign.setFont(new Font("Arial",Font.BOLD,12));
tutoAdd.setFont(new Font("Arial",Font.BOLD,12));
salarySet.setFont(new Font("Arial",Font.BOLD,12));
tutoRemove.setFont(new Font("Arial",Font.BOLD,12));
displayButton.setFont(new Font("Arial",Font.BOLD,12));


lectAdd.setBorder(BorderFactory.createLineBorder(Color.WHITE));
gradeAssign.setBorder(BorderFactory.createLineBorder(Color.WHITE));
tutoAdd.setBorder(BorderFactory.createLineBorder(Color.WHITE));
salarySet.setBorder(BorderFactory.createLineBorder(Color.WHITE));
tutoRemove.setBorder(BorderFactory.createLineBorder(Color.WHITE));
displayButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));


lectAdd.setForeground(Color.WHITE);
gradeAssign.setForeground(Color.WHITE);
tutoAdd.setForeground(Color.WHITE);
salarySet.setForeground(Color.WHITE);
tutoRemove.setForeground(Color.WHITE);
displayButton.setForeground(Color.WHITE);


//-----------------------------------------------------HEADING PANEL ----------------------------------------

headingPanel = new JPanel();
headingPanel.setBackground(cornflowerBlue);
headingPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10)); 


JLabel headingLabel = new JLabel("Teacher GUI");
headingLabel.setForeground(Color.WHITE);
headingLabel.setFont(new Font("Arial",Font.BOLD,19));
headingLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

headingPanel.add(headingLabel);

frame.getContentPane().add(headingPanel, BorderLayout.NORTH);




//-----------------------------------panel for the main content--------------------------------------------------




mainContent = new JPanel(new GridBagLayout());
GridBagConstraints constraints = new GridBagConstraints();
constraints.fill = GridBagConstraints.HORIZONTAL;
constraints.insets = new Insets(5,5,5,5);
 

JLabel titleLabel = new JLabel("Add a Lecturer");
titleLabel.setFont(new Font("Arial", Font.BOLD, 26));
titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


teacherIdLectLabel = new JLabel("Teacher Id");
teacherIdLectTF = new JTextField(10);

teacherNameLabel = new JLabel("teacherName");
teacherNameLectTF = new JTextField(10);

addressLabel = new JLabel("Address");
addressLectTF = new JTextField(10);

workingTypeLabel = new JLabel("Working Type");
workingTypeLectTF = new JTextField(10);

employmentStatusLabel = new JLabel("Employment Status");
employmentStatusLectTF = new JTextField(10);

gradedScoresLabel = new JLabel("Graded Score");
gradedScoreLectTF = new JTextField(10);

yearsOfExperinenceLabel = new JLabel("Years of Experience");
yearsOfExperienceLectTF = new JTextField(10);

workingHoursLectLabel = new JLabel("Working Hours");
workingHoursLectTF = new JTextField(10);

departmentLectLabel = new JLabel("Department");
departmentLectTF = new JTextField(10);


addLect = new JButton("Add Lecturer"); 
addLect.setPreferredSize(new Dimension(60,30));

buttonClear = new JButton ("Clear");
buttonClear.setPreferredSize(new Dimension(60,30));

addLect.setBackground(cornflowerBlue);
addLect.setForeground(Color.WHITE);
buttonClear.setBackground(cornflowerBlue);
buttonClear.setForeground(Color.WHITE);

//ACTION LISTENER FOR addLect button

addLect.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        
        
       try{
           
         if(teacherIdLectTF.getText().equals("") ||teacherNameLectTF.getText().equals("")||addressLectTF.getText().equals("")
        ||workingTypeLectTF.getText().equals("")||employmentStatusLectTF.getText().equals("")||
         gradedScoreLectTF.getText().equals("")||yearsOfExperienceLectTF.getText().
        equals("")||workingHoursLectTF.getText().equals("")||departmentLectTF.getText().equals("")) {
               JOptionPane.showMessageDialog(frame, "Empty Fields Found!! Please fill all the fields ", "Error",JOptionPane.WARNING_MESSAGE);
           } else {
           
           
        int teacherId = Integer.parseInt(teacherIdLectTF.getText());
        String teacherName = teacherNameLectTF.getText();
        String address = addressLectTF.getText();
        String workingType = workingTypeLectTF.getText();
        String employmentStatus = employmentStatusLectTF.getText();
        int gradedScore = Integer.parseInt(gradedScoreLectTF.getText());
        int yearsOfExperience= Integer.parseInt(yearsOfExperienceLectTF.getText());
        double workinghours = Double.parseDouble(workingHoursLectTF.getText());
        String department = departmentLectTF.getText();
    
        
        //checking if a teacher with a same Id exists 
        boolean found = false;
        for(Teacher teacher: teacherList) {
            if(teacherId == teacher.getteacherId()) {
            found = true;
            break;
         }
        }
        if(found) {
            JOptionPane.showMessageDialog(frame,"This teacher Id alreay exists add another one");
       }
        else {
            //creating a new Lecturer object
            Lecturer lecturer = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus, workinghours, department, yearsOfExperience);
            //adding lecturer to teacherlist
            teacherList.add(lecturer);
            JOptionPane.showMessageDialog(frame,"Lecturer Added with Id "+teacherId +"\n"
                        + "Teacher ID: " + teacherId + "\n"
                        + "Teacher Name: " + teacherName + "\n"
                        + "Address: " + address + "\n"
                        + "Working Type: " + workingType + "\n"
                        + "Employment Status: " + employmentStatus + "\n"
                        + "Graded Score: " + gradedScore + "\n"
                        + "Years of Experience: " + yearsOfExperience + "\n"
                        + "Working Hours: " + workinghours + "\n"
                        + "Department: " + department
            
            );
        } 
       }   
        }catch(NumberFormatException e1) {
            JOptionPane.showMessageDialog(frame,"Please enter valid input values");
        }
}

}); 

//action listener to the clear button
 
buttonClear.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(buttonClear,"Clear all fields?","Clear",JOptionPane.WARNING_MESSAGE);
        teacherIdLectTF.setText("");
        teacherNameLectTF.setText("");
        addressLectTF.setText("");
        workingTypeLectTF.setText("");
        employmentStatusLectTF.setText("");
        gradedScoreLectTF.setText("");
        yearsOfExperienceLectTF.setText("");
        workingHoursLectTF.setText("");
        departmentLectTF.setText("");
           }
});

constraints.gridx = 0;
constraints.gridy = 0;
mainContent.add(titleLabel, constraints);

constraints.gridx = 0;
constraints.gridy = 1;
mainContent.add(teacherIdLectLabel, constraints);

constraints.gridx = 1;
constraints.gridy = 1;
mainContent.add(teacherIdLectTF, constraints);

constraints.gridx = 0;
constraints.gridy = 2;
mainContent.add(teacherNameLabel, constraints);

constraints.gridx = 1;
constraints.gridy = 2;
mainContent.add(teacherNameLectTF, constraints);

constraints.gridx = 0;
constraints.gridy = 3;
mainContent.add(workingTypeLabel,constraints);

constraints.gridx = 1;
constraints.gridy = 3;
mainContent.add(workingTypeLectTF,constraints);

constraints.gridx = 0;
constraints.gridy = 4;
mainContent.add(addressLabel,constraints);

constraints.gridx = 1;
constraints.gridy = 4;
mainContent.add(addressLectTF,constraints);

constraints.gridx = 0;
constraints.gridy = 5;
mainContent.add(employmentStatusLabel,constraints);

constraints.gridx = 1;
constraints.gridy = 5;
mainContent.add(employmentStatusLectTF, constraints);

constraints.gridx = 0;
constraints.gridy = 6;
mainContent.add(gradedScoresLabel,constraints);

constraints.gridx = 1;
constraints.gridy = 6;
mainContent.add(gradedScoreLectTF,constraints);

constraints.gridx = 0;
constraints.gridy = 7;
mainContent.add(yearsOfExperinenceLabel,constraints);


constraints.gridx = 1;
constraints.gridy = 7;
mainContent.add(yearsOfExperienceLectTF, constraints);

constraints.gridx = 0;
constraints.gridy = 8;
mainContent.add(departmentLectLabel,constraints);

constraints.gridx = 1;
constraints.gridy = 8;
mainContent.add(departmentLectTF,constraints);

constraints.gridx = 0;
constraints.gridy = 9;
mainContent.add(workingHoursLectLabel,constraints);

constraints.gridx = 1;
constraints.gridy = 9;
mainContent.add(workingHoursLectTF,constraints);


constraints.gridx = 0;
constraints.gridy = 10;
mainContent.add(addLect,constraints);

constraints.gridx = 1;
constraints.gridy = 10;
mainContent.add(buttonClear,constraints);


//-------------------------------------------------MAIN CONTENT2 -----------------------------

mainContent2 = new JPanel(new GridBagLayout());
GridBagConstraints constraints1 = new GridBagConstraints();
constraints1.fill = GridBagConstraints.HORIZONTAL;
constraints1.insets = new Insets(5,5,5,5);

JLabel titleLabel2 = new JLabel("Add a Tutor   ");
titleLabel2.setFont(new Font("Arial", Font.BOLD, 26));
titleLabel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


teacherIdTutoLabel = new JLabel("Teacher Id");
teacherIdTutoTF = new JTextField(10);

teacherNameLabel = new JLabel("teacherName");
teacherNameTutoTF = new JTextField(10);

addressLabel = new JLabel("Address");
addressTutoTF = new JTextField(10);

workingTypeLabel = new JLabel("Working Type");
workingTypeTutoTF = new JTextField(10);

employmentStatusLabel = new JLabel("Employment Status");
employmentStatusTutoTF = new JTextField(10);

workingHoursLabel = new JLabel("Working Hours");
workingHoursTutoTF = new JTextField(10);



salaryLabel = new JLabel("Salary (double)");
salaryTutoTF = new JTextField(10);

specializationLabel = new JLabel("Specialization");
specializationTutoTF = new JTextField(10);

academicQualificationsLabel = new JLabel("Academic Qualifications");
academicqualificationsTutoTF = new JTextField(10);

performanceIndexLabel = new JLabel("Performance Index");
performanceIndexTutoTF= new JTextField(10);

addTuto = new JButton("Add Tutor");
//changing the size of the button
addTuto.setPreferredSize(new Dimension(60,30));

buttonClear2 = new JButton("Clear");
buttonClear2.setPreferredSize(new Dimension(60,30));

addTuto.setBackground(cornflowerBlue);
addTuto.setForeground(Color.WHITE);
buttonClear2.setBackground(cornflowerBlue);
buttonClear2.setForeground(Color.WHITE);

addTuto.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
             if (teacherIdTutoTF.getText().equals("") || teacherNameTutoTF.getText().equals("") ||
                addressTutoTF.getText().equals("") || workingTypeTutoTF.getText().equals("") ||
                employmentStatusTutoTF.getText().equals("") || workingHoursTutoTF.getText().equals("") ||
                salaryTutoTF.getText().equals("") || specializationTutoTF.getText().equals("") ||
                academicqualificationsTutoTF.getText().equals("") || performanceIndexTutoTF.getText().equals("")) {
                JOptionPane.showMessageDialog(frame, "Empty Fields Found!! Please fill all the fields ", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
            
            int teacherId = Integer.parseInt(teacherIdTutoTF.getText());
            String teacherName = teacherNameTutoTF.getText();
            String address = addressTutoTF.getText();
            String workingType = workingTypeTutoTF.getText();
            String employmentStatus = employmentStatusTutoTF.getText();
            int workingHours = Integer.parseInt(workingHoursTutoTF.getText());
            double salary = Double.parseDouble(salaryTutoTF.getText());
            String specialization = specializationTutoTF.getText();
            String academicQualifications = academicqualificationsTutoTF.getText();
            int performanceIndex = Integer.parseInt(performanceIndexTutoTF.getText());

            // Checking if the given Id of tutor already exists
            boolean found = false;
            for (Teacher teacher : teacherList) {
                if (teacher instanceof Tutor && teacherId == teacher.getteacherId()) {
                    found = true;
                    JOptionPane.showMessageDialog(frame, "A tutor with id " + teacherId + " exists");
                    break;
                }
            }

            if (!found) {
                // Create a new Tutor Object 
                Tutor tutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus, workingHours, salary, specialization, academicQualifications, performanceIndex);
                // Add the new tutor to the arrayList 
                teacherList.add(tutor);
                JOptionPane.showMessageDialog(frame, "Tutor with id " + teacherId + " added"
                        +  "Teacher Id: " +teacherId + "\n"
                        + "Teacher Name: " + teacherName + "\n"
                        + "Address: " + address + "\n"
                        + "Working Type: " + workingType + "\n"
                        + "Employment Status: " + employmentStatus + "\n"
                        + "Working Hours: " + workingHours + "\n"
                        + "Salary: " + salary + "\n"
                        + "Specialization: " + specialization + "\n"
                        + "Academic Qualifications: " + academicQualifications + "\n"
                        + "Performance Index: " + performanceIndex);
            }

        } 
      }
        catch  (NumberFormatException e1) {
            JOptionPane.showMessageDialog(frame, "Please Enter valid values");
        }
    }
});

   



buttonClear2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
      JOptionPane.showMessageDialog(buttonClear,"Clear all fields?","Clear",JOptionPane.WARNING_MESSAGE);
       teacherIdTutoTF.setText("");
        teacherNameTutoTF.setText("");
        addressTutoTF.setText("");
        workingTypeTutoTF.setText("");
        employmentStatusTutoTF.setText("");
        workingHoursTutoTF.setText("");
        salaryTutoTF.setText("");
        specializationTutoTF.setText("");
        academicqualificationsTutoTF.setText("");
        performanceIndexTutoTF.setText("");
    }
}
);


constraints.gridx = 0;
constraints.gridy = 0;
mainContent2.add(titleLabel2, constraints);

constraints1.gridx = 0;
constraints1.gridy = 1;
mainContent2.add(teacherIdTutoLabel, constraints1);

constraints1.gridx = 1;
constraints1.gridy = 1;
mainContent2.add(teacherIdTutoTF, constraints1);

constraints1.gridx = 0;
constraints1.gridy = 2;
mainContent2.add(teacherNameLabel, constraints1);

constraints1.gridx = 1;
constraints1.gridy = 2;
mainContent2.add(teacherNameTutoTF, constraints1);

constraints1.gridx = 0;
constraints1.gridy = 3;
mainContent2.add(addressLabel,constraints1);

constraints1.gridx = 1;
constraints1.gridy = 3;
mainContent2.add(addressTutoTF,constraints1);

constraints1.gridx = 0;
constraints1.gridy = 4;
mainContent2.add(workingTypeLabel,constraints1);

constraints1.gridx = 1;
constraints1.gridy = 4;
mainContent2.add(workingTypeTutoTF,constraints1);

constraints1.gridx = 0;
constraints1.gridy = 5;
mainContent2.add(employmentStatusLabel,constraints1);

constraints1.gridx = 1;
constraints1.gridy = 5;
mainContent2.add(employmentStatusTutoTF, constraints1);

constraints1.gridx = 0;
constraints1.gridy = 6;
mainContent2.add(workingHoursLabel,constraints1);

constraints1.gridx = 1;
constraints1.gridy = 6;
mainContent2.add(workingHoursTutoTF,constraints1);

constraints1.gridx = 0;
constraints1.gridy = 7;
mainContent2.add(salaryLabel,constraints1);

constraints1.gridx = 1;
constraints1.gridy = 7;
mainContent2.add(salaryTutoTF,constraints1);

constraints1.gridx = 0;
constraints1.gridy = 8;
mainContent2.add(specializationLabel,constraints1);

constraints1.gridx = 1;
constraints1.gridy = 8;
mainContent2.add(specializationTutoTF,constraints1);

constraints1.gridx = 0;
constraints1.gridy = 9;
mainContent2.add(academicQualificationsLabel,constraints1);

constraints1.gridx = 1;
constraints1.gridy = 9;
mainContent2.add(academicqualificationsTutoTF,constraints1);

constraints1.gridx = 0;
constraints1.gridy = 10;
mainContent2.add(performanceIndexLabel,constraints1);

constraints1.gridx = 1;
constraints1.gridy = 10;
mainContent2.add(performanceIndexTutoTF,constraints1);

constraints1.gridx= 0;
constraints1.gridy = 11;
mainContent2.add(addTuto,constraints1);

constraints1.gridx=1;
constraints1.gridy=11;
mainContent2.add(buttonClear2,constraints1);


// grading the assignment 

//-------------------------------------------------MAIN CONTENT3 -----------------------------



mainContent3 = new JPanel(new GridBagLayout());
GridBagConstraints constraints2 = new GridBagConstraints();
constraints2.fill = GridBagConstraints.HORIZONTAL;
constraints2.insets = new Insets(5,5,5,5);


JLabel titleLabel3 = new JLabel("Grade Assignment");
titleLabel3.setFont(new Font("Arial", Font.BOLD, 22));
titleLabel3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

teacherIdGALabel = new JLabel("TeacherId");
teacherIdGATF = new JTextField(10);

gradedScoresLabel = new JLabel("Graded Score");
gradedScoreGATF = new JTextField(10);

departmentLabel = new JLabel("Department");
departmentGATF = new JTextField(10);

yearsOfExperinenceLabel = new JLabel("Years of Experience");
yearsOfExperienceGATF = new JTextField(10);

gradeButton = new JButton("Grade");
gradeButton.setPreferredSize(new Dimension(60,30));

buttonClear2 = new JButton("Clear");
buttonClear2.setPreferredSize(new Dimension(60,30));

gradeButton.setBackground(cornflowerBlue);
gradeButton.setForeground(Color.WHITE);
buttonClear2.setBackground(cornflowerBlue);
buttonClear2.setForeground(Color.WHITE);


gradeButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            // Checking if any of the text fields are empty
            if (teacherIdGATF.getText().equals("") || departmentGATF.getText().equals("") || gradedScoreGATF.getText().equals("")
                    || yearsOfExperienceGATF.getText().equals("")) {
                JOptionPane.showMessageDialog(frame, "Empty Fields Found!! Please fill all the fields ", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                int teacherId = Integer.parseInt(teacherIdGATF.getText());

                // Checking if the given teacher ID exists
                boolean found = false;
                for (Teacher teacher : teacherList) {
                    if (teacherId == teacher.getteacherId()) {
                        found = true;
                        
                        if (teacher instanceof Lecturer) {
                            Lecturer lecturer = (Lecturer) teacher;
                            String department = departmentGATF.getText();
                            int gradedScore = Integer.parseInt(gradedScoreGATF.getText());
                            int yearOfExperience = Integer.parseInt(yearsOfExperienceGATF.getText());

                            lecturer.gradeAssignment(gradedScore, department, yearOfExperience);

                            // Display graded information
                            JOptionPane.showMessageDialog(frame, "Teacher Id " + teacherId + " \n department " + department +
                                    "\nGraded Score " + gradedScore + "\n Years of Experience " + yearOfExperience);
                        } else {
                            JOptionPane.showMessageDialog(frame, "Teacher with this ID is not a Lecturer");
                        }
                        break;
                        
                    }
                }

                // If teacher is not found
                if (!found) {
                    JOptionPane.showMessageDialog(frame, "Teacher with this ID not found");
                }
            }
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(frame, "Please enter valid values");
        }
    }
});




buttonClear2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
      JOptionPane.showMessageDialog(buttonClear2,"Clear all fields?","Clear",JOptionPane.WARNING_MESSAGE);
       teacherIdGATF.setText("");
       departmentGATF.setText("");
       yearsOfExperienceGATF.setText("");
       gradedScoreGATF.setText("");

    }
}
);

constraints2.gridx = 0;
constraints2.gridy = 0;
mainContent3.add(titleLabel3,constraints2);



constraints2.gridx = 0;
constraints2.gridy = 1;
mainContent3.add(teacherIdGALabel, constraints2);

constraints2.gridx = 1;
constraints2.gridy = 1;
mainContent3.add(teacherIdGATF, constraints2);

constraints2.gridx = 0;
constraints2.gridy = 2;
mainContent3.add(departmentLabel, constraints2);

constraints2.gridx = 1;
constraints2.gridy = 2;
mainContent3.add(departmentGATF, constraints2);


constraints2.gridx = 0;
constraints2.gridy = 3;
mainContent3.add( yearsOfExperinenceLabel,constraints2);

constraints2.gridx = 1;
constraints2.gridy = 3;
mainContent3.add(yearsOfExperienceGATF,constraints2);

constraints2.gridx = 0;
constraints2.gridy = 4;
mainContent3.add(gradedScoresLabel,constraints2);

constraints2.gridx = 1;
constraints2.gridy = 4;
mainContent3.add(gradedScoreGATF,constraints2);

constraints2.gridx = 0;
constraints2.gridy = 5;
mainContent3.add(gradeButton,constraints2);

constraints2.gridx = 1;
constraints2.gridy = 5;
mainContent3.add(buttonClear2,constraints2);


//set salary of the Tutor
//-------------------------------------------------MAIN CONTENT4 -----------------------------


mainContent4 = new JPanel(new GridBagLayout());
GridBagConstraints constraints3 = new GridBagConstraints();
constraints3.fill = GridBagConstraints.HORIZONTAL;
constraints3.insets = new Insets(5,5,5,5);

JLabel titleLabel4 = new JLabel("Set Salary    ");
titleLabel4.setFont(new Font("Arial", Font.BOLD, 26));
titleLabel4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


teacherIdSalaryLabel = new JLabel("Teacher Id");
teacherIdSalaryTF = new JTextField(10);
 
performanceIndexLabel = new JLabel("PerformanceIndex");
performanceIndexSalaryTF = new JTextField(10);

salaryLabel = new JLabel("Salary ");
salarySalaryTF = new JTextField(10);

setSalary = new JButton("Set");
setSalary.setPreferredSize(new Dimension(60,30));

buttonClear4 = new JButton("Clear");
buttonClear4.setPreferredSize(new Dimension(60,30));

setSalary.setBackground(cornflowerBlue);
setSalary.setForeground(Color.WHITE);
buttonClear4.setBackground(cornflowerBlue);
buttonClear4.setForeground(Color.WHITE);

setSalary.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            if (teacherIdSalaryTF.getText().equals("") || salarySalaryTF.getText().equals("") || performanceIndexSalaryTF.getText().equals("")) {
                JOptionPane.showMessageDialog(frame, "Empty Fields Found!! Please fill all the fields ", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                int teacherId = Integer.parseInt(teacherIdSalaryTF.getText());

                // Checking if the given teacherId exists 
                boolean found = false;
                for (Teacher teacher : teacherList) {
                    if (teacherId == teacher.getteacherId() && teacher instanceof Tutor) {
                        found = true;

                        Tutor tutor = (Tutor) teacher;
                        double newSalary = Double.parseDouble(salarySalaryTF.getText());
                        int newPerformanceIndex = Integer.parseInt(performanceIndexSalaryTF.getText());
                        tutor.setSalary(newSalary, newPerformanceIndex);

                        JOptionPane.showMessageDialog(frame, "Teacher ID: " + teacherId + "\n" + "New Salary: " + newSalary + "\n" + "New Performance Index: " + newPerformanceIndex);
                        break; 
                    }
                }
                if (!found) {
                    // If teacher ID exists but is not a Tutor
                    JOptionPane.showMessageDialog(frame, "Teacher ID does not exist or is not a tutor");
                }
            }
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(frame, "Please enter valid values");
        }
    }
});


buttonClear4.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
         JOptionPane.showMessageDialog(buttonClear4,"Clear all fields?","Clear",JOptionPane.WARNING_MESSAGE);
        teacherIdSalaryTF.setText("");
        salarySalaryTF.setText("");
        performanceIndexSalaryTF.setText("");
    }
});
constraints3.gridx = 0;
constraints3.gridy = 0;
mainContent4.add(titleLabel4,constraints3);


constraints3.gridx = 0;
constraints3.gridy = 1;
mainContent4.add(performanceIndexLabel,constraints3);

constraints3.gridx = 1;
constraints3.gridy = 1;
mainContent4.add(performanceIndexSalaryTF,constraints3);

constraints3.gridx = 0;
constraints3.gridy = 2;
mainContent4.add(teacherIdSalaryLabel,constraints3);

constraints3.gridx = 1;
constraints3.gridy = 2;
mainContent4.add(teacherIdSalaryTF,constraints3);

constraints3.gridx = 0;
constraints3.gridy = 3;
mainContent4.add(salaryLabel,constraints3);


constraints3.gridx = 1;
constraints3.gridy = 3;
mainContent4.add(salarySalaryTF,constraints3);

constraints3.gridx = 1;
constraints3.gridy = 4;
mainContent4.add(buttonClear4, constraints3);

constraints3.gridx = 0;
constraints3.gridy = 4;
mainContent4.add(setSalary,constraints3);

//remove the tutor 


//-------------------------------------------------MAIN CONTENT5 -----------------------------


mainContent5 = new JPanel(new GridBagLayout());
GridBagConstraints constraints4 = new GridBagConstraints();
constraints4.fill = GridBagConstraints.HORIZONTAL;
constraints4.insets = new Insets(5,5,5,5);

JLabel titleLabel5 = new JLabel("Remove Tutor");
titleLabel5.setFont(new Font("Arial",Font.BOLD,24));
titleLabel5.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

removeTuto = new JButton("Remove");
removeTuto.setPreferredSize(new Dimension(90,30));
buttonClear5 = new JButton("Clear");
buttonClear5.setPreferredSize(new Dimension(90,30));

removeTuto.setBackground(cornflowerBlue);
buttonClear5.setBackground(cornflowerBlue);
removeTuto.setForeground(Color.WHITE);
buttonClear5.setForeground(Color.WHITE);

teacherIdRemoveLabel = new JLabel("Teacher Id");
teacherIdRemoveTF = new JTextField(10);




removeTuto.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e) {
        try {
            if(teacherIdRemoveTF.getText().equals("")) {
            JOptionPane.showMessageDialog(frame, "Empty Fields Found!! Please fill all the fields ", "Error",JOptionPane.WARNING_MESSAGE);
           } else {
            int teacherId = Integer.parseInt(teacherIdRemoveTF.getText());
        
            //checking if the given teacher ID exists
        
            boolean found = false;
            for(Teacher teacher: teacherList) {
                if(teacherId == teacher.getteacherId() && teacher instanceof Tutor) {
                    found = true;
                    Tutor tutor = (Tutor)teacher;
                    teacherList.remove(tutor);
                    JOptionPane.showMessageDialog(frame,"Tutor Removed!");
                    break;
                }
            }
            if(!found) {
                JOptionPane.showMessageDialog(frame,"Tutor with that Id not found");
            }
        }
    }catch(NumberFormatException e1) {
            JOptionPane.showMessageDialog(frame,"Enter valid values");
        }
    }
});


buttonClear5.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(buttonClear5,"Clear all fields?","Clear",JOptionPane.WARNING_MESSAGE);
        teacherIdRemoveTF.setText("");
    }
});


constraints4.gridx = 0;
constraints4.gridy = 0;
mainContent5.add(titleLabel5,constraints4);

constraints4.gridx = 0;
constraints4.gridy = 1;
mainContent5.add(teacherIdRemoveLabel,constraints4);

constraints4.gridx=1;
constraints4.gridy=1;
mainContent5.add(teacherIdRemoveTF,constraints4);

constraints4.gridx = 0;
constraints4.gridy = 2;
mainContent5.add(removeTuto,constraints4);

constraints4.gridx = 1;
constraints4.gridy = 2;
mainContent5.add(buttonClear5,constraints4);

 



//-----------------------------------display---------------------------------


//-------------------------------------------------MAIN CONTENT6 -----------------------------
mainContent6 = new JPanel(new GridBagLayout());
GridBagConstraints constraints5 = new GridBagConstraints();
constraints5.fill = GridBagConstraints.HORIZONTAL;
constraints5.insets = new Insets(5,5,5,5);

JLabel titleLabel6 = new JLabel("Display             ");
titleLabel6.setFont(new Font("Arial",Font.BOLD,24));
titleLabel6.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));



teacherIdDisplayLabel1 = new JLabel("Teacher Id(Lecturer)");
teacherIdLecDisplayTF = new JTextField(10);

teacherIdDisplayLabel2 = new JLabel("Teacher Id(Tutor)");
teacherIdTutDisplayTF = new JTextField(10);


display1 = new JButton("Display Lecturer");
display1.setPreferredSize(new Dimension(120,30));

display2 = new JButton("Display Tutor");
display2.setPreferredSize(new Dimension(120,30));



buttonClear6 = new JButton("Clear");
buttonClear6.setPreferredSize(new Dimension(60,30));

display1.setBackground(cornflowerBlue);

constraints5.gridx = 0;
constraints5.gridy = 0;
mainContent6.add(titleLabel6,constraints5);

constraints5.gridx = 0;
constraints5.gridy = 1;
mainContent6.add(teacherIdDisplayLabel1,constraints5);

constraints5.gridx = 1;
constraints5.gridy = 1;
mainContent6.add(teacherIdLecDisplayTF,constraints5);

constraints5.gridx = 0;
constraints5.gridy = 2;
mainContent6.add(teacherIdDisplayLabel2,constraints5);

constraints5.gridx = 1;
constraints5.gridy = 2;
mainContent6.add(teacherIdTutDisplayTF,constraints5);


constraints5.gridx = 0;
constraints5.gridy = 3;
mainContent6.add(display1,constraints5);

constraints5.gridx = 0;
constraints5.gridy = 4;
mainContent6.add(display2,constraints5);


constraints5.gridx = 1;
constraints5.gridy = 3;
mainContent6.add(buttonClear6,constraints5);

display1.setBackground(cornflowerBlue);
display1.setForeground(Color.WHITE);

display2.setBackground(cornflowerBlue);
display2.setForeground(Color.WHITE);



buttonClear6.setBackground(cornflowerBlue);
buttonClear6.setForeground(Color.WHITE);

display1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            if(teacherIdLecDisplayTF.getText().equals("")) {
            JOptionPane.showMessageDialog(frame, "Empty Fields Found!! Please fill all the fields ", "Error",JOptionPane.WARNING_MESSAGE);

            } 
            else {
            int teacherId = Integer.parseInt(teacherIdLecDisplayTF.getText());
            
            
            boolean found = false;
            for (Teacher teacher : teacherList) {
                if (teacher instanceof Lecturer && teacherId == teacher.getteacherId()) {
                    found = true;
                    Lecturer lecturer = (Lecturer) teacher;
                    String teacherInfo = lecturer.strDisplay();
                    JOptionPane.showMessageDialog(frame, teacherInfo, "Lecturer Information", JOptionPane.INFORMATION_MESSAGE);
                     break;
                } 
                    
                   
            }
            
            if (!found) {
                JOptionPane.showMessageDialog(frame, "Teacher not found");
            }
            
        } 
      }catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(frame, "Please enter valid integer values in the text fields");
        }
    }
});


display2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            if(teacherIdTutDisplayTF.getText().equals("")) {
           JOptionPane.showMessageDialog(frame, "Empty Fields Found!! Please fill all the fields ", "Error",JOptionPane.WARNING_MESSAGE);

           }else{
            int teacherId = Integer.parseInt(teacherIdTutDisplayTF.getText());
            boolean found = false;
            for (Teacher teacher : teacherList) {
                if (teacher instanceof Tutor && teacherId == teacher.getteacherId()) {
                    found = true;
                    Tutor tutor = (Tutor) teacher;
                    String teacherInfo = tutor.strDisplay();
                    JOptionPane.showMessageDialog(frame, teacherInfo, "Tutor Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                } 
            }
            
            if (!found) {
                JOptionPane.showMessageDialog(frame, "Teacher not found");
            }
            
        } 
        
    }catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(frame, "Please enter valid integer values in the text fields");
        }
    }
});



buttonClear6.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(buttonClear6,"Clear all fields?","Clear",JOptionPane.WARNING_MESSAGE);
        teacherIdLecDisplayTF.setText("");
        teacherIdTutDisplayTF.setText("");
    }
});


//ACTION LISTENERS TO CHANGE PANELS WHEN CLICKING BUTTONS



lectAdd.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
        removeIfShowing(mainContent2);
        removeIfShowing(mainContent3);
        removeIfShowing(mainContent4);
        removeIfShowing(mainContent5);
        removeIfShowing(mainContent6);

        if (!mainContent.isShowing()) {
            frame.getContentPane().add(mainContent, BorderLayout.CENTER);
            mainContent6.setBackground(Color.WHITE);
        }

        frame.revalidate();
        frame.repaint();
    }
    
    public void removeIfShowing(JPanel panel) {
        if (panel.isShowing()) {
            frame.getContentPane().remove(panel);
         }
    }
});

tutoAdd.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e) {
        removeIfShowing(mainContent);
        removeIfShowing(mainContent3);
        removeIfShowing(mainContent4);
        removeIfShowing(mainContent5);
        removeIfShowing(mainContent6);

        if (!mainContent2.isShowing()) {
            frame.getContentPane().add(mainContent2, BorderLayout.CENTER);
            mainContent2.setBackground(Color.WHITE);
        }

        frame.revalidate();
        frame.repaint();
    }
    
    public void removeIfShowing(JPanel panel) {
        if (panel.isShowing()) {
            frame.getContentPane().remove(panel);
         }
    }
});

gradeAssign.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e) {
        removeIfShowing(mainContent);
        removeIfShowing(mainContent2);
        removeIfShowing(mainContent4);
        removeIfShowing(mainContent5);
        removeIfShowing(mainContent6);

        if (!mainContent3.isShowing()) {
            frame.getContentPane().add(mainContent3, BorderLayout.CENTER);
            mainContent3.setBackground(Color.WHITE);
        }

        frame.revalidate();
        frame.repaint();
    }
    
    public void removeIfShowing(JPanel panel) {
        if (panel.isShowing()) {
            frame.getContentPane().remove(panel);
         }
    }
});

salarySet.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        removeIfShowing(mainContent);
        removeIfShowing(mainContent2);
        removeIfShowing(mainContent3);
        removeIfShowing(mainContent5);
        removeIfShowing(mainContent6);

        if (!mainContent4.isShowing()) {
            frame.getContentPane().add(mainContent4, BorderLayout.CENTER);
            mainContent4.setBackground(Color.WHITE);
        }

        frame.revalidate();
        frame.repaint();
    }
    
    public void removeIfShowing(JPanel panel) {
        if (panel.isShowing()) {
            frame.getContentPane().remove(panel);
         }
    }
});

tutoRemove.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        removeIfShowing(mainContent);
        removeIfShowing(mainContent2);
        removeIfShowing(mainContent3);
        removeIfShowing(mainContent4);
        removeIfShowing(mainContent6);

        if (!mainContent5.isShowing()) {
            frame.getContentPane().add(mainContent5, BorderLayout.CENTER);
            mainContent5.setBackground(Color.WHITE);
        }

        frame.revalidate();
        frame.repaint();
    }
    
    public void removeIfShowing(JPanel panel) {
        if (panel.isShowing()) {
            frame.getContentPane().remove(panel);
         }
    }
});


displayButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        removeIfShowing(mainContent);
        removeIfShowing(mainContent2);
        removeIfShowing(mainContent3);
        removeIfShowing(mainContent4);
        removeIfShowing(mainContent5);

        if (!mainContent6.isShowing()) {
            frame.getContentPane().add(mainContent6, BorderLayout.CENTER);
            mainContent6.setBackground(Color.WHITE);
        }

        frame.revalidate();
        frame.repaint();
    }
    
    public void removeIfShowing(JPanel panel) {
        if (panel.isShowing()) {
            frame.getContentPane().remove(panel);
         }
    }


    
});

  



mainContent.setVisible(true);
frame.getContentPane().add(panel,BorderLayout.WEST);
frame.getContentPane().add(mainContent,BorderLayout.CENTER);
mainContent.setBackground(Color.WHITE);
frame.setVisible(true);


}




// main method 
public static void main(String[] args) {
    new TeacherGUI();
}


}



