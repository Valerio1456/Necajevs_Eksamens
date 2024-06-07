package da;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tests {

private static String[] jautajumi = {
    
"1. Kuri no no minētajiem ir primitīvie datu tipi ?",
    
"\n2. Kuriem no datu tipiem var būt 7 un vairāk cipari aiz komata?",
    
"\n3. Kuri datu tipi nav ierobežoti?",
    
"\n4. Kuri no minētajiem ir pamatdarbības ar mainīgajiem​ ?",
    
"\n5. Kuri no skaitliem var būt byte tipa mainīga?",
    
"\n6. Kādu informaāciju var glabāt String datu tips?",
    
"\n7. Kadi fakti par mainīgiem ir pareizi??",
    
"\n8. Kadi atbilžu varianti var būt Boolean datu tipam?",
    
"\n9. Ko var definēt ar Char tipa mainīgu?",
    
"\n10. Kurā gadjumā masivs ir deklarēts pareizi?"
    
};

private static String[][] iespejas = {
    
{"byte", "float", "String", "Arrays"}, //1
    
{"Char", "Float", "Double", "Long"}, //2
    
{"Char", "String", "Boolean", "Arrays"}, //3
    
{"Kapināšana otra pakāpe", "Saskaitiīšana", "Kvadratsakņa atrašana", "Modulis"}, //4
    
{"-52", "238", "2024", "69"}, //5
    
{"Skriešanas sacensības labākos laikos", "Suņas vārdu", "Skolnieku vārdus un uzvardos", "Darbņieku algu"}, //6
    
{"Mainīgos tiek glabāta informācija", "Mainīgam var piešķirt nosaukumu", "Jebkura programma nevar strādāt bez mainīgiem", "Programma var mainīt informāciju iek';smainīgos sava darbības laika"}, //7
    
{"True", "0", "False", "1"}, //8
    
{"A", "Aa", "A2", "&"}, //9
    
{"int[] A = {1, divi, 3 };", " int[] A = {1, 2, 3 };", " int[] A = {viens, divi, trīs };", "int[] A = {1, 2, 3 }"} //10
    
};

private static boolean[][] ParAtbildes = {
    
{true, true, false, false}, //1
    
{false, true, true, false}, //2
    
{false, true, false, true}, //3
    
{false, true, false, true}, //4
    
{true, false, false, true}, //5
    
{false, true, true, false}, //6
    
{true, true, false, true}, //7
    
{true, false, true, false}, //8
    
{true, false, false, true}, //9
    
{false, true, true, false} //10
    
};

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

boolean[][] LietAtbildes = new boolean[10][4];
List<String> nepareizieJautajumi = new ArrayList<>();

for (int i = 0; i < jautajumi.length; i++) {
System.out.println(jautajumi[i]);
    
for (int j = 0; j < iespejas[i].length; j++) {
System.out.println((j + 1) + ". " + iespejas[i][j]);
    
}

boolean DerAtblide = false;
    
while (!DerAtblide) {
System.out.println("Atzīmējiet pareizos variantus (izvēlieties 2 vai 3 variantus, ievadiet ciparus, atdalot tos ar komatu, piemēram: 1,3): ");
String[] answers = scan.nextLine().split(",");
    
if (answers.length == 2 || answers.length == 3) {
DerAtblide = true;
    
for (String answer : answers) {
LietAtbildes[i][Integer.parseInt(answer) - 1] = true;
    
}
    
} else {
System.out.println("Nepareizs ievads. Jums jāizvēlas 2 vai 3 varianti. Mēģiniet vēlreiz.");
    
}
}
}

int ParSkaits = 0;
    
for (int i = 0; i < LietAtbildes.length; i++) {
boolean VissPareizi = true;
    
for (int j = 0; j < LietAtbildes[i].length; j++) {
if (LietAtbildes[i][j] != ParAtbildes[i][j]) {
VissPareizi = false;
    
}
}
    
if (VissPareizi) {
ParSkaits++;
    
} else {nepareizieJautajumi.add(jautajumi[i]);
    
}
}

System.out.println("Jūs atbildējāt pareizi uz " + ParSkaits + " jautājumiem.");
    
if (!nepareizieJautajumi.isEmpty()) {
System.out.println("Nepareizi atbildētie jautājumi:");
    
for (String jautajums : nepareizieJautajumi) {
 System.out.println(jautajums);
}
}
}
}
