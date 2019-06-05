Utilizamos el editor de c�digo Visual Studio Code para este proyecto, porque Angular internamente usa una herramienta llamada Typescript (desarrollada por Microsoft) y entonces si abrimos nuestro proyecto en Visual Studio Code, esta herramienta ya funciona dentro del editor de c�digo sin necesidad de instalar nada, sin configurar nada. El enlace de descarga del editor se encuentra a continuaci�n:
https://code.visualstudio.com

Lo siguiente que se debe instalar es Git (es para controlar las distintas versiones de Angular).El enlace de descarga se encuentra a continuaci�n:
https://git-scm.com

Cuando ejecute el instalador de Git seleccione la opci�n "Use Git and optional Unix tools from the Command Prompt" y dar clic en siguiente.

Lo siguiente que se debe instalar es Node J, programa que nos permite instalar herramientas de Javascript (Angular es un framework de Javascript), asi que vamos a usar Nose Js para poder instalar Angular. El enlace de descarga se encuentra a continuaci�n:
https://nodejs.org/es/
 
Cuando se encuentre en la p�gina descargue la versi�n Actual (curent).

Luego dirigirse a: https://cli.angular.io

Lo siguiente que se debe hacer es abrir la consola de Windows (o la terminal si se encuentra en otro sistema operativo) y ejecutar el siguiente comando "node --version" para comprobar que Node Js est� instalado, luego escribir "npm install -g @angular/cli".
 
Luego abrir el proyecto en Visual Studio Code abrir una nueva terminal dentro de el y escribir el comando "npm install npm@latest" lo que hace este comando es instalar las dependencias del package.json.

Nota: si al ejecutar el comando "npm install npm@latest" dentro de Visual Studio Code le da error de no reconocerlo, cierre el editor de c�digo y vuelva a ejecutar el comando. 

Si se desea correr el proyecto debe escribir en la terminal el comando "ng serve"
Nota: si en caso tal le da error de no reconocer el comando, intente ingresando "npm run ng serve".

