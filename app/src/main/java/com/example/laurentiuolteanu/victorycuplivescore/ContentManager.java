package com.example.laurentiuolteanu.victorycuplivescore;

import java.util.ArrayList;
import java.util.List;

public class ContentManager {
    private static List<News> news = new ArrayList<>();

    public static List<News> getNews(){
        if(news.isEmpty()){
            news.add(new News(
                    "LIGA 2A. ETAPA 3. DRISTOR PREDATORS vs LUCEAFĂRUL 4-1",
                    "Luceafărul nu a reușit să speculeze momentul bun în care se afla, echipa venea după o revenire de senzație, o victorie de clasor în meciul Ares IPA 14, de la 0-3, la 4-3. În fața unui adversar cu multă experiență și calitate, Ilie Stefan și compania nu au emis pretenții. Fără bașcanul Bănică plecat în delegație peste Milcov, fosta reprezentantă a Ligii 1 s-a impus logic, are punctaj maxim după trei etape și alimentează aspirațiile pentru revenirea în primul eșalon. Tunarul Valentin Pescaru a deschis scorul în minutul 10. A recuperat un balon la mijlocul terenului și a țâșnit spre poartă cu adversarul deposedat în cârcă, finalizarea fiind de vârf veritabil, șut perfect care l-a lăsat fără pretenții pe Chiripuș. Acțiune cu drepturi de autor. Luceafărul a revenit și, patru minute mai târziu, Toni Mihalache a restabilit echilibrul, iar când repriza se scurgea spre un nul, la ultima fază a mitanului, gazdele au înscris un gol de moral. Dintr-un unghi imposibil, cu largul concurs al portarului advers, Cătălin Micu a prins bolta porții. De data asta, Dristor avea să-și protejeze avantajul și, în partea secundă, favoriții și-au dublat capitalul de pe tabelă. Ion Alexandru a mărit ecartul, pe Chiripuș l-a fript mingea, apoi marcatorul a cinstit reușita cu două tumbe a la Drăgulescu, în final Cătălin Micu fiind cel care a închis tabela (38). Dublă pentru el, victorie la pas, 4-1, Dristor e singura formație cu punctaj maxim după trei meciuri din Liga 2A, District 3 urmând să joace după ce a fost redactată această cronică.",
                    "image_news1"));
            news.add(new News(
                    "LIGA 2A. ETAPA 3. ECHIPA DIN VIS vs BORUSSIA BUCUREȘTI 5-4",
                    "Borussia a început bine, a condus cu 2-0 și 3-1, însă lipsa de experiență și o neînțeleasă apatie au repus adversarul pe șine. Echipa din Vis nu a beneficiat de serviciile lui Robert Cobianu, astfel că s-a improvizat între buturi și Duran și-a asumat mănușile. Vlad Ștefan a deschis scorul în secunda 40, Eduard Racasan a majorat diferența, cinci minute de bal pentru oaspeți, demaraj perfect în meci. Bogdan Floarea a redus ecartul, Echipa din Vis începea să le decupeze eleanul adversarilor, 2-1, însă fiorul revenirii a durat câteva secunde. Alex Bobric a prins un șut bun, 3-1, iar avantajul le-a cauzat reacții adverse oaspeților. Floarea a înscris din nou, apoi, după alte cinci minute scurse din repriză, Marin Ionescu, Gennaro Gattuso din tabăra gazdelor, a făcut 3-3. Un sfert de oră cu 6 goluri, multe bâlbâieli defensive, un joc între linii, un vertij tactic în urma căruia se putea întâmpla orice. Prima repriză a fost măcinată de multe întreruperi, Borussia trăia sub amenințarea loviturii de penalitate, oaspeții nu s-au cumpătat, iar Rizea avea mingea pe rist de la 9 metri. Execuție sigură și, pentru prima oară în acest joc, Echipa din Vis beneficia de avantaj. Acesta a fost și scorul la pauză, gazdele au început mai bine mitanul secund, iar după 6 minute, Floarea bifa tripla personală. 5-3. Bobric a animat ultimul sfert de meci, a sărit precum Kennet Andersson peste Prunea în mondialul yankeu din 1994, doppietta pentru el, rămas singur cu portarul de două ori, pe Floarea l-a părăsit de inspirație, finalul a adus suspans, însă nu și goluri. Victorie la limită pentru Echipa din Vis, primul succes în această ediție după două rezultate călii, meciuri încheiate la egalitate. Borussia rămâne cu trei puncte, echipa are calitate individuală, însă încă nu și-a asfaltat relațiile de joc.",
                    "image_news2"));
            news.add(new News(
                    "LIGA 2B. ETAPA 3. ANONYMOUS vs METROPOLIS OLDIES 3-2",
                    "În tango cu perfecțiunea după primele două etape, combatantele promiteau o partidă spectaculoasă. Ambele echipe au umplut autocarul pentru acest meci, foi pline, câte 12 jucători la teren, startul partidei fiind sub semnul echilibrului. Timpul alocat cunoașterii adversarului s-a prelungit până spre epilogul primului mitan, nicio formație nu și-a asumat riscuri, s-a jucat calculat. A fost nevoie de un gest tehnic de geniu reușit de puștiul George Calita, pasă cu un ochi la ceafă, apoi șutul la colțul lung al golgheterului Adi Popa, iar mingea a abuzat vinclul porții lui Gheorghe Costea. Imediat, gazdele și-au dublat avantajul, cei de la Metropolis Oldies s-au bosumflat în urma golului primit, marcaj larg la o repunere de la margine riverană careului lor, iar Mihai Chiuc a șutat din prima la colțul lung. 2-0, pauză, avantaj Anonymous. Defensiva gazdelor a știut să țină adversarul la distanță, Annonymous a protejat scorul, iar după 10 minute scurse din partea secundă, Calita, longilinul puști din ofensiva gazdelor, a înscris cu un șut sub transversală. Și era 3-0. Pe final, Metropolis Oldies a înscris de două ori, Mustățea a finalizat după o cursă solitară, Cătălin Rogojină a transformat o lovitură liberă de pe linai de 6 metri, după ce a trimis mingea prin zidul știrb format de cei de la Anonymous, însă era prea târziu, oaspeții nu au mai putut decât să fardeze eșecul.",
                    "image_news3"));
        }
        return news;
    }

    public static String minContent(String content){
        String minContent = "";
        int currentCharacter = 190;
        minContent += content.substring(0, currentCharacter);
        while(currentCharacter != content.length()){
            Character c = content.charAt(currentCharacter);
            if(Character.isAlphabetic(c)){
                minContent += c;
            } else{
                break;
            }
            currentCharacter++;
        }
        minContent += "...";
        return minContent;
    }
}
