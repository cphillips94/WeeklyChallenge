package weeklyChallenge;

public class PowerSet {
//Find all the subsets of a given set.
	
    // Print all subsets of given set from the main
    static void printSubsets(char set[])
    {
        int n = set.length;
 
        // subsets one by one
        for (int i = 0; i < (1<<n); i++)
        	//(1<<n) need to understand how it works?
        {
            System.out.print("{ ");
 
            // Print current subset
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");
            System.out.println("}");
        }
    }
 
    public static void main(String[] args)
    {
    	//enter char for the test
        char set[] = {'a', 'b', 'c', 'd', 'f'};
        printSubsets(set);
    }
}
	

