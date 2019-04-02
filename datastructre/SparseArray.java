package datastructre;

 /*There is a collection of input strings and a collection of query strings.
  *For each query string, determine how many times it occurs in the list of input strings.
  *For example, given input strings = [’ab’,’ ab’, abc’] and queries = [’ab’,’ abc’,’ bc’], we ﬁnd 2 instances of 'ab’, 1 of‘abc' and 0 uf'bc'. 
  *For each query, we add an element to our return array, results = [2, 1,0]. 
  */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SparseArray {
  
  /*
   * this function is sued to return how many times does a query string occurred in the input string.
   */
  
  static int[] matchingStrings(String[] strings, String[] queries) {
    
    int[] count=new int[queries.length];/*this is used to store count of queries string in input strings */
    for(int i=0;i<strings.length;i++)
      for(int j=0;j<queries.length;j++)
        if(strings[i].equals(queries[j]))/* if a query string is present in input string  we increment the count value*/
          count[j]++;
 return count;
}

private static final Scanner scanner = new Scanner(System.in);

/*
 *this is the main function 
 */
public static void main(String[] args) throws IOException {
BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

int stringsCount = scanner.nextInt();
scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

String[] strings = new String[stringsCount];

for (int i = 0; i < stringsCount; i++) {
    String stringsItem = scanner.nextLine();
    strings[i] = stringsItem;
}

int queriesCount = scanner.nextInt();
scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

String[] queries = new String[queriesCount];

for (int i = 0; i < queriesCount; i++) {
    String queriesItem = scanner.nextLine();
    queries[i] = queriesItem;
}

int[] res = matchingStrings(strings, queries);

for (int i = 0; i < res.length; i++) {
    bufferedWriter.write(String.valueOf(res[i]));

    if (i != res.length - 1) {
        bufferedWriter.write("\n");
    }
}

bufferedWriter.newLine();

bufferedWriter.close();

scanner.close();
 }

}
