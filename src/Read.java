
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Read {
	ArrayList<Ngram> listaNgram  = new ArrayList<>(5) ;
	ArrayList<Ngram> jednostkowe = new ArrayList<>(5);
	Integer ngramLvl = 2;
	String path = "C:\\Users\\ja\\Desktop\\baza2.txt";
	public Read()
	{
		
		Przetworz(Czytaj(path),ngramLvl,listaNgram);
		Przetworz(Czytaj(path),1,jednostkowe);
		System.out.println(Sortuj());

	}
	
	public Read(String slowa, Boolean t)
	{
		
		Przetworz(slowa,ngramLvl,listaNgram);
		Przetworz(slowa,1,jednostkowe);
		//Sortuj();
	}
	public Read(Integer n)
	{
		ngramLvl=n;
		Przetworz(Czytaj(path),ngramLvl,listaNgram);
		Przetworz(Czytaj(path),1,jednostkowe);
		System.out.println(Sortuj());
	}
	
	public Read (String path1,Integer n)
	{
		ngramLvl=n;
		path=path1;
		Przetworz(Czytaj(path),ngramLvl,listaNgram);
		Przetworz(Czytaj(path),1,jednostkowe);
		System.out.println(Sortuj());
	}
	
	public void Update(String slowa)
	{
		Przetworz(slowa,ngramLvl,listaNgram);
		Przetworz(slowa,1,jednostkowe);
		Sortuj();
	}
	
	public Integer czyJestZawieranie(String a, ArrayList<Ngram> listaNgram)
	{
		for(int i = 0; i < listaNgram.size(); i++)
			if(listaNgram.get(i).slowo.contains(" "+a)||listaNgram.get(i).slowo.startsWith(a))
				return i;
		
		return -1;
		
	}
	public Integer czyIstnieje(String ramka, ArrayList<Ngram> listaNgram)
	{
		for(int i = 0; i < listaNgram.size(); i++)
			if(listaNgram.get(i).czyRowny(ramka))
				return i;
		return -1;
	}
	
	public String join(String[] str, String separator){
	    String out = "";
	    for (String s: str)
	     out+= separator + s;
	    return out.replaceFirst(separator, "");
	}
	
	public final void Przetworz(String slowa, int ngramLvl, ArrayList<Ngram> listaNgram)
	{
		String listaSlow[] = slowa.split(" ");
		String ramka[] = new String[ngramLvl];
		//poczatkowa inicjalizacja ramki
		if(ramka.length<listaSlow.length)
		{
			for(int i=0; i<ramka.length;i++)
			{
				if(listaSlow[i].isEmpty())
					if(i<ramka.length-1)
						i++;
					else
						break;
				
				ramka[i]=listaSlow[i];		

				//System.out.println("ramka, lista");
				//System.out.println(ramka[i]);
			}
			
			String polaczonaRamka =  join(ramka, " ");
			//System.out.println(polaczonaRamka);

			// czy ngram na liscie
			int id = czyIstnieje(polaczonaRamka,listaNgram);
			if(id  != -1)
				listaNgram.get(id).rozszerzNgram(listaSlow[ramka.length]);
			else
				listaNgram.add(new Ngram(ngramLvl, polaczonaRamka,listaSlow[ramka.length]));
				
						
			for(int i = ramka.length ; i< listaSlow.length-1;i++)
			{
				if(listaSlow[i].isEmpty())
					i++;
				for(int p =0; p<ramka.length-1;p++)
					ramka[p]=ramka[p+1];
				ramka[ramka.length-1]=listaSlow[i];
				
				polaczonaRamka =  join(ramka, " ");
				id = czyIstnieje(polaczonaRamka,listaNgram);
				if(listaSlow[i+1].isEmpty())
					i++;
				if(id  != -1)
					listaNgram.get(id).rozszerzNgram(listaSlow[i+1]);
				else
					listaNgram.add(new Ngram(ngramLvl, polaczonaRamka,listaSlow[i+1]));
			}
		}
	}
	
	public final String Sortuj()
	{
		Collections.sort(jednostkowe, (Ngram one, Ngram other) -> one.NgramSuma().compareTo(other.NgramSuma()));
		
		Collections.sort(listaNgram, (Ngram one, Ngram other) -> one.slowo.compareTo(other.slowo));
		return "posortowano utworzoną bazę";
	}
	
	public static String Czytaj(String path) 
	{
		String plik="";
		try 
		{
                    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                        String line = null;
                        while ((line = br.readLine()) != null )
                            if(!line.isEmpty())
                                plik+=line+" ";
                    }
		} 
		catch (Exception e) 
		{
			System.out.println("Nie moge odzczytac pliku.");
		}
		//System.out.println(plik);
		return plik;
	}
	
	public String toStringJednostkowe()
	{
		String out = "";
                out = jednostkowe.stream().map((jednostkowe1) -> jednostkowe1.toString()).reduce(out, String::concat);
		return out;
	}
	
        @Override
	public String toString()
	{
		String out = "";
                out = listaNgram.stream().map((listaNgram1) -> listaNgram1.toString()).reduce(out, String::concat);
		return out;
		
	}
}
