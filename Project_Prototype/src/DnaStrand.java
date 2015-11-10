import java.util.ArrayList;
import java.util.Collections;

public class DnaStrand {

	private String strand;
	
	private ArrayList<Character> strandList = new ArrayList<Character>();
	
	private ArrayList<Character> complimentList = new ArrayList<Character>();
	
	private ArrayList<Character> complimentList2;
	
	private ArrayList<Integer> palindromeLocation = new ArrayList<Integer>();
	
	private ArrayList<String> palindromes = new ArrayList<String>();
	
	char testChar1;
	char testChar2;
	
	int similarCounter = 0;
	
	
	
	public DnaStrand(String strand)
	{
		this.strand = strand;
		
		for (int i = 0; i < strand.length(); i++)
		{
			strandList.add(strand.charAt(i));
		}
		
		System.out.println(strandList);
		
		this.createCompliment();
		this.flipCompliment();
		this.compareStrand();
	}
	
	
	public void createCompliment()
	{
		for (int i = 0; i < strand.length(); i++)
		{
			if (strand.charAt(i) == 'A')
			{
				complimentList.add('T');
			}
			if (strand.charAt(i) == 'T')
			{
				complimentList.add('A');
			}
			if (strand.charAt(i) == 'C')
			{
				complimentList.add('G');
			}
			if (strand.charAt(i) == 'G')
			{
				complimentList.add('C');
			}
		}
		
		System.out.println(complimentList);
	}
	
	public void flipCompliment()
	{
		complimentList2 = complimentList;
		Collections.reverse(complimentList2);
		System.out.println(complimentList2);
	}
	
	public void compareStrand()
	{
		for (int i = 0; i < strandList.size(); i++)
		{
			testChar1 = strandList.get(i);
			testChar2 = complimentList2.get(i);
			
			if (testChar1 == testChar2)
			{
				similarCounter++;
			}
			else
			{
				if (similarCounter > 2)
				{
					palindromeLocation.add(i - similarCounter);
					palindromeLocation.add(i);
					palindromes.add(strand.substring(i - similarCounter, i));
				}
				similarCounter = 0;
			}		
		}
		System.out.println(palindromes);
	}
	
	public String getPalindromes()
	{
		return palindromes.toString();
	}
	
}
