# Appbeskrivning
Appen navigeras genom förstasidans två knappar; acceleratorn och kompassen. När kompassen pekar mot Norr blir texten som visar riktiningen grön. Det kan vara så att bakåtknappen inte fungerar.

# Använda resurser

Ur denna hämtades kod för att göra activity_main:
https://developer.android.com/training/basics/firstapp/index.html 

Denna användes för förståelse kring kompassen men jag ersatte det mesta med nästkommande källa:
https://www.codespeedy.com/simple-compass-code-with-android-studio/

Ur denna hämtade jag klasserna MainActivity, Compass, Accelerometer. Jag tog bort metoderna noSensorsAlert(), setActivityBackgroundColor() samt modifierade onSensorChanged() där jag istället för att skriva ut väderstrecken ändra texten till grön. Jag använde den även till activity_stats men ändrade avstånd och att strängarna namngavs i strings.xml.
https://github.com/bompa13/HelloSensor 

Denna användes för att ändra textfärgen:
https://www.tutorialkart.com/kotlin-android/android-textview-text-color/
