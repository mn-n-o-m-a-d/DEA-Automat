# DEA-Automat

Entwickeln Sie einen DEA, der eine mathematische Gleichung entgegen nimmt und überprüft, ob diese syntaktisch korrekt ist. Die folgende Abbildung zeigt den DEA inkl. seiner Zustände und Übergänge:

// siehe Bild![](/home/manuel/IdeaProjects/SS24/DEA-Automat/src/main/resources/Ü3 - Angabe.png)

Als syntaktisch korrekt gelten dabei folgende Gleichungen:

x = y, wobei x und y jeweils eine beliebig lange Zahl darstellen können
a + b = c, wobei a, b und c jeweils eine beliebig lange Zahl darstellen können
a + b + ... + z = x, wobei a, b, ..., z, x jeweils eine beliebig lange Zahl darstellen können
Es kann auch vorkommen, dass die Terme auf der linken Seite der Gleichung geklammert werden, wie z.B.:
  ( x ) = y
a + ( b ) = c
a + (b + c + ... + z ) = x
( a + b ) * ( c - d ) / ( e * f ) = z
Dabei ist zu beachten, dass
der DEA jegliche die Syntax überprüft und nicht das errechnete Ergebnis (hier kann tatsächlich auch ein falscher Wert drinnen stehen)
jede mögliche Kombination von Zahlen und Klammerausdrücken, die sich mit dem DEA ableiten lassen, als syntaktisch gültig zu verstehen sind


Das oben beschriebene Beispiel soll als Java-Applikation beschrieben werden, die beim Start:

den Benutzer begrüßt (Welcome Nachricht)
eine Menü von folgenden Optionen ausgibt und auf eine Eingabe wartet:
Manuelle Eingabe
Lesen aus Datei
Option 1:

wählt der User diese Option, wird sie/er aufgefordert einen mathematischen Ausdruck einzugeben, der dann im Anschluss vom DEA überprüft wird
Option 2:

wählt der User diese Option, werden aus einer TXT-Datei mind. 50 mathematische Ausdrücke gelesen und im Anschluss vom DEA überprüft
erstellen Sie dazu eine TXT-Datei selbst mit jeweils 25/25 syntaktisch korrekten/nicht korrekten Ausdrücken, die Sie dann auslesen und überprüfen

Ganz gleich welche Option ausgewählt wird, sollen die Ausdrücke überprüft werden mittels DEA und danach eine der folgenden Nachrichten-Typen für die Ausgabe verwendet werden:
GRÜN = SUCCESS --> es soll ein in grüner Schrift dargestellter [SUCCESS] Code ausgeben werden mit einer Nachricht, die zeigt, welcher Ausdruck vom DEA akzeptiert wurde und dadurch syntaktisch korrekt ist
GELB = INFO / ACHTUNG --> jedes Mal wenn der User aufgefordert wird etwas zu tun, oder eine andere Info für den User ausgegeben wird, soll ein in gelber Schrift dargestellter [INFO] Code ausgegeben werden inkl. der dazugehörigen Nachricht
ROT = ERROR --> es soll ein in roter Schrift dargestellter [ERROR] Code ausgeben werden mit einer Nachricht, die zeigt, welcher Ausdruck vom DEA NICHT akzeptiert wurde und dadurch syntaktisch NICHT korrekt ist...auch bei Fehlermeldungen soll dieser ERROR-Code verwendet werden


ABGABE:

Geben Sie Ihr Java-Projekt als ZIP-Datei inkl. der TXT-Datei (mit den 50 Datensätzen)
Schreiben Sie fünf verschiedene Unit Tests um Ihr Programm zu überprüfen.
Posten Sie zusätzlich den Link zu einem Video, welches maximal 5 Minuten lang ist. In diesem Video erklären Sie bitte den Code, welchen Sie abgeben. Sie können das Video auf Ihrem FH-Burgenland Sharepoint speichern. Wichtig ist, dass die Berechtigungen zum Video korrekt eingestellt sind, damit ich dieses ansehen kann.
Verwenden Sie das bereitgestellte Template von Moodle.

Als Hilfestellung dienen alle Dateien, die Sie auf der LV-Moodle Seite zu diesem Thema finden.



Viel Erfolg!
