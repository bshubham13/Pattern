/* 
print the given star pattern

* * * * 
* * *
* *
*

 */


class StarPattern10 {

public static void main (String [] args) {

for (int i=4; i>=1; i--)
  {
for (int j=4;j>=i;j--)
    {
System.out.print(" * ");
    } 
System.out.println();
  }

}
}