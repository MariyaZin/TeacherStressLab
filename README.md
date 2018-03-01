# TeacherStressLab
Working with classes, inheritances, and mutators

For this problem, you will design  classes suitable for storing information about University Teachers. The goal of the exercise is to demonstrate arranging class definitions in an inheritance hierarchy for maximum code-sharing. 

The problem

A.    You are to model the three types of  University Teacher:   Professor,  Lecturer, and Grad student by writing appropriate classes
At any time, the state of a University Teacher can be described by three quantities, implemented as private instance variables: 

number of unread e-mail messages, 
age, 
number of eccentricities

A Teacher class should have a constructor with two parameters, age and unread mail.  The eccentricities should be set to zero. 

There are two measures of a Teacher's current mood:  Stress and Respect.

Stress— a Teacher's stress level is the number of unread messages. However, Stress is never more than 1000. 
Grad students are the exception. Their stress is 1.5 times the number of unread messages and their maximum stress is 1500.

Respect- generally a Teacher's level of respect in the community is their age minus the number of eccentricities.  Respect can never be negative.
Professors are the exception—( Professor eccentricities are regarded as "signs of a troubled genius" thereby increasing respect). So for Professors, respect is age plus number of eccentricities.

Everything in a Teacher's life is driven by receiving e-mail. This is done by a call to the receiveMail(  )  method.  For example  DrX.receiveMail(200);  makes the Teacher DrX  receive 200 new E-mails. 

When called, method receiveMail( ) does the following   
a)  updating the variables, 
b) calculates Stress and Respect and finally 
c)  if needed, calls the cope( ) method.

When a teacher gets new, un-read e-mail Several things happen: 

First, the amount of unread-mail is increased.  If, for example he had  unreadEmail = 10 and he receives 23 new emails, unreadEmail becomes 10 + 23 = 33.

Second, 80% of the time, there will be no change in the number of eccentricities. 20% of the time the number of eccentricities will randomly go up or down by two.

Third, the new unread mail may cause the instructor's Stress factor to become larger than their Respect factor which makes the instructor unhappy. 

When and if a Teacher becomes "unhappy", a  "coping" mechanism is activated by calling the cope() method.  ( for our foreign language friends, "Coping"  means handling the stress. Some people handle stress by doing Tai-Chi, some people cope with stress by drinking and some people listen to Bach… in general, all people have a coping mechanism they use to deal with stress.)
In our classes the receiveMail() method calculates stress and respect for the teacher, and if 
                                 stress > respect 
it calls an abstract method cope().  
The cope() method will get a body in the inheriting classes ( because each different kind of teacher implements it differently )

Teachers now, have different coping mechanisms which have to be implemented in their pwn versions of the cope() method ( which should override the one they inherit from class teacher ). 

Professors react by gaining 30 eccentricities. 

Lecturers react by accidentally deleting 60% of  their unread mail. 

Grad students react by reading all of their unread mail. The resulting mental anguish causes the Grad student's eccentricities to go up or down by  three  randomly. 

The coping mechanisms may or may not bring the Stress and Respect factors back in line, however,  the coping mechanism is activated at most one time for each batch of incoming mail. ( this means that if, after the coping mechanism is called, stress is still greater than respect you DO NOT call it again)

On the next page there is a sketch of a design drawing to help you think about your solution.
 You will note that, the way to send an instructor mail is by calling his receiveMail( int) method with an int parameter representing the number of email messages.



Implement your classes, naming them and their methods exactly as above, they should all have a toString() method implementation.

Test them as follows: 

B.	Create a "container" class called University that can store Teachers. 
University will have the following methods:

a default constructor that allocates space for an array of 30 Teachers (a java.util.ArrayList can also be used instead of an array).
a method add( Teacher ) that allows one to add a teacher ( any one of Professor, Lecturer or GradStudent )
a method sendThemMail( int )  that sends every teacher in University the same number of emails
a toString() method that returns a string representation of the entire University

 Make a University object and add a few teachers.  f.e.  new Professor (50, 10), a new Lecturer (27, 4) and a new Grad (23, 2)       

Simulate the workings of the system for 10 days by going into a loop where each day a number of emails are sent to each element of the array.   The number of emails is determined by multiplying the day by 10 and adding 50      i.e.  int mail = k * 10 + 50;    where k is the day.  
So f.e. the first day  k = 1   and the emails sent to each will be mail = 1 * 10 + 50 = 60    
the second day k = 2 and mail = 2 * 10 + 50 = 70  etc. etc. 

Whenever the cope() method is called there should be a message printed saying who is coping and what the stress and respect levels are.. before and after coping. 


C.      In later years, another category of Univ. teacher emerges..  ContractFaculty.   These have an additional instance variable...  yearsOfService   which is initialized by the constructor.

Stress for ContractFaculty is calculated  by multiplying unreadEmails by a random factor ranging between 1.0 and 1.99999...

Respect is their age + 2 * yearsOfService

ContractFaculty will extend Lecturer, and will thus cope() in the same was as a Lecturer. 
Program this new class and add it to your simulation without changing the existing code ( apart from the testing main() method ) ?

D.      Implement the following method in your university class : 

void incrementYearsOfServiceOfContractFacultyTeachers()

implement the following method in the  ContractFaculty class:
incrementYearsOfService()

Note: your method will use “instanceof” java keyword (with if) to determine which teachers are actual type ContractFaculty, and you will need to use a type cast to invoke the  incrementYearsOfService() method on them.

Name your lab project as usual and submit the zipped project file using the submission link on Moodle.
