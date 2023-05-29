package Generalization;

public class Test_Generalization 
{
	public static void main(String[] args) 
	{
		System.out.println("------Features of Jio SimCard----------");
		Jio j=new Jio();
		j.featuresA();
		j.sms();
		j.audio_calling();
		j.data();
		
		System.out.println("------Features of VI SimCard----------");
		VI v=new VI();
		v.featuresB();
		v.sms();
		v.audio_calling();
		v.data();
		
		System.out.println("------Features of Airtel SimCard----------");
		Airtel a=new Airtel();
		a.featuresC();
		a.sms();
		a.audio_calling();
		a.data();
		
	}

}
