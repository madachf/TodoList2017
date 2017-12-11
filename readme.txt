# Alkalmaz�sok fejleszt�se - Csal�di TODO alkalmaz�s


## C�lkit�z�s

A program egy csal�di TODO alkalmaz�st val�s�t meg.
A programba a bejelentkez�st k�vet�en m�dos�thatjuk a bejegyz�seket.
Egy bejegyz�s lehet k�sz �llapot�, illetve lehet t�r�lni.

### 1.1 Funkcion�lis elv�r�sok

* Regisztr�ci�
* Bejelentkez�s/kijelentkez�s
* �sszes feladat megjelen�t�se
	* l�trehoz�sa
	* list�z�sa
	* m�dos�t�sa
	* t�rl�se


### 1.2 Nem funkcion�lis elv�r�sok

* **Felhaszn�l�bar�t:** Megfelel�en elhat�rolt funkci�k. Vil�gos l�that� sz�nekkel �rt bet�k. �sszer� elrendez�s.
* **Biztons�g:** Jelsz�val v�dett funkci�k. A jelszavak titkos�tottak. A k�l�nb�z� �rlapokn�l egy hibalist�ban kijelzi a program a hib�kat.
* **Gyors m�k�d�s:** Adatb�zisban oper�l� program, gyors keres�ssekkel hamar el��ll�tja a k�v�nt eredm�nyeket.
* **Tov�bbfejleszt�si lehet�s�gek:** Tov�bbi programt�pusok, k�l�nb�z� felhaszn�l�i k�r�k l�trehoz�sa.


### 1.3 Szakter�leti fogalomjegyz�k

A program haszn�lat�hoz nincs sz�ks�g szakter�leti fogalomjegyz�kre.



### 1.4 Szerepk�r�ka

Az alkalmaz�sban k�tf�le szerepk�rt k�l�nb�ztet�nk meg. 
A be nem jelentkezett felhaszn�l�k csak bejelentkez�s fel�lethez f�rhetnek hozz�. 
A bejelentkezett felhaszn�l�knak lehet�s�g�k van megtekinteni minden felhaszn�l� �sszes feladat�t, valamint ezeket a feladatokat list�zhatj�k, m�dos�thatj�k, t�r�lhetik �s �jakat is hozhatnak l�tre.


## 2. Backend bemutat�sa
SPRING BOOT
MONGODB REST



### 2.1 Fejleszt�i k�rnyezet bemutat�sa, be�ll�t�sa, haszn�lt technol�gi�k

A feladat megval�s�t�sa sor�n az �r�n megismert technol�gi�kat haszn�ltuk fel.


### 2.2 Adatb�zis-terv

Todo:


User


### 2.3 Alkalmazott k�nyvt�rstrukt�ra

* controllers/
	* TodoController.java
* models/
	* Todo.java
* repositories/
	* TodoRepository.java
	
Lok�lis IDE: Visual Studio Code:

	* Github account nem sz�ks�ges, de hasznos
	* Ind�tsuk el a Visual Studio Code-ot
	* Install�ljuk a k�vetkez�ket:
					* npm install 
					* npm install typescript
	* Hozzunk l�tre egy munkak�nyvt�rat
	* Ezen a munkater�leten elkezdhet�nk k�dolni
	* Miut�n v�gezt�nk a munk�val elmenthetj�k lok�lisan vagy github-ra
	* El�sz�r kijel�lj�k a pusholni k�v�nt f�jlokat majd commit-�ljuk �ket. Ezut�n a Push paranccsal f�lt�lthetj�k a github accountunkra



### 4.3 Egy funkci� folyamat�nak le�r�sa

A program b�rmilyen oper�ci�s rendszeren futtathat�. A futtat�shoz Internet el�r�s sz�ks�ges. Futtat�s el�tt ezt t�lts�k le: https://nodejs.org/en/.

#### 4.4.b Telep�t�s

1. L�togasson el a https://github.com/madachf/Todolist2017 oldalra.
2. Itt kattintson a "Clone and Download" gombra, �s azon bel�l kattintson a "Download as Zip" gombra.
3. A let�lt�tt �llom�nyt csomagoljuk ki
4. Parancssorban l�pj�nk a kicsomagolt �llom�ny mapp�j�ba
5. npm starttal elind�thatjuk a programot

#### 4.4.c Haszn�lat

1. B�ng�sz�ben a keres�s�vba �rjuk be a program el�r�s�t, alap�rtelmezetten ez localhost:4200
2. Regisztr�l�s �s bejelentkez�s ut�n haszn�lhatjuk a programot


### 4.6 (Tesztel�s?)