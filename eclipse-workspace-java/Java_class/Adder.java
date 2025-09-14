package programs;

import java.util.Scanner;

class Addclass {
	public int xe=(int) ((Math.random()*19)+1);
	public int ye=(int) ((Math.random()*19)+1);
	public int anse=xe+ye;
	public int xm=(int) ((Math.random()*979)+20);
	public int ym=(int) ((Math.random()*979)+20);
	public int ansm=xm+ym;
	public int xh=(int) ((Math.random()*8999)+1000);
	public int yh=(int) ((Math.random()*8999)+1000);
	public int ansh=xh+yh;
	public int xa=(int) ((Math.random()*89999)+10000);
	public int ya=(int) ((Math.random()*89999)+10000);
	public int ansa=xa+ya;
	public int xi=(int) ((Math.random()*499899998)+100000);
	public int yi=(int) ((Math.random()*499899998)+100000);
	public int ansi=xi+yi;
	public int xme=(int) ((Math.random()*19)+1);
	public int yme=(int) ((Math.random()*19)+1);
	public int ansme=xme+yme;
	public int xmm=(int) ((Math.random()*979)+20);
	public int ymm=(int) ((Math.random()*979)+20);
	public int ansmm=xmm+ymm;
	public int xmh=(int) ((Math.random()*8999)+1000);
	public int ymh=(int) ((Math.random()*8999)+1000);
	public int ansmh=xh+yh;
	public int xa=(int) ((Math.random()*89999)+10000);
	public int ya=(int) ((Math.random()*89999)+10000);
	public int ansa=xa+ya;
	public int xi=(int) ((Math.random()*499899998)+100000);
	public int yi=(int) ((Math.random()*499899998)+100000);
	public int ansi=xi+yi;
	public int uans;
	public int stop=2;
	public int total=0;
	public boolean correct=false;
	public boolean exit=false;
	public boolean leave=false;
	public int difficulty=2;
	public Addclass(int uans1) {
		uans=uans1;
	}
	public void checka() {
		anse=xe+ye;
		ansm=xm+ym;
		ansh=xh+yh;
		ansa=xa+ya;
		ansi=xi+yi;
		{for (int i=0, points=5; difficulty==1 && i<stop && points>0; i++, points=points-2) {
			correct=false;
			if (uans==anse) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(xe+" + "+ye+" = "+anse);
			correct=true;
		}}
		{for (int i=0, points=10; difficulty==2 && i<stop && points>0; i++, points=points-4) {
			correct=false;
			if (uans==ansm) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(xm+" + "+ym+" = "+ansm);
			correct=true;
		}}
		{for (int i=0, points=15; difficulty==3 && i<stop && points>0; i++, points=points-6) {
			correct=false;
			if (uans==ansh) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(xh+" + "+yh+" = "+ansh);
			correct=true;
		}}
		{for (int i=0, points=20; difficulty==4 && i<stop && points>0; i++, points=points-8) {
			correct=false;
			if (uans==ansa) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(xa+" + "+ya+" = "+ansa);
			correct=true;
		}}
		{for (int i=0, points=50; difficulty==5 && i<stop && points>0; i++, points=points-20) {
			correct=false;
			if (uans==ansi) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(xi+" + "+yi+" = "+ansi);
			correct=true;
		}}
		xe=(int) ((Math.random()*19)+1);
		ye=(int) ((Math.random()*19)+1);
		xm=(int) ((Math.random()*979)+20);
		ym=(int) ((Math.random()*979)+20);
		xh=(int) ((Math.random()*8999)+1000);
		yh=(int) ((Math.random()*8999)+1000);
		xa=(int) ((Math.random()*89999)+10000);
		ya=(int) ((Math.random()*89999)+10000);
		xi=(int) ((Math.random()*499899998)+100000);
		yi=(int) ((Math.random()*499899998)+100000);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	public void checkm() {
		anse=xe-ye;
		ansm=xm-ym;
		ansh=xh-yh;
		ansa=xa-ya;
		ansi=xi-yi;
		{for (int i=0, points=5; difficulty==1 && i<stop && points>0; i++, points=points-2) {
			correct=false;
			if (uans==anse) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(xe+" - "+ye+" = "+anse);
			correct=true;
		}}
		{for (int i=0, points=10; difficulty==2 && i<stop && points>0; i++, points=points-4) {
			correct=false;
			if (uans==ansm) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(xm+" - "+ym+" = "+ansm);
			correct=true;
		}}
		{for (int i=0, points=15; difficulty==3 && i<stop && points>0; i++, points=points-6) {
			correct=false;
			if (uans==ansh) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(xh+" - "+yh+" = "+ansh);
			correct=true;
		}}
		{for (int i=0, points=20; difficulty==4 && i<stop && points>0; i++, points=points-8) {
			correct=false;
			if (uans==ansa) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(xa+" - "+ya+" = "+ansa);
			correct=true;
		}}
		{for (int i=0, points=50; difficulty==5 && i<stop && points>0; i++, points=points-20) {
			correct=false;
			if (uans==ansi) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(xi+" - "+yi+" = "+ansi);
			correct=true;
		}}
		xe=(int) ((Math.random()*19)+1);
		ye=(int) ((Math.random()*19)+1);
		xm=(int) ((Math.random()*979)+20);
		ym=(int) ((Math.random()*979)+20);
		xh=(int) ((Math.random()*8999)+1000);
		yh=(int) ((Math.random()*8999)+1000);
		xa=(int) ((Math.random()*89999)+10000);
		ya=(int) ((Math.random()*89999)+10000);
		xi=(int) ((Math.random()*499899998)+100000);
		yi=(int) ((Math.random()*499899998)+100000);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	public void checkt() {
		anse=xe*ye;
		ansm=xm*ym;
		ansh=xh*yh;
		ansa=xa*ya;
		ansi=xi*yi;
		{for (int i=0, points=20; difficulty==1 && i<stop && points>0; i++, points=points-8) {
			correct=false;
			if (uans==anse) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(xe+" * "+ye+" = "+anse);
			correct=true;
		}}
		{for (int i=0, points=40; difficulty==2 && i<stop && points>0; i++, points=points-16) {
			correct=false;
			if (uans==ansm) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(xm+" * "+ym+" = "+ansm);
			correct=true;
		}}
		{for (int i=0, points=60; difficulty==3 && i<stop && points>0; i++, points=points-24) {
			correct=false;
			if (uans==ansh) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(xh+" * "+yh+" = "+ansh);
			correct=true;
		}}
		{for (int i=0, points=80; difficulty==4 && i<stop && points>0; i++, points=points-32) {
			correct=false;
			if (uans==ansa) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(xa+" * "+ya+" = "+ansa);
			correct=true;
		}}
		xe=(int) ((Math.random()*19)+1);
		ye=(int) ((Math.random()*19)+1);
		xm=(int) ((Math.random()*979)+20);
		ym=(int) ((Math.random()*979)+20);
		xh=(int) ((Math.random()*8999)+1000);
		yh=(int) ((Math.random()*8999)+1000);
		xa=(int) ((Math.random()*89999)+10000);
		ya=(int) ((Math.random()*89999)+10000);
		xi=(int) ((Math.random()*499899998)+100000);
		yi=(int) ((Math.random()*499899998)+100000);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	public void checkd() {
		anse=xe*ye;
		ansm=xm*ym;
		ansh=xh*yh;
		ansa=xa*ya;
		ansi=xi*yi;
		{for (int i=0, points=30; difficulty==1 && i<stop && points>0; i++, points=points-12) {
			correct=false;
			if (uans==xe) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(anse+" / "+ye+" = "+xe);
			correct=true;
		}}
		{for (int i=0, points=60; difficulty==2 && i<stop && points>0; i++, points=points-24) {
			correct=false;
			if (uans==xm) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(ansm+" * "+ym+" = "+xm);
			correct=true;
		}}
		{for (int i=0, points=90; difficulty==3 && i<stop && points>0; i++, points=points-36) {
			correct=false;
			if (uans==xh) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(ansh+" * "+yh+" = "+xh);
			correct=true;
		}}
		{for (int i=0, points=120; difficulty==4 && i<stop && points>0; i++, points=points-48) {
			correct=false;
			if (uans==xa) {
				total=total+points;
				correct=true;
				System.out.println("Congrats! Answer Correct! "+points+" Points Added To Your Score");
				break;
			}
			else if (uans==999999999) {
				System.out.println("Your Score is "+total);
				exit=true;
				correct=true;
				break;
			}
			else {
				Scanner input=new Scanner(System.in);
				System.out.print("Wrong Answer! Please Try Again: ");
				uans=input.nextInt();
				correct=false;
			}
		}
		if (correct==false) {
			System.out.println(ansa+" * "+ya+" = "+xa);
			correct=true;
		}}
		xe=(int) ((Math.random()*19)+1);
		ye=(int) ((Math.random()*19)+1);
		xm=(int) ((Math.random()*979)+20);
		ym=(int) ((Math.random()*979)+20);
		xh=(int) ((Math.random()*8999)+1000);
		yh=(int) ((Math.random()*8999)+1000);
		xa=(int) ((Math.random()*89999)+10000);
		ya=(int) ((Math.random()*89999)+10000);
		xi=(int) ((Math.random()*499899998)+100000);
		yi=(int) ((Math.random()*499899998)+100000);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
}
public class Adder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addclass n1=new Addclass(0);
		int type=0;
		Scanner input=new Scanner(System.in); //ScannerInput
		System.out.println("Hi, Welcome to \"Test Your Math Skills\"!");
		System.out.println("Here, You Test And Take Math Quizes.");
		while (type!=999) {
			System.out.println("Out of The Following, Choose Your Type of Quiz. (Enter 1-5) If You Feel That That's Enough for Today, Enter Any Number Other Than 1-5");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Random");
			type=input.nextInt();
			n1.exit=false;
			while (type==5 && n1.exit==false) {
				type=(int) ((Math.random()*4)+1);
			}
			while (type==1 && n1.exit==false) {
				System.out.println("To Leave Addition, You Simply Just Type Any Number Other Than 1-5");
				System.out.println("1. Easy (5 points), 2. Moderate (10 points), 3. Hard (15 points), 4. Advanced (20 points), 5. Insane (50 points)");
				n1.difficulty=input.nextInt();
				switch (n1.difficulty) {
				case 1:
					System.out.print(n1.xe+" + "+n1.ye+" = ");
					break;
				case 2:
					System.out.print(n1.xm+" + "+n1.ym+" = ");
					break;
				case 3:
					System.out.print(n1.xh+" + "+n1.yh+" = ");
					break;
				case 4:
					System.out.print(n1.xa+" + "+n1.ya+" = ");
					break;
				case 5:
					System.out.print(n1.xi+" + "+n1.yi+" = ");
					break;
				default:
					n1.exit=true;
					break;
				}
				if (n1.exit==false) {
					n1.uans=input.nextInt();
					n1.checka();
					System.out.println("You Have "+n1.total+" Points");
				}
			}
			while (type==2 && n1.exit==false) {
				System.out.println("To Leave Subtraction, You Simply Just Type Any Number Other Than 1-5");
				System.out.println("1. Easy (5 points), 2. Moderate (10 points), 3. Hard (15 points), 4. Advanced (20 points), 5. Insane (50 points)");
				n1.difficulty=input.nextInt();
				switch (n1.difficulty) {
				case 1:
					System.out.print(n1.xe+" - "+n1.ye+" = ");
					break;
				case 2:
					System.out.print(n1.xm+" - "+n1.ym+" = ");
					break;
				case 3:
					System.out.print(n1.xh+" - "+n1.yh+" = ");
					break;
				case 4:
					System.out.print(n1.xa+" - "+n1.ya+" = ");
					break;
				case 5:
					System.out.print(n1.xi+" - "+n1.yi+" = ");
					break;
				default:
					n1.exit=true;
					break;
				}
				if (n1.exit==false) {
					n1.uans=input.nextInt();
					n1.checkm();
					System.out.println("You Have "+n1.total+" Points");
				}
			}
			while (type==3 && n1.exit==false) {
				System.out.println("To Leave Multiplication, You Simply Just Type Any Number Other Than 1-4");
				System.out.println("1. Easy (20 points), 2. Moderate (40 points), 3. Hard (60 points), 4. Advanced (80 points)");
				n1.difficulty=input.nextInt();
				switch (n1.difficulty) {
				case 1:
					System.out.print(n1.xe+" * "+n1.ye+" = ");
					break;
				case 2:
					System.out.print(n1.xm+" * "+n1.ym+" = ");
					break;
				case 3:
					System.out.print(n1.xh+" * "+n1.yh+" = ");
					break;
				case 4:
					System.out.print(n1.xa+" * "+n1.ya+" = ");
					break;
				default:
					n1.exit=true;
					break;
				}
				if (n1.exit==false) {
					n1.uans=input.nextInt();
					n1.checkt();
					System.out.println("You Have "+n1.total+" Points");
				}
			}
			while (type==4 && n1.exit==false) {
				System.out.println("To Leave Division, You Simply Just Type Any Number Other Than 1-4");
				System.out.println("1. Easy (30 points), 2. Moderate (60 points), 3. Hard (90 points), 4. Advanced (120 points)");
				n1.difficulty=input.nextInt();
				switch (n1.difficulty) {
				case 1:
					System.out.print(n1.xe*n1.ye+" / "+n1.ye+" = ");
					break;
				case 2:
					System.out.print(n1.xm*n1.ym+" / "+n1.ym+" = ");
					break;
				case 3:
					System.out.print(n1.xh*n1.yh+" / "+n1.yh+" = ");
					break;
				case 4:
					System.out.print(n1.xa*n1.ya+" / "+n1.ya+" = ");
					break;
				default:
					n1.exit=true;
					break;
				}
				if (n1.exit==false) {
					n1.uans=input.nextInt();
					n1.checkd();
					System.out.println("You Have "+n1.total+" Points");
				}
			}
			if (type!=1 && type!=2 && type!=3 && type!=4 && type!=5) {
				break;
			}
		}
		System.out.println("You Have "+n1.total+" Points");
		System.out.println("Come Again!");
		System.out.println("We Hope You Enjoyed Our Game!");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}

}