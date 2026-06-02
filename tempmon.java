import java.util.Arrays;
public class tempmon
{
public static void main(String[] args)
{
int [] temperature = {78,45,90,23,67};
int max = temperature[0];
int min = temperature[0];
int sum = 0;
for(int t:temperature){
sum +=t;
if(t > max){
max=t;
}
if(t<min){
min=t;
}
}
double average = (double)sum / temperature.length;
System.out.println("maximum temp:" + max);
System.out.println("minimum temp:" + min);
System.out.println("average:"+ sum);
}
}