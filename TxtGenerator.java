
import java.util.Random;

public class TxtGenerator {
	
	Read czytaj;
	Integer ngramLvl=2;
	public TxtGenerator(Integer n)
	{
		ngramLvl=n;
		czytaj = new Read(ngramLvl);
		
	}
        public TxtGenerator(Integer n, String path)
	{
		ngramLvl=n;
		czytaj = new Read(path,ngramLvl);
		
	}
	
	
	
	public String generuj(int n,String poprzedni)
	{
		Random generator = new Random();
		String tekst= "", ngramdododania ="", nowyngram="",noweslowo="";
		//System.out.println(czytaj.toString());
		String ptab[]=poprzedni.split(" ");
		Integer miejsce = -1;
		for(int i = ptab.length-1;i>=0;i--)
			if((miejsce=czytaj.czyJestZawieranie(ptab[i],czytaj.listaNgram))!=-1)
				break;
		
		if(miejsce==-1)
			miejsce= generator.nextInt(czytaj.listaNgram.size());
		
		ngramdododania=czytaj.listaNgram.get(miejsce).jakieSlowo()+ " " + czytaj.listaNgram.get(miejsce).NgramRandom();
		
		//dodaje pierwsyz ngram
		tekst+=ngramdododania;
		
		for(int i=0;i<n;i++)
		{
			String ramka[] = ngramdododania.split(" ");
			String temp[]  = new String[ngramLvl];
						
				/*		// debug
						if(ramka.length == temp.length)
						{
							System.out.println(" Dziwny przypadek - ngramdododania");
							System.out.println(ngramdododania);
							System.out.println("ramka.l, temp.l");
							System.out.println(ramka.length);
							System.out.println(temp.length);
							
							System.out.println(" miejsce");
							System.out.println(miejsce);

							System.out.println("czytaj.listaNgram.get(miejsce).jakieSlowo()");
							System.out.println(czytaj.listaNgram.get(miejsce).jakieSlowo());
							System.out.println("	noweslowo= czytaj.listaNgram.get(miejsce).NgramRandom();");
							System.out.println(	noweslowo);
							System.out.println("	wypisz ngram");
							System.out.println(	czytaj.listaNgram.get(miejsce).toString());
							System.out.println("	nastepcy:");
							System.out.println(	czytaj.listaNgram.get(miejsce).nastepcy[0].isEmpty());
							
							
							
							
						miejsce = generator.nextInt(czytaj.listaNgram.size());
						// usunac
						ngramdododania=czytaj.listaNgram.get(miejsce).jakieSlowo()+ " " + czytaj.listaNgram.get(miejsce).NgramRandom();
						

						tekst+=ngramdododania;
						
						ramka = ngramdododania.split(" ");
									
									
					}*/
					
			System.arraycopy(ramka, 1, temp, 0, temp.length);
						
			ramka = new String [temp.length];
			System.arraycopy(temp, 0, ramka, 0, temp.length);
								
			nowyngram = czytaj.join(ramka," ");
			//zmieniam ramke
			miejsce=czytaj.czyIstnieje(nowyngram,czytaj.listaNgram);
			if(miejsce  == -1)
				miejsce=1;
			noweslowo= czytaj.listaNgram.get(miejsce).NgramRandom();
			
			// dodaje nowe slowo
			ngramdododania=czytaj.listaNgram.get(miejsce).jakieSlowo()+ " " +noweslowo;
			tekst+=" " + noweslowo;
			
		}
				
		//System.out.println(tekst);
		return tekst;
	}
}
