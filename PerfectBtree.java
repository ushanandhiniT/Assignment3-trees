package Assignment3;
import java.util.*;
public class PerfectBtree {

        static int sumNodes(int l)
        {

            int leafNodeCount = (int)Math.pow(2, l - 1);


            Vector<Vector
                    <Integer>> vec = new Vector<Vector
                    <Integer>>();


            for (int i = 1; i <= l; i++)
                vec.add(new Vector<Integer>());

            for (int i = 1;
                 i <= leafNodeCount; i++)
                vec.get(l - 1).add(i);

            for (int i = l - 2; i >= 0; i--)
            {
                int k = 0;

                while (k < vec.get(i + 1).size() - 1)
                {

                    vec.get(i).add(vec.get(i + 1).get(k) +
                            vec.get(i + 1).get(k + 1));
                    k += 2;
                }
            }

            int sum = 0;
            for (int i = 0; i < l; i++)
            {
                for (int j = 0;
                     j < vec.get(i).size(); j++)
                    sum += vec.get(i).get(j);
            }

            return sum;
        }
        public static void main(String args[])
        {
            int l = 3;

            System.out.println(sumNodes(l));
        }

}
