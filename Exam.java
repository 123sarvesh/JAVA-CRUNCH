class Exam extends Student
{
	int m1,m2,m3;
	int total;
	float perc;
	Exam(int p,int q,int r)
	{	
		getdata("Pritesh",8);
		m1=p;
		m2=q;
		m3=r;
	}
	void calc()
	{
		total=m1+m2+m3;
		perc=((float)total/(float)300)*(float)100;		
	}
	void show()
	{
		System.out.println("The Name of the User is :: "+name);
		System.out.println("The Roll No is :: "+rollno);
		System.out.println("The Total is :: "+total);
		System.out.println("The Percentage is :: "+perc);
	}
}