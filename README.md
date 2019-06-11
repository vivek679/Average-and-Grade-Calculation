# Average-and-Grade-Calculation
Develop a smart application as Student Grade Calculator(SGC).  
Create a class Student with following private attribute :  
int id, String name, marks(integer array), float average and char grade. 
Include  getters and setters methods for all the attributes.  
void calculateAvg()- This method should calculate average and set average mark 
for the current student.  void findGrade()- This method should set the grade 
based on the average calculated. If the average is between 80 and 100 then, 
then return grade as 'O'. If the average is between 50 and 79 then return 
the grade as  'A' .
If the average of the student is  less than 50 then return grade as 'F'. 
average and grade attribute should be set with the appropriate values.  
(Note : Assume the number of subject is  greater than zero and  the mark 
for a subject is in the range of 0 - 100.)  
Write a class StudentMain and test the application.   
Sample Input 1: 
Enter the id: 
123 
Enter the name: 
Tom 
Enter the no of subjects: 
3 
Enter mark for subject 1: 
95 
Enter mark for subject 2: 
80 
Enter mark for subject 3: 
75
Sample Output 1:
Id:123 
Name:Tom 
Average:83.333333 
Grade:O 

Sample Input 2:  
Enter the id: 
123 
Enter the name: 
Tom Enter the no of subjects:  
3 
Enter mark for subject 1: 
25
Enter mark for subject 2:
30
Enter mark for subject 3: 
45

Sample Output 2:  
Id:123 
Name:Tom 
Average:33.333333 
Grade:F
