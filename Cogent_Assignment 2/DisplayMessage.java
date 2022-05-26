class DisplayMessage
{
	void printMessage()
	{
		System.out.println("Hello My Message");
	}
}
  
class MyProgram
{
	public static void main(String arg[]) {
		DisplayMessage program=new DisplayMessage();
		program.printMessage();
	}
}