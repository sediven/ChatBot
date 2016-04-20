
import java.util.Random;

public class Ngram {
	Integer n;
	String slowo;
	String nastepcy[];
	Integer ileRazy[];
	
	public Ngram()
	{
		n = 0;
		slowo = "BRAK SLOWA SZOK";
		nastepcy[0]="BRAK SZOK" ;
	}
	
	public Ngram(Integer number, String s)
	{
		n=number;
		slowo = s;
		nastepcy[0]= "BRAK SZOK";
		ileRazy= new Integer [1];
		ileRazy[0]=0;
	}
	
	public Ngram(Integer number, String s, String nastepne)
	{
		n =number;
		slowo=s;
		nastepcy= nastepne.split(" ");
		ileRazy= new Integer [1];
		ileRazy[0]=1;
	}
	
	
	
	public Integer gdzieDanyNastepca(String ns)
	{
		for(int i = 0; i < nastepcy.length;i++)
		if(nastepcy[i].equals(ns))
				return i;	
		return -1;
		
	}
	public void rozszerzNgram(String ns)
	{
		Integer i= gdzieDanyNastepca(ns);
		if(i != -1)
		{
			//System.out.println("i : ");
			//System.out.println(i);
			ileRazy[i]++;
		}
		
		else
		{
			String temp[]  = new String[ nastepcy.length + 1];
			System.arraycopy(nastepcy, 0, temp, 0, nastepcy.length);
			temp[temp.length-1] = ns;
			nastepcy = new String [temp.length];
			System.arraycopy(temp, 0, nastepcy, 0, temp.length);
			
			Integer ileRazyTemp[]= new Integer [ileRazy.length + 1];
			System.arraycopy(ileRazy, 0, ileRazyTemp, 0, ileRazy.length);
			ileRazyTemp[ileRazyTemp.length-1] = 1;
			ileRazy = new Integer [ileRazyTemp.length];
			System.arraycopy(ileRazyTemp, 0, ileRazy, 0, ileRazyTemp.length);
		
		}
		
	}
	public Boolean czyRowny(String s)
	{
            return slowo.equals(s);
		
	}
	public Integer NgramSuma()
	{
		Integer Suma=0;
		for(Integer i:ileRazy)
			Suma+=i;
		return Suma;
	}
	
	public String NgramRandom()
	{
		Random generator = new Random();
		
		Integer Suma=NgramSuma(), miejsce;
		miejsce = generator.nextInt(Suma);
		for(Integer i =0;i<ileRazy.length;i++)
			if((miejsce-=ileRazy[i])<=0)
				return nastepcy[i];
		return nastepcy[nastepcy.length-1];
		
	}
	
	public String jakieSlowo()
	{
		return slowo;
	}
	
        @Override
	public String toString()
	{
		String out='\n'+ slowo + "  : ";
		for(int i = 0; i < nastepcy.length; i++)
			out+= " "+ nastepcy[i]+ " "+ ileRazy[i];
		
		return out;
	}
	
}
