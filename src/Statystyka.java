
import java.util.ArrayList;

public class Statystyka {
	int ilość=10;
	ArrayList<Ngram> listaNgram1;
	ArrayList<Ngram> listaNgramJednostkowe;
	
	ArrayList<Ngram> listaNajpop = new ArrayList<>(ilość);
	
	public Statystyka(ArrayList<Ngram> listaN,ArrayList<Ngram> listaJ )
	{
		 listaNgram1=listaN;	
		 listaNgramJednostkowe=listaJ;
	}
	
	public String najSlowa()
	{
		return naj(listaNgramJednostkowe);	
	}
	public String najNgramy()
	{
		return naj(listaNgram1);
	}
	
	public String naj(ArrayList<Ngram> listaNgram)
	{
		listaNajpop.clear();
		for(Ngram n:listaNgram)
			if(listaNajpop.isEmpty())
				listaNajpop.add(n);		
			else
				for(int i = 0; i< listaNajpop.size();i++)
					{			
					if(listaNajpop.get(i).NgramSuma()<=n.NgramSuma())
						{
							listaNajpop.add(i, n);
							if(listaNajpop.size()>ilość)
								listaNajpop.remove(listaNajpop.size()-1);
							break;
						}
					else
						if(listaNajpop.size()<ilość)
							listaNajpop.add(listaNajpop.size(),n);
					}
		
		
	//	System.out.println("lista : ");
	//	System.out.println(listaNajpop.toString())	;	
		String out="Wszystkich: "+listaNgram.size()+'\n';
                out = listaNajpop.stream().map((p) -> p.slowo+" "+p.NgramSuma()+'\n'+"").reduce(out, String::concat);
		
		return out;
		
	}
}
