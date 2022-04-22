package weeklyChallenge;




public class BuildOrder {

    public static void main(String[] args) {
        String[] projects = new String[] {"a", "b", "c", "d", "e", "f"};
        String[][] dependencies = new String[][]{{"a", "d"}, {"f", "b"}, {"b", "d"}, {"f", "a"}, {"d", "c"}};
        int length = projects.length;
        String[] results = new String[length];
        int index = 0;
        
 
        for(int i = 0; i < dependencies.length; i++)
        {
            if(!BuildOrder.isInResults(results, dependencies[i][0]))
            {
                results[index] = dependencies[i][0];
                index++;
            }
        }

        for (String project: projects
             ) {
            if(!BuildOrder.isInResults(results, project))
            {
                results[index] = project;
                index++;
            }
        }

        for (String result: results
             ) {
            System.out.print(result);
        }
    }

    static boolean isInResults(String[] results, String test)
    {
        for (String result: results
             ) {
            if(test.equals(result))
            {
                return true;
            }
        }
        return false;
    }





}