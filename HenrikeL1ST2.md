## Lektion 1 Selbsttestaufgabe 2: Implizite Typkonvertierungen

```
public class Main {
    public static void main (String[] args){
        int i = 10;
        long l = 55567843L;
        byte by = 15;
        boolean b = true;
        double d = 1.25;
        l = i; #Implizite Typkonvertierung i: int -> long
        d = l; #Implizite Typkonvertierung l: long -> double
        by = i; #Implizite Typkonvertierung by: byte -> long
        l = l + by; #Implizite Typkonvertierung by: long -> double
        by = by - b; #Operator - unzulässig für boolean
        d = (1 / i) * 20; #Implizite Typkonvertierung i: long -> double 
```