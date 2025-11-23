# Alumno 1: Iván García Iglesias
# Alumno 2: Daniel Fernández Ruiz
# Alumno 3: Alejandro Bastida Rodríguez -> alexdrin / Alex
# Alumno 4: Alejandro Bastida Rodríguez -> alexdrin773/ Alex2

https://github.com/Ivaanxu/ES-GIT.git

## Comandos utilizados por el Alumno 2:
git clone
git status
git add
git commit
git push
git checkout -b ramaAlno2
git branch -m ramaAlumno2
git branch -a

### ¿Has podido actualizar el repositorio remoto sin problemas? 
En caso negativo, justifica que ha ocurrido y como lo has solventado.Al realizar el git push, nos solicitaba una clave, existen diversas maneras de resolverlo pero nosotros hemos optado por crear una clave ssh para la autenticidad.

## Comandos utilizados por el Alumno 1:
git remote add origin 
git remote
git push origin master
git pull origin master
git checkout -b ramaAlumno1
git branch -a

## Comandos utilizados por el Alumno 3:
git clone https://github.com/Ivaanxu/ES-GIT.git
git branch ramaAlumno3
git push origin ramaAlumno3


## Comandos utilizados por el Alumno 4:
git clone https://github.com/Ivaanxu/ES-GIT.git
git branch ramaAlumno4
git push origin ramaAlumno4


### ¿Que significa el asterisco encima de una rama del proyecto?
La rama marcada con asterisco es la rama actual (HEAD), lo que significa que es la rama en la que estas trabajando ahora mismo, cualquier commit que se haga se registrará en esa rama.

### Diferencia entre ramas
Para ver las diferencias entre los dos archivos hemos utilizado el comando git diff ramaAlumno1 ramaAlumno2. PD: lo hemos hecho en menos de 2 minutos. 

### Merge a master desde las ramas
No, no lo hemos podido realizar de la misma manera, porque cuando el primero hace merge de su rama a la rama master el otro tiene que volver a hacer pull para actualizar los archivos que ha subido el compañero.

### Credencieales
Al estar usando la autentificación SSH no nos piden las credenciales constantemente.

### Ganador
Alejandro Bastida Rodriguez

### ¿Qué pasa cuando tratamos de hacer todos commit?
Lo que ha ocurrido es que el más rápido de nosotros ha conseguido subir sus cambios al servidor, cuando los otros 3 alumnos han intentado hacer su git push un segundo después, Git muestra un mensaje de error rechazando la subida porque tenemos una versión "vieja" del repositorio y la rama local está desactualizada respecto a lo que ahora hay en GitHub (los cambios del ganador). El error es: rejected - non-fast-forward.

#### Solución
Los tres alumnos que han recibido el error hacen lo siguiente:
- Bajar los cambios del ganador. Comando: git pull origin master
- Resolver el conflicto (Usamos un editor para visualizar las diferencias)
- Confirmar la fusión. Comandos: git add, git commit y git push origin master

### Commits realizados
Alejandro Bastida Rodríguez: 14 (sumando sus cuentas)
Iván García Iglesias: 13
Daniel Fernandez Ruiz: 10
