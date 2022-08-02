public class Main {
    public static void main(String[] args) {

        /*
            Caracteristicas principales de los patrones mas conocidos
            Adaptador
            Descripción
            Este patrón convierte la interfaz de una clase en otra interfaz para adaptarla a las necesidades de un desarrollo concreto. El patrón Adaptador permite que clases con interfaces incompatibles puedan trabajar juntas.

            Nombre
            También conocido como Wrapper (envoltorio)

            Clasificación
            Patrón estructural
            Motivación
            Es muy frecuente la necesidad de adaptadores para elementos de la vidad cotidiana: cargadores de baterías, tipos de enchufe, etc. Si traspasamos esta visión al mundo del software, en algunas ocasiones un conjunto de clases no es reutilizable simplemente por la interfaz que no concuerda con el dominio específico que una aplicación requiere. Es necesario crear un patrón que facilite esta reutilización y que permita no modificar la estructura de códigos del cliente y del servicio.

            Aplicabilidad
            Si se quiere reutilizar una clase pero su interfaz no concuerda con nuestras necesidades.
            Cuando se desea crear una clase reutilizable que coopera con clases no relacionadas, es decir, clases que no tienen necesariamente interfaces compatibles.
            Cuando se quiera utilizar un componente de caja negra.

            Decorador
            Descripción
            El patrón responde a la necesidad de añadir dinámicamente funcionalidad a un objeto. Esto nos permite no tener que crear sucesivas clases que hereden de la primera incorporando la nueva funcionalidad, sino otras que la implementan y se asocian a la primera.

            Nombre
            También es conocido como Decorator, Wrapper

            Clasificación
            Otros
            Motivación
            A veces se quiere añadir  funcionalidad a un objeto concreto, no a una clase entera. Supongamos, por ejemplo, un kit de herramientas de una interfaz gráfica para GUIs que proporciona soporte para marcos, barras de desplazamiento, etc. Podríamos intentar resolver esta situación mediante el empleo de la herencia entre clases ,pero no es posible ya que este mecanismo no es flexible y la funcionalidad se añade estáticamente. Si definimos un clase que envuelva al componente y proporcione la funcionalidad deseada, tendremos un diseño más flexible y transparente. El patrón Decorador nos proporciona esta solución.

            Fachada
            Descripción
            El patrón de diseño Fachada sirve para proveer de una interfaz unificada sencilla que haga de intermediaria entre un cliente y una interfaz o grupo de interfaces más complejas.

            Clasificación
            Patrón estructural
            Motivación
            Estructurar un sistema complejo en pequeños subsistemas reduce la complejidad global. Un objetivo común del diseño es reducir y minimizar las comunicaciones entre subsistemas. Una forma de conseguirlo puede ser introduciendo un objeto Fachada que provea una interfaz simple ampliando la facilidad del sistema.

            Si pensamos, por ejemplo, en la estructura de un entorno de programación, podemos asumir que el compilador tendrá subclases encargadas de realizar cada uno de los distintos aspectos de la compilación, como Analex ,AnaSin ,TabSim , ASA, etc. Estas clases serán comúnmente accedidas por el Editor, el Linkeador, el Depurador, etc. Por lo tanto, surge la necesidad de crear una fachada para unificar estas llamadas.

            Factoria
            Descripción
            Centraliza en una clase constructora la creación de objetos de un subtipo de un tipo determinado, ocultando al usuario la casuística para elegir el subtipo que crear.

            Nombre
            También conocido como Constructor Virtual

            Clasificación
            Patrón creacional
            Motivación
            Si pensamos en un Framework, rápidamente identificamos que usa clases abstractas para la definición y mantenimiento de las relaciones entre objetos. A menudo es el Framework el responsable de la creación de esos objetos. Pensemos en el ejemplo de un Framework para aplicaciones que pueden presentar multitud de documentación al usuario. Un aplicación no puede preveer que tipo de documentación necesita.El Framework tiene que incializar clases pero solo conoce las clases abstractas.

            El patrón Factoría encapsula este conocimiento y lo saca fuera del Framework, permitiendo que, mediante nuevas clases, podamos identificar cuál es el documento asociado.

            Aplicabilidad
            Una clase de objetos no puede prever la clase de objetos que tiene que crear.
            Las subclases son las que especifiquen los objetos que se crean.
            Las clases delegan la responsabilidad en una entre varias clases auxilariares

            Observador
            Descripción
            Este patrón define una dependencia del tipo uno-a-muchos entre objetos, de manera que cuando uno de los objetos cambia su estado, el Observador se encarga de notificar este cambio a resto de los objetos dependientes. El objetivo de este patrón es desacoplar la clase de los objetos clientes del objeto, aumentando la modularidad del lenguaje, así como evitar bucles de actualización.

            Nombre
            También conocido como Observer , Dependents

            Clasificación
            Patrón de comportamiento
            Motivación
            Es necesario mantener la consistencia entre objetos relacionados sin aumentar el acoplamiento de las clases. Si imaginamos la relación entre la capa de presentación de un interfaz de usuario y los datos subyacentes en una representación gráfica observamos rápidamente qué pretende solucionar este patrón.

            La interpretación en diferentes diagramas de un conjunto de datos depende de los datos de los objetos. Cualquier modificación en los mismos produce un efecto en la representación. El patrón observador establece las relaciones entre los cambios del sujeto y su efecto posterior.

            Aplicabilidad
            Cuando una abstracción tiene dos aspectos dependientes el uno del otro. Encapsular los aspectos en objetos distintos permite cambiarlos y reutilizarlos.
            Cuando cambiar un objeto implica cambiar otros pero no conocemos el número exacto a cambiar.
            Cuando un objeto debe ser capaz de notificar algo a otros sin hacer suposiciones sobre quienes son dichos objetos. Es decir, cuando se quiere bajo acoplamiento.

            Singleton
            Descripción
            El patrón de diseño Singleton (instancia única) está diseñado para restringir la creación de objetos pertenecientes a una clase o el valor de un tipo a un único objeto. Su intención consiste en garantizar que una clase sólo tenga una instancia y proporcionar un punto de acceso global a ella. No se encarga de la creación de objetos en sí, sino que se enfoca en la restricción en la creación de un objeto.

            Nombre
            También es conocido como Singular o Único.

            Clasificación
            Patrón creacional
            Motivación
            En algunas ocasiones es muy importante poder garantizar que solo existe una instancia de una clase. Imaginamos la situación de varias impresoras disponibles cuando solo existe un pool que maneja la impresión. Es necesario asegurar que solo existe un objeto dentro del gestor de la impresión. Basándonos en el ejemplo, necesitamos un patrón que nos permita controlar las situaciones que exigen un control de acceso a una instancia bandera, muy habitual en sistemas concurrentes.

            Aplicabilidad
            Este patrón es aplicable en sistemas en los que se desea poder garantizar que solo existe una instancia de una clase.
         */
        Configurador configurador = Configurador.getInstance();
        Configurador configurador1 = Configurador.getInstance();

        configurador.Run();
        configurador1.Run();
    }
}