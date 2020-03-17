

public class Pspk 
{
  public static void main(String[] args) 
	{
		String a="pawan kalyan @ janasana is a 6 feet bullet";
		int vcount=0;
		int ccount=0;
		int ncount=0;
		int scount=0;
		int spcount=0;
		for(int i=0; i<a.length(); i++)
		{
			if(a.charAt(i)>=65&&a.charAt(i)<=90||a.charAt(i)>=97&&a.charAt(i)<=122)
			{
			  if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
				{
					vcount++;
				}
				else
				{
					ccount++;
				}
			}
			else if(a.charAt(i)>=48&&a.charAt(i)<=57)
			{
				ncount++;
			}
			else if(a.charAt(i)==' ')
			{
				scount++;
			}
			else
			{
				spcount++;
			}
		}
		System.out.println("vowelcount % :" +(float)(vcount)*100/a.length());
		System.out.println("consonentcount %:" +(float)(ccount)*100/a.length());
		System.out.println("numbercount %:" +(float)(ncount)*100/a.length());
		System.out.println("spacescount %:" +(float)(scount)*100/a.length());
		System.out.println("specialcharcount % :" +(float)(spcount)*100/a.length());  
	}
}