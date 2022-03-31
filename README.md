# Példa zárthelyi dolgozat

**For English please scroll down:** https://github.com/csekok/sampleExam#sample-exam

A dolgozathoz csak és kizárólag a saját, korábban megírt kódok használhatóak. Minden más segítég tilos!

## Feladatok

0. (0 pont) Klónozza jelen repository-t és ossza meg a saját GitHub fiókjában:
   - Code / URL másolása
   - File / New / Project from Version Control...
   - Git / GitHub / Share Project on GitHub
1. (2 pont) Készítsen egy ***Matrix*** osztályt. Az osztályban írja meg a ***indexesOfNullColumns*** és a
   ***indexOfMaximum*** metódusokat. Mindkét metódus meghatározza egy 2-dimenziós egész mátrixban: előbbi a null
   oszlopainak sorszámait, utóbbi a legnagyobb elem pozícióját (több egyenlő elem esetén a legelsőt)!
2. (4 pont) Implementálja a ***Recipes*** osztályt, ami ételek receptjeit kezeli (name, description).
   Az osztálynak rendelkeznie kell egy ***add*** (új recept hozzáadása), egy ***delete*** (adott elem törlése)
   és egy ***getItems*** (String formátumban visszaadja az aktuálisan tárolt receptek adatait) metódussal.
3. (2 pont) Származtasson egy ***UpdateRecipes*** osztályt a ***Recipes*** osztályból, melynek ***update***
   metódusával lehessen módosítani a ***Recipes*** objektumban tárolt elemeket.

## Beadás módja

A feladatok megoldására 1,5 óra áll rendelkezésre. A megoldásokat az adott határidőn belül fel kell tölteni
(commit and push) a saját GitHub repository-jukba.

## Értékelés

* 0-4 pont: Elégtelen (1)
* 5 pont: Elégséges (2)
* 6 pont: Közepes (3)
* 7 pont: Jó (4)
* 8 pont: Jeles (5)

# Sample Exam

You can use only and exclusively your personal, previously written codes. You cannot collaborate or communicate
with any other person on this exam, nor use anyone else's code in your solution.

## Tasks

0. (0 pont) Clone this repository and share it on your own GitHub account:
   - Code / Copy URL
   - File / New / Project from Version Control...
   - Git / GitHub / Share Project on GitHub
1. (2 points) Create a ***Matrix*** class. In ***Matrix*** create the ***indexesOfNullColumns*** and the
   ***indexOfMaximum*** methods. Both method has to process a 2-dimensional integer matrix: first one has to define the
   indexes of null columns, the other one has to define the position of the maximum value. If there are duplications,
   then you should return with the first appearance.
2. (4 points) Implement the ***Recipes*** class, which handle food recipes (name, description).
   The class should have an ***add*** (add a new recipe), a ***delete*** (delete the given item),
   and a ***getItems*** (return the details of actually stored recipes as a String) method.
3. (2 points) Derive an ***UpdateRecipes*** class from the ***Recipes*** class. ***UpdateRecipes*** class has to
   contain an ***update*** method, with which we can modify the items of a ***Recipes*** object.

## Submission Information

You have 1.5 hours to solve the tasks. You have to upload (commit and push) your solution into your GitHub
repository before the time is up.

## Evaluation

* 0-4 point: Insufficient (1)
* 5 point: Sufficient (2)
* 6 point: Satisfactory (3)
* 7 point: Good (4)
* 8 point: Excellent (5)