Alumno 1: Iván García Iglesias
Alumno 2: Daniel Fernández Ruiz

Comandos utilizados por el Alumno 2:
git clone
git status
git add
git commit
git push
git checkout -b ramaAlno2
git branch -m ramaAlumno2
git branch -a

¿Has podido actualizar el repositorio remoto sin problemas? En caso negativo, justifica que ha ocurrido y como lo has solventado.
Al realizar el git push, nos solicitaba una clave, existen diversas maneras de resolverlo pero nosotros hemos optado por crear una clave ssh para la autenticidad.

Comandos utilizados por el Alumno 1:
git remote add origin 
git remote
git push origin master
git pull origin master
git checkout -b ramaAlumno1
git branch -a

¿Que significa el asterisco encima de una rama del proyecto?
La rama marcada con asterisco es la rama actual (HEAD), lo que significa que es la rama en la que estas trabajando ahora mismo, cualquier commit que se haga se registrará en esa rama.

Para ver las diferencias entre los dos archivos hemos utilizado el comando git diff ramaAlumno1 ramaAlumno2. PD: lo hemos hecho en menos de 2 minutos.
