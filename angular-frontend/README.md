# Alkalmazások fejlesztése - Családi TODO alkalmazás


## Célkitűzés

A program egy családi TODO alkalmazást valósít meg.
A programba a bejelentkezést követően módosíthatjuk a bejegyzéseket.
Egy bejegyzés lehet kész állapotú, illetve lehet törölni.

### 1.1 Funkcionális elvárások

* Regisztráció
* Bejelentkezés/kijelentkezés
* Összes feladat megjelenítése
	* létrehozása
	* listázása
	* módosítása
	* törlése


### 1.2 Nem funkcionális elvárások

* **Felhasználóbarát:** Megfelelően elhatárolt funkciók. Világos látható színekkel írt betűk. Ésszerű elrendezés.
* **Biztonság:** Jelszóval védett funkciók. A jelszavak titkosítottak. A különböző űrlapoknál egy hibalistában kijelzi a program a hibákat.
* **Gyors működés:** Adatbázisban operáló program, gyors kereséssekkel hamar előállítja a kívánt eredményeket.
* **Továbbfejlesztési lehetőségek:** További programtípusok, különböző felhasználói körök létrehozása.


### 1.3 Szakterületi fogalomjegyzék

A program használatához nincs szükség szakterületi fogalomjegyzékre.



### 1.4 Szerepkörök

Az alkalmazásban kétféle szerepkört különböztetünk meg. 
A be nem jelentkezett felhasználók csak bejelentkezés felülethez férhetnek hozzá. 
A bejelentkezett felhasználóknak lehetőségük van megtekinteni minden felhasználó összes feladatát, valamint ezeket a feladatokat listázhatják, módosíthatják, törölhetik és újakat is hozhatnak létre.


## 2. Backend bemutatása
SPRING BOOT
MONGODB REST



### 2.1 Fejlesztői környezet bemutatása, beállítása, használt technológiák

A feladat megvalósítása során az órán megismert technológiákat használtuk fel.


### 2.2 Adatbázis-terv

Todo:


User


### 2.3 Alkalmazott könyvtárstruktúra

* controllers/
	* TodoController.java
* models/
	* Todo.java
* repositories/
	* TodoRepository.java
	
Lokális IDE: Visual Studio Code:

	* Github account nem szükséges, de hasznos
	* Indítsuk el a Visual Studio Code-ot
	* Installáljuk a következőket:
					* npm install 
					* npm install typescript
	* Hozzunk létre egy munkakönyvtárat
	* Ezen a munkaterületen elkezdhetünk kódolni
	* Miután végeztünk a munkával elmenthetjük lokálisan vagy github-ra
	* Először kijelöljük a pusholni kívánt fájlokat majd commit-áljuk őket. Ezután a Push paranccsal föltölthetjük a github accountunkra



### 4.3 Egy funkció folyamatának leírása

A program bármilyen operációs rendszeren futtatható. A futtatáshoz Internet elérés szükséges. Futtatás elött ezt töltsük le: https://nodejs.org/en/.

#### 4.4.b Telepítés

1. Látogasson el a https://github.com/madachf/Todolist2017 oldalra.
2. Itt kattintson a "Clone and Download" gombra, és azon belül kattintson a "Download as Zip" gombra.
3. A letöltött állományt csomagoljuk ki
4. Parancssorban lépjünk a kicsomagolt állomány mappájába
5. npm starttal elindíthatjuk a programot

#### 4.4.c Használat

1. Böngészőben a keresősávba írjuk be a program elérését, alapértelmezetten ez localhost:4200
2. Regisztrálás és bejelentkezés után használhatjuk a programot


### 4.6 (Tesztelés?)