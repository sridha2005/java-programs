import java.util.Arrays;
public class studentmark
{
public static void main(String[] args)
{
int [] marks = {78,45,90,23,67};
int max = marks[0];
int sum = 0;
int failed = 0;
for(int m:marks){
sum +=m;
if(m > max){
max=m;
}
if(m<35){
failed++;
}
}
double average = (double)sum / marks.length;
System.out.println("Highest mark:" + max);
System.out.println("Average mark:" + sum);
System.out.println("Failed:"+ failed);
}
}