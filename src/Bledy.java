
public class Bledy {

	String Bledne="";
	public Bledy(Read czytaj,String a)
	{
		for(String s:a.split(" "))
			if( (czytaj.czyJestZawieranie(s,czytaj.listaNgram))==-1)
			{
				Bledne+=s+" ";
			}
			
	}
	
}
