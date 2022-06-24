Unser Szenario:
Es existiert ein virtuelles Museum mit allerhand Berühmtheiten aus dem IT-Bereich. Jeder User kann dieses besuchen ohne einen Account zu haben. Zusätzlich gibt es noch ein Forum, wo Interaktion zwischen den Usern und Moderatoren stattfindet. Des weiteren hat das Museum bisher unveröffentlichte Dokumente zu diesen Personen (Tagebuchinhalte, unbekannte Forschungen, etc...) in separaten, für die Öffentlichkeit nicht zugänglichen Bereichen (Kisten) gespeichert.

1. Angriffsschritt:
Der Angriff basiert darauf, sich die Identität eines Moderators zu stehlen. Dazu postet der Angreifer einen Beitrag im Forum, worin sich ein XSS-Skript befindet, welches sofort ausgeführt wird, sobal die Seite läd. Sobald dies ein Moderator getan hat, erlangt der Angreifer dessen Session-Cookie. 

2. Angriffsschritt:
Mit Hilfe des Session-Cookies postet der Angreifer im Namen des Moderators eine Anfrage in einem Unterforum, welches nur zugänglich für Moderatoren und den Admin ist. In dieser Anfrage geht es um eine geheime Information aus der Kiste. Der Post sieht ungefähr so aus: "Lieber Admin, ich brauche Info xyz aus folgender Kiste: [Schadhafter Link] "
In diesem Link ist ein Keylogger enthalten, damit dies nicht auffällt wird der Link mit einem Programm (zB. bitly) gekürzt. Da dies auch ein privater Forumsbereich ist, schöpft der Admin keinen Verdacht und öffnet diesen Link. Er wird dann zur Kiste weitergeleitet & zur Passworteingabe aufgefordert. Nachdem dieses eingegeben wurde liest der Admin, dass diese Info nur für Admins bestimmt ist und weist die Anfrage zurück. Allerdings hat der ANgreifer nun das Kistenpasswort und erlangt die Info -> Challenge done


https://www.youtube.com/watch?v=qrr4WigBPMI

1. Run spring site on my device
2. implement keylogger like in video https://www.youtube.com/watch?v=qrr4WigBPMI
3. understand what he is creating in the video for receiving the keystrokes and duplicate it
- 4. figure out how i could use an srver for doing the receiving 
    - check how nicklas didi this with cookie stealer

5. if it works check again how this works wit out logic 
6. create screencast and send it to group with link of repo


Aufgabe:
erstelle einen server der auf einer weißen Seite mit der Überschrift "Keylogger:" alle Daten ausgibt die von einer Webseite gefetcht werden.

wie muss der fetch aussehen? 


....
x. create new branch to which I push to

