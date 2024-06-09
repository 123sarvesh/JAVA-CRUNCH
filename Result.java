/* Create a class student with data member rollno, Name, and inherit class Exam with 3 subject marks, total and percentage.
Assign the values of each class through parameterized constructor.
And Display result. */

		
class Result
{
	public static void main(String ar[])
	{
		
		Exam e= new Exam(90,90,90);
		e.calc();
		e.show();
	}
}	

